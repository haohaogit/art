package cn.art.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.art.model.BottomCaseType;
import cn.art.model.ColorType;
import cn.art.model.OutLineType;
import cn.art.model.PartType;
import cn.art.model.Survey;
import cn.art.model.TextureType;
import cn.art.model.Type;
import cn.art.service.BottomCaseTypeService;
import cn.art.service.ColorTypeService;
import cn.art.service.OutLineTypeService;
import cn.art.service.PartTypeService;
import cn.art.service.SurveyService;
import cn.art.service.TextureTypeService;
import cn.art.service.TypeService;
import cn.art.service.UserService;
import cn.art.util.JsonConvert;
import cn.art.util.Bean2PartBean.Type2PartBean;
import cn.art.util.pojo.typeIdName;
import cn.art.util.pojo.typeYUYI;

@Controller
@RequestMapping("manager/productMaintenance")
public class M_productMaintenceController {

	private TypeService typeService;
	private OutLineTypeService outLineTypeService;
	private ColorTypeService colorTypeService;
	private PartTypeService partTypeService;
	private TextureTypeService textureTypeService;
	private SurveyService surveyService;
	private BottomCaseTypeService bottomCaseTypeService;
	private UserService userService;

	private JsonConvert jsonConvert;
	private Type2PartBean type2PartBean;

	public M_productMaintenceController() {
		jsonConvert = new JsonConvert();
		type2PartBean = new Type2PartBean();
	}
	

	public UserService getUserService() {
		return userService;
	}
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
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

	public ColorTypeService getColorTypeService() {
		return colorTypeService;
	}

	@Autowired
	public void setColorTypeService(ColorTypeService colorTypeService) {
		this.colorTypeService = colorTypeService;
	}

	public PartTypeService getPartTypeService() {
		return partTypeService;
	}

	@Autowired
	public void setPartTypeService(PartTypeService partTypeService) {
		this.partTypeService = partTypeService;
	}

	public TextureTypeService getTextureTypeService() {
		return textureTypeService;
	}

	@Autowired
	public void setTextureTypeService(TextureTypeService textureTypeService) {
		this.textureTypeService = textureTypeService;
	}

	public SurveyService getSurveyService() {
		return surveyService;
	}

	@Autowired
	public void setSurveyService(SurveyService surveyService) {
		this.surveyService = surveyService;
	}

	public BottomCaseTypeService getBottomCaseTypeService() {
		return bottomCaseTypeService;
	}

	@Autowired
	public void setBottomCaseTypeService(BottomCaseTypeService bottomCaseTypeService) {
		this.bottomCaseTypeService = bottomCaseTypeService;
	}

	/*
	 * @RequestMapping("productMaintenance") public void
	 * producemaintence(HttpServletResponse response) throws IOException{
	 * List<typeIdName> types1 = typeService.selectAllOnlyIdandName(); String types
	 * = jsonConvert.list2json(types1);
	 * 
	 * response.setContentType("text/html;Charset=UTF-8");
	 * response.getWriter().println(JSONObject.toJSONString(types1));
	 * 
	 * 
	 * }
	 */

	@RequestMapping("list")
	public String list(Model model,
			HttpServletRequest request) {
		
		/*System.out.println("用户名和密码： "+ds);
		JSONObject jso=JSON.parseObject(ds);//json字符串转换成jsonobject对象
		String account = jso.getString("account");
		String password = jso.getString("password");
		boolean isRegister = false;
		System.out.println(account+"22"+password+"33");
		MD5 md = new MD5();
		List<User> users = userService.selectManagerByName(account.trim());
		for(User user:users){
			System.out.println(user.getUname()+"  "+user.getUpassword());
			if(password.equals(user.getUpassword())){
				//System.out.println("登录成功"+password+"  "+user.getUname()+"  "+user.getUpassword());
				isRegister = true;
				break;
			}
		}
		//HTML之间怎么传值
		HttpSession session = request.getSession();
		if(isRegister){
			session.setAttribute("status", "200");
			session.setAttribute("name", account);
			return "manager/productMaintenance/list";
		}else{
			System.out.println("aaaaaaaaaaaaahaohao");
			session.setAttribute("status", "100");
			session.setAttribute("errorMessage", "账户与密码不匹配");
			return "managerLogin";
		}
		*/
		return "manager/productMaintenance/list";
	}

	@RequestMapping("load/type")
	@ResponseBody
	public List<typeIdName> type(Model model) {
		List<typeIdName> typesList = typeService.selectAllOnlyIdandName();
		return typesList;
	}

	@RequestMapping("load/bottomcasetype")
	@ResponseBody
	public List<BottomCaseType> bottomCaseType(Integer tid) {
		//System.out.println("tid ="+tid);
		List<BottomCaseType> bottomCaseTypeList = new ArrayList<BottomCaseType>();
		if (tid != null) {
			bottomCaseTypeList = bottomCaseTypeService.selectByTID(tid);
		}
		/*for (BottomCaseType bottomCaseType : bottomCaseTypeList) {
			System.out.println("bottomCaseType.getBctname() "+bottomCaseType.getBctname()+" "+bottomCaseType.getBctid());
		}*/
		return bottomCaseTypeList;
	}

