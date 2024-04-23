package com.java.multithreading;

public class ThreadStaticSynchronization {

	public static void main(String args[]) throws InterruptedException {

		SynchronizedCounter sc = new SynchronizedCounter();

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				
				SynchronizedCounter.display();
				try {
					Thread.sleep(9000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				sc.display1();
				try {
					Thread.sleep(9000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();

	}

}
