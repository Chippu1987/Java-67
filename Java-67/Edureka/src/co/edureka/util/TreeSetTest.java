package co.edureka.util;
import java.util.TreeSet;
public class TreeSetTest 
{
	public static void main(String[] args) 
	{
		TreeSet<String> courses = new TreeSet<>();
		//courses.add(null); //java.lang.NullPointerException
		courses.add("Python");
		courses.add("Android");
		courses.add("iPhone");
		courses.add("Java");
		courses.add("CPP");
		System.out.println(courses);
	}
}