	/**
	 * 加载需要修改的信息
	 * 
	 * @param model
	 * @param id
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/edit")
	public String edit(Type item, Model model, @RequestParam(value = "id", defaultValue = "") Integer id) {
		if (id != null) {
			item = typeService.selectByPrimaryKey(id);
		}
		model.addAttribute("item", item);
		List<OutLineType> outLineTypeList = outLineTypeService.selectByTID(id);
		List<TextureType> textureTypeList = textureTypeService.selectByTID(id);
		List<PartType> partTypeList = partTypeService.selectByTID(id);
		List<ColorType> colorTypeList = colorTypeService.selectByTID(id);
		model.addAttribute("outLineTypeList", outLineTypeList);
		model.addAttribute("textureTypeList", textureTypeList);
		model.addAttribute("partTypeList", partTypeList);
		model.addAttribute("colorTypeList", colorTypeList);
		model.addAttribute("filename", item.getTicon());
		return "manager/productMaintenance/edit";
	}

	/**
	 * 保存
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("load/save")
	@ResponseBody
	public String save(Type item, String bottomCaseTypes, String outLineTypes, String colorTypes, String partTypes,
			String textureTypes) {
		String message = "0";// 插入新类型成功
		//User user = new User();
		System.out.println(" 1111110000000000111111");
		List<Survey> surveys = new ArrayList<Survey>();
		Integer tid = item.getTid();
		if (tid != null) {
			if (bottomCaseTypes != null) {
				List<BottomCaseType> bottomCaseTypeList = bottomCaseTypeService.selectByTID(tid);
				String[] bottomCaseTypeArray = bottomCaseTypes.split(",");
				System.out.println("test list0 "+bottomCaseTypeList.get(0).getBctid());
				System.out.println("test list1 "+bottomCaseTypeList.get(1).getBctid());
				System.out.println("test list size "+bottomCaseTypeList.size());
				int i = 0;
				for (String Type : bottomCaseTypeArray) {
					//如果数据库表中已有相应的记录，则先对已有的记录更新，多于的再进行插入数据库表操作
					if(i<bottomCaseTypeList.size()){
						BottomCaseType bottomCaseType = new BottomCaseType();
						bottomCaseType.setTid(tid);
						bottomCaseType.setBctname(Type);
						bottomCaseType.setBctid(bottomCaseTypeList.get(i).getBctid());
						bottomCaseTypeService.updateByPrimaryKey(bottomCaseType);
						i++;
					}else{
						BottomCaseType bottomCaseType = new BottomCaseType();
						bottomCaseType.setTid(tid);
						bottomCaseType.setBctname(Type);
						bottomCaseTypeService.insert(bottomCaseType);
					}
				}
				//如果数据表中的记录数多于新编辑的数量，则删除数据表中多于的记录
				if(i<bottomCaseTypeList.size()){
					for(int k = i;k<bottomCaseTypeList.size();k++){
						bottomCaseTypeService.deleteByPrimaryKey(bottomCaseTypeList.get(k).getBctid());
					}
				}
			}
			
			if (outLineTypes != null) {
				List<OutLineType> outLineTypeList = outLineTypeService.selectByTID(tid);
				String[] outLineTypeArray = outLineTypes.split(",");
				int i = 0;
				for (String Type : outLineTypeArray) {
					if(i<outLineTypeList.size()){
						OutLineType outLineType = new OutLineType();
						outLineType.setTid(tid);
						outLineType.setOname(Type);
						outLineType.setOtid(outLineTypeList.get(i).getOtid());
						outLineTypeService.updateByPrimaryKey(outLineType);
						i++;
					}else{
						OutLineType outLineType = new OutLineType();
						outLineType.setTid(tid);
						outLineType.setOname(Type);
						outLineTypeService.insert(outLineType);
					}
				}
				if(i<outLineTypeList.size()){
					for(int k = i;k<outLineTypeList.size();k++){
						outLineTypeService.deleteByPrimaryKey(outLineTypeList.get(k).getOtid());
					}
				}
			}
			
			if (colorTypes != null) {
				List<ColorType> colorTypeList = colorTypeService.selectByTID(tid);
				String[] colorTypeArray = colorTypes.split(",");
				int i = 0;
				for (String Type : colorTypeArray) {
					if(i<colorTypeList.size()){
						ColorType colorType = new ColorType();
						colorType.setTid(tid);
						colorType.setCbname(Type);
						colorType.setCbid(colorTypeList.get(i).getCbid());
						colorTypeService.updateByPrimaryKey(colorType);
						i++;
					}else{
						ColorType colorType = new ColorType();
						colorType.setTid(tid);
						colorType.setCbname(Type);
						colorTypeService.insert(colorType);
					}
				}
				if(i<colorTypeList.size()){
					for(int k = i;k<colorTypeList.size();k++){
						colorTypeService.deleteByPrimaryKey(colorTypeList.get(k).getCbid());
					}
				}
			}
			
			if (partTypes != null) {
				List<PartType> partTypeList = partTypeService.selectByTID(tid);
				String[] partTypeArray = partTypes.split(",");
				int i = 0;
				for (String Type : partTypeArray) {
					if(i<partTypeList.size()){
						PartType partType = new PartType();
						partType.setTid(tid);
						partType.setPbname(Type);
						partType.setPbid(partTypeList.get(i).getPbid());
						partTypeService.updateByPrimaryKey(partType);
						i++;
					}else{
						PartType partType = new PartType();
						partType.setTid(tid);
						partType.setPbname(Type);
						partTypeService.insert(partType);
					}
				}
				if(i<partTypeList.size()){
					for(int k = i;k<partTypeList.size();k++){
						partTypeService.deleteByPrimaryKey(partTypeList.get(k).getPbid());
					}
				}
			}
			
			if (textureTypes != null) {
				List<TextureType> textureTypeList = textureTypeService.selectByTID(tid);
				String[] textureTypeArray = textureTypes.split(",");
				int i = 0;
				for (String Type : textureTypeArray) {
					if(i<textureTypeList.size()){
						TextureType textureType = new TextureType();
						textureType.setTid(tid);
						textureType.setTtname(Type);
						textureType.setTtid(textureTypeList.get(i).getTtid());
						textureTypeService.updateByPrimaryKey(textureType);
						i++;
					}else{
						TextureType textureType = new TextureType();
						textureType.setTid(tid);
						textureType.setTtname(Type);
						textureTypeService.insert(textureType);
					}
				}
				if(i<textureTypeList.size()){
					for(int k = i;k<textureTypeList.size();k++){
						textureTypeService.deleteByPrimaryKey(textureTypeList.get(k).getTtid());
					}
				}
			}
			
			typeService.updateByPrimaryKey(item);
			message = "1";// 更新类型成功
			return message;
		}
		typeService.insert(item);
		return message;
	}

	/**
	 * 删除
	 * 
	 * @param model
	 * @param session
	 * @return
	 */
	@RequestMapping("/load/delete")
	@ResponseBody
	public int delete(Integer id) {
		int delete = typeService.deleteByPrimaryKey(id);
		return delete;
	}

