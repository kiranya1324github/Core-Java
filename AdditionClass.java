package com.edu;
  
class Addition1 {

	 int a;
	 int b;
	 float c;
	 double d;
      
	void add(int a,int b) {
	  int sum=a+b;
		System.out.println("sum of two int value is="  +sum);
	
}
  void add(int a,float c) {
	  float sum=a+c;
	  System.out.println("sum of int and float value is="  +sum);
  }
	  void add(int i,double d) {
		  double sum =i+d;
		  System.out.println("sum of int and double value is=" +sum);
	  }
	  
}

public class AdditionClass {

	public static void main(String[] args) {
	Addition1 ob= new Addition1 ();
		ob.add( 2,4);
		ob.add(3, 56.7);
		ob.add(2, 23.23);

	}

}
