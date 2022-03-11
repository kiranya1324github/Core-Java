package kiranya.com;

import java.util.Scanner;

public class DivisibleMain {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		n=sc.nextInt();
		if(n%5==0 && n%3==0) {
			System.out.println("divisible by 5 and 3 ");
		}
			else {
				System.out.println("Not divisible");
				
			}
		}
			
		
		

	}


