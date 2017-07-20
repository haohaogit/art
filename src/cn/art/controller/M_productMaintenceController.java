package cn.art.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.art.dao.BottomCaseTypeMapper;
import cn.art.dao.ColorTypeMapper;
import cn.art.dao.OutLineTypeMapper;
import cn.art.dao.PartTypeMapper;
import cn.art.dao.SurveyMapper;
import cn.art.dao.TextureTypeMapper;
import cn.art.dao.TypeMapper;
import cn.art.model.BottomCaseType;
import cn.art.model.ColorType;
import cn.art.model.OutLineType;
import cn.art.model.PartType;
import cn.art.model.Survey;
import cn.art.model.TextureType;
import cn.art.model.Type;
import cn.art.util.JsonConvert;
import cn.art.util.Bean2PartBean.Type2PartBean;
import cn.art.util.pojo.typeIdName;
import cn.art.util.pojo.typeYUYI;


@Controller
@RequestMapping("manager")
public class M_productMaintenceController {
	
	
	private TypeMapper typeMapper;
	private BottomCaseTypeMapper bottomCaseTypeMapper;
	private OutLineTypeMapper outLineTypeMapper;
	private ColorTypeMapper colorTypeMapper;
	private PartTypeMapper partTypeMapper;
	private TextureTypeMapper textureTypeMapper;
	private SurveyMapper surveyMapper;
	
	private JsonConvert jsonConvert;
	private Type2PartBean type2PartBean;
	
	public M_productMaintenceController(){
		jsonConvert = new JsonConvert();
		type2PartBean = new Type2PartBean();
	}
	
	public SurveyMapper getSurveyMapper() {
		return surveyMapper;
	}
	@Autowired
	public void setSurveyMapper(SurveyMapper surveyMapper) {
		this.surveyMapper = surveyMapper;
	}

	public OutLineTypeMapper getOutLineTypeMapper() {
		return outLineTypeMapper;
	}
	@Autowired
	public void setOutLineTypeMapper(OutLineTypeMapper outLineTypeMapper) {
		this.outLineTypeMapper = outLineTypeMapper;
	}

	public ColorTypeMapper getColorTypeMapper() {
		return colorTypeMapper;
	}
	@Autowired
	public void setColorTypeMapper(ColorTypeMapper colorTypeMapper) {
		this.colorTypeMapper = colorTypeMapper;
	}

	public PartTypeMapper getPartTypeMapper() {
		return partTypeMapper;
	}
	@Autowired
	public void setPartTypeMapper(PartTypeMapper partTypeMapper) {
		this.partTypeMapper = partTypeMapper;
	}

	public TextureTypeMapper getTextureTypeMapper() {
		return textureTypeMapper;
	}
	@Autowired
	public void setTextureTypeMapper(TextureTypeMapper textureTypeMapper) {
		this.textureTypeMapper = textureTypeMapper;
	}

	public BottomCaseTypeMapper getBottomCaseTypeMapper() {
		return bottomCaseTypeMapper;
	}
	@Autowired
	public void setBottomCaseTypeMapper(BottomCaseTypeMapper bottomCaseTypeMapper) {
		this.bottomCaseTypeMapper = bottomCaseTypeMapper;
	}

	public TypeMapper getTypeMapper() {
		return typeMapper;
	}
	@Autowired
	public void setTypeMapper(TypeMapper typeMapper) {
		this.typeMapper = typeMapper;
	}


	@RequestMapping("productMaintenance")
	public String producemaintence(HttpServletRequest request){
		List<typeIdName> types1 = typeMapper.selectAllOnlyIdandName();
		String  types = jsonConvert.list2json(types1);
		//第一种 request传值
		//HTML之间怎么传值
		HttpSession session = request.getSession();
		//session.setAttribute("types", types);
		//第二种 request传值
		request.setAttribute("types", types);
		return "manager/testlogin";
	}
	
