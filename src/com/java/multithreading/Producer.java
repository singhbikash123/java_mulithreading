package com.java.multithreading;

public class Producer implements Runnable{
	
	private Container container;
		
	public Producer(Container container) {
		this.container = container;
		
	}

	@Override
	public void run() {
		  String importantInfo[] = {
		            "I",
		            "Love",
		            "my",
		            "India!!!"
		        };
		  
		  for(int i=0;i<importantInfo.length;i++) {
			  container.drop(importantInfo[i]);
			  try {
	                Thread.sleep(5000);
	            } catch (InterruptedException e) {}
		  }
		  container.drop("DONE");
	}
	
	
	
}