package com.edu;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		float units;
		double fixed_rate=350,bill_pay;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of units");
		units=sc.nextLong();
		if(units<100) {
			bill_pay=units*1.50;
		}
		else if(units>=101 && units<=150) {
		  bill_pay=100*1.50+(units-100)*2.00;	    
		}
		else if(units>=151 &&   units>=250) {
			bill_pay=100*1.50+50*2.00+(units-150)*2.50;
			
		}
		else {
			bill_pay=100*1.50+50*2.00+100*2.5+(units-250)*4.00;
			
		}
		System.out.println("Your bill amount is "+(bill_pay+fixed_rate));
		}
		

	}


