package com.java.multithreading;

public class ThreadSynchronizedStatements {

	public static void main(String args[]) throws InterruptedException {
		CounterSynchronizedStatement stmt = new CounterSynchronizedStatement();
		

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {

					stmt.increment();
	
			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
					stmt.increment();

			}
		});

		Thread t3 = new Thread(new Runnable() {

			@Override
			public void run() {
				
					stmt.increment();

			}
		});
		
		t1.start();
		t2.start();
		t3.start();
	
		t1.join();
		t2.join();
		t3.join();
		
		System.out.println("Counter Value::"+stmt.value());
		

	}
	
	

}
