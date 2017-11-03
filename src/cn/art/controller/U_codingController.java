package cn.art.controller;

import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.art.dao.ColorTypeMapper;
import cn.art.dao.OutLineTypeMapper;
import cn.art.dao.PartTypeMapper;
import cn.art.dao.TextureTypeMapper;
import cn.art.model.Color;
import cn.art.model.ColorType;
import cn.art.model.OutLine;
import cn.art.model.OutLineType;
import cn.art.model.Part;
import cn.art.model.PartType;
import cn.art.model.Texture;
import cn.art.model.TextureType;
import cn.art.service.ColorService;
import cn.art.service.OutLineService;
import cn.art.service.PartService;
import cn.art.service.TextureService;
import cn.art.service.TypeService;
import cn.art.util.pojo.codeMerge;
import cn.art.util.pojo.show_detail;
import cn.art.util.pojo.typeIdName;


@Controller
@RequestMapping("html/facade/code")
public class U_codingController {
	private TypeService typeService;
	private OutLineService outLineService;
	private OutLineTypeMapper outLineTypeMapper;
	private ColorService colorService;
	private ColorTypeMapper colorTypeMapper;
	private PartService partService;
	private PartTypeMapper partTypeMapper;
	private TextureService textureService;
	private TextureTypeMapper textureTypeMapper;
	
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
	public TypeService getTypeService() {
		return typeService;
	}
	@Autowired
	public void setTypeService(TypeService typeService) {
		this.typeService = typeService;
	}
	public OutLineService getOutLineService() {
		return outLineService;
	}
	@Autowired
	public void setOutLineService(OutLineService outLineService) {
		this.outLineService = outLineService;
	}
	public ColorService getColorService() {
		return colorService;
	}
	@Autowired
	public void setColorService(ColorService colorService) {
		this.colorService = colorService;
	}
	public PartService getPartService() {
		return partService;
	}
	@Autowired
	public void setPartService(PartService partService) {
		this.partService = partService;
	}
	public TextureService getTextureService() {
		return textureService;
	}
	@Autowired
	public void setTextureService(TextureService textureService) {
		this.textureService = textureService;
	}
	
	//编码案列库 默认接口
	@RequestMapping("")
	@ResponseBody
	public List<codeMerge> codeingDefault(Model model,String tname, HttpServletRequest request){
		
		tname = URLDecoder.decode(tname);
		System.out.println("tname "+tname);
		List<codeMerge> codeMerges = new ArrayList<codeMerge>();
		codeMerge codeMerge;
		
		List<typeIdName> typeIdNames = typeService.selectAllByName(tname);
		int tid = 0;
		for (typeIdName typeIdName : typeIdNames) {
			tid = typeIdName.getTid();
			break;
		}
		
		List<OutLine> outLines = outLineService.selectByTID(tid);
		for (OutLine outLine : outLines) {
			System.out.println("outLine.getOimg() "+outLine.getOimg());
			codeMerge = new codeMerge();
			codeMerge.setType("outline");
			codeMerge.setId(outLine.getOid());
			codeMerge.setTid(outLine.getTid());
			codeMerge.setCodename(outLine.getOdescription());
			OutLineType outLineType = outLineTypeMapper.selectByPrimaryKey(outLine.getOtid());
			if(outLineType==null){
				codeMerge.setCodetypename(null);
			}else{
				codeMerge.setCodetypename(outLineType.getOname());
			}
			
			codeMerge.setCaseimg(outLine.getOimg());
			
			codeMerges.add(codeMerge);
		}
		
		List<Color> colors = colorService.selectByTID(tid);
		for (Color color : colors) {
			codeMerge = new codeMerge();
			codeMerge.setType("color");
			codeMerge.setId(color.getCid());
			codeMerge.setTid(color.getTid());
			codeMerge.setCodename(color.getCdescription());
			ColorType colorType = colorTypeMapper.selectByPrimaryKey(color.getCbid());
			if(colorType == null){
				codeMerge.setCodetypename(null);
			}else{
				codeMerge.setCodetypename(colorType.getCbname());
			}
			
			codeMerge.setCaseimg(color.getCimg());
			
			codeMerges.add(codeMerge);
		}
		List<Part> parts = partService.selectByTID(tid);
		for (Part part : parts) {
			codeMerge = new codeMerge();
			codeMerge.setType("part");
			codeMerge.setId(part.getPid());
			codeMerge.setTid(part.getTid());
			codeMerge.setCodename(part.getPdescription());
			PartType partType = partTypeMapper.selectByPrimaryKey(part.getPbid());
			if(partType == null){
				codeMerge.setCodetypename(null);
			}else{
				codeMerge.setCodetypename(partType.getPbname());
			}
			
			codeMerge.setCaseimg(part.getPimg());
			
			codeMerges.add(codeMerge);
		}
		
		List<Texture> textures = textureService.selectByTID(tid);
		for (Texture texture : textures) {
			codeMerge = new codeMerge();
			codeMerge.setType("texture");
			codeMerge.setId(texture.getTextureid());
			codeMerge.setTid(texture.getTid());
			codeMerge.setCodename(texture.getTdescription());
			TextureType textureType = textureTypeMapper.selectByPrimaryKey(texture.getTtid());
			if(textureType == null){
				codeMerge.setCodetypename(null);
			}else{
				codeMerge.setCodetypename(textureType.getTtname());
			}
			
			codeMerge.setCaseimg(texture.getTimg());
			
			codeMerges.add(codeMerge);
		}
		
		
		return codeMerges;
	}
	
