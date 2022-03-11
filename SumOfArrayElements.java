package com.edu;

import java.util.Scanner;

public class SumOfArrayElements {


	public static void main(String[] args) {
		int sum=0;
		float avg;
		
		int a[]=new int[10];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter "+a.length+"  elements");
		for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
		}
		   System.out.println("Enter Array elements are");
		   for(int i=0;i<a.length;i++) {
			 System.out.println(a[i]);
		   }
		   System.out.println("To find sum of elements");
		     for(int i=0;i<a.length;i++) {
		    	 sum=sum+a[i];
		     }
		     System.out.println("sum="  +sum);
		     avg=(float)sum/a.length;
				System.out.println("Average=" +avg);

	}

}
