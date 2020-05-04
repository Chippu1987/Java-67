package co.edureka;

public class SavingsAccount extends Account {
 private float interest;

public SavingsAccount() {
	super();
	// TODO Auto-generated constructor stub
}

public SavingsAccount(long acno, String name, float bal, float intrst) {
	super(acno, name, bal);
	this.interest=intrst;
}

public float getInterest() {
	return interest;
}

public void setInterest(float interest) {
	this.interest = interest;
}
 
}
