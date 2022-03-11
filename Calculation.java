package com.edu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Showroom {
	String name;
	long mobno;
	double cost;
	double dis;
	double amount;
	
	void Showroom() {
		mobno=0;
		cost=0;
		dis=0;
		amount=0;
		
	}
	
	void input() throws IOException {
		InputStreamReader is =new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(is);
		System.out.println("Enter a name");
		name= br.readLine();
		System.out.println("Enter  a mobile no");
		mobno=Long.parseLong(br.readLine());
		System.out.println("Enter a cost");
		cost=Double.parseDouble(br.readLine());
	    System.out.println("Enter dis");
	    dis=Double.parseDouble(br.readLine());
	    System.out.println("Enter total amount");
	    amount=Double.parseDouble(br.readLine());

	}
	


	void calculate() {
		if(cost<=10000)  {
			dis=(cost*5)/100;
			 System.out.println("Amount after 5% discount "  +dis);
		}
			 else	 if(cost>10000  &&  cost<=20000)  {
					dis=(cost*10)/100;
					 System.out.println("Amount after 10% discount "  +dis);
			 }
					 
					 else	 if(cost>20000  &&   cost<=35000)  {
							dis=(cost*15)/100;
							 System.out.println("Amount after 15% discount "  +dis);
					 }
				
							 else {
									dis=(cost*20)/100;
									 System.out.println("Amount after 20% discount "  +dis);
			 
			
		}
		amount=cost-dis;
		System.out.println("Amount to be paid"  +dis);
	}
}

public class Calculation {

	public static void main(String[] args) throws IOException {
	Showroom ob=new Showroom();
	ob.input();
	ob.calculate();
	}

}

