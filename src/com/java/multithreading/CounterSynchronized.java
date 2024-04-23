package com.java.multithreading;

public class CounterSynchronized {
	
	private int c =0;
	
	public synchronized void increment() {
		System.out.println("Increment Started");
		c++;
	}
	
	public synchronized void decrement() {
		System.out.println("Decrement Started");
		c--;
	}
	
	public  int value() {
		return c;
	}


}