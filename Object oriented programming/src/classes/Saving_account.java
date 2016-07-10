package classes;

public class Saving_account 
{
	public Saving_account(double b, double i)
	{
		interest = i;
		balance = b;
	}
	//^created the constructor w/ 2 variables
	
	public double balance(double b)
	{
		return balance;
	}
	// allows me to access the balance
	
	
	public void addInterest()
	{
		balance *= interest/100 + 1;
	}
	//^adds interest w/o a parameter
	
	public double balance;
	public double interest;
	//^Instances
}
