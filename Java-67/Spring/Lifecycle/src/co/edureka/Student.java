package co.edureka;

public class Student 
{
 private String name;
 
 public Student() {
	 this.name = "Sunil";
	 System.out.println("Inside zero argument constructor");
 }
 public Student(String name) {
	 this.name = name;
	 System.out.println("Inside parameterized constructor");
 }
public String getName() {
	System.out.println("Inside getName method");
	return name;
}
public void setName(String name) {
	this.name = name;
	System.out.println("Inside setName method");
}
@Override
public String toString() {
	return "Student [" + name + "]";
}
public void myInit1() {
	System.out.println("User-defined initialization-1");
}
public void myInit2() {
	System.out.println("User-defined initialization-2");
}

public void myDestroy() {
	System.out.println("User-defined destructor..");
}
}
