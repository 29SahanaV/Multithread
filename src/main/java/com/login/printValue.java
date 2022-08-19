package com.login;
 //resource
class syncounter {
	int i=0;
	public synchronized void increment() {                //synchronization method
		i++;
	}
}


public class printValue {

	public static void main(String[] args) throws InterruptedException {

		syncounter c=new syncounter();
		
	
		Thread t1= new Thread()
		{		
			public void run() {
				for(int i=1;i<=1000;i++)
					c.increment();
			}
		};
	
		Thread t2=new Thread()
		{
			public void run() {
				for(int i=1;i<=1000;i++)
					c.increment();
			}
		};
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		System.out.println(c.i);
		
		
	}
}
