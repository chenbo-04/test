package com.intercept;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
//��һ�ִ����������÷�ʽ
public class Myintercept extends  MethodFilterInterceptor
{
	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		
		return invocation.invoke();
	}

}
