package com.edu;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		int size,search_element,pos=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter "+size+" elements");
		for(int i=0;i<size;i++) {
		a[i]=sc.nextInt();
		}
		System.out.println("Enter the element to be searched");
		search_element=sc.nextInt();
		for(int i=0;i<size;i++) {
			if(search_element==a[i]) {
				pos=i+1;
				break;
			}
		}
		if (pos>0) {
			System.out.println("Successful search");
			System.out.println("the element "+size+"    found at position " +pos);
		}
		else {
			System.out.println("Unsuccessful number");
		}
	}
}
	


