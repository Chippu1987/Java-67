package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class SaveEmp {

	public static void main(String[] args) throws Exception 
	{
		 Class.forName("oracle.jdbc.driver.OracleDriver");
		 
		 Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "java67", "password");
			 
		 Statement st = con.createStatement();
		 
		 String sql = "insert into emp values(101,'Sunil',123.45)";
		 
		 try
		 {
			 int rows_affected = st.executeUpdate(sql);
			 System.out.println("Employees Saved - "+ rows_affected);
		 }
		 catch(Exception ex) {
			 System.out.println("Exception: " + ex.toString());
		 }
		 
		 st.close();
		 con.close();
	}
}
