package cn.art.controller;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.art.model.Color;
import cn.art.model.OutLine;
import cn.art.model.OutLineType;
import cn.art.model.Part;
import cn.art.model.Texture;
import cn.art.model.Word;
import cn.art.service.ColorService;
import cn.art.service.ColorTypeService;
import cn.art.service.OutLineService;
import cn.art.service.OutLineTypeService;
import cn.art.service.PartService;
import cn.art.service.PartTypeService;
import cn.art.service.TextureService;
import cn.art.service.TextureTypeService;
import cn.art.service.TypeService;
import cn.art.service.WordService;
import cn.art.util.JsonConvert;
import cn.art.util.pojo.codecase;
import cn.art.util.pojo.typeIdName;


@Controller
@RequestMapping("manager/code")
public class M_codingController {
	
	private TypeService typeService;
	private OutLineTypeService outLineTypeService;
	private OutLineService outLineService;
	private ColorTypeService colorTypeService;
	private ColorService colorService;
	private PartTypeService partTypeService;
	private PartService partService;
	private TextureTypeService textureTypeService;
	private TextureService textureService;
	private WordService wordService;

	private JsonConvert jsonConvert;
	
	public M_codingController(){
		jsonConvert = new JsonConvert();
	}
	
	public TypeService getTypeService() {
		return typeService;
	}
	@Autowired
	public void setTypeService(TypeService typeService) {
		this.typeService = typeService;
	}
	public OutLineTypeService getOutLineTypeService() {
		return outLineTypeService;
	}
	@Autowired
	public void setOutLineTypeService(OutLineTypeService outLineTypeService) {
		this.outLineTypeService = outLineTypeService;
	}
	public OutLineService getOutLineService() {
		return outLineService;
	}
	@Autowired
	public void setOutLineService(OutLineService outLineService) {
		this.outLineService = outLineService;
	}
	public ColorTypeService getColorTypeService() {
		return colorTypeService;
	}
	@Autowired
	public void setColorTypeService(ColorTypeService colorTypeService) {
		this.colorTypeService = colorTypeService;
	}
	public ColorService getColorService() {
		return colorService;
	}
	@Autowired
	public void setColorService(ColorService colorService) {
		this.colorService = colorService;
	}
	public PartTypeService getPartTypeService() {
		return partTypeService;
	}
	@Autowired
	public void setPartTypeService(PartTypeService partTypeService) {
		this.partTypeService = partTypeService;
	}
	public PartService getPartService() {
		return partService;
	}
	@Autowired
	public void setPartService(PartService partService) {
		this.partService = partService;
	}
	public TextureTypeService getTextureTypeService() {
		return textureTypeService;
	}
	@Autowired
	public void setTextureTypeService(TextureTypeService textureTypeService) {
		this.textureTypeService = textureTypeService;
	}
	public TextureService getTextureService() {
		return textureService;
	}
	@Autowired
	public void setTextureService(TextureService textureService) {
		this.textureService = textureService;
	}
	public WordService getWordService() {
		return wordService;
	}
	@Autowired
	public void setWordService(WordService wordService) {
		this.wordService = wordService;
	}
	
	
	
	//编码案例库（默认接口(xx/轮廓编码/xx型)）
	@RequestMapping("")
	public String facadeCoding(HttpServletRequest request){
		List<typeIdName> type1 = typeService.selectAllOnlyIdandName();
		request.setAttribute("types", jsonConvert.list2json(type1));
		
		//确认默认的产品类型ID
		int tid = 1;
		for (typeIdName typeIdName:type1) {
			tid = typeIdName.getTid();
			break;
		}
		
		List<OutLineType> outLineTypes = outLineTypeService.selectByTID(tid);
		request.setAttribute("outlinetypes", jsonConvert.list2json(outLineTypes));
		
		//确认默认的轮廓类型ID
		int otid = 1;
		for (OutLineType outLineType:outLineTypes) {
			otid = outLineType.getOtid();
			break;
		}
		
		Map<String, Integer> map = new HashMap<>();
		map.put("tid", tid);
		map.put("otid", otid);
		List<OutLine> outLines = outLineService.selectByTIDandOTID(map);
		
		codecase code;
		List<codecase> codes = new LinkedList<>();
		for(OutLine outLine:outLines){
			code = new codecase();
			code.setCaseName(outLine.getOdescription());
			code.setCodeID(outLine.getOid());
			code.setCodeTypeID(otid);
			code.setTID(tid);
			codes.add(code);
		}
		
		request.setAttribute("codecases", jsonConvert.list2json(codes));
		return "manager/testlogin";
	}
	
