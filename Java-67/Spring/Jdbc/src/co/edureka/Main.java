package co.edureka;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		AccountDAO dao =(AccountDAO)context.getBean("accountdao");
		
		/*
		Account acc = new Account(10010124,"Rahul",35000f);
		dao.createAccount(acc);
		*/
		/*
		Account acc = new Account(10010124,"Rahul Sharma",22500f);
		dao.updateAccount(acc);
		*/
		
		List<Account> accounts = dao.getAccounts();
		for(Account acc : accounts)
		{
			System.out.println(acc); //toString()
			Thread.sleep(1000);
		}
	}
}
