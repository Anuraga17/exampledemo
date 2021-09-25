package com.cg.modal;
public class Account
{
	private int accountNumber;
	double balance;
	String accountHolderName;
	String openedDate;
	public Account() {}
	public Account(int accountNumber,double balance)
	{
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double validateBalance(double balance) {
		return (balance>=5000) ? balance : 0;
	}
	public void setAccountHolderName(String accountHolderName)
	{
		this.accountHolderName = accountHolderName;
	}
	public String getAccountHolderName()
	{
		return accountHolderName;
	}
	public void setOpenedDate(String openedDate)
	{
		this.openedDate = openedDate;
	}
	public String getOpenedDate()
	{
		return openedDate;
	}
	

}