	@RequestMapping("productMaintenance/edit/{id}/yuyi")
	public String produceyuyi(@PathVariable int id , HttpServletRequest request){
		Type type = typeMapper.selectByPrimaryKey(id);
		typeYUYI typeYUYI = type2PartBean.type2YUYI(type);
		String type1 = jsonConvert.Bean2Json(typeYUYI);
		request.setAttribute("types", type1);
		return "manager/testlogin";
	}
	@RequestMapping("productMaintenance/edit/{id}/yuyi/confirm")
	public String produceyuyiSave(@PathVariable int id , HttpServletRequest request){
		Type type = new Type();
		type.setTid(id);
		type.setTname(request.getParameter("TName"));
		type.setTalgorithm(Integer.parseInt(request.getParameter("TAlgorithm")));
		type.setTicon(request.getParameter("TIcon"));
		type.setTwordtype(Integer.parseInt(request.getParameter("TWordType")));
		type.setTyuyi(request.getParameter("TYuyi"));
		int isok = typeMapper.updateByPrimaryKeySelective(type);
		if(isok==1){
			request.setAttribute("status", "200");
		}else {
			request.setAttribute("status", "100");
			request.setAttribute("errorMessage", "语义库某某地方保存失败");
		}
		System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaa");
		request.setAttribute("types", isok);
		return "manager/testlogin";
	}
	
	@RequestMapping("productMaintenance/edit/{id}/bottom")
	public String productMaintencebottom(@PathVariable int id ,HttpServletRequest request){
		Type type = typeMapper.selectByPrimaryKey(id);
		String tanli = type.getTanli();
		request.setAttribute("TAnli", tanli);
		
		List<BottomCaseType> bottomCaseTypes = bottomCaseTypeMapper.selectByTID(id);
		request.setAttribute("bottomcasetypes", jsonConvert.list2json(bottomCaseTypes));
		
		return "manager/testlogin";
	}
	@RequestMapping("productMaintenance/edit/{id}/bottom/confirm")
	public String productMaintencebottomSave(@PathVariable int id ,HttpServletRequest request){
		String TAnli = request.getParameter("TAnli");
		Type type1 = new Type();
		type1.setTanli(TAnli);
		typeMapper.updateByPrimaryKeySelective(type1);
		
		BottomCaseType bottomCaseType = new BottomCaseType();
		String bctanme = null;
		bctanme = request.getParameter("type1");
		boolean isExist = false;
		//先判断该产品类型（产品类型ID = id）的底层案例类型是否已经存在，如果已处在则保存该条数据到数据库中
		List<BottomCaseType> bottomCaseTypes = bottomCaseTypeMapper.selectByTID(id);
		for (BottomCaseType bottomCaseType2: bottomCaseTypes) {
			if(bctanme.equals(bottomCaseType2.getBctname())){
				isExist = true;
				break;
			}
		}
		//如果不存在则保存到数据库，否则给出该底层案例类型已存在的信息
		if(!isExist){
			bottomCaseType.setBctname(bctanme);
			bottomCaseType.setTid(id);
			int isok = bottomCaseTypeMapper.insertSelective(bottomCaseType);
			if(isok==1){
				request.setAttribute("status", "200");
			}else{
				request.setAttribute("status", "100");
				request.setAttribute("errorMrssage", "底层案例库某某地方保存失败");
			}
		}else{
			request.setAttribute("AnliExistInfo", bctanme+"已存在");
		}
		return "manager/testlogin";
	}
	
