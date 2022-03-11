package com.edu;

public class StringEx1 {

	public static void main(String[] args) {
		String s="Mohandas Karamchand Gandhi";
		System.out.println(s.indexOf(' '));
		System.out.println(s.lastIndexOf(' '));
		int li=s.lastIndexOf(' ');
		
		System.out.println(s.substring(li+1));
		System.out.println(s.substring(0,li+1));
		String s1=s.substring(0,li+1);
		String s2=s.substring(li+1);
		System.out.println(s1+"  "+s2);

		
		
	

	}

}

                
