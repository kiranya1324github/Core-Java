package com.edu;

//polymorphism->many forms

class Overloading {
	void display() {
		System.out.println("Display with no argument");
		
	}
	void display(int i) {
		System.out.println(" one argument of type int");
		
	}
	void display(float i) {
		System.out.println(" one argument of type float");
		
	}
	void display( double i) {
		System.out.println("one argument  of double type");
		
	}
	void display(String i) {
		System.out.println("one argument of string type");
		
		
	}
	void display(int i,float j) {
		System.out.println("one argument of int type and float type");
		
	}
	void display(float j,int i) {
		System.out.println("one argument of float type and double type");
		
	}
	public void add(int i, int j) {
		// TODO Auto-generated method stub
		
	}
	
}


public class PolymorphismDemoMain {

	
	
	
	public static void main(String[] args) {
		Overloading ob=new Overloading();
		ob.display();
		ob.display(45.56);
		ob.display(56);
		ob.display(23.67f);
		ob.display(57,34.4f);
		ob.display(35.6f,34);

	}

}
