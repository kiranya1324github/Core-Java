package com.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/mydb"; //mydb is the database name of mysql
		String un="root";
		String pass="root";
		Connection conn=null;
		Statement st=null;
		ResultSet rs=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id to be fetch record");
		int id=sc.nextInt();
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url, un, pass);
			st=conn.createStatement();
			String sql="select * from login2 where id=  " +id;
			rs=st.executeQuery(sql);
			if(rs.next()) {
				System.out.println(rs.getString("id")+"    "+rs.getString("name"));
			
			}else {
				System.out.println("user not exists");
			}
 		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	


