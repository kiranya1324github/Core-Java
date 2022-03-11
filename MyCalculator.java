package p1;

import java.util.Scanner;

public class MyCalculator {

	public static void main(String[] args) {
		
		
		int firstnum,secondnum,ans,choice;
		char ch;
		Scanner sc=new Scanner(System.in);
		do {
		       
		System.out.println("Enter firstnumber");
		          firstnum=sc.nextInt();
		  System.out.println("Enter secondnumber");
		          secondnum=sc.nextInt();
		    System.out.println("*****MENU*****");
		  	
		  		System.out.println("1.Addition");
		        System.out.println("2.Subraction");
		        System.out.println("3.Multiplication");
		  		System.out.println("4.Division");
		  		System.out.println("5.Modify");
		  		System.out.println("please Enter your choice");
		  		choice=sc.nextInt();
		   
		  		switch (choice) {	
		  		case 1:   ans=firstnum+secondnum;
		System.out.println("Addition of "+firstnum+" and "+secondnum+"  is   "+ans);
		                break;
		  		case 2 :  ans=firstnum-secondnum;
		System.out.println("Subraction of "+firstnum+" and "+secondnum+"   is   "+ans);
		                 break;
		  		case 3: ans=firstnum*secondnum;
		System.out.println("Product of "+firstnum+" and "+secondnum+"  is   "+ans);
		                 break;
		  		case 4 : ans=firstnum%secondnum;
		System.out.println("Division of "+firstnum+"   and    "+secondnum+"     is  "+ans);
		                    break;
		  		case  5:   ans=firstnum|secondnum;
		System.out.println("Modify of "+firstnum+"   and   "+secondnum+"     is "+ans);
		                      break;
		       default:System.out.println("Invalid input");
		}
		
		 System.out.println("do you want to continue Y/N");
                         ch=sc.next().charAt(0);
		}
		 while(ch!='N'); {
	            	 System.out.println("Outside do while");
	             }

	
		
	
	

	

}
}




	

