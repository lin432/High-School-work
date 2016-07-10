package objects;

import java.util.*;

public class BankAccount {

	public String name;
	public Double balance;
	
	public BankAccount(String n, Double d)
	{   
		name = n;
		balance = d;
	}
	
	public void deposit(double dp)
	{
		balance += dp;
		
	}
	
	public void withdraw(double wd)
	{
		balance-=wd;
	}
	
	public double getbalance()
	{
		return balance;
	}
	
	public String getname()
	{
		return name;
	}
	
}
