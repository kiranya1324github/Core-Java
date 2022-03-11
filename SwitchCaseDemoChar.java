package p1;

import java.util.Scanner;

public class SwitchCaseDemoChar {

	public static void main(String[] args) {
		char ch;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Character");
		 ch=sc.next().charAt(0);
		 switch (ch) {
		
		 case 'A':System.out.println("Vowel");
		          break;
		 case 'E':System.out.println("Vowel");
		           break;
		 case 'I':System.out.println("Vowel");
		            break;
		 case 'O':System.out.println("Vowel");
                      break;
         case 'U':System.out.println("Vowel");
                     break;
          default: 
        	         System.out.println("Not an vowel");

	 
		 }
		 
	}

}
