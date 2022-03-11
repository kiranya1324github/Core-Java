package com.edu;

import java.util.Scanner;

public class UserInputArray {

	public static void main(String[] args) {
		int a[]=new int[5];
		int i;
		// datatype identifier[]=new datatype[size];
		 Scanner sc= new Scanner(System.in);
		 // input array elements
		 System.out.println("Enter Array elements  " +a.length);
		 for(i=0;i<a.length;i++) {
			 a[i]=sc.nextInt();
		 }
		              // display array elements
                      System.out.println(" Array elements are");
                      for(i=0;i<a.length;i++) {
                    	  System.out.println(a[i]);
                      }
	}

}
