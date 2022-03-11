package edu.com;

import java.util.Scanner;

public class DivideError {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		a=sc.nextInt();
		System.out.println("enter the second number");
		b=sc.nextInt();
		System.out.println("Before division");
		try {
			c=a/b;
			
		}catch(ArithmeticException e) {
			e.getStackTrace();
			System.out.println("catch block is used only during exception");
		}
		finally {
			System.out.println("finally block always excutes");
		}
		
			System.out.println("After division");
		}
		

	}


