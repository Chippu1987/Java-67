class BankTest 
{
	public static void main(String[] args) 
	{
		Bank bank = null;
		bank = new SBI();
		System.out.println(bank.a);
		System.out.println(Bank.a);
		System.out.println(SBI.a);
		System.out.println(ICICI.a);
		//bank.a=20;//CE
		bank.deposit(2500);
		bank.withdraw(1000);

		bank = new ICICI();
		bank.deposit(2500);
		bank.withdraw(1000);
	}
}
