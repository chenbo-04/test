package com.web;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

public class ImpAction implements Action{

	@Override
	public String execute() throws Exception {
		System.out.println("����ʵ��Action�ӿڵ���");
		return "defaultAction";
	}
	public String login() throws Exception {
//		ServletActionContext.getRequest().setAttribute("username", "123");
//		ServletActionContext.getRequest().setAttribute("password", "123");
		ActionContext.getContext().put("username", "123");
		ActionContext.getContext().put("password", "123");
		return "toLogin";
	}

}
