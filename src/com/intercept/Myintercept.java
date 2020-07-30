package com.intercept;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
//第一种创建拦截器得方式
public class Myintercept extends  MethodFilterInterceptor
{
	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		
		return invocation.invoke();
	}

}
