package com.login;

public class Threads {

	public static void main(String[] args)  throws InterruptedException{
		// TODO Auto-generated method stub
	
		Thread t2=new Thread() {
			public void run() {
				for(int i=1;i<=5;i++)
				{
					System.out.println("Hello People");
					try {
						Thread.sleep(1000);
					}catch(Exception e) {}
				}	
			}
		};
		
		
		webdesigning wd= new webdesigning();
		digitalMarketing dm=new digitalMarketing();
		javacourse jc=new javacourse();
		Thread t1=new Thread(jc);
		t1.start();
		t2.start();
		wd.start();
		dm.start();
		wd.join();
		dm.join();
		t1.join();
		t2.join();
		
		dm.setName("Anudip Thread");
		System.out.println("Name of digital marketing  is: "+dm.getName());
		wd.setPriority(Thread.MAX_PRIORITY);
		System.out.println("Priority of wd is :"+wd.getPriority());
	}

}


abstract class deepTech{
	abstract public void aws();
}

class javacourse extends deepTech implements Runnable{
	
	public void run() {
		System.out.println("welcome to Java");
	}
	public void aws() {
		System.out.println("Welcome to AWS");
	}
}


class webdesigning extends Thread{
	
	public void run() {
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hi People");
			try {
				Thread.sleep(1000);
			}catch(Exception e) {}
		}
}

	
}

class digitalMarketing extends Thread{
	
	public void run() {
			
			for(int i=1;i<=5;i++)
			{
				System.out.println("Hello People");
				try {
					Thread.sleep(1000);
				}catch(Exception e) {}
			}
	}
}


