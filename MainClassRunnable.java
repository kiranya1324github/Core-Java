package edu.com;

class MyClass implements Runnable{

	

@Override
public void run() {
	
		for(int i=0;i<=5;i++) {
			System.out.println("Inside run method " +Thread.currentThread());
			try {
		   Thread.sleep(1000);
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
	
	
}
}
}

public class MainClassRunnable {

	public static void main(String[] args) throws InterruptedException {
		
		MyClass ob=new MyClass();
		Thread tob=new Thread(ob);
		Thread tob1=new Thread(ob);
		System.out.println("main class");
		System.out.println("Inside run method " +Thread.currentThread());
		tob.setName("First");
		tob1.setName("Second");
		tob.start();
		tob1.start();
		tob.setPriority(2);
		tob1.setPriority(5);
		
		
	
		System.out.println(tob.isAlive());
		tob.join();
		tob1.join();
		
	
		
		
		

	}

}