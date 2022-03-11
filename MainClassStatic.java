package com.edu;

import java.util.Scanner;

class Employee {
	
	String name;
	int eid;
static	String cname="Oracle";
	

          void accept() {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a name");
      name=sc.nextLine();
      System.out.println("Enter eid");
      eid=sc.nextInt();
          }
      
      void display() {
    	  System.out.println("Name="  +name);
    	  System.out.println("eid="  +eid);
    	  System.out.println("cname="  +cname);
      }
    	  
      }
      
      





public class MainClassStatic {

	public static void main(String[] args) {
		Employee eob[];
		Scanner sc=new Scanner(System.in);
	      System.out.println("Enter number of Employees");
	      int n=sc.nextInt();
	       eob=new Employee[n];
	       for(int i=0;i<n;i++) {
	    	   eob[i]=new Employee();
	    	   eob[i].accept();
	       }
	    	System.out.println("Employee Details");
	    	 for(int i=0;i<n;i++) {
	    		 eob[i].display();
	    		 
	    	
	    	   
	       }
		

	}

}
