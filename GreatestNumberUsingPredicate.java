package com.edu;

import java.util.function.Predicate;

public class GreatestNumberUsingPredicate {

	public static void main(String[] args) {
	  Predicate<Integer>gt=(i)->i>10;
	  System.out.println("Is my number is greater than "+gt.test(20));
	  boolean b=gt.test(20);
	  if(b) {
		  System.out.println("greater than 10");
	  }
	  else {
		  System.out.println("less than 10");
		  
	  }
	 
	  

	}

}
