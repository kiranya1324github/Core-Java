package com.edu;




import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
     class WorkShop2{
  
	String name;
	long mobno;
	double cost;
	double dis;
	double amount;
	
	WorkShop2() {
		name=null;
		mobno=0;
		cost=0.0;
		dis=0.0;
		amount=0.0;
	}
	
	
	
	void input() throws IOException {
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);
		
		System.out.println("Enter a name");
		name=br.readLine();
		System.out.println("Enter mobile number");
		mobno=Long.parseLong(br.readLine());
		System.out.println("Enter cost");
		cost=Double.parseDouble(br.readLine());
		System.out.println("Enter discount");
		dis=Double.parseDouble(br.readLine());
		System.out.println("Enter total amount");
		amount=Double.parseDouble(br.readLine());
		
	}
	        void calculate() {
	        	if(cost<=10000) {
	        		dis=(cost*5)/100;
	        	
	        	}
	        	else	if(cost>10000 && cost<=20000) {
	        		dis=(cost*10)/100;
	        		
	        	
	        	}
	        	else if(cost>10000  &&   cost<=35000) {
	        		dis=(cost*15)/100;
	        		  
	        	}
	        	
	        	else  {
	        		dis=(cost*20)/100;  // more than 30000
	        		
	        }
	        
	        	System.out.println("Discount amount is Rs  "+dis);
	        
	        amount=cost-dis;
	        
	        }
	        void display() {
	        	System.out.println("customer name is =" +name);
	        	System.out.println("Amount to be paid after discount is Rs "+amount);
	        }

}
  public     class  WorkShop1 {
	public static void main(String[] args) throws IOException {
		WorkShop2 ob =new WorkShop2();
		ob.input();
		ob.calculate();
		ob.display();

	}

}



