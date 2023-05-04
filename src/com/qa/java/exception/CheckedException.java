package com.qa.java.exception;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CheckedException {

	static Connection con;
	static Statement st;
	static ResultSet rs;

	public static void main(String[] args) {
		JDBC_Connection();
	}

	public static void JDBC_Connection() {
		try {
			
			  String url = "jdbc:mysql://localhost:3306/table_name"; // table details
			  String username = "rootgfg"; // MySQL credentials 
			  String password = "gfg123";
			  String query = "select *from students"; // query to be run
			  Class.forName("com.mysql.cj.jdbc.Driver"); // Driver name con =
			  DriverManager.getConnection(url, username, password);
			  System.out.println("Connection Established successfully"); st =
			  con.createStatement(); rs = st.executeQuery(query); // Execute query
			  rs.next(); String name = rs.getString("name"); // Retrieve name from db
			  System.out.println(name); // Print result on console
			 
			System.out.println("Before Break");
			int p = 10 / 0;
			System.out.println("After break");

		} catch (SQLException se) {

		}  catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			System.out.println("Catch Block");
			e.printStackTrace();
		}

		finally {

			System.out.println("DB Connection close");
		}
	}
}
