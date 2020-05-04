package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BatchExec 
{
	public static void main(String[] args) throws Exception
	{
	  Class.forName("com.mysql.jdbc.Driver");
	  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/edureka","root","");
	  Statement st = con.createStatement();
	  
	  con.setAutoCommit(false);
	  
	  st.addBatch("insert into emp values(101,'Sunil',123.45)");
	  st.addBatch("insert into emp values(102,'Anil',123.45)");
	  //st.addBatch("insert into emp values(102,'Sanjay',123.45)");
	  st.addBatch("insert into emp values(103,'Sanjay',123.45)");
	  st.addBatch("update emp set sal=2500.5");
	  
	  try
	  {
		  int[] n = st.executeBatch();
		  for(int x : n)
		  {
			  System.out.println("Rows Affected : "+ x);
		  }
		  con.commit();
	  }
	  catch(Exception ex) {
		  System.out.println(ex);
		  con.rollback();
	  }
	  finally {
		  st.close();
		  con.close();
	  }
	}
}