	//编码案例库 编码类型明细接口
	@RequestMapping("{tid}/{codeType}/{xid}")
	public String facadeCodingDetail(@PathVariable int tid,@PathVariable String codeType,@PathVariable int xid,HttpServletRequest request){
		codecase code;
		if("outline".equals(codeType)){
			Map<String, Integer> map = new HashMap<>();
			map.put("tid", tid);
			map.put("otid", xid);
			List<OutLine> outLines = outLineService.selectByTIDandOTID(map);
			
			
			List<codecase> codes = new LinkedList<>();
			for(OutLine outLine:outLines){
				code = new codecase();
				code.setCaseName(outLine.getOdescription());
				code.setCodeID(outLine.getOid());
				code.setCodeTypeID(xid);
				code.setTID(tid);
				codes.add(code);
			}
			request.setAttribute("codecases", jsonConvert.list2json(codes));
			
		}else if("part".equals(codeType)){
			Map<String, Integer> map = new HashMap<>();
			map.put("tid", tid);
			map.put("pbid", xid);
			List<Part> parts = partService.selectByTIDandPBID(map);
			
			List<codecase> codes = new LinkedList<>();
			for(Part part:parts){
				code = new codecase();
				code.setCaseName(part.getPdescription());
				code.setCodeID(part.getPid());
				code.setCodeTypeID(xid);
				code.setTID(tid);
				codes.add(code);
			}
			request.setAttribute("codecases", jsonConvert.list2json(codes));
			
		}
		else if("color".equals(codeType)){
			Map<String, Integer> map = new HashMap<>();
			map.put("tid", tid);
			map.put("cbid", xid);
			List<Color> colors = colorService.selectByTIDandCBID(map);
			
			List<codecase> codes = new LinkedList<>();
			for(Color color:colors){
				code = new codecase();
				code.setCaseName(color.getCdescription());
				code.setCodeID(color.getCid());
				code.setCodeTypeID(xid);
				code.setTID(tid);
				codes.add(code);
			}
			request.setAttribute("codecases", jsonConvert.list2json(codes));
			
		}
		else if("texture".equals(codeType)){
			Map<String, Integer> map = new HashMap<>();
			map.put("tid", tid);
			map.put("ttid", xid);
			List<Texture>  textures = textureService.selectByTIDandTTID(map);

			List<codecase> codes = new LinkedList<>();
			for(Texture texture:textures){
				code = new codecase();
				code.setCaseName(texture.getTdescription());
				code.setCodeID(texture.getTextureid());
				code.setCodeTypeID(xid);
				code.setTID(tid);
				codes.add(code);
			}
			request.setAttribute("codecases", jsonConvert.list2json(codes));
			
		}
		return "manager/testlogin";
	}
	
