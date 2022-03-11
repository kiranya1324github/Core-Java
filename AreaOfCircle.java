package Area;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float area,radius;
		System.out.println("Enter radius of circle ");
		radius=sc.nextFloat();
		area=3.14159f*radius*radius;
		System.out.println("area of circle " +area);

	}

}
