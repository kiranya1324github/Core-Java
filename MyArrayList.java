package com.edu;

import java.util.ArrayList;

public class MyArrayList {

	private static final Object Hello = null;

	public static void main(String[] args) {
		ArrayList<Integer>  lst=new ArrayList<>();
		
		lst.add(40);
		lst.add(56);
		lst.add(30);
		lst.add(2,43);

		lst.add(2);
		
		
		
		System.out.println(lst);
		
		ArrayList<Float>  lst1=new ArrayList<>();
		
		lst1.add(23.7f);
		lst1.add(23.4f);
		lst1.clear();
		System.out.println(lst1);
		
		ArrayList<String>    lst2=new ArrayList<>();
		lst2.add("Hello");
		lst2.add("Hii");
	
		System.out.println(lst2);
		
		
		//Array is a predefined class
		//It is not static
		//It is dynamic
		//It is used in java.util
		
		
		
		
		
		
		
		
		
		
		
	}
}


