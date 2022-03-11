package p1;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		 int num,digit,rev=0;
		 System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		// input num=123 output 321
		    digit=num%10;  // digit=3
		    System.out.println(digit);
		   num=num/10;   //num=123/10=12
		   digit=num%10;  //digit=12%10=2
		    
		   System.out.println(digit);//32
		   num=num/10;//12/10=1
		   digit=num%10;
		
		
		while(num!=0) {
			digit=num%10;
			System.out.println(digit);
			rev=rev*10+digit;
			num=num/10;
		}
		System.out.println("Reversed Number is " +rev);
		    
		}
		

	}


