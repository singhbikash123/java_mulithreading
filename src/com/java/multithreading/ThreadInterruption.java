package com.java.multithreading;

public class ThreadInterruption implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

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

	}

	public static void main(String args[]) {
		Runnable r1 = new ThreadInterruption();
		Runnable r2 = new ThreadInterruption();
		
		Thread t1 = new Thread(r1,"Thread X");
		Thread t2 = new Thread(r2,"Thread Y");
	
		
		t1.start();
		t2.start();
		
		t1.interrupt();
		if(t1.isInterrupted()) {
			
			System.out.println("Threa t1 got interrupted");
		}
		
		

	}

}