	@RequestMapping("productMaintenance/edit/{id}/code")
	public String productMaintenceCode(@PathVariable int id,HttpServletRequest request){
		Type type = typeMapper.selectByPrimaryKey(id);
		String Tbianma = type.getTbianma();
		request.setAttribute("TBianma", Tbianma);
		System.out.println(Tbianma);
		List<OutLineType> outLineTypes = outLineTypeMapper.selectByTID(id);
		request.setAttribute("outlinetypes", jsonConvert.list2json(outLineTypes));
		
		List<ColorType> colorTypes = colorTypeMapper.selectByTID(id);
		request.setAttribute("colortypes", jsonConvert.list2json(colorTypes));
		
		List<PartType> partTypes = partTypeMapper.selectByTID(id);
		request.setAttribute("parttypes", jsonConvert.list2json(partTypes));
		
		List<TextureType> textureTypes = textureTypeMapper.selectByTID(id);
		request.setAttribute("texturetypes", jsonConvert.list2json(textureTypes));
		
		return "manager/testlogin";
	}
	
	@RequestMapping("productMaintenance/edit/{id}/code/confirm")
	public String productMaintenceCodeSave(@PathVariable int id,HttpServletRequest request){
		String TBianma = request.getParameter("TBianma");
		Type type1 = new Type();
		type1.setTbianma(TBianma);
		typeMapper.updateByPrimaryKeySelective(type1);
		
		OutLineType outLineType = new OutLineType();    
		ColorType colorType = new ColorType();          
		PartType partType = new PartType();             
		TextureType textureType = new TextureType();    
		String oname  = null;
		String ttname = null;
		String cbname = null;
		String pbname = null;
		
		oname = request.getParameter("outlinetype");
		ttname = request.getParameter("texturetype");
		cbname = request.getParameter("colortype");
		pbname = request.getParameter("parttype");
		
		boolean isExist = false;
		//分四个模块分别处理 轮廓编码、色彩编码、材质编码、部件编码
		
		//先判断该轮廓类型（轮廓类型ID = id）的轮廓类型是否已经存在，如果已处在则保存该条数据到数据库中轮廓类型表中
		List<OutLineType> outLineTypes = outLineTypeMapper.selectByTID(id);
		for (OutLineType outLineType2: outLineTypes) {
			if(oname.equals(outLineType2.getOname())){
				isExist = true;
				break;
			}
		}
		//如果不存在则保存到数据库，否则给出该底层案例类型已存在的信息
		if(!isExist){
			outLineType.setOname(oname);
			outLineType.setTid(id);
			int isok = outLineTypeMapper.insertSelective(outLineType);
			if(isok==1){
				request.setAttribute("outline_status", "200");
			}else{
				request.setAttribute("outline_status", "100");
				request.setAttribute("outline_errorMrssage", "轮廓编码某某地方保存失败");
			}
		}else{
			request.setAttribute("outline_ExistInfo", oname+"已存在");
		}
		
		isExist = false;
		//判断该色彩类型（轮廓类型ID = id）的色彩类型是否已经存在，如果已处在则保存该条数据到数据库中色彩类型表中
		List<ColorType> colorTypes = colorTypeMapper.selectByTID(id);
		for (ColorType colorType2: colorTypes) {
			if(cbname.equals(colorType2.getCbname())){
				isExist = true;
				break;
			}
		}
		//如果不存在则保存到数据库，否则给出该底层案例类型已存在的信息
		if(!isExist){
			colorType.setCbname(cbname);
			colorType.setCbid(id);
			int isok = colorTypeMapper.insertSelective(colorType);
			if(isok==1){
				request.setAttribute("color_status", "200");
			}else{
				request.setAttribute("color_status", "100");
				request.setAttribute("color_errorMrssage", "色彩编码某某地方保存失败");
			}
		}else{
			request.setAttribute("color_ExistInfo", oname+"已存在");
		}
		
		isExist = false;
		//判断该部件类型（轮廓类型ID = id）的部件类型是否已经存在，如果已处在则保存该条数据到数据库中部件类型表中
		List<PartType> partTypes = partTypeMapper.selectByTID(id);
		for(PartType partType2:partTypes){
			if(pbname.equals(partType2.getPbname())){
				isExist = true;
				break;
			}
		}
		if(!isExist){
			partType.setPbname(pbname);
			partType.setPbid(id);
			int isok = partTypeMapper.insertSelective(partType);
			if(isok==1){
				request.setAttribute("part_status", "200");
			}else{
				request.setAttribute("part_status", "100");
				request.setAttribute("part_errorMrssage", "部件编码某某地方保存失败");
			}
		}else{
			request.setAttribute("part_ExistInfo", pbname+"已存在");
		}
		
		isExist = false;
		//判断该材质类型（材质类型ID = id）的材质类型是否已经存在，如果已处在则保存该条数据到数据库中材质类型表中
		List<TextureType> textureTypes = textureTypeMapper.selectByTID(id);
		for(TextureType textureType2:textureTypes){
			if(ttname.equals(textureType2.getTtname())){
				isExist = true;
				break;
			}
		}
		if(!isExist){
			textureType.setTtname(ttname);
			textureType.setTid(id);
			int isok = textureTypeMapper.insertSelective(textureType);
			if(isok==1){
				request.setAttribute("texture_status", "200");
			}else{
				request.setAttribute("texture_status", "100");
				request.setAttribute("texture_errorMrssage", "材质编码某某地方保存失败");
			}
		}else{
			request.setAttribute("texture_ExistInfo", ttname+"已存在");
		}
		
		return "manager/testlogin";
	}
	
