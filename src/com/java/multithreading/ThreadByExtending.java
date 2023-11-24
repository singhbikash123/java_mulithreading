package com.java.multithreading;

/**
 * @author Bikash Singh
 */
public class ThreadByExtending extends Thread {
	private final String name;

	public ThreadByExtending(String name) {
		super(name);
		this.name = name;

	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			// System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread current thread::" + Thread.currentThread().getName() + "Value of i::" + i);
		}
	}

	public static void main(String args[]) {
		System.out.println("Thread name:::" + Thread.currentThread().getName());
		Thread t1 = new ThreadByExtending("Thread 1 ");
		Thread t2 = new ThreadByExtending("Thread 2 ");
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

	}

}
