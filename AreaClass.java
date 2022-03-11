package p1;

import java.util.Scanner;

public class AreaClass {

	public static void main(String[] args) {
		float length,breadth,base,height,radius,side =0,area;
		int choice;
		char ch;
		Scanner sc=new Scanner(System.in);
		do {

		System.out.println("******MENU*****");
		System.out.println("1.Area of square");
		System.out.println("2. Area of Rectangle");
		System.out.println("3.Area of Circle");
		System.out.println("4.Area of Traiangle");
		System.out.println("Please enter your choice");
		  choice=sc.nextInt();
		  switch(choice) {
		  
		  
		  
		  case 1:System.out.println(" Find Area of square");
		         System.out.println("Enter side of square");
		            side=sc.nextFloat();
		            area=side*side;
		            System.out.println("Area of square of side "+side+" is "+area);
		            break;
		 
		  case 2 :System.out.println("Find Area of Rectangle");
		          System.out.println("Enter length of rectangle");
		          length=sc.nextFloat();
		          System.out.println("Enter breadth of rectangle");
		          breadth=sc.nextFloat();
		          area=length*breadth;
		          System.out.println("Area of Rectangle of length "+length+" and breadth "+breadth+"  "+area);
		          break;
		 
		  case 3 :System.out.println("Find Area of circle");
		          System.out.println("Enter radius of circle");
		          radius=sc.nextFloat();
		          area=3.14159f*radius*radius;
		          System.out.println("Area of circle of radius is "+radius+"  "+area);
		          break;
		  case 4 :System.out.println("Find Area of Triangle");
		           System.out.println("Enter base of a triangle");
		           base=sc.nextFloat();
		           System.out.println("Enter height of a triangle");
		           height=sc.nextFloat();
		           area=(base*height)/2;
		           System.out.println("Area of triangle of base "+base+"   and  height "+  height+"  is "+area);
		           break;
		           
		   default : System.out.println("Invalid input");
		          
		         
		  }
		  System.out.println("do you want to continue Y/N");
		  ch=sc.next().charAt(0);
		}
		  while(ch!='N');
           System.out.println("Outside do while");
	}

}
