package p1;

import java.util.Scanner;

public class SimpleInterest {
		public static void main(String[] args) {
	      float p,t,r,si;
	      Scanner input=new Scanner(System.in);
	      System.out.println("Enter principal amount");
	      p=input.nextFloat();
	      System.out.println("Enter duration");
	      t=input.nextFloat();
	      System.out.println("Enter rate of interest");
	      r=input.nextFloat();
	      
	      si=(p*t*r)/100;
	      System.out.println("Simple Interest=Rs.100    "+si);
	      
	      
	      
		
		

	}

}
