package co.edureka;

public class Bank {
 public void deposit() {
	 System.out.println("Generic Deposit Method");
 }
 public void deposit(String acno, float amt) {
	 System.out.println("Depositing Rs."+amt+" in A/C "+acno);
 } 
 public void withdraw() {
	 System.out.println("Withdraw method logic");
 }
}
