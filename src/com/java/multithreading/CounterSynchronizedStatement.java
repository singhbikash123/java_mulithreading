package com.java.multithreading;

public class CounterSynchronizedStatement {
	
private int c =0;
	
	public void increment() {
		synchronized (this) {
			c++;
		}
	}
	
	public void decrement() {
		synchronized (this) {
			c++;
		}
	}
	
	public int value() {
		return c;
	}


}
