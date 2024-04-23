package com.java.multithreading;

public class ThreadInterferenceSolution {
	
public static void main(String[] args) throws InterruptedException {
		
	CounterSynchronized counter = new CounterSynchronized();
			
		Thread t1 = new Thread(new Runnable() {
				
				@Override
				public void run() {
					for(int i= 0;i<5;i++) {
						
						try {
							Thread.sleep(9000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						counter.increment();
						
					}
					
				}
			});
			
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i= 0;i<5;i++) {
					
					try {
						Thread.sleep(9000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					
					}
					counter.decrement();
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