	@RequestMapping(value = "productMaintenance3")
	@ResponseBody
	public Map<String, Object> delete(Type type, HttpServletRequest request) {
		Map<String, Object> map = new HashMap<String, Object>();
		typeService.deleteByPrimaryKey(type.getTid());

		try {
			typeService.updateByPrimaryKeySelective(type);
			map.put("code", 1);
		} catch (Exception e) {
			System.out.println("111111");
			map.put("code", 2);
			map.put("errorInfo", "鍒犻櫎澶辫触");
		}

		return map;
	}

	@RequestMapping("productMaintenance2")
	public String producemaintence2(HttpServletRequest request) {
		List<typeIdName> types1 = typeService.selectAllOnlyIdandName();
		String types = jsonConvert.list2json(types1);
		// 第一种 request传值
		// HTML之间怎么传值
		HttpSession session = request.getSession();
		session.setAttribute("types", types);
		session.setAttribute("isNewaddType", "false");
		// 第二种 request传值
		// request.setAttribute("types", types);

		return "manager/testform";
	}

	// 语义库 接口
	@RequestMapping("productMaintenance/edit/{id}/yuyi")
	public String produceyuyi(@PathVariable int id, HttpServletRequest request) {
		Type type = typeService.selectByPrimaryKey(id);
		typeYUYI typeYUYI = type2PartBean.type2YUYI(type);
		String type1 = jsonConvert.Bean2Json(typeYUYI);
		request.setAttribute("types", type1);
		return "manager/testlogin";
	}

	// 语义库 保存接口
	@RequestMapping("productMaintenance/edit/{id}/yuyi/confirm")
	public String produceyuyiSave(@PathVariable int id, HttpServletRequest request) {
		Type type = new Type();
		type.setTid(id);
		type.setTname(request.getParameter("TName"));
		type.setTalgorithm(Integer.parseInt(request.getParameter("TAlgorithm")));
		type.setTicon(request.getParameter("TIcon"));
		type.setTwordtype(Integer.parseInt(request.getParameter("TWordType")));
		type.setTyuyi(request.getParameter("TYuyi"));
		int isok = typeService.updateByPrimaryKeySelective(type);
		if (isok == 1) {
			request.setAttribute("status", "200");
		} else {
			request.setAttribute("status", "100");
			request.setAttribute("errorMessage", "语义库某某地方保存失败");
		}
		System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaa");
		request.setAttribute("types", isok);
		return "manager/testlogin";
	}

	// 底层案列库 接口
	@RequestMapping("productMaintenance/edit/{id}/bottom")
	public String productMaintencebottom(@PathVariable int id, HttpServletRequest request) {
		Type type = typeService.selectByPrimaryKey(id);
		String tanli = type.getTanli();
		request.setAttribute("TAnli", tanli);

		List<BottomCaseType> bottomCaseTypes = bottomCaseTypeService.selectByTID(id);
		request.setAttribute("bottomcasetypes", jsonConvert.list2json(bottomCaseTypes));

		return "manager/testlogin";
	}

