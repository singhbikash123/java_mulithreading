package com.java.multithreading;

public class Account {
	
	private String customerName;
	
	private double balance;
		
	public Account(String customerName, double balance) {
		super();
		this.customerName = customerName;
		this.balance = balance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	
	public synchronized void withdrawAmount(double withdrawal_Amount) throws InterruptedException {
		System.out.println("Insdide withdrawAmount");
		Thread.sleep(9000);
		while(this.balance<withdrawal_Amount) {
			System.out.println("Insdide waiting condition");
			wait();
		}
		this.balance = this.balance - withdrawal_Amount;
		
	}
	
	
	public synchronized void depositeAmount(double deposite_Amount) {
		System.out.println("Insdide depositeAmount method");
		this.balance = this.balance + deposite_Amount;
		//notify();
		notifyAll();
		System.out.println("Notified to waiting thread in queue");
	}
	

	
	
	

}
