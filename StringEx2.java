package com.edu;

import java.util.Scanner;

public class StringEx2 {

	public static void main(String[] args) {
	    String s="Mohandas Karamchand Gandhi";
	    int sp=s.indexOf(' ');
	    int  lis=s.lastIndexOf( ' ' );
	  String s1=s.charAt(0)+"."+s.charAt(sp+1)+"."+s.substring(lis+1);
	  System.out.println(s1);
	}

}
