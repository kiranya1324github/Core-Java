package com.edu;

class MyClass2 extends Thread{          
	int total;
	public void run() {                           
	                                                    
	
		synchronized (this) {
			for(int i=1;i<=20;i++) {
				total=total+i;
			}
			notify();
		}
	}
	
}




public class ThreadCoomunication1 {

	public static void main(String[] args) throws InterruptedException {
		MyClass2 ob=new MyClass2();
		ob.start();
		synchronized(ob) {
			System.out.println("Before wait");
			ob.wait();
			System.out.println("sum of 1 to 20 natural numbers="+ob.total);
		}
		

	}

}
