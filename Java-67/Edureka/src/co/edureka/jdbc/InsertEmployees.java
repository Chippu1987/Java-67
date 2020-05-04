package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertEmployees {

	public static void main(String[] args) throws Exception
	{	 
		 Connection con = ConnectionFactory.getConnection();
			 
		 PreparedStatement pst = con.prepareStatement("insert into emp(empno,ename,sal) values(?,?,?)"); 
 
		 Scanner sc = new Scanner(System.in);
		 String req="Y";
		 while(req.equalsIgnoreCase("Y"))
		 {
		  try
		  {
			System.out.println("enter empno, name, sal");
			String empno=sc.next();
			String name=sc.next();
			String sal=sc.next();
			
			pst.setString(1, empno);
			pst.setString(2, name);
			pst.setString(3, sal);
			
			int n = pst.executeUpdate();
			if(n>0)
				System.out.println("Employee Saved!");
			
			System.out.print("More employees to svae [Y/N]: ");
			req=sc.next();
		  }
		  catch(Exception ex) {
			 System.out.println("Exception: " + ex.toString());
		  }
		 } 
		 pst.close();
		 con.close();	
	 }
}