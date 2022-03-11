package com.edu;

import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
	   String s;
	   int c=0;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter a Sentence");
	   s=sc.nextLine();
	   String s1=s.toLowerCase();
	   System.out.println("No of characters ="+s.length());
	   for(int i=0;i<s1.length();i++) {
		   char ch=s1.charAt(i);
		   if(ch==' ') {
		   c=c+1;
		   } 
	   }
	   System.out.println("No of Words ="+(c+1));
	}

}
