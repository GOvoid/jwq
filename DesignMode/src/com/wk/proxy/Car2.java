package com.wk.proxy;

public class Car2 extends Car{
	@Override
	public void move(){
		long starttime = System.currentTimeMillis();
		System.out.println("������ʼ��");
		super.move();
		long endtime = System.currentTimeMillis();
		System.out.println("����������ʽ����������ʻʱ��" + (endtime - starttime) + "����");
	}

}