	@RequestMapping("productMaintenance/edit/{id}/newstyle")
	public String productMaintenceNewcase(@PathVariable int id ,HttpServletRequest request){
		Type type = typeMapper.selectByPrimaryKey(id);
		String tzaoxing = type.getTzaoxing();
		request.setAttribute("TZaoxing", tzaoxing);
		
		return "manager/testlogin";
	}
	@RequestMapping("productMaintenance/edit/{id}/newstyle/confirm")
	public String productMaintenceNewcaseSave(@PathVariable int id ,HttpServletRequest request){
		String tzaoxing = request.getParameter("TZaoxing");
		Type type = new Type();
		type.setTid(id);
		type.setTzaoxing(tzaoxing);
		int isok = typeMapper.updateByPrimaryKeySelective(type);
		if(isok==1){
			request.setAttribute("status", "200");
		}else {
			request.setAttribute("status", "100");
			request.setAttribute("errorMessage", "新造型库某某地方保存失败");
		}
		
		
		return "manager/testlogin";
	}
	
	@RequestMapping("productMaintenance/edit/{id}/paraSet")
	public String productMaintenceSetPara(@PathVariable int id,HttpServletRequest request){
		Type type = typeMapper.selectByPrimaryKey(id);
		String tcanshu = type.getTcanshu();
		request.setAttribute("TCanshu", tcanshu);
		
		List<Survey> surveys = surveyMapper.selectByTID(id);
		for(Survey survey: surveys){
			request.setAttribute("ChooseSurvey", survey.getChoosesurvey());
			request.setAttribute("Algorithm", survey.getAlgorithms());
			break;
		}
		
		return "manager/testlogin";
	}
	@RequestMapping("productMaintenance/edit/{id}/paraSet/confirm")
	public String productMaintenceSetParaSave(@PathVariable int id,HttpServletRequest request){
		
		String tcanshu = request.getParameter("TCanshu");
		String choosesurvey = request.getParameter("ChooseSurvey");
		String algorithm = request.getParameter("Algorithm");
		
		Type type = new Type();
		type.setTid(id);
		type.setTcanshu(tcanshu);
		int isok = typeMapper.updateByPrimaryKeySelective(type);
		if(isok==1){
			request.setAttribute("status", "200");
		}else {
			request.setAttribute("status", "100");
			request.setAttribute("errorMessage", "产品类型参数保存失败");
		}
		
		Survey survey = new Survey();
		survey.
		
		
		
		
		
		return "manager/testlogin";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@RequestMapping("testform")
	public void testform(HttpServletRequest request){
		request.setAttribute("tid", "2");
	}

}
