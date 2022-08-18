package com.login;

public class multi {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		wish w=new wish();      //Thread
		greet g=new greet();    //Thread
		
	   //	w.display();    dont want to invoke display method bcz we dont have
	//	g.display()
    /*Thread class lamda expn (5 lines code)*/
	//	Thread t1=new Thread(()->{        //enorormous class tecn -> to reduce no.of lines of code
	//	for(int i=1;i<5;i++)
	//	{
	//		System.out.println("welcome to java");    //o/p:wlc to java hi ppl hi ppl... hello ppl..... 
	//		try { Thread.sleep(1000); } catch(Exception e) {}     //o/p: welcome to java 
			                                                            //  hi ppl
			                                                            //hello ppl......(5 iterations)  
	//	}
	//	});
	//	t1.start();
		w.start();        //to invoke the Thread
		//System.out.println(w.isAlive());      //TRUE hello hi......goodbye
		g.start();       //to invoke the Thread
		
		try {         // by this  Join method helps to waits main thread to execute wish n greet thread
		w.join();      //for writing join method try and catch is a must otherwise exception will rise
		g.join();     //o/p: hi ppl hello pll ....goodbye
		}
		catch(Exception e) {}
		System.out.println(w.isAlive());   //isAlive -FALSE when w its complete its executions
		System.out.println("goodbye");        //bfr executing two Threads  o/p:goodbye hi ppl hello ppl...
	}

}
class wish extends Thread{                       //extends thread to change class into Thread class
	  // by this we ll get iteration within 5 sec -> hello ppl hi ppl hello ppl hi ppl....(5 times)
	public void run()                       //replaced display() by run() bcz its Thread class
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("hello ppl");
			try {
				Thread.sleep(1000);  //for every 1 second it executes for 5 iteration
			}
			catch(Exception e) {}
		}
	}
}
class greet extends Thread{                       //extends thread to change class into Thread class
	public void run()                              //replaced display() by run() bcz its Thread class
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("hi ppl");
			try {
				Thread.sleep(1000);     //for every 1 second it executes for 5 iteration
			}
			catch(Exception e) {}
		}
	}
}