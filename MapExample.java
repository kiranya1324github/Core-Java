package com.edu;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;


class Book {
	int bid;
	String bname;
	String aname;
	float price;
	public Book(int bid, String bname, String aname, float price) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.aname = aname;
		this.price = price;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + ", aname=" + aname + ", price=" + price + "]";
	}
	
}



public class MapExample {
	public static void main(String[] args) {
	
		HashMap<Integer,  Book>hm =new HashMap<>();
	Book b1=new Book(4,"C Programming ", "James", 800f);
	Book b2=new Book(6,"Java", "Hilter", 600f);
	Book b3=new Book(3,"Oracle sql", "John", 900f);
	
	hm.put(1, b1);
	hm.put(2, b2);
	hm.put(3, b3);
	
	
	System.out.println(hm);
	
	
	for(Map.Entry<Integer, Book>me:hm.entrySet() ) {
		int k=me.getKey();
		Book b=me.getValue();
		System.out.println(b.getBid()+"  "+b.getBname()+"  "+b.getAname()+"   "+b.getPrice());
	}
	
	
         //Hash table shafles the values
	     //Hash Map does not changes the values
	      //Tree Map does no changes
	
	

	

	}

}
