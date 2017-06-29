package cn.art.controller;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.art.model.User;
import cn.art.service.UserService;
import cn.art.util.MD5;


@Controller
@RequestMapping("/html")
public class loginController {
	private UserService userService;
	
	public UserService getUserService() {
		return userService;
	}
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	
	@RequestMapping("customerLogin")
	public String costomlogin(HttpServletRequest request) throws NoSuchAlgorithmException, UnsupportedEncodingException{
		//request.get
		boolean isRegister = false;
		String account = request.getParameter("account");
		String password = request.getParameter("password");
		
		System.out.println(account+"  "+password);
		MD5 md = new MD5();
		List<User> users = userService.selectUserByName(account);
		for(User user:users){
			System.out.println(user.getUname()+"  "+user.getUpassword());
			if(md.str2md5(password).equals(user.getUpassword())){
				System.out.println("登录成功"+password+"  "+user.getUname()+"  "+user.getUpassword());
				isRegister = true;
			}
		}
		
		if(isRegister){
			
			//HTML之间怎么传值
			HttpSession session = request.getSession();
			session.setAttribute("status", "200");
			session.setAttribute("name", account);
			return "redirect:/html/corpus.do";
		}else{
			return "customerLogin";
		}
	}
	@RequestMapping("corpus")
	public String costomcorpus(HttpServletRequest request){
		//String name = "wangzhe";
    	//request.setAttribute("name",name);
    	HttpSession session = request.getSession();
    	String account = (String) session.getAttribute("name");
    	System.out.println(account);
		return "corpus";
	}

}
