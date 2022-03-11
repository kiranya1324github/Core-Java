package com.edu;


final class MyBank {
	final int accno=99807;  //value becoz final value cannot be changed
	
	
	final void modify() {   //method cannot be overridden becoz of final
		//accno=accno+6;
	
		System.out.println("Modify");
	}


//class MyClassFinalDemo extends MyBank {        //cannot extend becoz of final
	//void modify () error final meyhod cannot be overridden
//	System.out.println(" Override Modify");
}


public class MyClassFinalDemo {

	public static void main(String[] args) {
	

	}

}
