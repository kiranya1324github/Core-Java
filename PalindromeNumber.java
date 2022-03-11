package p1;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
       Scanner sc=new Scanner(System.in);
       int num,rev=0,digit,num1;
       System.out.println("Enter a number");
       num=sc.nextInt();
       System.out.println("before while num= "+num);
        num1=num;
        
		
             while(num!=0) {
            	 digit=num%10;
            	 rev=rev*10+digit;
            	 num=num/10;
             }
             System.out.println("Reversed Number is" +rev);
             System.out.println(" after while num=  "+num);
         if(rev==num1) {
           System.out.println("It is a palindrome");
         }else {
           System.out.println("Not a palindrome");
           }
         }
        	 
	}


