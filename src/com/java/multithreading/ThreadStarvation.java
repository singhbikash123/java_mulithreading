package com.java.multithreading;

public class ThreadStarvation extends Thread {
	 static int threadcount = 1;
	 private String threadName;
	 
	 public ThreadStarvation(String threadName) {
		 super(threadName);
	 }
	
	public void run() {
		
		System.out.println("Thread::"+Thread.currentThread().getName()+"::gettting called");
	}
	
	
	public static void main(String args[]) {
		
		Thread t1 = new ThreadStarvation("Thread Max");
		t1.setPriority(MAX_PRIORITY);
		
		Thread t2 = new ThreadStarvation("Thread Normal");
		t2.setPriority(8);
		
		Thread t3 = new ThreadStarvation("Thread Min");
		t3.setPriority(7);
		
		Thread t4 = new ThreadStarvation("Thread Min below");
		t4.setPriority(6);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		
	}

	public String getThreadName() {
		return threadName;
	}

	public void setThreadName(String threadName) {
		this.threadName = threadName;
	}

}
