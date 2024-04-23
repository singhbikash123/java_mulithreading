package com.java.multithreading;

public class DeadlockMainThread extends Thread{
	
	private static Thread mainThread;
	
	public void run() {
		
	     System.out.println("Child Thread waiting for" + 
                 " main thread completion");
		
		try {
			mainThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			  System.out.println("Child thread execution" + 
                      " completes");
		}
		
	}
	
	public static void main(String args[]) throws InterruptedException {
		
		DeadlockMainThread.mainThread = Thread.currentThread();
		DeadlockMainThread thread = new DeadlockMainThread();
		thread.start();
	        System.out.println("Main thread waiting for " + 
	                            "Child thread completion");
	 
	        // main thread is waiting for the completion
	        // of Child thread
	        thread.join();
	 
	        System.out.println("Main thread execution" + 
	                                      " completes");
		
	}

	
	

}
