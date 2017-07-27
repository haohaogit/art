package cn.art.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.art.service.JWordService;
import cn.art.service.TypeService;
import cn.art.service.WordService;
import cn.art.util.JsonConvert;
import cn.art.util.pojo.typeIdName;


@Controller
@RequestMapping("manager/dimense")
public class M_dimenseController {
	private JWordService jWordService;
	private TypeService typeService;
	private WordService wordService;
	
	private JsonConvert jsonConvert;
	
	public WordService getWordService() {
		return wordService;
	}
	@Autowired
	public void setWordService(WordService wordService) {
		this.wordService = wordService;
	}

	public M_dimenseController(){
		jsonConvert = new JsonConvert();
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
	
	//降维词汇库 (默认接口)
	@RequestMapping("")
	public String semanticDimense(HttpServletRequest request){
		List<typeIdName> types = typeService.selectAllOnlyIdandName();
		request.setAttribute("types", jsonConvert.list2json(types));
		
		
		return "manager/testlogin";
	}
	
	//降维词汇库 "词汇"点击接口
	@RequestMapping("{wordType}")
	public String semanticDimenseWordType(@PathVariable String wordType,HttpServletRequest request){
		if("voca".equals(wordType)){
			String vocas = jWordService.getVoca();
			request.setAttribute("words", vocas);
		}else if("cidui".equals(wordType)){
			String cidui = jWordService.getcidui();
			request.setAttribute("cidui", cidui);
		}
		
		return "manager/testlogin";
	}
	
	//降维词汇库 添加新词汇接口
	@RequestMapping("addNewVoca")
	public String semanticDimenseAddVoca(HttpServletRequest request){
		String words = wordService.getwordFp();
		request.setAttribute("words", words);
		return "manager/testlogin";
	}
	
	//降维词汇库 添加新词汇/添加 接口
	@RequestMapping("addNewVoca/{wid}/{tid}")
	public String semanticDimenseAddVocaSave(@PathVariable Integer wid,@PathVariable Integer tid,HttpServletRequest request){
		int isok = jWordService.insertVoca(wid, tid);
		if(isok==1){
			//插入成功
			request.setAttribute("status", 200);
		}else{
			request.setAttribute("status", 100);
			request.setAttribute("errorMessage", "降维词汇库词汇插入失败");
		}
		return "manager/testlogin";
	}
	
	//降维词汇库 添加新词对/添加 接口
	@RequestMapping("addCiDui/{wid}/{wid1}/{tid}")
	public String semanticDimenseAddciduiSave(@PathVariable Integer wid,@PathVariable Integer wid1,@PathVariable Integer tid,HttpServletRequest request){
		int isok = jWordService.insertCidui(wid,wid1,tid);
		if(isok==1){
			//插入成功
			request.setAttribute("status", 200);
		}else{
			request.setAttribute("status", 100);
			request.setAttribute("errorMessage", "降维词汇库词对插入失败");
		}
		return "manager/testlogin";
	}
	
	//降维词汇库 删除接口
	@RequestMapping("delete/{jwid}")
	public String semanticDimenseDelete(@PathVariable Integer jwid,HttpServletRequest request){
		int isok = jWordService.deleteByPrimaryKey(jwid);
		if(isok==1){
			//插入成功
			request.setAttribute("status", 200);
		}else{
			request.setAttribute("status", 100);
			request.setAttribute("errorMessage", "降维词汇库删除失败");
		}
		return "manager/testlogin";
	}
	

}
