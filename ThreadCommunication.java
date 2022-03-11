package com.edu;  //notify and wait are used  only in synchronized 

class MyClass1 extends Thread{
int total;
public void run() {
	synchronized(this) {
		for(int i=1;i<=50;i++) {
			total=total+i;
		
		}
		notify();
	}
	
	
}

	
	
}

public class ThreadCommunication {
	public static void main(String[] args) throws InterruptedException {
		
	MyClass1 ob=new MyClass1();
	ob.start();
	synchronized(ob) {
		System.out.println("Before start");
		ob.wait();
		System.out.println("sum of 1 to 50 natural numbers="+ob.total);
	}


		

	}

}
