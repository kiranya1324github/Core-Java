package edu.com;


	 class MyThreadClass extends Thread{
		public void run() {
			for(int i=1;i<=100;i++) {
			System.out.println(" Inside run method" +Thread.currentThread());
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
			}
		}
	}
	 } 
		
		public class MyMainClass {
	public static void main(String[] args) {
		
		
		MyThreadClass ob=new MyThreadClass();
		
		
		MyThreadClass ob1=new MyThreadClass();
		
		System.out.println("main method");
		ob.setName("First");
		
		ob1.setName("Second");
		ob.start();
		try {
			ob.join();
		
		
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		ob1.start();
		try {
			ob.join();
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		
		

	}
		}

