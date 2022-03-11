package com.edu;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class CountUniqueVowelsConstant {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int c=0,v=0;
		System.out.println("Enter a String");
		String s=sc.nextLine();
		TreeSet<Character> p1=new TreeSet<>();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			p1.add(ch);
		}
			System.out.println(p1);
			Iterator<Character>  it=p1.iterator();
			while(it.hasNext()) {
				char ch=it.next();
				if(ch=='a' ||ch=='e' ||ch=='i'||ch=='o'|| ch=='u') {
					v++;
				}else {
					c++;
					
				}
			}
			System.out.println("Number of unique vowels " +v);
			System.out.println("Number of unique consonents "  +c);
			
			
			
					
					
		}
		
	

	

}