	//编码案列库 类型分类详细 接口  轮廓
	@RequestMapping("outline")
	@ResponseBody
	public List<codeMerge> codeingoutlineClassify(Model model, String tname,HttpServletRequest request){
		List<typeIdName> typeIdNames = typeService.selectAllByName(tname);
		int tid = 0;
		for (typeIdName typeIdName : typeIdNames) {
			tid = typeIdName.getTid();
			break;
		}
		List<codeMerge> codeMerges = new ArrayList<codeMerge>();
		codeMerge codeMerge;
		
	
		List<OutLine> outLines = outLineService.selectByTID(tid);
		for (OutLine outLine : outLines) {
			codeMerge = new codeMerge();
			codeMerge.setType("outline");
			codeMerge.setId(outLine.getOid());
			codeMerge.setTid(outLine.getTid());
			codeMerge.setCodename(outLine.getOdescription());
			OutLineType outLineType = outLineTypeMapper.selectByPrimaryKey(outLine.getOtid());
			if(outLineType==null){
				codeMerge.setCodetypename("");
			}else{
				codeMerge.setCodetypename(outLineType.getOname());
			}
			
			codeMerge.setCaseimg(outLine.getOimg());
			
			codeMerges.add(codeMerge);
		}
		
		return codeMerges;
	}
	
	//编码案列库 类型分类详细 接口  色彩
	@RequestMapping("color")
	@ResponseBody
	public List<codeMerge> codeincolorClassify(Model model, String tname,HttpServletRequest request){
		List<typeIdName> typeIdNames = typeService.selectAllByName(tname);
		int tid = 0;
		for (typeIdName typeIdName : typeIdNames) {
			tid = typeIdName.getTid();
			break;
		}
		List<codeMerge> codeMerges = new ArrayList<codeMerge>();
		codeMerge codeMerge;
		
	
		List<Color> colors = colorService.selectByTID(tid);
		for (Color color: colors) {
			codeMerge = new codeMerge();
			codeMerge.setType("color");
			codeMerge.setId(color.getCid());
			codeMerge.setTid(color.getTid());
			codeMerge.setCodename(color.getCdescription());
			ColorType colorType = colorTypeMapper.selectByPrimaryKey(color.getCbid());
			if(colorType == null){
				codeMerge.setCodetypename("");
			}else{
				codeMerge.setCodetypename(colorType.getCbname());
			}
			
			codeMerge.setCaseimg(color.getCimg());
			
			codeMerges.add(codeMerge);
		}
		
		return codeMerges;
	}
	
