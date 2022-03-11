package com.edu;

import java.util.Scanner;



class Bank extends Exception {
		Bank(String s){
			super(s);
		}
}	
			

	
		
		class SBI {
			int balance;
			SBI() {
				balance=20000;
			}
			void deposit(int amt) {
				balance=amt+balance;
				System.out.println("total balance" +balance);
		
			}
			void withdraw(int amt)  {
			int withdraw = 10000;
		
			
				try {
				if(amt>balance) {
					throw  new Bank("insufficient balance");
				}
				else {
					balance=balance-withdraw;
					System.out.println("Update balance"  +balance);
				}
					
				}
				
			catch(Bank e) {
			e.printStackTrace();
		}
		}
}

		    
		
			public class MainClassBankBalance {
				
				public static void main(String[] args) {
					SBI ob=new SBI();
					ob.deposit(10000);
					ob.withdraw(40000);
			
				}
			}
	
	

			
		

	
