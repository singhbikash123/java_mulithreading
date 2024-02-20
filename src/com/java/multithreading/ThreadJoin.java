package com.java.multithreading;

public class ThreadJoin {
	
	
	public static void main(String args[]) {
		
		Runnable r1 = ()->{
			for (int i = 0; i < 5; i++) {
				System.out.println("Thread name::" + Thread.currentThread().getName() + " i:::" + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					System.out.println("Thread interrupted and existing");
					// return;
				}

			}
			
		};
		
		Thread t1 = new Thread(r1,"Thread X");
		Thread t2 = new Thread(r1,"Thread Y");
		System.out.println(Thread.currentThread().getName());
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName());
	
	}

}
