package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTableOracle 
{
	public static void main(String[] args) throws Exception 
	{
	 System.out.println("<<<Initialize JDBC Driver");
	 Class.forName("oracle.jdbc.driver.OracleDriver");
	 
	 System.out.println("<<<Connect to DB Server");
	 Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","java67","password");
	 System.out.println("<<<Connected to DB Server");
	 
	 System.out.println("<<<Create an object for passing query to DB");
	 Statement st = con.createStatement();
	 
	 String sql = "create table emp(empno number(5), ename varchar(25), sal number(10,2), primary key(empno))";
	 
	 try
	 {
		 st.execute(sql);
		 System.out.println("DB Table Created!");
	 }
	 catch(Exception ex) {
		 System.out.println("Exception: " + ex.toString());
	 }
	 
	 System.out.println("<<<Closing connection with DB");
	 st.close();
	 con.close();
	}
}
