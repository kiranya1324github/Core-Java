package com.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class InsertRecordByUser {

	public static void main(String[] args) {
		//Connection
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/mydb";//mydb is database in sql
		String un="root";
		String pass="root";
		Connection conn=null;
		Statement st=null;
		int id=0;
		String name;
		Scanner sc=new Scanner(System.in);
		String ins=null;
		
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url, un, pass);
			st=conn.createStatement();
			
			while(true) {
			System.out.println("Enter name");
			name=sc.next();
			System.out.println("Enter id");
			id=sc.nextInt();
			ins="insert into login values("+id+" ,'"+name+"')";
			int i=st.executeUpdate(ins);
			
			
			if(i>0) {
				System.out.println("Recore is inserted successfully");
			}else {
				System.out.println("Not inserted");
			}
			System.out.println("Do you want to continue y/n");
			char ch=sc.next().charAt(0);
			if(ch=='n') {
				break;
			}
		}
		
		}catch(Exception e) {
			e.printStackTrace();
		}
          System.out.println("End of program");
	}
}

