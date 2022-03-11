package com.edu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class School {
	int sid;
	String sname;
	float amount;
	String add;


  void input() throws  IOException {
	  InputStreamReader is=new InputStreamReader(System.in);
	  BufferedReader br=new BufferedReader(is);
	  System.out.println("Enter student id");
	  sid=Integer.parseInt(br.readLine());
	  System.out.println("Enter student name");
	  sname=br.readLine();
	  System.out.println("Enter  total amount");
	  amount=Float.parseFloat(br.readLine());
	  System.out.println("Enter address");
	  add=br.readLine();
	  
	  
  }




	
	void display() {
		System.out.println("sid="    +sid);
		System.out.println("sname="  +sname);
		System.out.println("amount="  +amount);
		System.out.println("add="   +add);
		
	}
}
	public class Student {
      public static void main(String args[]) throws IOException {
    	  School ob=new School();
    	  ob.input();
    	  ob.display();
      	  
	
}
	}


