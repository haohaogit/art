package cn.art.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.art.service.JWordService;
import cn.art.service.TypeService;
import cn.art.util.JsonConvert;
import cn.art.util.pojo.typeIdName;


@Controller
@RequestMapping("manager/dimense")
public class M_dimenseController {
	private JWordService jWordService;
	private TypeService typeService;
	
	private JsonConvert jsonConvert;
	
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
	
	
	
	
	
	
	
	
	//降维词汇库 (默认接口)
	@RequestMapping("")
	public String semanticDimense1(HttpServletRequest request){
		
		return "manager/testlogin";
	}

}
