package p1;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		int i,num,factorial=1;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		num=sc.nextInt();
		
		   i=num;
		   while(i>=1) {
			   factorial=factorial*i;
			   i=i-1;
			   
		   }
                 System.out.println("factorial  "  +factorial);
	}
	

}
