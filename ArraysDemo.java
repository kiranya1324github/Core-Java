package com.edu;

public class ArraysDemo {

	public static void main(String[] args) {
		
		    int  a[]= {1,2,3,4,5};
		   
		    
		      System.out.println("First Element="+a[0]);
		      System.out.println("First Element="+a[1]);
		      System.out.println("First Element="+a[2]);
		      System.out.println("First Element="+a[3]);
		      System.out.println("First Element="+a[4]);
		      // to print the length of elements in reverse orderwZ
		      for(int i=0;i<a.length;i++) {
		    	  System.out.println(a[i]);
		      }
		      System.out.println("Array elements Reverse order");
		      for(int i=a.length-1;i>=0;i--) {
		    	  System.out.println(a[i]);
		      }
	
	}
}

