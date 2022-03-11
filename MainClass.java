package com.edu;

class MyClass extends Thread {   //override the run method
	
	public void run() {
		for(int i = 0;i<=100;i++) {
		System.out.println("Inside run Thread "+Thread.currentThread());
		
		try {
			Thread.sleep(10000);      //sleep Thread
		}catch(InterruptedException e) {
			e.printStackTrace();
			
		}
	}

	}
}


public class MainClass {

	public static void main(String[] args) {
		MyClass  ob =new MyClass(); //new class
		MyClass  ob1=new MyClass(); //new class
		System.out.println(" Main JVM Thread "+Thread.currentThread());
		System.out.println("Thread-0 "+ob.isAlive());
		System.out.println("Thread-1 "+ob1.isAlive());
		ob.setName("First");
		ob1.setName("Second");
		
	
	         ob.start();    //start will run the method  //Runnable state
            ob1.start();      //Runnable state
            //ob1.start(); IIligal ThreadException
	}

}
	


