package com.java.multithreading;

public class SynchronizedCounter {
	
	private int c =0;
	
	public synchronized void increment() {
		c++;
	}
	
	public synchronized void decrement() {
		c--;
	}
	
	 public synchronized int value() {
	        return c;
	    }
	 
	 public static synchronized void display() {
		 System.out.println("I am at static synchronized");
		 
	 }
	 
	 public static synchronized void display1() {
		 System.out.println("I am at non static synchronized");
		 
	 }

}
