package Area;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float length,breadth,area;
		System.out.println("Enter length of a rectangle");
		length=sc.nextFloat();
		System.out.println("Enter breadth of a rectangle");
		breadth=sc.nextFloat();
		
		area=length*breadth;
		System.out.println("Area of Rectangle length "+length+"  and  breadth "+breadth+"   "+area);

	}

}
