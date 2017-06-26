package cn.art.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/html")
public class loginController {
	
	
	@RequestMapping("customerLogin")
	public String comtomlogin(HttpServletRequest request){
		//request.get
		String account = request.getParameter("account");
		String password = request.getParameter("password");
		
		System.out.println(account+"  "+password);
		if("111".equals(account)&&"222".equals(password)){
			return "redirect:/html/corpus.do";
		}else{
			return "customerLogin";
		}
	}
	@RequestMapping("corpus")
	public String comtomcorpus(HttpServletRequest request){
		String name = "wangzhe";
    	request.setAttribute("name",name);
    	System.out.println("1111111111");
		return "corpus";
	}

}
