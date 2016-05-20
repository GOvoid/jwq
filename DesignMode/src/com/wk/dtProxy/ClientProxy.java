package com.wk.dtProxy;

import java.lang.reflect.Proxy;

public class ClientProxy {
	public static void main(String[] args) {

		Count count = new CountImpl();
		CountProxy countProxy = new CountProxy(count);
		Class<?> cimpl = count.getClass();
		
		Count c = (Count)Proxy.newProxyInstance(cimpl.getClassLoader(), cimpl.getInterfaces(), countProxy);
		
		c.queryCount();
		c.updateCount();
		
	}
}
