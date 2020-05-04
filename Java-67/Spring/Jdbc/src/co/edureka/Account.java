package co.edureka;

public class Account {
 private long acno;
 private String name;
 private float bal;
 
public Account() {	}

public Account(long acno, String name, float bal) {
	this.acno = acno;
	this.name = name;
	this.bal = bal;
}

public long getAcno() {
	return acno;
}
public void setAcno(long acno) {
	this.acno = acno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getBal() {
	return bal;
}
public void setBal(float bal) {
	this.bal = bal;
}
@Override
public String toString() {
	return "Account [" + acno + " | " + name + " | " + bal + "]";
} 
}
