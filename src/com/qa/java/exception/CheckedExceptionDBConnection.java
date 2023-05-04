package com.qa.java.exception;

import java.sql.*;

public class CheckedExceptionDBConnection {
	static Statement st;
	static ResultSet rs;
	static Connection con;

	public static void main(String[] args) {
		try {
			String url = "jdbc:mysql://localhost:3306/table_name"; // table details
			String username = "rootgfg"; // MySQL credentials
			String password = "gfg123";
			String query = "select *from students"; // query to be run
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Driver name
			con = DriverManager.getConnection(url, username, password);
			System.out.println("Connection Established successfully");
			st = con.createStatement();
			rs = st.executeQuery(query); // Execute query
			rs.next();
			String name = rs.getString("name"); // Retrieve name from db
			System.out.println(name); // Print result on console
		} 
		catch (SQLException sql) {
			System.out.println(sql.getMessage());
		} 
		catch (ClassNotFoundException c) {
			System.out.println(c.getMessage());
		} 

	}

}
