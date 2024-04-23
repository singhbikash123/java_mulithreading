package com.java.multithreading;

public class ThreadInterference {
	
	public static void main(String[] args) throws InterruptedException {
		
		Counter counter = new Counter();
			
		Thread t1 = new Thread(new Runnable() {
				
				@Override
				public void run() {
					for(int i= 0;i<5;i++) {
						counter.increment();
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}
					
				}
			});
			
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i= 0;i<5;i++) {
					counter.decrement();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		});
	   t1.start();
	   t2.start();
	   
	   t1.join();
	   t2.join();
	   
	   System.out.println("Counter Value:::"+counter.value());
	
	}
}
