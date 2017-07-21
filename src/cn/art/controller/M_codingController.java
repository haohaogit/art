package cn.art.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.art.dao.ColorTypeMapper;
import cn.art.dao.OutLineTypeMapper;
import cn.art.dao.PartTypeMapper;
import cn.art.dao.TextureTypeMapper;
import cn.art.dao.TypeMapper;
import cn.art.model.OutLineType;
import cn.art.util.JsonConvert;
import cn.art.util.pojo.typeIdName;


@Controller
@RequestMapping("manager/code")
public class M_codingController {
	private TypeMapper typeMapper;
	private OutLineTypeMapper outLineTypeMapper;
	private ColorTypeMapper colorTypeMapper;
	private PartTypeMapper partTypeMapper;
	private TextureTypeMapper textureTypeMapper;
	
	private JsonConvert jsonConvert;
	
	public M_codingController(){
		jsonConvert = new JsonConvert();
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
		int tid = 1;
		for (typeIdName typeIdName:type1) {
			tid = typeIdName.getTid();
			break;
		}
		List<OutLineType> outLineTypes = outLineTypeMapper.selectByTID(tid);
		request.setAttribute("outlinetypes", jsonConvert.list2json(outLineTypes));
		
		return "manager/testlogin";
	}
	
	@RequestMapping("{tid}/{codeType}/{xid}")
	public String facadeCodingDetail(@PathVariable int tid,@PathVariable String codeType,@PathVariable int xid,HttpServletRequest request){
		
		return "manager/testlogin";
	}
	
	

}
