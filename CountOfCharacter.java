package com.edu;

import java.util.Scanner;

public class CountOfCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int c=0;
		String s;
		System.out.println("Enter a string");
		s=sc.nextLine();
		System.out.println("Enter a character");
		char ch=sc.next().charAt(0);
		for(int i=0;i<s.length();i++) {
			if(ch==s.charAt(i)) {
				c++;
			}
			
		}
		System.out.println(ch+" Character is present ");

	}

}
