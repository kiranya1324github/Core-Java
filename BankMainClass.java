package firstpackage;



 class Bank {
	float inst;
	 float rateOfInterest() {
		 
	 System.out.println("Rate of Interest="+inst);
	 return inst;
	 }
 
 }
 class SBI extends Bank {
	 
	 float rateOfInterest() {
		 inst= 5;
	  
	 return inst;
	 }
		 
	 }
 
 
 class 	ICICI extends Bank  {
	 float rateOfInterest() {
	  inst = 8;

	
	 return inst;
	 }
	 
 }
public class BankMainClass {

	public static void main(String[] args) {
		
          Bank ob;
          ob=new SBI();
       
          System.out.println("Rate of Interest of SBI= " +ob.rateOfInterest());
          ob=new ICICI();
       
        float v=ob.rateOfInterest();
        System.out.println("Rate of Interest   of ICICI bank="+v);
	}

}