	@RequestMapping("productMaintenance/edit/{id}/bottom/confirm")
	public String productMaintencebottomSave(@PathVariable int id, HttpServletRequest request) {
		String TAnli = request.getParameter("TAnli");
		Type type1 = new Type();
		type1.setTid(id);
		type1.setTanli(TAnli);
		int isok = typeService.updateByPrimaryKeySelective(type1);
		if (isok == 1) {
			request.setAttribute("TAnli_status", "200");
		} else {
			request.setAttribute("TAnli_status", "100");
			request.setAttribute("TAnli_errorMrssage", "类型库案例字段保存失败");
		}

		BottomCaseType bottomCaseType = new BottomCaseType();
		String bctanme = null;
		bctanme = request.getParameter("type1");
		boolean isExist = false;
		// 先判断该产品类型（产品类型ID = id）的底层案例类型是否已经存在，如果已处在则保存该条数据到数据库中
		List<BottomCaseType> bottomCaseTypes = bottomCaseTypeService.selectByTID(id);
		for (BottomCaseType bottomCaseType2 : bottomCaseTypes) {
			if (bctanme.equals(bottomCaseType2.getBctname())) {
				isExist = true;
				break;
			}
		}
		// 如果不存在则保存到数据库，否则给出该底层案例类型已存在的信息
		if (!isExist) {
			bottomCaseType.setBctname(bctanme);
			bottomCaseType.setTid(id);
			isok = bottomCaseTypeService.insertSelective(bottomCaseType);
			if (isok == 1) {
				request.setAttribute("BCType_status", "200");
			} else {
				request.setAttribute("BCType_status", "100");
				request.setAttribute("BCType_errorMrssage", "底层案例类型库保存失败");
			}
		} else {
			request.setAttribute("AnliExistInfo", bctanme + "已存在");
		}

		return "manager/testlogin";
	}

	// 编码案列库 接口
	@RequestMapping("productMaintenance/edit/{id}/code")
	public String productMaintenceCode(@PathVariable int id, HttpServletRequest request) {
		Type type = typeService.selectByPrimaryKey(id);
		String Tbianma = type.getTbianma();
		request.setAttribute("TBianma", Tbianma);
		System.out.println(Tbianma);
		List<OutLineType> outLineTypes = outLineTypeService.selectByTID(id);
		request.setAttribute("outlinetypes", jsonConvert.list2json(outLineTypes));

		List<ColorType> colorTypes = colorTypeService.selectByTID(id);
		request.setAttribute("colortypes", jsonConvert.list2json(colorTypes));

		List<PartType> partTypes = partTypeService.selectByTID(id);
		request.setAttribute("parttypes", jsonConvert.list2json(partTypes));

		List<TextureType> textureTypes = textureTypeService.selectByTID(id);
		request.setAttribute("texturetypes", jsonConvert.list2json(textureTypes));

		return "manager/testlogin";
	}

	@RequestMapping("productMaintenance/edit/{id}/code/confirm")
	public String productMaintenceCodeSave(@PathVariable int id, HttpServletRequest request) {
		String TBianma = request.getParameter("TBianma");
		Type type1 = new Type();
		type1.setTid(id);
		type1.setTbianma(TBianma);
		int isok = typeService.updateByPrimaryKeySelective(type1);
		if (isok == 1) {
			request.setAttribute("TBianma _status", "200");
		} else {
			request.setAttribute("TBianma _status", "100");
			request.setAttribute("TBianma _errorMrssage", "类型库编码字段保存失败");
		}
		OutLineType outLineType = new OutLineType();
		ColorType colorType = new ColorType();
		PartType partType = new PartType();
		TextureType textureType = new TextureType();
		String oname = null;
		String ttname = null;
		String cbname = null;
		String pbname = null;

		oname = request.getParameter("outlinetype");
		ttname = request.getParameter("texturetype");
		cbname = request.getParameter("colortype");
		pbname = request.getParameter("parttype");

		boolean isExist = false;
		// 分四个模块分别处理 轮廓编码、色彩编码、材质编码、部件编码

		// 先判断该轮廓类型（轮廓类型ID = id）的轮廓类型是否已经存在，如果已处在则保存该条数据到数据库中轮廓类型表中
		List<OutLineType> outLineTypes = outLineTypeService.selectByTID(id);
		for (OutLineType outLineType2 : outLineTypes) {
			if (oname.equals(outLineType2.getOname())) {
				isExist = true;
				break;
			}
		}
		// 如果不存在则保存到数据库，否则给出该底层案例类型已存在的信息
		if (!isExist) {
			outLineType.setOname(oname);
			outLineType.setTid(id);
			isok = outLineTypeService.insertSelective(outLineType);
			if (isok == 1) {
				request.setAttribute("outline_status", "200");
			} else {
				request.setAttribute("outline_status", "100");
				request.setAttribute("outline_errorMrssage", "轮廓编码某某地方保存失败");
			}
		} else {
			request.setAttribute("outline_ExistInfo", oname + "已存在");
		}

		isExist = false;
		// 判断该色彩类型（轮廓类型ID = id）的色彩类型是否已经存在，如果已处在则保存该条数据到数据库中色彩类型表中
		List<ColorType> colorTypes = colorTypeService.selectByTID(id);
		for (ColorType colorType2 : colorTypes) {
			if (cbname.equals(colorType2.getCbname())) {
				isExist = true;
				break;
			}
		}
		// 如果不存在则保存到数据库，否则给出该底层案例类型已存在的信息
		if (!isExist) {
			colorType.setCbname(cbname);
			colorType.setCbid(id);
			isok = colorTypeService.insertSelective(colorType);
			if (isok == 1) {
				request.setAttribute("color_status", "200");
			} else {
				request.setAttribute("color_status", "100");
				request.setAttribute("color_errorMrssage", "色彩编码某某地方保存失败");
			}
		} else {
			request.setAttribute("color_ExistInfo", oname + "已存在");
		}

		isExist = false;
		// 判断该部件类型（轮廓类型ID = id）的部件类型是否已经存在，如果已处在则保存该条数据到数据库中部件类型表中
		List<PartType> partTypes = partTypeService.selectByTID(id);
		for (PartType partType2 : partTypes) {
			if (pbname.equals(partType2.getPbname())) {
				isExist = true;
				break;
			}
		}
		if (!isExist) {
			partType.setPbname(pbname);
			partType.setPbid(id);
			isok = partTypeService.insertSelective(partType);
			if (isok == 1) {
				request.setAttribute("part_status", "200");
			} else {
				request.setAttribute("part_status", "100");
				request.setAttribute("part_errorMrssage", "部件编码某某地方保存失败");
			}
		} else {
			request.setAttribute("part_ExistInfo", pbname + "已存在");
		}

		isExist = false;
		// 判断该材质类型（材质类型ID = id）的材质类型是否已经存在，如果已处在则保存该条数据到数据库中材质类型表中
		List<TextureType> textureTypes = textureTypeService.selectByTID(id);
		for (TextureType textureType2 : textureTypes) {
			if (ttname.equals(textureType2.getTtname())) {
				isExist = true;
				break;
			}
		}
		if (!isExist) {
			textureType.setTtname(ttname);
			textureType.setTid(id);
			isok = textureTypeService.insertSelective(textureType);
			if (isok == 1) {
				request.setAttribute("texture_status", "200");
			} else {
				request.setAttribute("texture_status", "100");
				request.setAttribute("texture_errorMrssage", "材质编码某某地方保存失败");
			}
		} else {
			request.setAttribute("texture_ExistInfo", ttname + "已存在");
		}

		return "manager/testlogin";
	}

