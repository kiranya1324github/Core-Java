package com.edu;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class StudentTreeSet {
int sid;
int marks;
String name;

public  StudentTreeSet(int sid,int marks,String name) {
	super();
	
	this.sid=sid;
	this.marks=marks;
	this.name=name;
}

public int getSid() {
	return sid;
}



public void setSid(int sid) {
	this.sid = sid;
}



public int getMarks() {
	return marks;
}



public void setMarks(int marks) {
	this.marks = marks;
}



public String getName() {
	return name;
}



public void setName(String name) {
	this.name = name;
}
}
class StudentMarksCompare implements Comparator<StudentTreeSet>{

	@Override
	public int compare(StudentTreeSet o1, StudentTreeSet o2) {
	
		return  o1.marks-o2.marks;
	}
	
}

class StudentIdCompare implements Comparator<StudentTreeSet> {

	@Override
	public int compare(StudentTreeSet o1, StudentTreeSet o2) {
	
		return o1.getSid()-o2.getSid();
	}
	
}

class StudentNameCompare implements Comparator<StudentTreeSet> {

	@Override
	public int compare(StudentTreeSet o1, StudentTreeSet o2) {
		
		return o1.getName().compareTo(o2.getName());
	}
	
}



public class TreeSetStudentMain {
	
	public static void main(String[] args) {
		TreeSet<StudentTreeSet> ob=new TreeSet<StudentTreeSet>(new  StudentMarksCompare() );
		
		StudentTreeSet tob1=new StudentTreeSet(1,450,"Kiranya");
		StudentTreeSet tob2=new StudentTreeSet(2,560,"Mani");
		StudentTreeSet tob3=new StudentTreeSet(3,540,"Keerthi");
		ob.add(tob1);
		ob.add(tob2);
		ob.add(tob3);
		
		
		
		
		
		Iterator<StudentTreeSet> it=ob.iterator();
		while(it.hasNext()) {
			StudentTreeSet sob=it.next();
			System.out.println("sid ="+sob.getSid()+" Name=" +sob.getName()+"  marks=" +sob.getMarks());
		}
		
		
		TreeSet<StudentTreeSet> ob1=new TreeSet<StudentTreeSet>(new StudentIdCompare());

                   StudentTreeSet  tob4=new StudentTreeSet(1,15,"Kiranya");
                   StudentTreeSet  tob5=new StudentTreeSet(2,11,"Radha");
                   StudentTreeSet  tob6=new StudentTreeSet(3,12,"Sudha");
                   ob1.add(tob4);
                   ob1.add(tob5);
                   ob1.add(tob6);
                   
                   Iterator<StudentTreeSet> it1=ob1.iterator();
                   while(it1.hasNext()) {
                   StudentTreeSet sob1=it1.next();
                   System.out.println("sid  ="+sob1.getSid()+" Name=" +sob1.getName()+"   marks=" +sob1.getMarks());
                   
                   }   
            TreeSet<StudentTreeSet> ob2=new TreeSet<StudentTreeSet>(new StudentNameCompare());
            
                StudentTreeSet   tob7=new StudentTreeSet(4,12,"Kiranya");
                StudentTreeSet   tob8=new StudentTreeSet(6,15,"Sahaja");
                StudentTreeSet   tob9=new StudentTreeSet(5,11,"Spandana");
                ob2.add(tob7);
                ob2.add(tob8);
                ob2.add(tob9);
                
                Iterator<StudentTreeSet>  it2=ob2.iterator();
                while(it2.hasNext()) {
                	StudentTreeSet sob2=it2.next();
                	System.out.println("sid   ="+sob2.getSid()+"  Name=" +sob2.getName()+"   marks=" +sob2.getMarks());
                }
               
                     
                   
	}

}


