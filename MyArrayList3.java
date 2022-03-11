package com.edu;

import java.util.ArrayList;
import java.util.Scanner;

public class MyArrayList3 {

	public static void main(String[] args) {
	ArrayList<Integer> lst=new ArrayList<>();
	int e;
	Scanner sc=new Scanner(System.in);
	System.out.println("How many elements");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++) {
	System.out.println("enter the elements");
	 e=sc.nextInt();
	lst.add(e);

	}

	
	System.out.println("ArrayList elements=  "+lst);
	System.out.println("enter the element to be search");
	int s=sc.nextInt();
	if(lst.contains(s)) {
		System.out.println(s+    " present in list");
	}else {
		System.out.println(s+    "not present in list");
		
	}
	ArrayList<Integer> cl=(ArrayList<Integer>) lst.clone();  
	                      //syntax
	System.out.println(cl);
	System.out.println(lst.subList(2, 5));
	System.out.println(lst.subList(4,5));

	}

}
