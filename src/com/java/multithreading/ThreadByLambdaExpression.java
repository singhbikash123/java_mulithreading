package com.java.multithreading;

public class ThreadByLambdaExpression {
	
	//Thread lambda expression implemenation
	public static Runnable r = ()->{
		
		for(int i =0;i<5;i++) {

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread name::"+Thread.currentThread().getName()+"Thread State::>"+Thread.currentThread().getState());
			
		}
	};
	
	public static void main(String args[]) {
		
	 System.out.println("Thread name::"+Thread.currentThread().getName());
	 Thread t1 = new Thread(r,"Thread 1 ");
	 Thread t2 = new Thread(r,"Thread 2 ");
	 System.out.println("T1 State::"+t1.getState());
	 System.out.println("T2 State::"+t2.getState());
	
	 t1.start();	
	 t2.start();
	 System.out.println("T1 State::"+t1.getState());
	 System.out.println("T2 State::"+t2.getState());
	 try {
		t1.join();
		t2.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	
		
	}

}
