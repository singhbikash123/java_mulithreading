package com.java.multithreading;

public class SynchronizedWaitNotifyNotifyAll {
	
	public static void main(String args[]) throws InterruptedException {
		Account acc = new Account("Bikash", 20000);
		
	   Thread t1 = new Thread(new Runnable() {
		@Override
		public void run() {
			try {
				acc.withdrawAmount(30000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	});
	   
	   Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					acc.withdrawAmount(30000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	   
	   Thread t3 = new Thread(new Runnable() {
			@Override
			public void run() {
				acc.depositeAmount(30000);
			}
		});
	   
	   t1.start();
	   t2.start();
	   t3.start();
	   t1.join();
	   t2.join();
	   t3.join();
	   
	   System.out.println(acc.getCustomerName() +":"+ acc.getBalance());
		   
	   
	   
	}

}
