package co.edureka.apps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import co.edureka.domains.Account;

public class AccountCreation {

	public static void main(String[] args) {
		   Configuration config = new Configuration();
		   config.configure("co/edureka/configs/hibernate.cfg.xml"); 
		   
		   SessionFactory sfactory = config.buildSessionFactory();
		   
		   Session session = sfactory.openSession();
		   Transaction tx = session.beginTransaction();
		   
		   Account acc = new Account(100215,"Sunil Joseph",25000f);
		   
		   session.save(acc);
		   
		   System.out.println("----------------------");
		   
		   tx.commit();
		   session.close();
		   sfactory.close();
	}

}
