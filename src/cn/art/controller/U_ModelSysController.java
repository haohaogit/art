package cn.art.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.art.service.ColorService;
import cn.art.service.JWordService;
import cn.art.service.NewCaseService;
import cn.art.service.PartService;
import cn.art.service.SurveyService;
import cn.art.service.TextureService;
import cn.art.service.TypeService;


@Controller
@RequestMapping("model")
public class U_ModelSysController {
	private JWordService jWordService;
	private TypeService typeService;
	private SurveyService surveyService;
	private PartService partService;
	private ColorService colorService;
	private TextureService textureService;
	private NewCaseService newCaseService;
	
	public NewCaseService getNewCaseService() {
		return newCaseService;
	}
	@Autowired
	public void setNewCaseService(NewCaseService newCaseService) {
		this.newCaseService = newCaseService;
	}
	public ColorService getColorService() {
		return colorService;
	}
	@Autowired
	public void setColorService(ColorService colorService) {
		this.colorService = colorService;
	}
	public TextureService getTextureService() {
		return textureService;
	}
	@Autowired
	public void setTextureService(TextureService textureService) {
		this.textureService = textureService;
	}
	public PartService getPartService() {
		return partService;
	}
	@Autowired
	public void setPartService(PartService partService) {
		this.partService = partService;
	}
	public SurveyService getSurveyService() {
		return surveyService;
	}
	@Autowired
	public void setSurveyService(SurveyService surveyService) {
		this.surveyService = surveyService;
	}
	public JWordService getjWordService() {
		return jWordService;
	}
	@Autowired
	public void setjWordService(JWordService jWordService) {
		this.jWordService = jWordService;
	}
	public TypeService getTypeService() {
		return typeService;
	}
	@Autowired
	public void setTypeService(TypeService typeService) {
		this.typeService = typeService;
	}

	
	//参数设置 类型分类默认接口
	@RequestMapping("setparameter")
	public String modelSetpara(HttpServletRequest request){
		String types = typeService.selectAllOnlyIDName();
		request.setAttribute("types", types);
		
		//取出默认第一个物件类型的tid
		int tid = typeService.getFirstTid();
		//获取词汇类型    1 表示词汇 2 表示词对
		int TWordType = typeService.selectByPrimaryKey(tid).getTwordtype();
		//获取系统造型介绍
		String TZaoxing = typeService.selectByPrimaryKey(tid).getTzaoxing();
		//获取造型图标
		String TIcon = typeService.selectByPrimaryKey(tid).getTicon();
		
		String Words = jWordService.getAllJwordByTID(tid);
		
		
		String ChooseSurvey = surveyService.getChooseSurvey(tid);
		String Algorithms = surveyService.getAlgorithms(tid);
		
		return "manager/testlogin";
	}
	
	//参数设置 类型分类接口
	@RequestMapping("setparameter/{tid}")
	public String modelSetparaBytid(@PathVariable Integer tid,HttpServletRequest request){
		request.setAttribute("tid", tid);
		
		//获取词汇类型    1 表示词汇 2 表示词对
		int TWordType = typeService.selectByPrimaryKey(tid).getTwordtype();
		//获取系统造型介绍
		String TZaoxing = typeService.selectByPrimaryKey(tid).getTzaoxing();
		//获取造型图标
		String TIcon = typeService.selectByPrimaryKey(tid).getTicon();
		
		String Words = jWordService.getAllJwordByTID(tid);
		
		
		String ChooseSurvey = surveyService.getChooseSurvey(tid);
		String Algorithms = surveyService.getAlgorithms(tid);
		
		return "manager/testlogin";
	}
	
	//                                    暂未实现该接口
	//参数设置 保存接口(也是造型生成 入口)
	@RequestMapping("generate/{tid}/{cihuiInfo}")
	public String modelGenerate(@PathVariable Integer tid,@PathVariable String cihuiInfo,HttpServletRequest request){
		request.setAttribute("NewCaseArg", cihuiInfo);
		
		String Imgparameter = "";       //高脚杯返回的是轮廓位置数据
		String recommendImg = "";       //燃气灶等是一个推荐图片
		String recommendRcolor= "";
		String recommendRcolorID = "";
		String recommendRtexture= "";
		String recommendRtextureID = "";
		
		request.setAttribute("Imgparameter", Imgparameter);//高脚杯是位置参数
		request.setAttribute("recommendImg", recommendImg); //其他的是推荐的图片地址
		
		request.setAttribute("recommendRcolor", recommendRcolor);
		request.setAttribute("recommendRcolorID", recommendRcolorID);
		request.setAttribute("recommendRtexture", recommendRtexture);
		request.setAttribute("recommendRtextureID", recommendRtextureID);
		
		
		return "manager/testlogin";
	}
	
	
	//造型生成 "确定"接口   (也是调转到造型调整的接口 部件添加)
	@RequestMapping("generete/{tid}/Confirm")
	public String modelGenerateSave(@PathVariable Integer tid,HttpServletRequest request){
		 //上一步中利用高脚杯的位置数据产生的推荐图示 或燃气灶等的推荐图片
		String recommendRtotal  = request.getParameter("recommendImg");      
		
		String recommendRoutline = request.getParameter("recommendRoutline");
		
		//String recommendRcolor = (String) request.getAttribute("recommendRcolor");
		//int recommendRcolorID = request.getParameter("recommendRcolorID");
		//String recommendRtexture = request.getParameter("recommendRtexture");
		// recommendRtextureID = request.getParameter("recommendRtextureID");
		
		//id生成器   UUID id生成器产生的是 string 类型的ID
		//UUID uuid = UUID.randomUUID();
		request.setAttribute("recommendRtotal", recommendRtotal);
		//request.setAttribute("recommendcolorImg", recommendcolorImg);
		//request.setAttribute("recommendtextureImg", recommendtextureImg);
		
		
		//System.out.println("myname is llllllllllll");
		return "redirect:/model/"+tid+"/partAdd";
	}
	
