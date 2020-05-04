class Employee 
{
	int empno;
	String name;
	float sal;
	
	void setDetails() {
		empno = 102;
		name = "Naveen";
		sal=5500;
	}
	
	void displayDetails() {
	 System.out.println(empno+" | "+name+" | "+sal);
	}
} //Employee

class ObjectTest1
{
	public static void main(String[] args) 
	{
	 Employee emp = new Employee();
	 System.out.println(emp.empno+" | "+emp.name+" | "+emp.sal);
	 
	 //change the state using reference
	 emp.empno=101;
	 emp.name="Sunil";
	 emp.sal=2500.5f;
	 emp.displayDetails(); 
	 
	 //change state using a method
	 emp.setDetails();
	 emp.displayDetails();
	}
}
