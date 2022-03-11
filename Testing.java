package edu.com;

class MyClass2 extends Thread {
	public void run() {
		for(int i=0;i<=10;i++) {
			try {
				Thread.sleep(1000);    //sleep method
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Thread run method" +Thread.currentThread());
	}
}


public class Testing {

	public static void main(String[] args) throws InterruptedException {
		MyThreadClass ba=new MyThreadClass();
		MyThreadClass ba1=new MyThreadClass();
		System.out.println("main class");
		System.out.println("Thread run method" +Thread.currentThread());
		ba.setName("First");
		ba1.setName("Second"); 
		ba.setPriority(5);//set name
		ba1.setPriority(8);
	   
		ba.start();
	   System.out.println(ba.isAlive());
		
		ba.join();
		
		ba1.start();  //run method
		 System.out.println(ba.isAlive());
		
	}

}
