package p1;

import java.util.Scanner;

public class Factorial_ForLoop {

	public static void main(String[] args) {
		int i,num,factorial=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		num=sc.nextInt();
		
		for(i=num;i>=1;i--) {
			factorial=factorial*i;
		}
			System.out.println("factorial   "    +factorial);
		
		

	}

}
