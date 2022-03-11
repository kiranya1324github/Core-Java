package com.edu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Transport {
  
	  String name;
	  int w;
	  int charge;
	  float surge_charge=0.05f;
	  
	  void accept() throws IOException {
		  InputStreamReader is=new InputStreamReader(System.in);
		  BufferedReader br= new BufferedReader(is);
		  System.out.println("Enter name");
		  name=br.readLine();
		  System.out.println("Enter weight");
		  w=Integer.parseInt(br.readLine());
		  System.out.println("Enter charge");
		  charge=Integer.parseInt(br.readLine());
	  }
	   void calculate() {
		   if(w<=10) {
			   charge=w*25;
		   }
		   else if(w>=10 && w<=20) {
			   charge=10*25+(w-10)*20;
		   }
	   
		   else {
			   charge=10*25+20*20+(w-30)*10;
		   }
					   
	   }  
		   
	   
	   void print() {
		   System.out.println("Name\tWeight\tB ill Amount");
		   System.out.println("___________________________");
		   System.out.println(name+"\t"+w+"\t"+(charge+(charge*0.05)));
		  
	   
   
	   
	   }
}
	  public class TransportMain {
	public static void main(String[] args) throws IOException {
		Transport ob=new Transport();
		ob.accept();
		ob.calculate();
		ob.print();
	}
		

	}


