package com.edu;

interface Mysphere {
	int i=3;
	void add();
	void display();
}
  abstract class A1 implements Mysphere {

	@Override
	public void add() {
		System.out.println("Add");
		
	}
	
}
   class A2  extends A1{       // we can extend from class to class but we cannot extend from class to interface
                               //we can implement from class to interface
	@Override                           // we cannot implement from class to class
	public void display() {
		System.out.println("Display");
		
	}
	   
	   
   }

public class InterfaceDemo {

	public static void main(String[] args) {
	//	A1 ob=new A1();
		//ob.add();
	//	ob.display();
                A2 ob1=new A2();
                ob1.add();
                ob1.display();
	}

}
