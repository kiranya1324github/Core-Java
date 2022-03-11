package p1;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,squarenum = 0,sum=0,digit;
		System.out.println("Enter a number");
              num=sc.nextInt();
              squarenum=num*num;
              while(squarenum!=0) {
            	     digit=squarenum%10;
            	     sum=sum+digit;
            	     squarenum=squarenum/10;
            	  
              }
                      if(sum==num) {
                    	  System.out.println("Neon number");
                      }else {
                    	   System.out.println("Not a Neon number");
                      }
	}

}
