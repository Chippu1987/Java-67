package co.edureka.apps;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import co.edureka.configs.HibernateUtils;
import co.edureka.domains.Student;

public class HQLTest {

	public static void main(String[] args) throws InterruptedException {
		  SessionFactory sf = HibernateUtils.getSessionFactory();
		  Session session = sf.openSession();
		  
		  //TypedQuery<Student> query = session.createQuery("from co.edureka.domains.Student");
		  //TypedQuery<Student> query = session.createQuery("from co.edureka.domains.Student where sname='Sunil Joseph'");
		  /*
		  TypedQuery<Student> query = session.createQuery("from co.edureka.domains.Student where studid between ? and ?"); //positional parameters
		  query.setParameter(0, Integer.valueOf(101));
		  query.setParameter(1, Integer.valueOf(105));
		  */
		  TypedQuery<Student> query = session.createQuery("from co.edureka.domains.Student where studid between :x and :y"); //named parameters
		  query.setParameter("x", Integer.valueOf(105));
		  query.setParameter("y", Integer.valueOf(1050));
		  
		  List<Student> students = query.getResultList();
		  
		  for(Student st : students)
		  {
			  System.out.println(st);
			  Thread.sleep(1000);
		  }
		  
		  System.out.println();
		  
		  Transaction tx=session.beginTransaction();  
		  TypedQuery q=session.createQuery("update co.edureka.domains.Student set sname=:name where studid=:sid");  
		  q.setParameter("name","Sunil");  
		  q.setParameter("sid",101);  
		  			      
		  int status=q.executeUpdate();  
		  if(status>0)
		   System.out.println("Students Updated = "+status);
		  else
		   System.out.println("No matching students found!");
		  
		  session.close();
		  sf.close();
	}
}
