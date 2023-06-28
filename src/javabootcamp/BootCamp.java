package javabootcamp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BootCamp {

	final String  customerID;
	final String  Password;
	String FN;
	String MN;
	String LN;
	String EMAILID;
	int MOBILENO;
	String ADDRESS;
	String PAN;
	long ADHAAR;
	static Connection con;
	static Statement st;
	static ResultSet rs;

	
	
	
	public BootCamp() {
System.out.println("BootCamp");
		this.customerID = "";
		this.Password = "";
		System.out.println("Welcome to ARC Bank");
	}

	public BootCamp(String FN, String MN, String LN, String EMAILID, int MOBILENO, String ADDRESS, String PAN,
			long ADHAAR) {

		this.FN = FN;
		this.MN = MN;
		this.LN = LN;
		this.EMAILID = EMAILID;
		this.MOBILENO = MOBILENO;
		this.ADDRESS = ADDRESS;
		this.PAN = PAN;
		this.ADHAAR = ADHAAR;
		this.customerID = "";
		this.Password = "";
		System.out.println("Data Stored in variables");
		
	}

	public void insertDataIntoDatabase() {
		System.out.println("DB update");
		try {

			String url = "jdbc:mysql://localhost:3306/table_name"; // table details
			String username = "rootgfg"; // MySQL credentials
			String password = "gfg123";
			String query = "INSERT INTO customer_table (FN, MN,LN,EMAILID,MOBILENO,ADDRESS,PAN,ADHAAR) VALUES " + "("
					+ FN + "," + MN + "," + LN + ")";
			Class.forName("com.mysql.cj.jdbc.Driver"); // Driver name
			con = DriverManager.getConnection(url, username, password);
			System.out.println("Connection Established successfully");
			st = con.createStatement();
			rs = st.executeQuery(query); // Execute query

		} catch (SQLException se) {

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Catch Block");
			e.printStackTrace();
		}

		finally {

			System.out.println("DB Connection close");
		}
	}

	public ResultSet sendDataToCibil() {

		System.out.println("DB update");
		try {

			String url = "jdbc:mysql://localhost:3306/table_name"; // table details
			String username = "rootgfg"; // MySQL credentials
			String password = "gfg123";
			String query = "select * from customer_table where PAN="+PAN;
					
			Class.forName("com.mysql.cj.jdbc.Driver"); // Driver name
			con = DriverManager.getConnection(url, username, password);
			System.out.println("Connection Established successfully");
			st = con.createStatement();
			rs = st.executeQuery(query); // Execute query

		} catch (SQLException se) {

		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Catch Block");
			e.printStackTrace();
		}

		finally {

			System.out.println("DB Connection close");
		}

		return rs;

	}

	public BootCamp balTransfer() throws Exception {
		System.out.println("Before Division");
		try {
		int i=10/0;
		}catch(Exception e) {
			e.printStackTrace();			
		}
		System.out.println("After Division");
		return new BootCamp();
		
		
		//Thread.sleep(8900);
		
		
		//throw new Exception("Exceptor");
	}
	
	public BootCamp balTransfer(String KJ) throws Exception {
		System.out.println("Before Division");
		try {
		int i=10/0;
		}catch(Exception e) {
			e.printStackTrace();			
		}
		System.out.println("After Division");
		
		
		Thread.sleep(8900);
		
		
		throw new Exception("Exceptor");
	}
	
}
