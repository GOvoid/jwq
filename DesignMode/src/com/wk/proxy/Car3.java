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
		System.out.println("������ʼ��");
		car.move();
		long endtime = System.currentTimeMillis();
		System.out.println("����������ʽ����������ʻʱ��" + (endtime - starttime) + "����");
	
	}
}