	// 新造型库 接口
	@RequestMapping("productMaintenance/edit/{id}/newstyle")
	public String productMaintenceNewcase(@PathVariable int id, HttpServletRequest request) {
		Type type = typeService.selectByPrimaryKey(id);
		String tzaoxing = type.getTzaoxing();
		request.setAttribute("TZaoxing", tzaoxing);

		return "manager/testlogin";
	}

	@RequestMapping("productMaintenance/edit/{id}/newstyle/confirm")
	public String productMaintenceNewcaseSave(@PathVariable int id, HttpServletRequest request) {
		String tzaoxing = request.getParameter("TZaoxing");
		Type type = new Type();
		type.setTid(id);
		type.setTzaoxing(tzaoxing);
		int isok = typeService.updateByPrimaryKeySelective(type);
		if (isok == 1) {
			request.setAttribute("status", "200");
		} else {
			request.setAttribute("status", "100");
			request.setAttribute("errorMessage", "新造型库某某地方保存失败");
		}

		return "manager/testlogin";
	}

	// 参数设置 接口
	@RequestMapping("productMaintenance/edit/{id}/paraSet")
	public String productMaintenceSetPara(@PathVariable int id, HttpServletRequest request) {
		Type type = typeService.selectByPrimaryKey(id);
		String tcanshu = type.getTcanshu();
		request.setAttribute("TCanshu", tcanshu);

		// List<Survey> surveys = surveyService.selectByTID(id);
		// for (Survey survey : surveys) {
		// request.setAttribute("ChooseSurvey", survey.getChoosesurvey());
		// request.setAttribute("Algorithm", survey.getAlgorithms());
		// break;
		// }

		return "manager/testlogin";
	}

	@RequestMapping("productMaintenance/edit/{id}/paraSet/confirm")
	public String productMaintenceSetParaSave(@PathVariable int id, HttpServletRequest request) {

		String tcanshu = request.getParameter("TCanshu");
		String choosesurvey = request.getParameter("ChooseSurvey");
		String algorithm = request.getParameter("Algorithm");

		Type type = new Type();
		type.setTid(id);
		type.setTcanshu(tcanshu);
		int isok = typeService.updateByPrimaryKeySelective(type);
		if (isok == 1) {
			request.setAttribute("status", "200");
		} else {
			request.setAttribute("status", "100");
			request.setAttribute("errorMessage", "产品类型参数保存失败");
		}

		Survey survey = new Survey();
		survey.setChoosesurvey(choosesurvey);
		survey.setAlgorithms(algorithm);
		survey.setTid(id);
		isok = surveyService.updateOnlyCA(survey);
		if (isok == 1) {
			request.setAttribute("status", "200");
		} else {
			request.setAttribute("status", "100");
			request.setAttribute("errorMessage", "调查参数保存失败");
		}

		return "manager/testlogin";
	}

