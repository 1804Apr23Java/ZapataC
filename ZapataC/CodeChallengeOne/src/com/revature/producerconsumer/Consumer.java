package com.revature.producerconsumer;

public class Consumer extends Thread {
	private Basket basket;
	
	public Consumer (Basket b, int number) {
		basket = b;
	}
	
	public void run() {
		int value = 0;
		for (int i = 0; i < 10; i++) {
			value = basket.get();
			System.out.println("Consumer got: " + value);
		}
	}
}
