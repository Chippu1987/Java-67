package co.edureka.jdbc;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception
	{
	  EmployeeDAO edao = EmployeeDAOFactory.getEmployeeDAO();
	  /*
	  //insert employee
	  Employee emp = new Employee(106,"Randeep",2500.5f);
	  edao.saveEmp(emp);
	  */
	  
	  /*
	  //update employee
	  Employee emp = new Employee(101,"Sunil Joseph",2500.5f);
	  edao.updateEmp(emp);
	  */
	  
	  Scanner sc = new Scanner(System.in);
	  /*
	  //delete employee
	  System.out.print("enter employee no to delete: ");
	  int eno = sc.nextInt();
	  edao.deleteEmp(eno);
	  */
	  
	  List<Employee> emps = edao.getEmployees();
	  for(Employee emp : emps)
	  {
		  System.out.println(emp); //toString()
		  Thread.sleep(2000);
	  }
	  
	  sc.close();
	}
}
