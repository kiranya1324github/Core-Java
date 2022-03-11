package kiranya.com;

import java.util.Scanner;

public class AverageMarks {



	public static void main(String[] args) {
		int s1,s2,s3,s4,s5;
		float avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("First subject marks");
		s1=sc.nextInt();
		System.out.println("Second subject marks");
		s2=sc.nextInt();
		System.out.println("Third subject marks");
		s3=sc.nextInt();
		System.out.println("Fouth subject marks");
		s4=sc.nextInt();
		System.out.println("Five subject marks ");
		s5=sc.nextInt();
		avg  = (s1+s2+s3+s4+s5)/5;
		System.out.println("average marks="+avg);
	
	
		
		

	}

}
