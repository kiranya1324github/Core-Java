package com.edu;

public class MainApp {

	public static void main(String[] args) {
		Thread ob=new Thread() {
		public void run() {
		System.out.println("Run Method");
	}
};
	
ob.start();
	}
}
  