class Account 
{
 long acno;
 String name;
 float bal;

 Account(){}

 Account(long acno, String name, float bal)
 {
   this.acno = acno;
   this.name = name;
   this.bal = bal;
 }

 void deposit(float amt)
 {
   this.bal = this.bal + amt;
   System.out.println("Rs."+amt+" Deposited || Balance = "+this.bal);
 }

 void withdraw(float amt)
 {
   if(this.bal >= amt){
	   this.bal = this.bal - amt;
	   System.out.println("Rs."+amt+" Debitted || Balance = "+this.bal);
   }
   else{
	   System.out.println("ERROR: Insufficient Balance!!");
   }
 }

 void getBalance(){
   System.out.println("A/C No: "+this.acno+" | Name: "+this.name+" | Balance: "+this.bal);
 }
}
