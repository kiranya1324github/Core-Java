package com.edu;


public class Division {
	
	
	

	public static void main(String[] args) {
		
		
		
		int a=5,b=0,c=0;
		int ar[]=new int[3];
   
		System.out.println("Before division"  );
		try {                                 // we use try and catch to handle run time error
			c=a/b;
			System.out.println("after a/b "+c);
			}
		catch(ArithmeticException ex) {
			System.out.println("Inside the catch");
			ex.printStackTrace();
		}
		try {                                 // we use try and catch to handle run time error
			ar[1]=10;                                        //two types of exception
			}                                         //1.checked         ->try and catch are mandatory
		
		                                       // even if the syntax is correct also it will occur compilation error
		                                       //   and we have to throw a THrows IO exception is called check exception
		                                            //  2.non- checked->try and catch are not mandatory
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Inside the catch");
		      e.printStackTrace();
			
		}
		finally {	
			System.out.println("Finally will always excuted");
		}
		System.out.println("After division"  );
		//
		//if it is error it will go to catch statement oterwiswe it will only excutes only try and final statememnts
		
		
		


	}

}
