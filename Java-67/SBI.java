class SBI implements Bank 
{
  public void deposit(float amt){
	  System.out.println("Depositing Rs."+amt+" in SBI");
  }
  public void withdraw(float amt){
	  System.out.println("Debiting Rs." +amt+" from SBI A/C"); 
  }
}
