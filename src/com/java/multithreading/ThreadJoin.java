package com.java.multithreading;

public class ThreadJoin implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread name:::"+Thread.currentThread().getName()+"::"+i);
		}
		
	}
	
	public static void main(String args[]) {
		
		Runnable r1 = new ThreadJoin();
		Runnable r2 = new ThreadJoin();
		Runnable r3 = new ThreadJoin();
		
		Thread t1 = new Thread(r1,"Thread X");
		Thread t2 = new Thread(r2,"Thread Y");
		Thread t3 = new Thread(r3,"Thread Z");
		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
