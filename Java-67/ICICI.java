class ICICI implements Bank 
{
  public void deposit(float amt){
	  System.out.println("Depositing Rs."+amt+" in ICICI A/c");
  }
  public void withdraw(float amt){
	  System.out.println("Debiting Rs." +amt+" from ICICI A/C"); 
  }
}
