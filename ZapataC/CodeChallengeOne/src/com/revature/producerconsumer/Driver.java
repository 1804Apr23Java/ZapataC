package com.revature.producerconsumer;

public class Driver {

	public static void main(String[] args) {
		Basket b = new Basket();
		Producer p1 = new Producer (b, 1);
		Consumer c1 = new Consumer (b, 1);
		p1.start();
		c1.start();
	}

}
