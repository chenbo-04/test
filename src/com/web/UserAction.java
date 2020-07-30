package com.web;

import org.apache.struts2.ServletActionContext;

import com.domain.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.service.UserService;

public class UserAction extends ActionSupport implements ModelDriven<User>{
	public User user =new User();

	public String login() throws Exception  {
		System.out.println("这是登入");
		UserService userService = new UserService();
		boolean success = userService.findUser(user);
		if(success) {
			return "success";
		}
		else {
			ServletActionContext.getRequest().setAttribute("error", "用户名密码错误");
			return "error";
		}
	
		
		
	}
	public String register() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("这是注册");
		return null;
	}
	

	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}

	
	
}
