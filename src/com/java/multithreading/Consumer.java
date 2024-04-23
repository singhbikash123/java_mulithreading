package com.java.multithreading;

public class Consumer implements Runnable{
	
	private Container container;
	
	public Consumer(Container container) {
		this.container = container;
	}

	@Override
	public void run() {
		
		for (String message = container.pick();
	             ! message.equals("DONE"); message = container.pick()) {
			
			 System.out.format("MESSAGE RECEIVED: %s%n", message);
	            try {
	                Thread.sleep(5000);
	            } catch (InterruptedException e) {}
		}
		
	}
	
	
	
}