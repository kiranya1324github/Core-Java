package p1;

import java.util.Scanner;

public class Grade {

	public static void main(String args[]) {
				int marks;
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the  student marks");
				marks=sc.nextInt();
				if(marks>=90 && marks<=100) {
					System.out.println("Grade A");
				}
				else  if (marks>=70 && marks<=89) {
					System.out.println("B Grade");
				}
					else if (marks>=40 && marks<=39) {
						System.out.println("C Grade");
					}
					else {
						System.out.println("Invalid");
					}
	}			
}			
		
				
				
			

			

		





