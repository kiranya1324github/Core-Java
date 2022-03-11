package com.edu;




import java.util.Hashtable;
import java.util.Map;

public class HashTable1 {

	public static void main(String[] args) {
		Hashtable<Integer, String>hp=new Hashtable<Integer,String>();
		hp.put(20, "Lily");
		hp.put(50, "Arthi");
		hp.put(25, " Keerthi");
		System.out.println(hp);
		
		hp.putIfAbsent(20, "Lily");
		System.out.println("After invoking putIfAbsent()  method ");
		for(Map.Entry m:hp.entrySet()) {
			System.out.println(m.getKey()+"  "+m.getValue());
		}
		
		for(Map.Entry m:hp.entrySet()) {
			hp.put(50, "Arthi");
			hp.put(25, "Keerthi");
			System.out.println(m.getKey()+"   "+m.getValue());
		}
		
		
	}
	
	
	

}

          
          







