package com.wk.proxy;

public class Car2 extends Car{
	@Override
	public void move(){
		long starttime = System.currentTimeMillis();
		System.out.println("汽车开始了");
		super.move();
		long endtime = System.currentTimeMillis();
		System.out.println("汽车结束形式……汽车行驶时间" + (endtime - starttime) + "毫秒");
	}

}
