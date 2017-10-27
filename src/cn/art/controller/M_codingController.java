package cn.art.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.art.model.Color;
import cn.art.model.ColorType;
import cn.art.model.OutLine;
import cn.art.model.OutLineType;
import cn.art.model.Part;
import cn.art.model.PartType;
import cn.art.model.Texture;
import cn.art.model.TextureType;
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

	public M_codingController() {
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

	@RequestMapping("list")
	public String list(Model model, codecase codecase) {
		List<typeIdName> typesList = typeService.selectAllOnlyIdandName();
		model.addAttribute("typesList", typesList);
		model.addAttribute("codecase", codecase);
		return "manager/appearance/code/list";
	}

	@RequestMapping("load/outLineType")
	@ResponseBody
	public List<Map<String, String>> codeType(Integer tid) {
		List<OutLineType> outLineTypeList = new ArrayList<OutLineType>();
		List<Map<String, String>> codeTypeList = new ArrayList<Map<String, String>>(outLineTypeList.size());
		if (tid != null) {
			outLineTypeList = outLineTypeService.selectByTID(tid);
			for (OutLineType OutLineType : outLineTypeList) {
				Map<String, String> codeTypeMap = new HashMap<String, String>();
				codeTypeMap.put("id", OutLineType.getOtid().toString());
				codeTypeMap.put("tid", OutLineType.getTid().toString());
				codeTypeMap.put("name", OutLineType.getOname());
				codeTypeList.add(codeTypeMap);
			}
		}
		return codeTypeList;
	}

	@RequestMapping("codecase/outLineType")
	@ResponseBody
	public List<Map<String, String>> codecaseOutLine(Integer tid, Integer codeTypeId) {
		List<OutLine> outLineTypeList = new ArrayList<OutLine>();
		List<Map<String, String>> codeTypeList = new ArrayList<Map<String, String>>();
		Map<String, Integer> TIDandOTIDMap = new HashMap<String, Integer>();
		TIDandOTIDMap.put("tid", tid);
		TIDandOTIDMap.put("otid", codeTypeId);
		if (tid != null) {
			outLineTypeList = outLineService.selectByTIDandOTID(TIDandOTIDMap);
			for (OutLine OutLine : outLineTypeList) {
				Map<String, String> codeTypeMap = new HashMap<String, String>();
				codeTypeMap.put("id", OutLine.getOid().toString());
				// codeTypeMap.put("tid", OutLine.getTid().toString());
				codeTypeMap.put("name", OutLine.getOdescription());
				codeTypeList.add(codeTypeMap);
			}
		}
		return codeTypeList;
	}

	@RequestMapping("load/textureType")
	@ResponseBody
	public List<Map<String, String>> TextureType(Integer tid) {
		List<TextureType> textureTypeList = new ArrayList<TextureType>();
		List<Map<String, String>> codeTypeList = new ArrayList<Map<String, String>>();
		if (tid != null) {
			textureTypeList = textureTypeService.selectByTID(tid);
			for (TextureType TextureType : textureTypeList) {
				Map<String, String> codeTypeMap = new HashMap<String, String>();
				codeTypeMap.put("id", TextureType.getTtid().toString());
				codeTypeMap.put("tid", TextureType.getTid().toString());
				codeTypeMap.put("name", TextureType.getTtname());
				codeTypeList.add(codeTypeMap);
			}
		}
		return codeTypeList;
	}

	@RequestMapping("codecase/textureType")
	@ResponseBody
	public List<Map<String, String>> codecaseTexture(Integer tid, Integer codeTypeId) {
		List<Texture> textureList = new ArrayList<Texture>();
		List<Map<String, String>> codeTypeList = new ArrayList<Map<String, String>>();
		Map<String, Integer> TIDandOTIDMap = new HashMap<String, Integer>();
		TIDandOTIDMap.put("tid", tid);
		TIDandOTIDMap.put("ttid", codeTypeId);
		if (tid != null) {
			textureList = textureService.selectByTIDandTTID(TIDandOTIDMap);
			for (Texture Texture : textureList) {
				Map<String, String> codeTypeMap = new HashMap<String, String>();
				codeTypeMap.put("id", Texture.getTextureid().toString());
				// codeTypeMap.put("tid", Texture.getTid().toString());
				codeTypeMap.put("name", Texture.getTdescription());
				codeTypeList.add(codeTypeMap);
			}
		}
		return codeTypeList;
	}

	@RequestMapping("load/partType")
	@ResponseBody
	public List<Map<String, String>> PartType(Integer tid) {
		List<PartType> partTypeList = new ArrayList<PartType>();
		List<Map<String, String>> codeTypeList = new ArrayList<Map<String, String>>();
		if (tid != null) {
			partTypeList = partTypeService.selectByTID(tid);
			for (PartType PartType : partTypeList) {
				Map<String, String> codeTypeMap = new HashMap<String, String>();
				codeTypeMap.put("id", PartType.getPbid().toString());
				codeTypeMap.put("tid", PartType.getTid().toString());
				codeTypeMap.put("name", PartType.getPbname());
				codeTypeList.add(codeTypeMap);
			}
		}
		return codeTypeList;
	}

	@RequestMapping("codecase/partType")
	@ResponseBody
	public List<Map<String, String>> codecasePart(Integer tid, Integer codeTypeId) {
		List<Part> partList = new ArrayList<Part>();
		List<Map<String, String>> codeTypeList = new ArrayList<Map<String, String>>();
		Map<String, String> codeTypeMap;
		Map<String, Integer> TIDandOTIDMap = new HashMap<String, Integer>();
		TIDandOTIDMap.put("tid", tid);
		TIDandOTIDMap.put("pbid", codeTypeId);
		if (tid != null) {
			partList = partService.selectByTIDandPBID(TIDandOTIDMap);
			for (Part Part : partList) {
				codeTypeMap = new HashMap<String, String>();
				codeTypeMap.put("id", Part.getPid().toString());
				// codeTypeMap.put("tid", Part.getTid().toString());
				codeTypeMap.put("name", Part.getPdescription());
				codeTypeList.add(codeTypeMap);
			}
		}
		return codeTypeList;
	}

	@RequestMapping("load/colorType")
	@ResponseBody
	public List<Map<String, String>> ColorType(Integer tid) {
		List<ColorType> colorTypeList = new ArrayList<ColorType>();
		List<Map<String, String>> codeTypeList = new ArrayList<Map<String, String>>();
		//Map<String, String> codeTypeMap = new HashMap<String, String>();
		if (tid != null) {
			colorTypeList = colorTypeService.selectByTID(tid);
			
			for (ColorType ColorType : colorTypeList) {
				//System.out.println("ColorType.getCbname() "+ColorType.getCbname());
				Map<String, String> codeTypeMap = new HashMap<String, String>();
				codeTypeMap.put("id", ColorType.getCbid().toString());
				codeTypeMap.put("tid", ColorType.getTid().toString());
				codeTypeMap.put("name", ColorType.getCbname());
				codeTypeList.add(codeTypeMap);
			}
		}
		return codeTypeList;
	}

	@RequestMapping("codecase/colorType")
	@ResponseBody
	public List<Map<String, String>> codecaseColor(Integer tid, Integer codeTypeId) {
		List<Color> colorList = new ArrayList<Color>();
		List<Map<String, String>> codeTypeList = new ArrayList<Map<String, String>>();
		Map<String, String> codeTypeMap;
		Map<String, Integer> TIDandOTIDMap = new HashMap<String, Integer>();
		TIDandOTIDMap.put("tid", tid);
		TIDandOTIDMap.put("cbid", codeTypeId);
		if (tid != null) {
			colorList = colorService.selectByTIDandCBID(TIDandOTIDMap);
			for (Color Color : colorList) {
				//System.out.println("Color.getCdescription () "+Color.getCdescription());
				codeTypeMap = new HashMap<String, String>();
				codeTypeMap.put("id", Color.getCid().toString());
				// codeTypeMap.put("tid", Color.getTid().toString());
				codeTypeMap.put("name", Color.getCdescription());
				codeTypeList.add(codeTypeMap);
			}
		}
		return codeTypeList;
	}

	/**
	 * 加载需要修改的信息
	 *
	 * @param model
	 * @param id
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/editcolorType")
	public String edit(Color item, Model model, Integer id, Integer tid, Integer codeTypeId) {
		if (id != null) {
			item = colorService.selectByPrimaryKey(id);
		} else {
			item.setCbid(codeTypeId);
			item.setTid(tid);
		}
		List<ColorType> typesList = colorTypeService.selectByTID(item.getTid());
		model.addAttribute("typesList", typesList);
		model.addAttribute("item", item);
		return "manager/appearance/code/editcolorType";
	}

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/editpartType")
	public String edit(Part item, Model model, Integer id, Integer tid, Integer codeTypeId) {
		if (id != null) {
			item = partService.selectByPrimaryKey(id);
		} else {
			item.setPbid(codeTypeId);
			item.setTid(tid);
		}
		List<PartType> typesList = partTypeService.selectByTID(item.getTid());
		model.addAttribute("typesList", typesList);
		model.addAttribute("item", item);
		return "manager/appearance/code/editpartType";
	}

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/edittextureType")
	public String edit(Texture item, Model model, Integer id, Integer tid, Integer codeTypeId) {
		if (id != null) {
			item = textureService.selectByPrimaryKey(id);
		} else {
			item.setTtid(codeTypeId);
			item.setTid(tid);
		}
		List<TextureType> typesList = textureTypeService.selectByTID(item.getTid());
		model.addAttribute("typesList", typesList);
		model.addAttribute("item", item);
		return "manager/appearance/code/edittextureType";
	}

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/editoutLineType")
	public String edit(OutLine item, Model model, Integer id, Integer tid, Integer codeTypeId) {
		if (id != null) {
			item = outLineService.selectByPrimaryKey(id);
		} else {
			item.setOtid(codeTypeId);
			item.setTid(tid);
		}
		List<OutLineType> typesList = outLineTypeService.selectByTID(item.getTid());
		model.addAttribute("typesList", typesList);
		model.addAttribute("item", item);
		return "manager/appearance/code/editoutLineType";
	}

	/**
	 * 保存
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("load/savetextureType")
	@ResponseBody
	public String save(Texture item) {
		String message = "0";// 插入新类型成功
		if (item.getTextureid() != null) {
			textureService.updateByPrimaryKey(item);
			message = "1";// 更新类型成功
			return message;
		}
		// texture.setBctid(1);
		// texture.setTid(2);
		textureService.insert(item);
		return message;
	}

	@RequestMapping("load/savepartType")
	@ResponseBody
	public String save(Part item) {
		String message = "0";// 插入新类型成功
		if (item.getPid() != null) {
			partService.updateByPrimaryKey(item);
			message = "1";// 更新类型成功
			return message;
		}
		// part.setBctid(1);
		// part.setTid(2);
		partService.insert(item);
		return message;
	}

	@RequestMapping("load/savecolorType")
	@ResponseBody
	public String save(Color item) {
		String message = "0";// 插入新类型成功
		System.out.println("load/savecolorType  ");
		if (item.getCid() != null) {
			System.out.println("1111111111111111111111111111111111111111111111111111111111111111111111  "+item.getCid());
			//colorService.updateByPrimaryKey(item);
			colorService.updateByPrimaryKeySelective(item);
			message = "1";// 更新类型成功
			return message;
		}
		// color.setBctid(1);
		// color.setTid(2);
		colorService.insert(item);
		return message;
	}

	@RequestMapping("load/saveoutLineType")
	@ResponseBody
	public String save(OutLine item) {
		String message = "0";// 插入新类型成功
		if (item.getOid() != null) {
			outLineService.updateByPrimaryKey(item);
			message = "1";// 更新类型成功
			return message;
		}
		// outLine.setBctid(1);
		// outLine.setTid(2);
		outLineService.insert(item);
		return message;
	}

	/**
	 * 删除
	 *
	 * @param model
	 * @param session
	 * @return
	 */
	@RequestMapping("/load/deletecolorType")
	@ResponseBody
	public int deletecolor(Integer id) {
		int delete = colorService.deleteByPrimaryKey(id);
		return delete;
	}

	@RequestMapping("/load/deletepartType")
	@ResponseBody
	public int deletepart(Integer id) {
		int delete = partService.deleteByPrimaryKey(id);
		return delete;
	}

	@RequestMapping("/load/deletetextureType")
	@ResponseBody
	public int deletetexture(Integer id) {
		int delete = textureService.deleteByPrimaryKey(id);
		return delete;
	}

	@RequestMapping("/load/deleteoutLineType")
	@ResponseBody
	public int delete(Integer id) {
		int delete = outLineService.deleteByPrimaryKey(id);
		return delete;
	}
	//
	// /**
	// * 保存
	// *
	// * @param model
	// * @return
	// */
	// @RequestMapping("load/save")
	// @ResponseBody
	// // public String save(codecase codecase, Integer bcid,Integer bctid,Integer
	// // tid) {
	// public String save(codecase codecase) {
	// String message = "0";// 插入新类型成功
	//// if (codecase.getBcid() != null) {
	//// codeCaseService.updateByPrimaryKey(codecase);
	// message = "1";// 更新类型成功
	// return message;
	// }
	// codecase.setBctid(1);
	// codecase.setTid(2);
	// codeCaseService.insert(codecase);
	// return message;
	// }

	// 编码案例库（默认接口(xx/轮廓编码/xx型)）
	@RequestMapping("")
	public String facadeCoding(HttpServletRequest request) {
		List<typeIdName> type1 = typeService.selectAllOnlyIdandName();
		request.setAttribute("types", jsonConvert.list2json(type1));

		// 确认默认的产品类型ID
		int tid = 1;
		for (typeIdName typeIdName : type1) {
			tid = typeIdName.getTid();
			break;
		}

		List<OutLineType> outLineTypes = outLineTypeService.selectByTID(tid);
		request.setAttribute("outlinetypes", jsonConvert.list2json(outLineTypes));

		// 确认默认的轮廓类型ID
		int otid = 1;
		for (OutLineType outLineType : outLineTypes) {
			otid = outLineType.getOtid();
			break;
		}

		Map<String, Integer> map = new HashMap<>();
		map.put("tid", tid);
		map.put("otid", otid);
		List<OutLine> outLines = outLineService.selectByTIDandOTID(map);

		codecase code;
		List<codecase> codes = new LinkedList<>();
		for (OutLine outLine : outLines) {
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

	// 编码案例库 编码类型明细接口
	@RequestMapping("{tid}/{codeType}/{xid}")
	public String facadeCodingDetail(@PathVariable int tid, @PathVariable String codeType, @PathVariable int xid,
			HttpServletRequest request) {
		codecase code;
		if ("outline".equals(codeType)) {
			Map<String, Integer> map = new HashMap<>();
			map.put("tid", tid);
			map.put("otid", xid);
			List<OutLine> outLines = outLineService.selectByTIDandOTID(map);

			List<codecase> codes = new LinkedList<>();
			for (OutLine outLine : outLines) {
				code = new codecase();
				code.setCaseName(outLine.getOdescription());
				code.setCodeID(outLine.getOid());
				code.setCodeTypeID(xid);
				code.setTID(tid);
				codes.add(code);
			}
			request.setAttribute("codecases", jsonConvert.list2json(codes));

		} else if ("part".equals(codeType)) {
			Map<String, Integer> map = new HashMap<>();
			map.put("tid", tid);
			map.put("pbid", xid);
			List<Part> parts = partService.selectByTIDandPBID(map);

			List<codecase> codes = new LinkedList<>();
			for (Part part : parts) {
				code = new codecase();
				code.setCaseName(part.getPdescription());
				code.setCodeID(part.getPid());
				code.setCodeTypeID(xid);
				code.setTID(tid);
				codes.add(code);
			}
			request.setAttribute("codecases", jsonConvert.list2json(codes));

		} else if ("color".equals(codeType)) {
			Map<String, Integer> map = new HashMap<>();
			map.put("tid", tid);
			map.put("cbid", xid);
			List<Color> colors = colorService.selectByTIDandCBID(map);

			List<codecase> codes = new LinkedList<>();
			for (Color color : colors) {
				code = new codecase();
				code.setCaseName(color.getCdescription());
				code.setCodeID(color.getCid());
				code.setCodeTypeID(xid);
				code.setTID(tid);
				codes.add(code);
			}
			request.setAttribute("codecases", jsonConvert.list2json(codes));

		} else if ("texture".equals(codeType)) {
			Map<String, Integer> map = new HashMap<>();
			map.put("tid", tid);
			map.put("ttid", xid);
			List<Texture> textures = textureService.selectByTIDandTTID(map);

			List<codecase> codes = new LinkedList<>();
			for (Texture texture : textures) {
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

	// 编码案例库 编辑接口
	@RequestMapping("edit/{codeType}/{id}")
	public String facadeCodingEdit(@PathVariable String codeType, @PathVariable int id, HttpServletRequest request) {
		if ("outline".equals(codeType)) {
			String outLine = outLineService.selectD(id);
			request.setAttribute("outline", outLine);

		} else if ("part".equals(codeType)) {
			String part = partService.selectPartD(id);
			request.setAttribute("part", part);

		} else if ("color".equals(codeType)) {
			String color = colorService.selectColorD(id);
			request.setAttribute("color", color);

		} else if ("texture".equals(codeType)) {
			String texture = textureService.selectTextureD(id);
			request.setAttribute("texture", texture);
		}

		return "manager/testlogin";
	}

	// 编辑保存 新增案例保存接口 目前存在一些 问题 接口状态待定。。。。。。。。。。。。。。。。
	// 编码案例库 编辑保存接口
	@RequestMapping("edit/{codeType}/{id}/confirm")
	public String facadeCodingEditSave(@PathVariable String codeType, @PathVariable Integer id,
			HttpServletRequest request) {
		String cname = request.getParameter("cname");
		String ctypename = request.getParameter("ctypename");
		String cdate = request.getParameter("cdate");
		String cimg = request.getParameter("cimg");
		String cimg1 = request.getParameter("cimg1");
		String cimg2 = request.getParameter("cimg2");
		String cimg3 = request.getParameter("cimg3");
		String cimg4 = request.getParameter("cimg4");

		if ("outline".equals(codeType)) {
			int isok = outLineService.update(id, cname.trim(), ctypename, cdate.trim(), cimg1, cimg2, cimg3, cimg4);
			if (isok == 1) {
				request.setAttribute("outline_status", 200);
			} else {
				request.setAttribute("outline_status", 100);
				request.setAttribute("outline_erroeMesage", cname + "编辑保存失败");
			}
		} else if ("part".equals(codeType)) {
			int isok = partService.update(id, cname.trim(), ctypename, cimg, cimg1, cimg2, cimg3, cimg4);
			if (isok == 1) {
				request.setAttribute("part_status", 200);
			} else {
				request.setAttribute("part_status", 100);
				request.setAttribute("part_erroeMesage", cname + "编辑保存失败");
			}

		} else if ("color".equals(codeType)) {
			int isok = colorService.update(id, cname.trim(), ctypename, cdate.trim(), cimg1, cimg2, cimg3, cimg4);
			if (isok == 1) {
				request.setAttribute("color_status", 200);
			} else {
				request.setAttribute("color_status", 100);
				request.setAttribute("color_erroeMesage", cname + "编辑保存失败");
			}

		} else if ("texture".equals(codeType)) {
			int isok = textureService.update(id, cname.trim(), ctypename, cimg, cimg1, cimg2, cimg3, cimg4);
			if (isok == 1) {
				request.setAttribute("texture_status", 200);
			} else {
				request.setAttribute("texture_status", 100);
				request.setAttribute("texture_erroeMesage", cname + "编辑保存失败");
			}
		}

		return "manager/testlogin";
	}

	// 编码案例库 添加新案例接口
	@RequestMapping("addCase/{tid}/{codeType}")
	public String facadeCodingAddCase(@PathVariable int tid, @PathVariable String codeType,
			@PathVariable String codecase, HttpServletRequest request) {
		String cname = request.getParameter("cname");
		String ctypename = request.getParameter("ctypename");
		String cdate = request.getParameter("cdate");
		String cimg = request.getParameter("cimg");
		String cimg1 = request.getParameter("cimg1");
		String cimg2 = request.getParameter("cimg2");
		String cimg3 = request.getParameter("cimg3");
		String cimg4 = request.getParameter("cimg4");

		if ("outline".equals(codeType)) {
			int isok = outLineService.insertSelect(tid, cname, ctypename, cdate, cimg1, cimg2, cimg3, cimg4);
			if (isok == 1) {
				request.setAttribute("outline_status", 200);
			} else {
				request.setAttribute("outline_status", 100);
				request.setAttribute("outline_erroeMesage", cname + "新案例添加失败");
			}

		} else if ("part".equals(codeType)) {
			int isok = partService.insertSelect(tid, cname, ctypename, cimg, cimg1, cimg2, cimg3, cimg4);
			if (isok == 1) {
				request.setAttribute("part_status", 200);
			} else {
				request.setAttribute("part_status", 100);
				request.setAttribute("part_erroeMesage", cname + "新案例添加失败");
			}

		} else if ("color".equals(codeType)) {
			int isok = colorService.insertSelect(tid, cname, ctypename, cdate, cimg1, cimg2, cimg3, cimg4);
			if (isok == 1) {
				request.setAttribute("color_status", 200);
			} else {
				request.setAttribute("color_status", 100);
				request.setAttribute("color_erroeMesage", cname + "新案例添加失败");
			}

		} else if ("texture".equals(codeType)) {
			int isok = textureService.insertSelect(tid, cname, ctypename, cimg, cimg1, cimg2, cimg3, cimg4);
			if (isok == 1) {
				request.setAttribute("texture_status", 200);
			} else {
				request.setAttribute("texture_status", 100);
				request.setAttribute("texture_erroeMesage", cname + "新案例添加失败");
			}

		}

		return "manager/testlogin";
	}

	/*
	 * 删除接口 该功能模块风险较大 很容易对数据库造成不可估量的风险 咱不对外提供 //编码案例库 删除接口
	 * 
	 * @RequestMapping("delete/{codeType}/{id}") public String
	 * facadeCodingEditDelete(@PathVariable String codeType,@PathVariable int
	 * id,HttpServletRequest request){ if("outline".equals(codeType)){ int isDelete
	 * = outLineService.deleteByPrimaryKey(id); if(isDelete==1){
	 * request.setAttribute("status", 200); }else{ request.setAttribute("status",
	 * 100); request.setAttribute("erroeMessage", "轮廓编码删除失败"); }
	 * 
	 * 
	 * }else if("part".equals(codeType)){ int isDelete =
	 * partService.deleteByPrimaryKey(id); if(isDelete==1){
	 * request.setAttribute("status", 200); }else{ request.setAttribute("status",
	 * 100); request.setAttribute("erroeMessage", "部件编码删除失败"); }
	 * 
	 * }else if("color".equals(codeType)){ int isDelete =
	 * colorService.deleteByPrimaryKey(id); if(isDelete==1){
	 * request.setAttribute("status", 200); }else{ request.setAttribute("status",
	 * 100); request.setAttribute("erroeMessage", "色彩编码删除失败"); }
	 * 
	 * }else if("texture".equals(codeType)){ int isDelete =
	 * textureService.deleteByPrimaryKey(id); if(isDelete==1){
	 * request.setAttribute("status", 200); }else{ request.setAttribute("status",
	 * 100); request.setAttribute("erroeMessage", "材质编码删除失败"); } }
	 * 
	 * return "manager/testlogin"; }
	 */

}
