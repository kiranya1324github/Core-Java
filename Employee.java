package p1;

import java.util.Scanner;

public class Employee {
	String name;
	int age;
	int phno;

	public void display() {
		System.out.println("name=" +name);
		System.out.println("age="  +age);
		System.out.println("phno="  +phno);
	
		
		
		
	}

	public void input() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a name");
	name=sc.nextLine();
	System.out.println("Enter age");
	age=sc.nextInt();
	System.out.println("Enter phno");
	phno=sc.nextInt();
		
		
	}
	public static void main(String args[]) {
		Employee ob=new Employee();
		Employee ob1=new Employee();
		ob.input();
		ob.display();
		ob1.input();
		ob1.display();
		
	}

	
		
	}


