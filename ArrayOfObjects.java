package p1;

public class ArrayOfObjects {

	public static void main(String[] args) {
		Employee s[]=new Employee[2]; 
		for(int i=0;i<s.length;i++) {
			s[i]=new Employee();
			}
	
		
		for(int i=0;i<s.length;i++) {
			s[i].input();
			
		}
		System.out.println("Students Details");
		for(int i=0;i<s.length;i++) {
			s[i].display();
		}


	}

}
