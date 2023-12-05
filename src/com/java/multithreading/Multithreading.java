package com.java.multithreading;

public class Multithreading implements Runnable{
	
	private int i =0;
	
    public synchronized void increment() {
    	 	i++;
    }
    
    public synchronized int getValue() {
    	return i;
    }

	@Override
	public void run() {
		for(int i =0; i<5; i++) {
			increment();
			try {
				Thread.sleep(101);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" Get Value::"+getValue()); 
		}
		
	}
	
	public static void main(String args[]) {
		
		Runnable r1 = new Multithreading();
		Runnable r2 = new Multithreading();

		Thread t1 = new Thread(r1,"Thread 1");
		Thread t2 = new Thread(r2,"Thread 2");
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