	//部件添加 接口
	@RequestMapping("{tid}/partAdd")
	public void modelPartAdjust(@PathVariable Integer tid,HttpServletRequest request){
		
		//String recommendImg  = (String)request.getAttribute("recommendRtotal");
		String parts = partService.getPartBasic(tid);
		
		//request.setAttribute("recommendImg", recommendImg);
		request.setAttribute("parts", parts);
		
		//System.out.println("myname is 33333333333333333333");
		//return "manager/testlogin";
	}
	
	//部件添加 保存接口 (也是调转到造型调整的 色彩调整接口)
	@RequestMapping("{pid}/partAdd/confirm")
	public String  modelPartAdjustSave(@PathVariable Integer pid,HttpServletRequest request){
		request.setAttribute("partId", pid);
		String recommendAoutline = request.getParameter("recommendImg"); //用于记录经过部件调整后的整体推荐图片
		request.setAttribute("recommendAoutline", recommendAoutline);  //把 经过部件调整后的整体图片先存到浏览器的request/response域中
		
		int tid = (int) request.getAttribute("tid");
		return "redirect:/model/"+tid+"/colorAdjust";
	}
	
	//色彩调整 接口 
	@RequestMapping("{tid}/colorAdjust")
	public void  modelColorAdjust(@PathVariable Integer tid,HttpServletRequest request){
		
		//String recommendImg1  = (String)request.getAttribute("recommendImg1");
		String colors = colorService.getColorBasic(tid);
		
		//request.setAttribute("recommendImg", recommendImg1);
		request.setAttribute("colors", colors);
	}
	
	//色彩调整 保存接口 (也是调转到造型调整的 材质调整接口)
	@RequestMapping("{cid}/partAdd/confirm")
	public String  modelColordjustSave(@PathVariable Integer cid,HttpServletRequest request){
		request.setAttribute("recommendAcolorID", cid);
		String recommendAcolor = request.getParameter("recommendImg2"); //用于记录经过色彩调整后的整体推荐图片
		request.setAttribute("recommendAcolor", recommendAcolor);  //把 经过色彩调整后的整体图片先存到浏览器的request/response域中
		
		int tid = (int) request.getAttribute("tid");
		return "redirect:/model/"+tid+"/partAdd";
	}
	
	//材质调整 接口 
	@RequestMapping("{tid}/textureAdjust")
	public void  modelTextureAdjust(@PathVariable Integer tid,HttpServletRequest request){
		
		String recommendImg2  = (String)request.getAttribute("recommendImg2");
		String textures = textureService.getTextureBasic(tid);
		
		request.setAttribute("recommendImg", recommendImg2);
		request.setAttribute("textures", textures);
	}
	
	//材质调整 保存接口 (也是调转到造型调整的 材质调整接口)
	@RequestMapping("{textureid}/textureAdjust/confirm")
	public String  modeltextureAdjustSave(@PathVariable Integer textureid,HttpServletRequest request){
		
		
		int tid = (int) request.getAttribute("tid");
		String NewCaseArg = (String) request.getAttribute("NewCaseArg");
		
		String recommendRtotal = (String) request.getAttribute("recommendRtotal");
		String recommendRoutline = (String) request.getAttribute("recommendRoutline");
		
		String recommendRcolor= (String) request.getAttribute("recommendRcolor");
		int recommendRcolorID = (int) request.getAttribute("recommendRcolorID");
		String recommendRtexture= (String) request.getAttribute("recommendRtexture");
		int recommendRtextureID = (int) request.getAttribute("recommendRtextureID");
		
		///////////////////////来源？？？？？？？？
		String recommendAtotal = (String) request.getAttribute("recommendImg3");//用于记录经过材质调整后的整体推荐图片
		String recommendAoutline = (String) request.getAttribute("recommendAoutline");
		
		String recommendAcolor= (String) request.getAttribute("recommendAcolor");
		int recommendAcolorID = (int) request.getAttribute("recommendAcolorID");
		String recommendAtexture= (String) request.getAttribute("recommendAtexture");
		int recommendAtextureID = textureid;
		
		//newCaseService.insertSelect(tid, newcasename, newcaseRtotal, newcaseRoutline, newcaseRcolor, newcaseRtexture, newcaseAtotal, newcaseAoutline, newcaseAcolor, newcaseAtexture)
		//String recommendImg3 = request.getParameter("recommendImg3"); 
		//request.setAttribute("recommendImg1", recommendImg1);  //把 经过材质调整后的整体图片先存到浏览器的request/response域中
		
		
		
		
		
		return "";
	}


}
