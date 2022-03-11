package com.edu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Employee {
	int eid;
	String ename;
	String role;
	float sal;
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
	
	public Employee(int eid, String ename, String role, float sal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.role = role;
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
}
class EmployeeIdCompare implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
	
		return o1.getEid()-o2.getEid();
	}
	
}

class EmployeeNameCompare implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getEname().compareTo(o2.getEname());
	}
	
}

class EmployeeRoleCompare implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getRole().compareTo(o2.getRole());
	}
	
}
class EmployeeSalaryCompare  implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getSal()==o2.getSal()) {
			return 0;
		}
		else if(o1.getSal()>o2.getSal()) {
			return 1;
		}
	else {
		return -1;
	}
	
}

}


public class MyArrayList5 {

	public static void main(String[] args) {
		ArrayList<Employee> eit=new ArrayList<>();
		Employee eob=new Employee(1,"Kiranya","MD",9876.34f);
		Employee eob1=new Employee(3,"Sahaja","Officer",654.34f);
		Employee eob2=new Employee(2,"Spandana","Manager",123.65f);
		eit.add(eob);
		eit.add(eob1);
		eit.add(eob2);
		
		
		System.out.println("Before Sorting");
		Iterator<Employee> it=eit.iterator();
		while(it.hasNext()) {
			Employee e=it.next();
			System.out.println(e.eid+"   "+e.ename+"   "+e.role);
		}
		Collections.sort(eit,new EmployeeIdCompare() );
		System.out.println("After Sorting");
		Iterator<Employee> it1=eit.iterator();
		while(it1.hasNext()) {
				Employee e=it1.next();
				System.out.println(e.getEid()+"   "+e.getEname()+"  "+e.getRole());
		}
		
		Collections.sort(eit,new EmployeeNameCompare());
		System.out.println("After Sorting");
		Iterator<Employee> it2=eit.iterator();
		while(it2.hasNext()) {
			Employee e=it2.next();
			System.out.println(e.getEid()+"  "+e.getEname()+"   "+e.getRole());
		}
		
		Collections.sort(eit,new EmployeeRoleCompare());
		System.out.println("After sorting");
		Iterator it3=eit.iterator();
		while(it3.hasNext()) {
			Employee e=(Employee) it3.next();
			System.out.println(e.getEid()+"  "+e.getEname()+"  "+e.getRole());
		}
//Salary compare
		Collections.sort(eit,new EmployeeSalaryCompare());
	  System.out.println("Employee data based on salary ascending order");
		Iterator it4=eit.iterator();
		while(it4.hasNext()) {
			Employee e=(Employee) it4.next();
			System.out.println(e.getEid()+"  "+e.getEname()+"  "+e.getRole()+ "  "+e.getSal());
		}
}
}

