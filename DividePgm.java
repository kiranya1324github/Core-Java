package p1;

import java.util.Scanner;

public class DividePgm {

	public static void main(String[] args) {
		int choice;
		char ch;
		float amount=10000,withdraw,deposit,balance;
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("1. Choose for deposit");
		System.out.println("2.  Choose for Withdrawl");
		System.out.println("3. Display the Balance");
		System.out.println("Enter your choice");
		choice=sc.nextInt();
		switch(choice) {
		case 1: System.out.println("Enter amount to be deposited");
		         deposit=sc.nextFloat();
		         if(deposit>0) {
		         amount=amount+deposit;
		         System.out.println("amount after deposit   " +amount);
		}
		else {
			      System.out.println("deposit amount shouldn't be negative");
		}
			
		         break;
		         
		case 2:  System.out.println("Enter the amount to be withdrawl");
		          withdraw=sc.nextFloat();
		          if(withdraw<amount)
		          {
		             amount=amount-withdraw;
		          System.out.println("balance amount=  "+amount);
		          }
		          else {
		          
		        	  System.out.println("Insufficient balance");
		          }
		    
		          break;
		case 3:   System.out.println("display the current amount");
		          System.out.println(" balance amount  " +amount);
		          break;
		
		   default: 
			         System.out.println("invalid input");
		         
		}
		      System.out.println("do you want to continue Y/N");
		      ch=sc.next().charAt(0);
		}
		      while(ch!='N'); {
		    	  System.out.println("Outside do while");
		      }
		      
		
		      
		
	}
}


