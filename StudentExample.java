package com.edu;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

class Student{
	int sid;
	String sname;
	float fees;
	public Student(int sid, String sname, float fees) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.fees = fees;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public float getFees() {
		return fees;
	}
	public void setFees(float fees) {
		this.fees = fees;
	}
}





public class StudentExample {

	public static void main(String[] args) {
		Hashtable<Integer, Student>hm=new Hashtable<>();
		Student s1=new Student(1,"Kitty",200f);
		Student s2=new Student(5,"Manu",500f);
		Student s3=new Student(4,"Kiranya",1000f);
		
		hm.put(7, s1);
		hm.put(9, s2);
		hm.put(10, s3);
		
		System.out.println(hm);
		

	
	for(Map.Entry<Integer, Student>me:hm.entrySet()) {
		int k=me.getKey();
		Student s=me.getValue();
		System.out.println(s.getSid()+"   "+s.getSname()+"   "+s.getFees());
		
	}

}
}
