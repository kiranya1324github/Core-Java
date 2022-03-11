package com.edu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Student {
		int sid; 
		String name;
		float fees;
		public Student(int sid,String name,float fees) {
			super();
			this.sid=sid;
			this.name=name;
			this.fees=fees;
		}
		public int getSid() {
			return sid;
		}
		public void setSid(int sid) {
			this.sid = sid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public float getFees() {
			return fees;
		}
		public void setFees(float fees) {
			this.fees = fees;
		}
	}

class StudentIdCompare1 implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.sid-o2.sid;
	}
	
}
class StudentNameCompare1 implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.getName().compareTo(o2.getName());
	}
	
}

class StudentFeesCompare1 implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		return (int) (o1.getFees()-o2.getFees());
	}
	
}



	public class MyArrayList4 {

	
	public static void main(String[] args) {
		ArrayList<Student> ob=new ArrayList<>();
		Student sob1=new Student(1,"Kiranya", 7824.89f);
		Student sob2=new Student(2,"Manisha", 7524.89f);
		Student sob3=new Student(3,"Bhargavi", 7224.89f);
		ob.add(sob1);
		ob.add(sob2);
		ob.add(sob3);
		
		
		
		
		System.out.println("Before sorting");
		Iterator<Student> sit=ob.iterator();
		while(sit.hasNext()) {
		Student s=sit.next(); 
		System.out.println(s.sid+"  "+s.name+"  "+s.fees);
		}
		
		StudentIdCompare1 si=new StudentIdCompare1();
	         Collections.sort(ob,si);
	         System.out.println("After sorting");
	         Iterator<Student>sit1=ob.iterator();
	         while(sit1.hasNext()) {
	        	 Student s=sit1.next();
	        	 System.out.println(s.getSid()+"  "+s.getName()+"  "+s.getFees());
	         }
	         StudentNameCompare1 si1=new StudentNameCompare1();
	          Collections.sort(ob,si1);
	          System.out.println("After sorting");
	          Iterator<Student>sit2=ob.iterator();
	          while(sit2.hasNext()) {
	        	  Student s=sit2.next();
	        	  System.out.println(s.getSid()+"   "+s.getName()+"   "+s.getFees());
	          }
	          StudentFeesCompare1 si2=new StudentFeesCompare1();
	          Collections.sort(ob,si2);
	          System.out.println("After sorting");
	          Iterator<Student>sit3=ob.iterator();
	          while(sit3.hasNext()) {
	        	  	Student s=sit3.next();
	        	  	System.out.println(s.getSid()+"  "+s.getName()+"   "+s.getFees());
	          }
	}
	}

	
	
	
	


