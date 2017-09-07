package cn.art.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.art.model.Word;
import cn.art.service.JWordService;
import cn.art.service.SurveyService;
import cn.art.service.TypeService;
import cn.art.service.WordService;
import cn.art.util.pojo.typeIdName;
import cn.art.util.pojo.wordFV;


@Controller
@RequestMapping("html/corpus")
public class U_corpusController {
	private WordService wordService;
	private TypeService typeService;
	private JWordService jWordService;
	private SurveyService seurveyService;
	
	public SurveyService getSeurveyService() {
		return seurveyService;
	}
	@Autowired
	public void setSeurveyService(SurveyService seurveyService) {
		this.seurveyService = seurveyService;
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
	public WordService getWordService() {
		return wordService;
	}
	@Autowired
	public void setWordService(WordService wordService) {
		this.wordService = wordService;
	}

	//基础意象词汇库  详细分类接口
	@RequestMapping("basic/firstChar")
	@ResponseBody
	public List<wordFV> corpusBasic(Model model,HttpServletRequest request){
		List<wordFV> words = new ArrayList<wordFV>();
		words = wordService.getWordFV();
		
		return words;
	}
	
	@RequestMapping("basic/vocabularyType")
	@ResponseBody
	public List<wordFV> corpusBasic1(Model model,HttpServletRequest request){
		List<wordFV> words = new ArrayList<wordFV>();
		words = wordService.getWordFV();
		
		return words;
	}
	
	//基础意象语义库 详细词汇接口(比如"安宁")
	@RequestMapping("basic/word")
	@ResponseBody
	public Word corpusBasicWordDetail(Model model,Integer wid,HttpServletRequest request){
		Word word = new Word();
		word = wordService.selectByPrimaryKey(wid);
		System.out.println("word success       11111111111111111111111");
		return word;
	}
	
	//降维词汇库 物件类型默认接口
	@RequestMapping("dimense/type")
	@ResponseBody
	public List<typeIdName> corpusDimensetype(Model model){
		List<typeIdName> typelist = new ArrayList<typeIdName>();
		typelist = typeService.selectAllOnlyIDName1();
		
		return typelist;
	}
	
	//降维词汇库  详细词汇接口(比如"朝气")
	@RequestMapping("dimense/words")
	@ResponseBody
	public List<wordFV> corpusDimense(Model model,String tname){
		List<wordFV> words = new ArrayList<wordFV>();
		
		words = jWordService.getAllJwordByTName(tname);
		System.out.println("111  jWordService.getAllJwordByTName(tname);   11111111111111");
		return words;
	}
	
	
	
	
	//问卷调查与检验 物件类型默认接口
	@RequestMapping("question")
	public String corpusQuestion(HttpServletRequest request){
		String types = typeService.selectAllOnlyIDName();
		request.setAttribute("types", types);
		
		int tid = typeService.getFirstTid();
		String surveys = seurveyService.selectSurveysByTID(tid);
		request.setAttribute("surveys", surveys);
		
		return "manager/testlogin";
	}
	
	//问卷调查与检验   xx物件类型调查接口
	@RequestMapping("question/{tid}")
	public String corpusQuestionClassify(@PathVariable Integer tid,HttpServletRequest request){
		
		String surveys = seurveyService.selectSurveysByTID(tid);
		request.setAttribute("surveys", surveys);
		
		return "manager/testlogin";
	}
	
	

}
