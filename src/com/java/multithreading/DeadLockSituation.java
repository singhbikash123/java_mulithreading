package com.java.multithreading;

public class DeadLockSituation {
	
	public static void main(String args[]) {
		
		Friend bikash = new Friend("Bikash");
		Friend alika = new Friend("Alika");
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				bikash.greeted(alika);	
			}
		});
		
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				bikash.greeted(alika);	
			}
		});
		
		
		
		
	}

}


class Friend{
	
	 private final String name;
     public Friend(String name) {
         this.name = name;
     }
     public String getName() {
         return this.name;
     }
     public synchronized void greeted(Friend bower) {
         System.out.format("%s: %s"
             + "  has greeted to me!%n", 
             this.name, bower.getName());
         bower.greetedBack(this);
     }
     public synchronized void greetedBack(Friend bower) {
         System.out.format("%s: %s"
             + " has greeted back to me!%n",
             this.name, bower.getName());
     }
}

