package com.edu;

class Addition {
	static int i;
	static int j;
	static int s;
	 int m,n,s1;
	 Addition(int a,int b){
	 m=a;
	 n=b;
	 }	 
	
	
	static {
		i=10;
		j=5;
		 
	}
	
	
	static void add() {  // static can be accessed within static data
		s=i+j;
		System.out.println("sum="  +s);
	}
	
	void nonStaticAddition() {
		s1=m+n;
		System.out.println("s1="  +s1);
	}
}

public class StaticMethodClass {
	public static void main(String[] args) {
		//static variables and methods can be accessed with reference to class
		 //Object creation is not required
		//static information belongs to class
		Addition.add(); //static method
		Addition ob=new Addition(3,5);
		Addition ob1=new Addition(6,5);
	   ob.nonStaticAddition();
	   ob1.nonStaticAddition();
	}

}

	
	
	