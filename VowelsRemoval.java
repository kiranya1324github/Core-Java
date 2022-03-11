package com.edu;

import java.util.Scanner;

public class VowelsRemoval {

	public static void main(String[] args) {
		String a="";
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter a String");
	String s=sc.nextLine().toLowerCase();
		for( int i=0;i<s.length();i++) {
             char ch=s.charAt(i);
             if(ch=='a' || ch=='e'  ||  ch=='i'   ||  ch=='o'  ||  ch=='u') {
            	 continue;
             }
             else {
            	 a=a+s.charAt(i);
             }
             }
		 System.out.println("After removing vowels "+a);
		
	}

}
