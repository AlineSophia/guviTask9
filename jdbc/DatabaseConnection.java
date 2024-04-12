package com.guvi.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseConnection {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		String url = "jdbc:mysql://localhost:3306/table_name";
		String username = "root";
		String password = "root";
		Class.forName("com.mysql.cj.jdbc.Driver"); // Driver name
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("Connection Established successfully");
		 PreparedStatement ps = null; //Prepared Statement
		 String sql = "";
		
		  sql = "insert into  employee values('101','Jenny','25','10000')";
		  ps = con.prepareStatement(sql);
		  ps.execute();
		  sql = "insert into  employee values('102','Jacky','30','20000')";
		  ps = con.prepareStatement(sql);
		  ps.execute();
		  sql = "insert into  employee values('103','Joe','20','40000')";
		  ps = con.prepareStatement(sql);
		  ps.execute();
		  sql = "insert into  employee values('104','John','40','80000')";
		  ps = con.prepareStatement(sql);
		  ps.execute();
		  sql = "insert into  employee values('105','Shameer','25','90000')";
		  ps = con.prepareStatement(sql);
		  ps.execute();
		 
		

		ps.close(); // close statement
		con.close(); // close connection
		System.out.println("Connection Closed....");

	}

}
