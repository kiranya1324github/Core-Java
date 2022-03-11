package Area;

import java.util.Scanner;

public class AreaOfTraiangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float base,height,area;
		System.out.println("Enter base of Triangle");
		base=sc.nextFloat();
		System.out.println("Enter height of Triangle");
		height=sc.nextFloat();
		area=(base*height)/2;
		System.out.println(" area of triangle base "+base+" and height "+height+"  "+area);

	}

}
