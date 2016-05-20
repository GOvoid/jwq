package com.wk.dtProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CountProxy implements InvocationHandler {

	private Object target;

	public CountProxy(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("开始前***");
		Object res = method.invoke(target, args);
		System.out.println("结束后***");
		return res;
	}

}
