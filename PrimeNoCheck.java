package p1;

import java.util.Scanner;

public class PrimeNoCheck {

	public static void main(String[] args) {
		int num,i,c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		num=sc.nextInt();
		     for(i=1;i<=num;i++) {
		    	 if(num%i==0) {
		    		 c=c+1;
		    	 }
		     }       
				
                  if(c==2) {
                	  System.out.println("is prime number");
                  }  else {
                	   System.out.println("not a prime number");
                  }
	}

}
