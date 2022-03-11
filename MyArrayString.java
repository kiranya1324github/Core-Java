package com.edu;

import java.util.ArrayList;
import java.util.Scanner;

public class MyArrayString {
	
	public static void main(String[] args) {
		ArrayList<String> lst=new ArrayList<>();
		String e;
		Scanner sc=new Scanner(System.in);
		System.out.println("How many names");
		String n=sc.nextLine();
	    
		for(int i=1;i<i;i++) {
		System.out.println("enter the names");
		String name=sc.nextLine();
		lst.add(name);
	       }
	       
	   	
	   	System.out.println(" name=  "+lst);
	   	System.out.println("enter the name to be search");
	   	String s=sc.nextLine();
	   	if(lst.contains(s)) {
	   		System.out.println(s+    " present in list");
	   	}else {
	   		System.out.println(s+    "not present in list");
	   		
	       
		
		
		
		
		
	
	
	
		}


	}

}

