package cn.art.controller;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.art.service.JWordService;
import cn.art.service.SurveyService;
import cn.art.service.TypeService;


@Controller
@RequestMapping("model")
public class U_ModelSysController {
	private JWordService jWordService;
	private TypeService typeService;
	private SurveyService surveyService;
	
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
	
	/*                                    暂未实现该接口
	//参数设置 保存接口(也是造型生成 入口)
	@RequestMapping("generate/{tid}/{cihuiInfo}")
	public String modelGenerate(@PathVariable Integer tid,@PathVariable String cihuiInfo,HttpServletRequest request){
		
		String Imgparameter = "";
		String recommendImg = "";
		String recommendcolor = "";
		String recommendcolorRGB = "";
		String recommendtextureImg = "";
		String recommendtextureImg1 = "";
		
		
		
		return "manager/testlogin";
	}
	*/
	
	//造型生成 "确定"接口   (也是调转到造型调整的接口 部件添加)
	@RequestMapping("generete/{tid}/Confirm")
	public String modelGenerateSave(@PathVariable Integer tid,HttpServletRequest request){
		
		String recommendImg  = request.getParameter("recommendImg ");
		String recommendcolor = request.getParameter("recommendcolor");
		String recommendtextureImg = request.getParameter("recommendtextureImg");
		
		//id生成器
		UUID uuid = UUID.randomUUID();
		
		int nid = 0;
		
		
		return "manager/testlogin";
	}

}
