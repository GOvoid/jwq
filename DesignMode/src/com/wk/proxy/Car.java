package com.wk.proxy;

import java.util.Random;

public class Car implements Moveable {
	public void move() {
		

		try {
			Thread.sleep(new Random().nextInt(1000));
			System.out.println("������ʻ��");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
