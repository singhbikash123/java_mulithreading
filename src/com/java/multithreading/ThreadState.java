package com.java.multithreading;

class SecondThread implements Runnable {

	@Override
	public void run() {

		try {
			Thread.sleep(102);
		} catch (InterruptedException i1) {
			i1.printStackTrace();
		}

		System.out.println(
				"The state for t1 after it invoked join method() on thread t2" + " " + ThreadState.t1.getState());

		// implementing try-catch block
		try {
			Thread.sleep(202);
		} catch (InterruptedException i2) {
			i2.printStackTrace();
		}

	}

}

public class ThreadState implements Runnable {
	public static Thread t1;
	public static ThreadState ts;

	public static void main(String args[]) {
		ts = new ThreadState();
		t1 = new Thread(ts);
		System.out.println("Post intializing the sate of thread t1:: " + t1.getState());
		t1.start();

		System.out.println("State of thread t1 post start method:: " + t1.getState());
	}

	public void run() {
		SecondThread st = new SecondThread();
		Thread t2 = new Thread(st);
		System.out.println("Post intializing the sate of thread t2:: " + t2.getState());
		t2.start();
		System.out.println("State of thread t1 post start method:: " + t2.getState());

		try {
			t2.sleep(100);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("State of thread t2 post sleep() method:: " + t2.getState());

		try {
			t2.join();
			System.out.println("State of thread t2 post join() method:: " + t2.getState());
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		System.out.println("State of thread t1 post join() method:: " + t1.getState());

	}

}
