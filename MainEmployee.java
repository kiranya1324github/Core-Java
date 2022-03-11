package hinteritance.java;

import java.util.Scanner;

class Employee {
	
	float sal;

	Employee() {
	sal=30000;
}
}

class Programmer extends Employee {
	String name;
	int age;
	
	void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		name=sc.next();
		System.out.println("Enter age");
		age=sc.nextInt();
	}


		
	
	
		void display() {
		System.out.println("name=" +name);
		System.out.println("age=" +age);
		System.out.println("salary=" +sal);
	}
}
	


public class MainEmployee {

	public static void main(String[] args) {
				Programmer ob=new Programmer();
		ob.input();
		ob.display();

	}

}
