package classes;

public class BankAccount {
	
	private double balance;
	public String name;
	//basic variables for account
	
	public BankAccount(double amt,String nme)
	{//constructor
		balance = amt;
		name = nme;
	}
	
	public double check()
	{return balance;}
	
	public void deposit(double amt)
	{
		balance = balance + amt;
	}
	
	public void withdraw(double amt)
	{
		balance = balance - amt;
	}
	//^^basic balance commands^^
}
