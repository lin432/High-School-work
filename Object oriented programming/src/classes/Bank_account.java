package classes;

public class Bank_account {

	public Bank_account(int h, String n)
	{
		balance = h;
		name = n;
	}
	//create balance constructor
	
	public void addInterest(double i)
	{
		interest = i;
		balance *=(i/100)+1;
		
	}
	//add interest, (I don't know how interest actually works -_-)
	
	public int deposit(int m)
	{
		deposit = m;
		int x = balance += deposit;
		return x;
	}
	//method to save deposit
	
	public int withdraw(int p)
	{
		withdraw = p;
		int y = balance -= withdraw;
		return y;
	}
	//method to withdraw deposit
	
	
	public String name;
	public double interest;
	public int balance;
	public int deposit;
	public int withdraw;
	//state variables
}
