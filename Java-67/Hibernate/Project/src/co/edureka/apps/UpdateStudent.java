package co.edureka.apps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import co.edureka.configs.HibernateUtils;
import co.edureka.domains.Student;

public class UpdateStudent {

	public static void main(String[] args) {
		  SessionFactory sf = HibernateUtils.getSessionFactory();
		  Session session = sf.openSession();
		  session.beginTransaction();
		  
		  /*
		  Student st = new Student(101,"Sunil Joseph","sunil@edureka.co","1111111111");
		  session.update(st);
		  */
		  
		  
		  Student st = session.get(Student.class, Integer.valueOf(103));
		  if(st != null) {
			  System.out.println(st);
			  st.setSname("Anil Kumar"); //dirty object
		  }
		  else
			  System.out.println("No matching student found!");
		  
		  
		  session.getTransaction().commit();
		  session.close();
		  sf.close();
	}
}