	// 造型生产 接口
	@RequestMapping("productMaintenance/edit/{id}/genestyle")
	public String producrMaintenceGenestyle(@PathVariable int id, HttpServletRequest request) {
		Type type = typeService.selectByPrimaryKey(id);
		String TShengcheng = type.getTshengcheng();
		request.setAttribute("TShengcheng", TShengcheng);

		return "manager/testlogin";
	}

	@RequestMapping("productMaintenance/edit/{id}/genestyle/confirm")
	public String producrMaintenceGenestyleSave(@PathVariable int id, HttpServletRequest request) {
		String TShengcheng = request.getParameter("TShengcheng");
		Type type = new Type();
		type.setTid(id);
		type.setTshengcheng(TShengcheng);
		int isok = typeService.updateByPrimaryKeySelective(type);
		if (isok == 1) {
			request.setAttribute("status", 200);
		} else {
			request.setAttribute("status", 200);
			request.setAttribute("errorMessage", "类型库造型生成字段保存失败");
		}

		return "manager/testlogin";
	}

	// 造型调整 接口
	@RequestMapping("productMaintenance/edit/{id}/styleadjust")
	public String producrMaintenceStyleadjust(@PathVariable Integer id, HttpServletRequest request) {
		Type type = typeService.selectByPrimaryKey(id);
		String TTiaozheng = type.getTtiaozheng();
		request.setAttribute("TTiaozheng", TTiaozheng);

		return "manager/testlogin";
	}

	@RequestMapping("productMaintenance/edit/{id}/styleadjust/confirm")
	public String producrMaintenceStyleadjustSave(@PathVariable int id, HttpServletRequest request) {
		String TTiaozheng = request.getParameter("TTiaozheng");
		Type type = new Type();
		type.setTid(id);
		type.setTtiaozheng(TTiaozheng);
		int isok = typeService.updateByPrimaryKeySelective(type);
		if (isok == 1) {
			request.setAttribute("status", 200);
		} else {
			request.setAttribute("status", 100);
			request.setAttribute("errorMessage", "类型库造型调整字段保存失败");
		}

		return "manager/testlogin";
	}

	/*
	 * //产品类型维护 删除接口
	 * 
	 * @RequestMapping("productMaintenance/edit/{id}/styleadjust") public String
	 * producrMaintenceDelete(@PathVariable Integer id,HttpServletRequest request){
	 * 
	 * request.setAttribute("status", "该接口有风险，暂未实现");
	 * 
	 * 
	 * return "manager/testlogin"; }
	 */

	// 产品类型维护 添加新类型接口
	// 底层案列库保存 接口
	@RequestMapping("productMaintenance/newadd/confirm/yuyi")
	public String produceNewaddyuyi(HttpServletRequest request) {

		String tname = request.getParameter("TName");
		int isok = 0;
		Type type = new Type();
		//type = typeService.selectAllByName(tname);
		if (tname.equals(type.getTname())) {
			request.setAttribute("tnameIsExist", tname + "已存在");
		} else {
			type.setTname(tname);
			type.setTalgorithm(Integer.parseInt(request.getParameter("TAlgorithm")));
			type.setTicon(request.getParameter("TIcon"));
			type.setTwordtype(Integer.parseInt(request.getParameter("TWordType")));
			type.setTyuyi(request.getParameter("TYuyi"));

			isok = typeService.insertSelective(type);
			if (isok == 1) {
				request.setAttribute("status", 200);
			} else {
				request.setAttribute("status", 100);
				request.setAttribute("errorMessage", "新增语义库字段保存失败");
			}

			HttpSession session = request.getSession();
			session.setAttribute("isNewaddType", "true");
			//session.setAttribute("tid", typeService.selectAllByName(tname).getTid());

		}

		return "manager/testlogin";
	}

	// 底层案列库保存 接口
	@RequestMapping("productMaintenance/newadd/confirm/bottom")
	public String producrMaintenceNewaddBottom(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String isNewaddType = session.getAttribute("isNewaddType").toString();
		if ("true".equals(isNewaddType)) {
			int tid = Integer.parseInt(session.getAttribute("tid").toString());
			String TAnli = request.getParameter("TAnli");

			Type type1 = new Type();
			type1.setTid(tid);
			type1.setTanli(TAnli);
			int isok = typeService.updateByPrimaryKeySelective(type1);
			if (isok == 1) {
				request.setAttribute("TAnli_status", "200");
			} else {
				request.setAttribute("TAnli_status", "100");
				request.setAttribute("TAnli_errorMrssage", "类型库案例字段保存失败");
			}

			BottomCaseType bottomCaseType = new BottomCaseType();
			String bctanme = null;
			bctanme = request.getParameter("type1");
			boolean isExist = false;
			// 先判断该产品类型（产品类型ID = id）的底层案例类型是否已经存在，如果已处在则保存该条数据到数据库中
			List<BottomCaseType> bottomCaseTypes = bottomCaseTypeService.selectByTID(tid);
			for (BottomCaseType bottomCaseType2 : bottomCaseTypes) {
				if (bctanme.equals(bottomCaseType2.getBctname())) {
					isExist = true;
					break;
				}
			}
			// 如果不存在则保存到数据库，否则给出该底层案例类型已存在的信息
			if (!isExist) {
				bottomCaseType.setBctname(bctanme);
				bottomCaseType.setTid(tid);
				isok = bottomCaseTypeService.insertSelective(bottomCaseType);
				if (isok == 1) {
					request.setAttribute("BCType_status", "200");
				} else {
					request.setAttribute("BCType_status", "100");
					request.setAttribute("BCType_errorMrssage", "底层案例类型库保存失败");
				}
			} else {
				request.setAttribute("AnliExistInfo", bctanme + "已存在");
			}
		} else {
			request.setAttribute("NewaddTypeErrorMessage", "请先填写添加新类型中语义库信息");
		}

		return "manager/testlogin";
	}

