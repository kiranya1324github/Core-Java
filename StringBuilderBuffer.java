package com.edu;

public class StringBuilderBuffer {

	public static void main(String[] args) {
		String s="Hello World";
         StringBuffer b=new StringBuffer("Hello World");
         //String Builder
	//insert,append,replace,delete,reverse
       b.insert(2,"hi");            //insert
	
       System.out.println(b);  
       b.append("calcutta");                  // append
       System.out.println(b);
       b.replace(3,5, "How");            //replace
       System.out.println(b); 
       b.reverse();               // reverse
       System.out.println(b);
       b.delete(3, 5);                          //delete
       System.out.println(b);
       b.deleteCharAt(2);           // delete char
       System.out.println(b);
       

	}
	
}