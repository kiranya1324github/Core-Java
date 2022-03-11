package com.edu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Employee{
	int eid;
	String ename;
	float sal;
	public Employee(int eid, String ename, float sal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
}

class EmployeeIdCompare implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getEid()-o2.getEid();
	}
	
}

class EmployeeNameCompare implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getEname().compareTo(o2.getEname());
	
	}
}

class EmployeeSalCompare implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return   (int) (o1.getSal()-o2.getSal());
	}
	
}


public class Employeeexample {

	public static void main(String[] args) {
		ArrayList<Employee>eob=new ArrayList<Employee>();
		Employee eob1=new Employee(11,"Kiran",10000f);
		Employee eob2=new Employee(17,"Dina",20000f);
		Employee eob3=new Employee(10,"Faraia",120000f);
		
		eob.add(eob1);
		eob.add(eob2);
		eob.add(eob3);
		
		System.out.println("before sorting");
       Iterator<Employee> iob=eob.iterator();
       while(iob.hasNext()) {
    	   Employee ob=iob.next();
    	   System.out.println(+ob.getEid()+" "+ob.getEname()+"  "+ob.getSal());
       }
       
       Collections.sort(eob,new EmployeeIdCompare());
       System.out.println("after sorting");
       Iterator<Employee> iob1=eob.iterator();
       while(iob1.hasNext()) {
    	   Employee ob=iob1.next();
    	   System.out.println(ob.getEid()+"  "+ob.getEname()+"   "+ob.getSal());
       }
       
       Collections.sort(eob,new EmployeeNameCompare());
       System.out.println("after sorting");
       Iterator<Employee> iob2=eob.iterator();
       while(iob2.hasNext() ) {
    	   Employee ob=iob2.next();
    	   System.out.println(+ob.getEid()+"   "+ob.getEname()+"  "+ob.getSal());
       }
       
       Collections.sort(eob,new EmployeeSalCompare());
       System.out.println("after sorting");
       Iterator<Employee> iob3=eob.iterator();
       while(iob3.hasNext()) {
    	   Employee ob=iob3.next();
    	   System.out.println(ob.getEid()+"  "+ob.getEname()+"  "+ob.getSal());
    	   
       }
		
		
	}
}

