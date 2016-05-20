package com.wk.proxy;

public class Car3 implements Moveable{
	private Car car;

	public Car3(Car car){
		super();
		this.car = car;
	}

	@Override
	public void move(){
		long starttime = System.currentTimeMillis();
		System.out.println("汽车开始了");
		car.move();
		long endtime = System.currentTimeMillis();
		System.out.println("汽车结束形式……汽车行驶时间" + (endtime - starttime) + "毫秒");
	
	}
}
