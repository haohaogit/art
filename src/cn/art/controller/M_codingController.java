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

import cn.art.dao.ColorMapper;
import cn.art.dao.ColorTypeMapper;
import cn.art.dao.OutLineMapper;
import cn.art.dao.OutLineTypeMapper;
import cn.art.dao.PartMapper;
import cn.art.dao.PartTypeMapper;
import cn.art.dao.TextureMapper;
import cn.art.dao.TextureTypeMapper;
import cn.art.dao.TypeMapper;
import cn.art.dao.WordMapper;
import cn.art.model.Color;
import cn.art.model.OutLine;
import cn.art.model.OutLineType;
import cn.art.model.Part;
import cn.art.model.Texture;
import cn.art.model.Word;
import cn.art.util.JsonConvert;
import cn.art.util.pojo.codecase;
import cn.art.util.pojo.typeIdName;


@Controller
@RequestMapping("manager/code")
public class M_codingController {
	private TypeMapper typeMapper;
	private OutLineTypeMapper outLineTypeMapper;
	private OutLineMapper outLineMapper;
	private ColorTypeMapper colorTypeMapper;
	private ColorMapper colorMapper;
	private PartTypeMapper partTypeMapper;
	private PartMapper partMapper;
	private TextureTypeMapper textureTypeMapper;
	private TextureMapper textureMapper;
	private WordMapper wordMapper;
	
	public WordMapper getWordMapper() {
		return wordMapper;
	}
	@Autowired
	public void setWordMapper(WordMapper wordMapper) {
		this.wordMapper = wordMapper;
	}

	private JsonConvert jsonConvert;
	
	public M_codingController(){
		jsonConvert = new JsonConvert();
	}
	
	public OutLineMapper getOutLineMapper() {
		return outLineMapper;
	}
	@Autowired
	public void setOutLineMapper(OutLineMapper outLineMapper) {
		this.outLineMapper = outLineMapper;
	}
	
	public ColorMapper getColorMapper() {
		return colorMapper;
	}
	@Autowired
	public void setColorMapper(ColorMapper colorMapper) {
		this.colorMapper = colorMapper;
	}

	public PartMapper getPartMapper() {
		return partMapper;
	}
	@Autowired
	public void setPartMapper(PartMapper partMapper) {
		this.partMapper = partMapper;
	}

	public TextureMapper getTextureMapper() {
		return textureMapper;
	}
	@Autowired
	public void setTextureMapper(TextureMapper textureMapper) {
		this.textureMapper = textureMapper;
	}

	public TypeMapper getTypeMapper() {
		return typeMapper;
	}
	@Autowired
	public void setTypeMapper(TypeMapper typeMapper) {
		this.typeMapper = typeMapper;
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
	
	//编码案例库（默认接口(xx/轮廓编码/xx型)）
	@RequestMapping("")
	public String facadeCoding(HttpServletRequest request){
		List<typeIdName> type1 = typeMapper.selectAllOnlyIdandName();
		request.setAttribute("types", jsonConvert.list2json(type1));
		
		//确认默认的产品类型ID
		int tid = 1;
		for (typeIdName typeIdName:type1) {
			tid = typeIdName.getTid();
			break;
		}
		
		List<OutLineType> outLineTypes = outLineTypeMapper.selectByTID(tid);
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
		List<OutLine> outLines = outLineMapper.selectByTIDandOTID(map);
		
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
			List<OutLine> outLines = outLineMapper.selectByTIDandOTID(map);
			
			
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
			List<Part> parts = partMapper.selectByTIDandPBID(map);
			
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
			List<Color> colors = colorMapper.selectByTIDandCBID(map);
			
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
			List<Texture>  textures = textureMapper.selectByTIDandTTID(map);

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
			OutLine outLine = outLineMapper.selectByPrimaryKey(id);
			request.setAttribute("outline", jsonConvert.Bean2Json(outLine));
			
		}else if("part".equals(codeType)){
			Part part = partMapper.selectByPrimaryKey(id);
			request.setAttribute("part", jsonConvert.Bean2Json(part));
			
		}else if("color".equals(codeType)){
			Color color = colorMapper.selectByPrimaryKey(id);
			request.setAttribute("color", jsonConvert.Bean2Json(color));
			
		}else if("texture".equals(codeType)){
			Texture texture = textureMapper.selectByPrimaryKey(id);
			request.setAttribute("texture", jsonConvert.Bean2Json(texture));
		}
		
		return "manager/testlogin";
	}
	
	
	//                        编辑保存 新增案例保存接口   目前存在一些 问题   接口状态待定。。。。。。。。。。。。。。。。
	//编码案例库 编辑保存接口
	@RequestMapping("edit/{codecase}/confirm")
	public String facadeCodingEditSave(@PathVariable String codecase,HttpServletRequest request){
		Word word = jsonConvert.Json2Bean(codecase);
		int isok = wordMapper.insert(word);
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
			int isDelete = outLineMapper.deleteByPrimaryKey(id);
			if(isDelete==1){
				request.setAttribute("status", 200);
			}else{
				request.setAttribute("status", 100);
				request.setAttribute("erroeMessage", "轮廓编码删除失败");
			}
			
			
		}else if("part".equals(codeType)){
			int isDelete = partMapper.deleteByPrimaryKey(id);
			if(isDelete==1){
				request.setAttribute("status", 200);
			}else{
				request.setAttribute("status", 100);
				request.setAttribute("erroeMessage", "部件编码删除失败");
			}
			
		}else if("color".equals(codeType)){
			int isDelete = colorMapper.deleteByPrimaryKey(id);
			if(isDelete==1){
				request.setAttribute("status", 200);
			}else{
				request.setAttribute("status", 100);
				request.setAttribute("erroeMessage", "色彩编码删除失败");
			}
			
		}else if("texture".equals(codeType)){
			int isDelete = textureMapper.deleteByPrimaryKey(id);
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
