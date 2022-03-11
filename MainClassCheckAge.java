package com.edu;            //User defined Exception

import java.util.Scanner;
class CheckAgeVoting extends Exception {
	CheckAgeVoting(String s){
		super(s);
	}
}



public class MainClassCheckAge {

	public static void main(String[] args) {
               int age;
               Scanner sc=new Scanner(System.in);
               System.out.println("Enter the age");
               age=sc.nextInt();
               try {
               if(age<18) {
            	   throw new CheckAgeVoting("Not eligle for voting");
               }
               }
               catch(CheckAgeVoting e)  {
            	   e.printStackTrace();
               }
            	   
            	   
               }
	}


