package cn.art.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.art.service.WordService;

@Controller
@RequestMapping("search")
public class U_search {
	private WordService wordService;
	
	
	public WordService getWordService() {
		return wordService;
	}
	@Autowired
	public void setWordService(WordService wordService) {
		this.wordService = wordService;
	}


	@RequestMapping("facade")
	public String UserSearch(HttpServletRequest request){
		
		return "manager/testlogin";
	}
	

}
