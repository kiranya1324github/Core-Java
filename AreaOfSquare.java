package Area;

import java.util.Scanner;

public class AreaOfSquare {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Float side,area;
		System.out.println("Enter side of a square");
		side=sc.nextFloat();
		area=side*side;
		System.out.println(" area of square "+side+"  "+area);
		
		

	}

}
