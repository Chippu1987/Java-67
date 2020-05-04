package co.edureka.domains;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="account", schema = "java67")
public class Account 
{
 private Integer acno;
 private String name;
 private Float bal;
 public Account(Integer acno, String name, Float bal) 
 {
	this.acno = acno;
	this.name = name;
	this.bal = bal;
 }
@Id
@Column(name="acno", nullable = false, unique = true, length = 5)
public Integer getAcno() {
	return acno;
}
public void setAcno(Integer acno) {
	this.acno = acno;
}
@Column(name="name", length = 20)
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Column(name="balance", length = 10 , precision = 2)
public Float getBal() {
	return bal;
}
public void setBal(Float bal) {
	this.bal = bal;
} 
}
