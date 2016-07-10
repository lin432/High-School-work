package bank;

public class Bank_account {
	
	public double balance;
	public String name;
	
	public void new_account(double b, String n)
	{
			name = n;
			balance = b;
	}
	
	public void deposit(double deposit)
	{
		balance = balance+deposit;
	}
	
	public void withdraw(double withdraw)
	{
		balance = balance-withdraw;
	}
	
	public double get_balance()
	{
		return balance;
	}
	
	public String get_name()
	{
		return name;
	}

}
