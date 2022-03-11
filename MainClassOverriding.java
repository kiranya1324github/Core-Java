package firstpackage;

class Shape {
	void area() {
		System.out.println("Area of Shape class");
	}
	
}
class Square extends Shape {   //overrides
	void area() {
		System.out.println("Area of Square class");
		
	}
}
class Rectangle extends Shape {
	void area() {
		System.out.println("Area of Rectangle class");
	}
}
				


public class MainClassOverriding {

	public static void main(String[] args) {
		Shape sob;
		sob=new Rectangle();  // call rectangle
		sob.area();
		sob=new Square();    // call Square
		sob.area(); 
		
		

	}

}
