package com.Springboot_Hibernate_PortgresSQL_Docker.Springboot_Hibernate_PortgresSQL_Docker;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity (name="Account_Data")
public class Account 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	long id;
	long AccNo;
	String AccHolderName;
	double balance;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getAccNo() {
		return AccNo;
	}
	public void setAccNo(long accNo) {
		AccNo = accNo;
	}
	public String getAccHolderName() {
		return AccHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		AccHolderName = accHolderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
