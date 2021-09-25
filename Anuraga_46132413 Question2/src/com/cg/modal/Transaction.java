package com.cg.modal;
import com.cg.exception.InsufficientBalanceException;
public class Transaction 
{
	public void deposit(Account account,double amount)
	{
		account.setBalance(account.getBalance()+amount);
	}
	public static void withdraw(Account account,double amount)
	{
		double balance = account.getBalance();
		if(balance - amount >= 5000)
			account.setBalance(balance - amount);
		else
			throw new InsufficientBalanceException(balance-amount+" is not sufficient min deposit");
	}

}
