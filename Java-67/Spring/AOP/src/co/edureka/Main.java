package co.edureka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		Bank bank = (Bank)context.getBean("bank");
		bank.deposit();
		bank.deposit("SBI1234",25000f);
		System.out.println("------------------------");
		
		bank = (Bank)context.getBean("proxy");
		bank.deposit();
		System.out.println();
		bank.deposit("SBI1234",25000f);
	}
}
