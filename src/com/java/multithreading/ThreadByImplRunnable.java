package com.java.multithreading;

public class ThreadByImplRunnable implements Runnable {

	@Override
	public void run() {
		for(int i = 0;i<5;i++) {
			System.out.println("Thread name::"+Thread.currentThread().getName()+" value of i="+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	public static void main(String args[]) {
		
		Runnable r1 = new ThreadByImplRunnable();
		Thread t1 = new Thread(r1,"Runnable 1");
		Thread t2 = new Thread(r1,"Runnable 2");
		Thread t3 = new Thread(r1,"Runnable 3");
		t1.start();
		t2.start(); 
		t3.start();
		
	}
	
	

}
