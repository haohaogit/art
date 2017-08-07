package cn.art.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.art.model.User;

import com.fasterxml.jackson.databind.ObjectMapper;


@Controller
@RequestMapping("json")
public class testController {
	
	@RequestMapping("testRequestBody")
	public void setJson(@RequestBody User user,
			HttpServletResponse response) throws Exception{
		ObjectMapper mapper = new ObjectMapper();
		System.out.println("11111111111111111111111111111");
		//将user对象转换成json输出
		System.out.println(mapper.writeValueAsString(user));
		user.setUemail("csdn@163.com");
		response.setContentType("text/html;charset=UTF-8");
		
		//将user对象转换为json 写到客户端
		response.getWriter().println(mapper.writeValueAsString(user));
	}

}
