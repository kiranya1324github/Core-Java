package com.edu;

class Customer  {
	int amount;
	public Customer() {
		amount=30000;
	}
	
	
	synchronized void deposit(int amount) {
		System.out.println("Inside deposit");
	
	
		this.amount=this.amount+amount;
		System.out.println("amount is deposited");
		notify();
	}
	synchronized void withdraw(int amount) throws InterruptedException {
		System.out.println("Inside withdraw");
	
		if(amount>this.amount) {
		System.out.println(" withdraw is not possible");
		System.out.println("First you have to deposit");
		wait();
		this.amount=this.amount-amount;
		System.out.println("Your balance after withdraw " +this.amount);
	}
		else {
			this.amount=this.amount-amount;
			System.out.println("Your balance after withdraw " +this.amount);
		}
			
		}
	
}

public class ThreadBank {
	
	
	

	public static void main(String[] args) {
		Customer cob=new Customer();
		
	
			Thread ob1=new Thread() {
			public void run() {
				cob.deposit(10000);
			}
			};
			ob1.start();
			Thread ob2=new Thread() {
			public void run() {
				try {
					cob.withdraw(50000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
			
	};
		
		

	}

}
