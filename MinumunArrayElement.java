package com.edu;

import java.util.Scanner;

public class MinumunArrayElement {

	public static void main(String[] args) {
		
		int a[]=new int[5];
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter "+a.length+"  elements");
		for(int i=0;i<a.length;i++) {
			 a[i]=sc.nextInt();
		}
                 //to find minimum array
		int min=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("Least number is  "  +min);
	}
}                  
	               

