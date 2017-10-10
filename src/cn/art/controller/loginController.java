package cn.art.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cn.art.model.User;
import cn.art.service.UserService;
import cn.art.util.MD5;
import cn.art.util.pojo.checkLogin;
import cn.art.util.pojo.rUser;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


@Controller
@RequestMapping("")
public class loginController {
	
	private UserService userService;
	public checkLogin checkLogin;
	
	public loginController(){
		
		
		checkLogin = new checkLogin();
		checkLogin.setLogin(false);
	}
	public UserService getUserService() {
		return userService;
	}
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	@RequestMapping("managerLogin")
	public User managerLogin(String account, String password) {
		User user = new User();
		System.out.println("account " + account + " password " + password);
		
		System.out.println(" 1010test account " + account + " test password " + password);
		user.setUname(account);
		return user;
	}
	//             验证  注解 @requestparam() 
	
	@RequestMapping(value="manager/register",method=RequestMethod.GET)
	public String registerForm(){
		System.out.println("1111111111111111111222");
		return "manager/registerForm";
	}
	@RequestMapping(value="manager/register",method=RequestMethod.POST)
	public String register(
			@RequestParam("loginname") String loginname,
			@RequestParam("password") String password,
			@RequestParam("username") String username
			){
		System.out.println("loginname "+loginname+" password "+password+" username "+username);
		
		return "manager/loginForm";
	}
	
	
	
	
	
	//用户登录
	@RequestMapping(value ="customerLogin1",method=RequestMethod.POST)
	public void costomlogin1(HttpServletRequest request,
			@RequestParam("account") String account,
			@RequestParam("password") String password
			) throws NoSuchAlgorithmException, UnsupportedEncodingException{
		//request.get
		boolean isRegister = false;
		
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
			//return "redirect:/user/corpus";
		}else{
			System.out.println("aaaaaaaaaaaaahaohao");
			session.setAttribute("status", "100");
			session.setAttribute("errorMessage", "账户与密码不匹配");
			//return "user/customerLogin";
		}
	}
	
	//用户登录
		@RequestMapping(value ="html/customerLogin",method=RequestMethod.POST)
		public void costomlogin(HttpServletRequest request,
				@RequestBody User user,
				HttpServletResponse response
				) throws NoSuchAlgorithmException, IOException{
			//request.get
			boolean isRegister = false;
			System.out.println("22222222222222222");
			System.out.println(user.getUname()+" 123 "+user.getUpassword());
			HttpSession session = request.getSession();
			//checkLogin.setLogin(true);
			//uname = user.getUname();
			checkLogin.setUsername(user.getUname());
			session.setAttribute("username1", user.getUname());
			//session.setMaxInactiveInterval(60);
			/**
			 * 
			
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
				//return "redirect:/user/corpus";
			}else{
				System.out.println("aaaaaaaaaaaaahaohao");
				session.setAttribute("status", "100");
				session.setAttribute("errorMessage", "账户与密码不匹配");
				//return "user/customerLogin";
			} */
			ObjectMapper mapper = new ObjectMapper();
			response.setContentType("text/html;charset=UTF-8");
			response.getWriter().println(mapper.writeValueAsString(user));
		}
	
	//用户注册
	@RequestMapping(value="user/customerRegister",method=RequestMethod.POST)
	public String costomuserRegister(HttpServletRequest request,
			@RequestParam("newAccount") String newAccount,
			@RequestParam("newPassword") String newPassword,
			@RequestParam("confirmPassword") String confirmPassword,
			@RequestParam("newEmail") String newEmail
			) throws NoSuchAlgorithmException, UnsupportedEncodingException{
		//request.get
		boolean isRegister = false;
		
		//判断用户注册时两次输入密码是否一致
		if(newPassword.trim()!=confirmPassword.trim()){
			request.setAttribute("errorMessage", "两次输入的密码不一致");
		}else{
			int isok = userService.insertSelect(newAccount.trim(), newPassword.trim(), newEmail.trim());
			if(isok==1){
				//插入成功
				request.setAttribute("status", 200);
			}else{
				request.setAttribute("status", 100);
				request.setAttribute("errorMessage", "用户注册失败");
			}
		}
		
		return "user/customerLogin";
	}
	
	//用户注册
	@RequestMapping(value="html/customerRegister",method=RequestMethod.POST)
	public void costomuserRegister(HttpServletRequest request,
			@RequestBody rUser ruser,
			HttpServletResponse response
			) throws NoSuchAlgorithmException, IOException{
		//request.get
		boolean isRegister = false;
		System.out.println("333333333333333333333");
		System.out.println("name "+ruser.getUname()+" password "+ruser.getUpassword()+" cpassword "+ruser.getCpassword());
		/**
		 * 
		
		//判断用户注册时两次输入密码是否一致
		if(ruser.getUpassword().trim()!=ruser.getCpassword().trim()){
			request.setAttribute("errorMessage", "两次输入的密码不一致");
		}else{
			int isok = userService.insertSelect(ruser.getUname().trim(), ruser.getUpassword().trim(), ruser.getUemail().trim());
			if(isok==1){
				//插入成功
				request.setAttribute("status", 200);
			}else{
				request.setAttribute("status", 100);
				request.setAttribute("errorMessage", "用户注册失败");
			}
		} */
		ObjectMapper mapper = new ObjectMapper();
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().println(mapper.writeValueAsString(ruser));
		//return "user/customerLogin";
	}
		
	
	//管理员登录
	@RequestMapping("manager/managerLogin")
	public String costommanagerlogin(HttpServletRequest request,
			@RequestParam("account") String account,
			@RequestParam("password") String password
			) throws NoSuchAlgorithmException, UnsupportedEncodingException{
		//request.get
		boolean isRegister = false;
		System.out.println(account+"22"+password+"33");
		MD5 md = new MD5();
		List<User> users = userService.selectManagerByName(account.trim());
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
	
	
	//检查是否登录
	@RequestMapping(value="html/checkLogin",method=RequestMethod.POST)
	public void costomuserCheckLogin(HttpServletRequest request,
			HttpServletResponse response
			) throws JsonProcessingException, IOException{
		String isExistLogin = (String) request.getSession().getAttribute("username1");
		if(isExistLogin!=null){
			checkLogin.setLogin(true);
			//System.out.println("session域中有用户名"+isExistLogin);
			checkLogin.setUsername(isExistLogin);
			
		}else{
			checkLogin.setUsername("");
			checkLogin.setLogin(false);
			//System.out.println("session域中没有用户名");
		}
		ObjectMapper mapper = new ObjectMapper();
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().println(mapper.writeValueAsString(checkLogin));
		
	}

}
