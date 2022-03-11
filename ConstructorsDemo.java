package p1;
class Addition {
	int i,j,s;
	Addition() {
		System.out.println("after object creation");
		i=1;
		j=2;
	}
	   
	Addition(int k,int l) {
		i=k;
		j=l;
	}
	void add() {
		s=i+j;
	}
	void display() {
		System.out.println("Display");
		System.out.println("The sum of "+i+"   and   "+j+"   is  "+s);
	}
}

public class ConstructorsDemo {

	public static void main(String[] args) {
		Addition ob=new Addition();
		System.out.println("i=" +ob.i);
		System.out.println("j="  +ob.j);
		ob.add();
		ob.display();
		
		
		

	}

}
