package co.edureka.jdbc;

public class EmployeeDAOFactory 
{
 private static EmployeeDAO edao = null;
 public static EmployeeDAO getEmployeeDAO() throws Exception
 {
	 EmployeeDAO dao = new EmployeeDAOImpl();
	 return dao;
 }
}
