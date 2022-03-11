package p1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Railway1 {


		String name;
		String coach;
		long mobno;
		String  First_ac,Second_ac,Third_ac,Sleeper;
		int amount,total_amount,tickets;
		void accept() throws IOException {
			InputStreamReader is=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(is);
			System.out.println("Enter the name of Passenger :");
			name=br.readLine();
			System.out.println("Enter the Coach type");
			System.out.println("1.First_ac");
			System.out.println("2.Second_ac");
			System.out.println("3.Third_ac");
			System.out.println("4.Sleeper");
			coach=br.readLine();
			System.out.println("Enter the mobile number");
			mobno=Long.parseLong(br.readLine());
			System.out.println("Enter no of tickets");
			tickets=Integer.parseInt(br.readLine());
			
		}
		void calculation() {
			if(coach.equalsIgnoreCase("First_ac"))  {
				amount=750;
				//System.out.println("Inside 750");
			}
			else if(coach.equalsIgnoreCase("Second_ac")) {
				amount=500;
			}
			else if(coach.equalsIgnoreCase("Third_ac")) {
			   amount=250;
		}
		else {
			amount=0;
		}
		
		
	}
           void update() {
        	   System.out.println("Name of Passenger:  "+name);
        	   System.out.println("Coach type  "+coach);
        	   System.out.println("Mobile_number " +mobno);
        	   System.out.println("Number of tickets: "+tickets);
        	   System.out.println("Total amount need to pay for "+tickets+"  is "+(amount*tickets)+" Rupees");
        	   
        	   
           }
	
}		
		public class Railway {
			public static void main(String args[])  throws IOException {
				Railway1 ob=new  Railway1();
				ob.accept();
				
				ob.calculation();
				ob.update();
				
				
				
			}
		}
               
	


