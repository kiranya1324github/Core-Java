package p1;

import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		int day;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the day number");
		day=sc.nextInt();
		switch (day) {
		case 1: System.out.println("Enter the Monday");
		         break;
		case 2: System.out.println("Enter the Tuesday");
		         break;
		case 3: System.out.println("Enter the Wednesday");
		         break;
		case 4: System.out.println("Enter the Thursaday");
		         break;
		case 5:  System.out.println("Enter the Friday");
		         break;
		case 6:   System.out.println("Enter the Saturday");
		         break;
		case 7:  System.out.println("Enter the Sunday");
		         break;
	    default: 
	    	
	    	      System.out.println("Invalid Input");
		
	
	
	}
}
}