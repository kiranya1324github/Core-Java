package p1;

public class NestedLoop {

	public static void main(String[] args) {
		for( int i=1;i<=5;i++) {
		for(int j=1;j<=4; j++) {
			System.out.print(j+ " ");
		}
		  System.out.println();
		}
			   int k=1;
			   for(int i=1;i<4;i++) {
				  for(int j=1;j<=i;j++) {
					  System.out.println(k+ " ");
					  k++;
				  }
			   }
			
		}

	}


