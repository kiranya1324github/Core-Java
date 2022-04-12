package com.edu;

interface Calculations{
	void add(int a,int b);
	default void mult(int a,int b) {
		int m=a*b;
		System.out.println("product=" +m);
	
	}
	static void sub(int a,int b) {
		int ans=a-b;
		System.out.println("Difference=" +ans);
		
	}
	
}
interface MyUpdateCalculations{
	default void mult(int a,int b) {
		int m=a*b;
			System.out.println("MyUpdateCalculations product="+m);
	}
	void myfunct();
	
}



public class DefaultMethodInterface implements Calculations,MyUpdateCalculations {

	
		@Override
	public void add(int a, int b) {
		int s=a*b;
		System.out.println("sum=" +s);
		
	}
	@Override
	public void myfunct() {
		
		
	}
	@Override
	public void mult(int a, int b) {
		
		Calculations.super.mult(a, b);
	}
	
	public static void main(String[] args) {
		DefaultMethodInterface ob=new DefaultMethodInterface();
		ob.add(4, 6);
		ob.mult(8, 6);
		Calculations.sub(8,2);

	}
	

	

}




