package hinteritance.java;
//multiple inheritance
//class called
class one {
	one() {
		System.out.println("one Constructor");
		
	}
	}
	class two extends one {
		two () {
			System.out.println("two Constructor");
		}
	}
		
	class three extends two {
		three() {
			System.out.println("three Constructor");
		}
	}
		class four extends three {
			four() {
				System.out.println("four Constructor");
			}
		
	
	}



public class ConstructorMain {

	public static void main(String[] args) {
		
		four ob=new four();
		

	}

}
