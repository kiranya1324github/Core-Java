package p1;

import java.util.Scanner;

public class FahrenheitToCelsis {

	public static void main(String[] args) {
		
			
				Scanner sc=new Scanner(System.in);
				System.out.println("1.to convert from Fahrenheit to Celsius");
				System.out.println("2.to convert from Celsius to Fahrenheit");
				System.out.println("Enter your choice");
				
				int choice=sc.nextInt();
				double ft=0.0, ct=0.0;
				switch(choice) {
				case 1: 
					   System.out.println("Enter temperature in Fahrenheit");
					   ft=sc.nextDouble();
					   ct=(ft-32)*5/9;
					   System.out.println("Temperature in Celsius"  +ct);
					   break;
				case 2:
					    System.out.println("Enter temperature in Celsius");
					    ct=sc.nextDouble();
					    ft=ct*9/5+32;
					    System.out.println("Temperature in Fahrenheit"  +ft);
					    break;
			  default : 
				          System.out.println("Invalid input");
					    
				}

	}

}
