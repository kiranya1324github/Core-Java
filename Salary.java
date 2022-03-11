package p1;

 

	
		import java.io.BufferedReader;
		import java.io.IOException;
		import java.io.InputStreamReader;

		 class Salary {
		 String name,add,sub_spl;
		 long mobnum;
		 int monthly_sal;
		 float income_tax,total_sal;
		 
		 
		 
		 
		 void accept() throws IOException {
			 InputStreamReader is=new InputStreamReader(System.in);
			 BufferedReader br=new BufferedReader(is);
			 System.out.println("Enter the name of the teacher");
			 name=br.readLine();
			 System.out.println("Enter the address");
			 add=br.readLine();
			 System.out.println("Enter mobile number");
			 mobnum=Long.parseLong(br.readLine());
			 System.out.println("Enter monthly_salary");
			 monthly_sal=Integer.parseInt(br.readLine());
			 System.out.println("Enter income_tax");
			 income_tax=Float.parseFloat(br.readLine());
			 System.out.println("Enter total_salary");
			 total_sal=Float.parseFloat(br.readLine());
		 }
			 
			void calculate() {
				total_sal=monthly_sal*12;
				if(total_sal>175000) {
					income_tax=total_sal*0.05f;
				}
			}
			
		      void display() {
		    	  System.out.println("name="  +name);
		    	  System.out.println("address="  +add);
		    	  System.out.println("mobile number="  +mobnum);
		    	  System.out.println("income_tax="  +income_tax);
		    	  System.out.println("total_salary="  +total_sal);
		    	  System.out.println("Take home sal="+(total_sal-income_tax));
		      }
		 
		 
		 
			public class Salary1 {
			public static void main(String[] args) throws IOException {
				Salary ob=new Salary();
				ob.accept();
				ob.calculate();
				ob.display();

			}
			}
		 
		 }
		 
		 


	


