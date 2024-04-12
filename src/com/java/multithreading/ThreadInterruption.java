package com.java.multithreading;

public class ThreadInterruption implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			
			
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread name:"+Thread.currentThread().getName()+ ":" +i);
		}

	}

	public static void main(String args[]) {
		
		Runnable r1 = new ThreadInterruption();
		Runnable r2 = new ThreadInterruption();
		Runnable r3 = new ThreadInterruption();
		
		Thread t1 = new Thread(r1,"First Thread ");
		Thread t2 = new Thread(r2,"Second Thread ");
		Thread t3 = new Thread(r3,"Third  Thread ");
		t1.start();
		t2.start();
		t3.start();
		try {
			t1.interrupt();
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName());
	}
}
