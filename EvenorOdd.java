package p1;

import java.util.Scanner;

public class EvenorOdd {
	public static void main(String[] args) {
		int num1;
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter the number");
		num1=sc.nextInt();
		if(num1%2==0)
		{
			System.out.println("Even");
			
		}
		else	
		{  
			System.out.println("Odd");
	
		}
	}

}
