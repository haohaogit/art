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
@RequestMapping("")
public class loginController {
	private UserService userService;
	
	public UserService getUserService() {
		return userService;
	}
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	
	@RequestMapping("html/customerLogin")
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
				break;
			}
		}
		//HTML之间怎么传值
		HttpSession session = request.getSession();
		if(isRegister){
			session.setAttribute("status", "200");
			session.setAttribute("name", account);
			return "redirect:/user/corpus";
		}else{
			System.out.println("aaaaaaaaaaaaahaohao");
			session.setAttribute("status", "100");
			session.setAttribute("errorMessage", "账户与密码不匹配");
			return "user/customerLogin";
		}
	}
	
	@RequestMapping("user/customerLogin")
	public String costomuserlogin(HttpServletRequest request) throws NoSuchAlgorithmException, UnsupportedEncodingException{
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
				break;
			}
		}
		//HTML之间怎么传值
		HttpSession session = request.getSession();
		if(isRegister){
			session.setAttribute("status", "200");
			session.setAttribute("name", account);
			return "redirect:/user/corpus";
		}else{
			System.out.println("aaaaaaaaaaaaahaohao");
			session.setAttribute("status", "100");
			session.setAttribute("errorMessage", "账户与密码不匹配");
			return "user/customerLogin";
		}
	}
	
	@RequestMapping("manager/managerLogin")
	public String costommanagerlogin(HttpServletRequest request) throws NoSuchAlgorithmException, UnsupportedEncodingException{
		//request.get
		boolean isRegister = false;
		String account = request.getParameter("account");
		String password = request.getParameter("password");
		System.out.println("1111111111111111111111111111111111111111111111111111111111");
		System.out.println(account+"  "+password);
		MD5 md = new MD5();
		List<User> users = userService.selectManagerByName(account);
		for(User user:users){
			System.out.println(user.getUname()+"  "+user.getUpassword());
			if(md.str2md5(password).equals(user.getUpassword())){
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
			return "redirect:/manager/testlogin";
		}else{
			System.out.println("aaaaaaaaaaaaahaohao");
			session.setAttribute("status", "100");
			session.setAttribute("errorMessage", "账户与密码不匹配");
			return "manager/managerLogin";
		}
	}
	@RequestMapping("manager/testlogin")
	public void managertest(HttpServletRequest request){
		//String name = "wangzhe";
    	//request.setAttribute("name",name);
    	HttpSession session = request.getSession();
    	String account = (String) session.getAttribute("name");
    	System.out.println(account);
		//return "corpus";
	}
	
	
	
	@RequestMapping("user/corpus")
	public void costomcorpus(HttpServletRequest request){
		//String name = "wangzhe";
    	//request.setAttribute("name",name);
    	HttpSession session = request.getSession();
    	String account = (String) session.getAttribute("name");
    	System.out.println(account);
		//return "corpus";
	}

}