	//编码案列库 类型分类详细 接口  部件
	@RequestMapping("part")
	@ResponseBody
	public List<codeMerge> codeinpartClassify(Model model, String tname,HttpServletRequest request){
		List<typeIdName> typeIdNames = typeService.selectAllByName(tname);
		int tid = 0;
		for (typeIdName typeIdName : typeIdNames) {
			tid = typeIdName.getTid();
			break;
		}
		List<codeMerge> codeMerges = new ArrayList<codeMerge>();
		codeMerge codeMerge;
		
	
		List<Part> parts = partService.selectByTID(tid);
		for (Part part: parts) {
			codeMerge = new codeMerge();
			codeMerge.setType("part");
			codeMerge.setId(part.getPid());
			codeMerge.setTid(part.getTid());
			codeMerge.setCodename(part.getPdescription());
			PartType partType = partTypeMapper.selectByPrimaryKey(part.getPbid());
			if(partType == null){
				codeMerge.setCodetypename("");
			}else{
				codeMerge.setCodetypename(partType.getPbname());
			}
			
			codeMerge.setCaseimg(part.getPimg());
			
			codeMerges.add(codeMerge);
		}
		
		return codeMerges;
	}
		
		
	//编码案列库 类型分类详细 接口  材质
	@RequestMapping("texture")
	@ResponseBody
	public List<codeMerge> codeintextureClassify(Model model, String tname,HttpServletRequest request){
		List<typeIdName> typeIdNames = typeService.selectAllByName(tname);
		int tid = 0;
		for (typeIdName typeIdName : typeIdNames) {
			tid = typeIdName.getTid();
			break;
		}
		List<codeMerge> codeMerges = new ArrayList<codeMerge>();
		codeMerge codeMerge;
		
		List<Texture> textures = textureService.selectByTID(tid);
		for (Texture texture: textures) {
			codeMerge = new codeMerge();
			codeMerge.setType("texture");
			codeMerge.setId(texture.getTextureid());
			codeMerge.setTid(texture.getTid());
			codeMerge.setCodename(texture.getTdescription());
			TextureType textureType = textureTypeMapper.selectByPrimaryKey(texture.getTtid());
			if(textureType == null){
				codeMerge.setCodetypename("");
			}else{
				codeMerge.setCodetypename(textureType.getTtname());
			}
			
			codeMerge.setCaseimg(texture.getTimg());
			
			codeMerges.add(codeMerge);
		}
		
		return codeMerges;
	}
	
	@RequestMapping("detail/color")
	@ResponseBody
	public show_detail getdetailInfo(Model model, Integer id,HttpServletRequest request){
		
		show_detail show_detail = new show_detail();
		Color color = colorService.selectByPrimaryKey(id);
		
		
		show_detail.setDescription(color.getCdescription());
		show_detail.setColornum(color.getCnum());
		show_detail.setImg(color.getCimg());
		show_detail.setFile(color.getCfile());
		show_detail.setRgb(color.getCrgb());
		ColorType colorType = colorTypeMapper.selectByPrimaryKey(color.getCbid());
		if(colorType==null){
			show_detail.setTypeName("");
		}else{
			show_detail.setTypeName(colorType.getCbname());
		}
		System.out.println("show_detail.getDescription() "+show_detail.getDescription());
		return show_detail;
	}
	
	//"加载更多"  接口
	@RequestMapping("{tid}/{xmore}")
	public String codeingAddMore(@PathVariable Integer tid,@PathVariable String xmore,HttpServletRequest request){
		
		if("outline".equals(xmore)){
			String outlines = outLineService.getOutlineB(tid);
			request.setAttribute("outlines", outlines);
			
		}else if("color".equals(xmore)){
			String colors = colorService.getColorBasic(tid);
			request.setAttribute("colors", colors);
			
		}else if("part".equals(xmore)){
			String parts = partService.getPartBasic(tid);
			request.setAttribute("parts", parts);
			
		}else if("texture".equals(xmore)){
			String textures = textureService.getTextureBasic(tid);
			request.setAttribute("textures", textures);
			
		}else{
			request.setAttribute("errorMessage", "请正确填写加载更多信息的物件类型");
		}
		
		return "";
	}
	
	//"详细信息"接口
	@RequestMapping("detail/{xmore}/{xid}")
	public String codeingAddMore(@PathVariable String xmore,@PathVariable Integer xid,HttpServletRequest request){
		
		if("outline".equals(xmore)){
			String outline = outLineService.selectD(xid);
			request.setAttribute("outline", outline);
			
		}else if("color".equals(xmore)){
			String color = colorService.selectColorD(xid);
			request.setAttribute("color", color);
			
		}else if("part".equals(xmore)){
			String part = partService.selectPartD(xid);
			request.setAttribute("part", part);
			
		}else if("texture".equals(xmore)){
			String texture = textureService.selectTextureD(xid);
			request.setAttribute("texture", texture);
			
		}else{
			request.setAttribute("errorMessage", "请正确填写详细信息的物件类型和id号");
		}
		
		return "manager/testlogin";
	}

}