	// 新类型编码案列库保存 接口
	@RequestMapping("productMaintenance/newadd/confirm/code")
	public String producrMaintenceNewaddCode(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String isNewaddType = session.getAttribute("isNewaddType").toString();
		if ("true".equals(isNewaddType)) {
			int id = Integer.parseInt(session.getAttribute("tid").toString());

			String TBianma = request.getParameter("TBianma");
			Type type1 = new Type();
			type1.setTid(id);
			type1.setTbianma(TBianma);
			int isok = typeService.updateByPrimaryKeySelective(type1);
			if (isok == 1) {
				request.setAttribute("TBianma _status", "200");
			} else {
				request.setAttribute("TBianma _status", "100");
				request.setAttribute("TBianma _errorMrssage", "类型库编码字段保存失败");
			}
			OutLineType outLineType = new OutLineType();
			ColorType colorType = new ColorType();
			PartType partType = new PartType();
			TextureType textureType = new TextureType();
			String oname = null;
			String ttname = null;
			String cbname = null;
			String pbname = null;

			oname = request.getParameter("outlinetype");
			ttname = request.getParameter("texturetype");
			cbname = request.getParameter("colortype");
			pbname = request.getParameter("parttype");

			boolean isExist = false;
			// 分四个模块分别处理 轮廓编码、色彩编码、材质编码、部件编码

			// 先判断该轮廓类型（轮廓类型ID = id）的轮廓类型是否已经存在，如果已处在则保存该条数据到数据库中轮廓类型表中
			List<OutLineType> outLineTypes = outLineTypeService.selectByTID(id);
			for (OutLineType outLineType2 : outLineTypes) {
				if (oname.equals(outLineType2.getOname())) {
					isExist = true;
					break;
				}
			}
			// 如果不存在则保存到数据库，否则给出该底层案例类型已存在的信息
			if (!isExist) {
				outLineType.setOname(oname);
				outLineType.setTid(id);
				isok = outLineTypeService.insertSelective(outLineType);
				if (isok == 1) {
					request.setAttribute("outline_status", "200");
				} else {
					request.setAttribute("outline_status", "100");
					request.setAttribute("outline_errorMrssage", "轮廓编码某某地方保存失败");
				}
			} else {
				request.setAttribute("outline_ExistInfo", oname + "已存在");
			}

			isExist = false;
			// 判断该色彩类型（轮廓类型ID = id）的色彩类型是否已经存在，如果已处在则保存该条数据到数据库中色彩类型表中
			List<ColorType> colorTypes = colorTypeService.selectByTID(id);
			for (ColorType colorType2 : colorTypes) {
				if (cbname.equals(colorType2.getCbname())) {
					isExist = true;
					break;
				}
			}
			// 如果不存在则保存到数据库，否则给出该底层案例类型已存在的信息
			if (!isExist) {
				colorType.setCbname(cbname);
				colorType.setCbid(id);
				isok = colorTypeService.insertSelective(colorType);
				if (isok == 1) {
					request.setAttribute("color_status", "200");
				} else {
					request.setAttribute("color_status", "100");
					request.setAttribute("color_errorMrssage", "色彩编码某某地方保存失败");
				}
			} else {
				request.setAttribute("color_ExistInfo", oname + "已存在");
			}

			isExist = false;
			// 判断该部件类型（轮廓类型ID = id）的部件类型是否已经存在，如果已处在则保存该条数据到数据库中部件类型表中
			List<PartType> partTypes = partTypeService.selectByTID(id);
			for (PartType partType2 : partTypes) {
				if (pbname.equals(partType2.getPbname())) {
					isExist = true;
					break;
				}
			}
			if (!isExist) {
				partType.setPbname(pbname);
				partType.setPbid(id);
				isok = partTypeService.insertSelective(partType);
				if (isok == 1) {
					request.setAttribute("part_status", "200");
				} else {
					request.setAttribute("part_status", "100");
					request.setAttribute("part_errorMrssage", "部件编码某某地方保存失败");
				}
			} else {
				request.setAttribute("part_ExistInfo", pbname + "已存在");
			}

			isExist = false;
			// 判断该材质类型（材质类型ID = id）的材质类型是否已经存在，如果已处在则保存该条数据到数据库中材质类型表中
			List<TextureType> textureTypes = textureTypeService.selectByTID(id);
			for (TextureType textureType2 : textureTypes) {
				if (ttname.equals(textureType2.getTtname())) {
					isExist = true;
					break;
				}
			}
			if (!isExist) {
				textureType.setTtname(ttname);
				textureType.setTid(id);
				isok = textureTypeService.insertSelective(textureType);
				if (isok == 1) {
					request.setAttribute("texture_status", "200");
				} else {
					request.setAttribute("texture_status", "100");
					request.setAttribute("texture_errorMrssage", "材质编码某某地方保存失败");
				}
			} else {
				request.setAttribute("texture_ExistInfo", ttname + "已存在");
			}
		} else {
			request.setAttribute("NewaddTypeErrorMessage", "请先填写添加新类型中语义库信息");
		}

		return "manager/testlogin";
	}

