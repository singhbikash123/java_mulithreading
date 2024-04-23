package com.java.multithreading;

public class Container {
	private String message;

	private boolean empty_flag = true;

	public synchronized String pick() {
		while (empty_flag) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}

		empty_flag = true;
		notifyAll();

		return message;

	}

	public synchronized void drop(String message) {

		while (!empty_flag) {

			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		empty_flag = false;
		this.message = message;
		notifyAll();

	}

}