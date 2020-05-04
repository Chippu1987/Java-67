package co.edureka.apps;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import co.edureka.configs.HibernateUtils;
import co.edureka.domains.Batch;
import co.edureka.domains.Faculty;

public class Relationships {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Faculty faculty = new Faculty(1,"Sunil Joseph");
		
		Batch batch1 = new Batch(101,"Java @ 26th Oct 2019", faculty);
		Batch batch2 = new Batch(102,"Bigdata @ 05th Jan 2020", faculty);
		Batch batch3 = new Batch(103,"Java @ 28th Feb 2020", faculty);
		
		Set<Batch> batches = new HashSet<>();
		batches.add(batch1);
		batches.add(batch2);
		batches.add(batch3);
		
		faculty.setBatches(batches);
		
		session.save(faculty);
		tx.commit();
		
		session.close();
		sf.close();
	}
}