	// 新类型 新造型库保存 接口
	@RequestMapping("productMaintenance/newadd/confirm/newstyle")
	public String producrMaintenceNewaddnewstyle(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String isNewaddType = session.getAttribute("isNewaddType").toString();
		if ("true".equals(isNewaddType)) {
			int id = Integer.parseInt(session.getAttribute("tid").toString());

			String tzaoxing = request.getParameter("TZaoxing");
			Type type = new Type();
			type.setTid(id);
			type.setTzaoxing(tzaoxing);
			int isok = typeService.updateByPrimaryKeySelective(type);
			if (isok == 1) {
				request.setAttribute("status", "200");
			} else {
				request.setAttribute("status", "100");
				request.setAttribute("errorMessage", "新造型库某某地方保存失败");
			}
		} else {
			request.setAttribute("NewaddTypeErrorMessage", "请先填写添加新类型中语义库信息");
		}

		return "manager/testlogin";
	}

	// 新类型 参数设置保存 接口
	@RequestMapping("productMaintenance/newadd/confirm/paraSet")
	public String producrMaintenceNewaddparaSet(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String isNewaddType = session.getAttribute("isNewaddType").toString();
		if ("true".equals(isNewaddType)) {
			int id = Integer.parseInt(session.getAttribute("tid").toString());

			String tcanshu = request.getParameter("TCanshu");
			String choosesurvey = request.getParameter("ChooseSurvey");
			String algorithm = request.getParameter("Algorithm");

			Type type = new Type();
			type.setTid(id);
			type.setTcanshu(tcanshu);
			int isok = typeService.updateByPrimaryKeySelective(type);
			if (isok == 1) {
				request.setAttribute("status", "200");
			} else {
				request.setAttribute("status", "100");
				request.setAttribute("errorMessage", "产品类型参数保存失败");
			}

			Survey survey = new Survey();
			survey.setChoosesurvey(choosesurvey);
			survey.setAlgorithms(algorithm);
			survey.setTid(id);
			isok = surveyService.updateOnlyCA(survey);
			if (isok == 1) {
				request.setAttribute("status", "200");
			} else {
				request.setAttribute("status", "100");
				request.setAttribute("errorMessage", "产品类型参数保存失败");
			}
		} else {
			request.setAttribute("NewaddTypeErrorMessage", "请先填写添加新类型中语义库信息");
		}

		return "manager/testlogin";
	}

	// 新类型 造型生产保存 接口
	@RequestMapping("productMaintenance/newadd/confirm/genestyle")
	public String producrMaintenceNewaddGenestyle(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String isNewaddType = session.getAttribute("isNewaddType").toString();
		if ("true".equals(isNewaddType)) {
			int id = Integer.parseInt(session.getAttribute("tid").toString());

			String TShengcheng = request.getParameter("TShengcheng");
			Type type = new Type();
			type.setTid(id);
			type.setTshengcheng(TShengcheng);
			int isok = typeService.updateByPrimaryKeySelective(type);
			if (isok == 1) {
				request.setAttribute("status", 200);
			} else {
				request.setAttribute("status", 200);
				request.setAttribute("errorMessage", "类型库造型生成字段保存失败");
			}
		} else {
			request.setAttribute("NewaddTypeErrorMessage", "请先填写添加新类型中语义库信息");
		}

		return "manager/testlogin";
	}

	// 新类型 造型调整保存 接口
	@RequestMapping("productMaintenance/newadd/confirm/styleAdjust")
	public String producrMaintenceNewaddstyleAdjust(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String isNewaddType = session.getAttribute("isNewaddType").toString();
		if ("true".equals(isNewaddType)) {
			int id = Integer.parseInt(session.getAttribute("tid").toString());
			String TTiaozheng = request.getParameter("TTiaozheng");
			Type type = new Type();
			type.setTid(id);
			type.setTtiaozheng(TTiaozheng);
			int isok = typeService.updateByPrimaryKeySelective(type);
			if (isok == 1) {
				request.setAttribute("status", 200);
			} else {
				request.setAttribute("status", 100);
				request.setAttribute("errorMessage", "类型库造型调整字段保存失败");
			}
		} else {
			request.setAttribute("NewaddTypeErrorMessage", "请先填写添加新类型中语义库信息");
		}

		return "manager/testlogin";
	}

	@RequestMapping("testform")
	public void testform(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String tid = session.getAttribute("tid").toString();
		System.out.println("tid: " + tid);
		request.setAttribute("tid", "2");
	}

}
