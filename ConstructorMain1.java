package hinteritance.java;
// one parent can have many child
//but one child cannot have many parents
class five {
	five() {
		System.out.println("five Constructor");
		
	}
	}
	class six extends five {
		six () {
			System.out.println("six Constructor");
		}
	}
		
	class seven extends five {
	    seven() {
			System.out.println("seven Constructor");
		}
	}
		class eight extends five {
			eight() {
				System.out.println("eight Constructor");
			}
		
	
	



		

	}



public class ConstructorMain1 {

	public static void main(String[] args) {
	  seven ob=new seven();

	}

}
