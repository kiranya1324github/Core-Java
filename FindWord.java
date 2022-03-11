package com.edu;

import java.util.Scanner;

public class FindWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s;
		int c=0;
		System.out.println("Enter a sentence");
		 s=sc.nextLine();
		 
		 String ch[]=s.split(" ");
        System.out.println("Enter a word to find");
        String w=sc.next();
        for(int i=0;i<ch.length;i++) {
        	if(ch[i].equals(w)) {
        		c++;
        	}
        }
	
        System.out.println("Occurence of word  "+c);
	
	 System.out.println(s.replaceFirst("hii","bye"));

	}
}
