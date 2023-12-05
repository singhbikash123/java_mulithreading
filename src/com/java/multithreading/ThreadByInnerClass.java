package com.java.multithreading;

public class ThreadByInnerClass {
	public static void main(String args[]) {
		
	   Runnable r1  = new Runnable() {
		public void run() {
			for(int i = 0;i<5;i++) {
				System.out.println("Thread name::"+Thread.currentThread().getName()+" value of i="+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		
			
		}
	};
	
	Thread t1 = new Thread(r1,"Thread1");
	Thread t2 = new Thread(r1,"Thread2");
	Thread t3 = new Thread(r1,"Thread3");
	t1.start();
	t2.start();
	t3.start();
	
	
		
		
		
	}

}
