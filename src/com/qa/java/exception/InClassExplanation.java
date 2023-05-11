package com.qa.java.exception;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class InClassExplanation {

	static Connection con;
	static Statement st;
	static ResultSet rs;
	List<String> arrayList = new ArrayList<String>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void JDBC_Connectior() {

		String url = "jdbc:mysql://localhost:3306/table_name"; // table details
		String username = "rootgfg"; // MySQL credentials
		String password = "gfg123";
		String query = "select *from students"; // query to be run

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection(url, username, password);
			st = con.createStatement();
			rs = st.executeQuery(query);

			while (rs.next()) {
				// Retrieve values from each row
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");

				// Do something with the retrieved values
				System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
			}
			rs.next();

			String name1 = rs.getString("name"); // Retrieve name from db

		} catch (Throwable e) {

			e.printStackTrace();
		} 

		finally {

			try {
				if (rs != null)
					rs.close();
				if (st != null)
					st.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
				
			}

		}

	}

}
