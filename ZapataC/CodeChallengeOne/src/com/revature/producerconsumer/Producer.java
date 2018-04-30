package com.revature.producerconsumer;

public class Producer extends Thread {
	private Basket basket;
	private int number;
	private final int capacity = 10;
	
	public Producer (Basket b, int number) {
		basket = b;
		this.number = number;
	}
	
	public void run() {
		for (int i = 0; i < capacity; i++) {
			basket.put(i);
			System.out.println("Producer #" + this.number + " put: " + i);
			try {
				sleep ((int)(Math.random() * 100));
			} catch (InterruptedException e) {
				
			}
		}
	}
}
