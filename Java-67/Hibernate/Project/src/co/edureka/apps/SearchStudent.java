package co.edureka.apps;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import co.edureka.configs.HibernateUtils;
import co.edureka.domains.Student;

public class SearchStudent {

	public static void main(String[] args) {
		  SessionFactory sf = HibernateUtils.getSessionFactory();
		  Session session = sf.openSession();
		  
		  /*
		  //retrieve a student record using load()
		  Student st = new Student();
		  System.out.println(st);
		  try {
		   session.load(st, Integer.valueOf(1025));
		  }
		  catch(Exception ex) {
			  System.out.println(ex.toString());
		  }
		  System.out.println(st);
		  */
		  
		  Student st = session.get(Student.class, Integer.valueOf(105));
		  if(st != null)
			  System.out.println(st);
		  else
			  System.out.println("No matching student found!");
		  
		  session.close();
		  sf.close();
	}
}
