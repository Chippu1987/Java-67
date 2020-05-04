package co.edureka.util;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetTest 
{
	public static void main(String[] args) 
	{
	 HashSet<String> courses = new HashSet<String>();
	 
	 System.out.println(courses.add("C")); //true
	 System.out.println(courses.add("C")); //false
	 courses.add(null);
	 
	 Scanner sc = new Scanner(System.in);
	 String req = "Y";
	 
	 while(req.equalsIgnoreCase("Y"))
	 {
		System.out.print("enter course name: ");
		String cname = sc.nextLine();
		boolean result = courses.add(cname);
		if(!result) {
			System.out.println(cname+" is already in list!");
		}
		
		System.out.print("More courses[Y/N]: ");
		req=sc.nextLine();
	 }
	 
	 System.out.println("Available Courses @ edureka");
	 System.out.println(courses);
	 
	 sc.close();	 
	}
}
