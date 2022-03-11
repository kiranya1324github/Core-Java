package firstpackage;
  
class MyFirstClass {
	public int pubj;  //public
	private int pri;  //private
	protected int protk;  //protected
	int dfm;   //default
	
	
	//with in package
	//public is only within class
	//default public are like public
	//all the classes can access with reference to object
	
	
	
	void MyFirstClassDisplay() {
		System.out.println(" public can be accessed "+pubj);
 
 			System.out.println("default can be accessed "+dfm);
 			
 			System.out.println("protected can be accessed "+protk);
	}
}

	class IndependentClass {
		void display() {
			//private can be accessed within class
			MyFirstClass ob=new MyFirstClass();
			System.out.println(" public can be accessed "+ob.pubj);
		//	System.out.println("private can be accesses  "+ob.pri); // private class can hidden
			System.out.println("default can be accessed "+ob.dfm);
			//All the classes can be accessed within the single class using object except private class.
			System.out.println("protected can be accessed "+ob.protk);
		}
	}

     class MyExtendedClass extends MyFirstClass {
    	 void extendedDisplay() {
    	 MyFirstClass ob=new MyFirstClass();
    	
    	 System.out.println(" public can be accessed "+pubj);
 		//	System.out.println("private can be accesses  "+ob.pri); // private class can hidden
 			System.out.println("default can be accessed "+dfm);
 			//All the classes can be accessed within the single class using object except private class.
 			System.out.println("protected can be accessed "+protk);
    	 // no object creation
 			//public,default and protected are directly inherited
     }
    	 
     }
		
		
	
		       
		
	


public class MainClassAccessSpecifiers {
         public static void main (String args[]) {
        IndependentClass ob=new IndependentClass();
        	ob.display();
         

         }
}