	//编码案例库 编辑接口
	@RequestMapping("edit/{codeType}/{id}")
	public String facadeCodingEdit(@PathVariable String codeType,@PathVariable int id,HttpServletRequest request){
		if("outline".equals(codeType)){
			OutLine outLine = outLineService.selectByPrimaryKey(id);
			request.setAttribute("outline", jsonConvert.Bean2Json(outLine));
			
		}else if("part".equals(codeType)){
			Part part = partService.selectByPrimaryKey(id);
			request.setAttribute("part", jsonConvert.Bean2Json(part));
			
		}else if("color".equals(codeType)){
			Color color = colorService.selectByPrimaryKey(id);
			request.setAttribute("color", jsonConvert.Bean2Json(color));
			
		}else if("texture".equals(codeType)){
			Texture texture = textureService.selectByPrimaryKey(id);
			request.setAttribute("texture", jsonConvert.Bean2Json(texture));
		}
		
		return "manager/testlogin";
	}
	
	
	//                        编辑保存 新增案例保存接口   目前存在一些 问题   接口状态待定。。。。。。。。。。。。。。。。
	//编码案例库 编辑保存接口
	@RequestMapping("edit/{codecase}/confirm")
	public String facadeCodingEditSave(@PathVariable String codecase,HttpServletRequest request){
		Word word = jsonConvert.Json2Bean(codecase);
		int isok = wordService.insert(word);
		System.out.println("isok  :"+isok);
		return "manager/testlogin";
	}
	
	//编码案例库 添加新案例接口
	@RequestMapping("{tid}/{codeType}/addCase/{codecase}")
	public String facadeCodingAddCase(@PathVariable int tid,@PathVariable String codeType,@PathVariable String codecase,HttpServletRequest request){
		if("outline".equals(codeType)){
			
			
		}else if("part".equals(codeType)){
			
			
		}else if("color".equals(codeType)){
			
			
		}else if("texture".equals(codeType)){
			
		}
		
		return "manager/testlogin";
	}
	
	
		
		
		
	/*	                               删除接口  该功能模块风险较大 很容易对数据库造成不可估量的风险  咱不对外提供
	//编码案例库 删除接口
	@RequestMapping("delete/{codeType}/{id}")
	public String facadeCodingEditDelete(@PathVariable String codeType,@PathVariable int id,HttpServletRequest request){
		if("outline".equals(codeType)){
			int isDelete = outLineService.deleteByPrimaryKey(id);
			if(isDelete==1){
				request.setAttribute("status", 200);
			}else{
				request.setAttribute("status", 100);
				request.setAttribute("erroeMessage", "轮廓编码删除失败");
			}
			
			
		}else if("part".equals(codeType)){
			int isDelete = partService.deleteByPrimaryKey(id);
			if(isDelete==1){
				request.setAttribute("status", 200);
			}else{
				request.setAttribute("status", 100);
				request.setAttribute("erroeMessage", "部件编码删除失败");
			}
			
		}else if("color".equals(codeType)){
			int isDelete = colorService.deleteByPrimaryKey(id);
			if(isDelete==1){
				request.setAttribute("status", 200);
			}else{
				request.setAttribute("status", 100);
				request.setAttribute("erroeMessage", "色彩编码删除失败");
			}
			
		}else if("texture".equals(codeType)){
			int isDelete = textureService.deleteByPrimaryKey(id);
			if(isDelete==1){
				request.setAttribute("status", 200);
			}else{
				request.setAttribute("status", 100);
				request.setAttribute("erroeMessage", "材质编码删除失败");
			}
		}
		
		return "manager/testlogin";
	}
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//编码案例库 编辑保存接口
	@RequestMapping("edit/confirm")
	public String facadeCodingEditSave1(HttpServletRequest request){
		//String word  = "word";
		String word  = "{\"wsimilar\":\"悠闲 安定 安适 安好 安详 清静 安逸 稳重 安详 平和 和缓 安闲 平宁 平安 宁静 安全 安静 安清 镇静 幽静 静谧 稳定 清闲 平静 承平 安乐 安谧 从容 自在 舒适 太平 寂静 冷静 和平 安稳 安然\",\"wid\":7,\"wvocatype\":\"大气\",\"wbasic\":\"1.秩序正常，没有骚扰；2.心情安定、平静。\",\"wcolorwarm\":1,\"wword\":\"安宁\",\"wdetail\":\"1.安定，太平。\",\"wfirstchar\":\"A\",\"woposite\":\"混乱 纷乱 烦躁 烦恼 动乱 骚扰 烦扰 动荡 烦闷 纷扰\"}";
		request.setAttribute("codecase", word);
		int isok = 1111;
		System.out.println("isok123  :"+isok);
		return "manager/testform";
	}

}
