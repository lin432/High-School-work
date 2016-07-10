package classes;

public class TimeDepositAccount extends BankAccount {
	
	private double interest;
	private int months;
	private double penalty = 1.04;
	//variables for the months, interest and the penalty amount
	//I set penalty amount because it would likely be part of a set plan
	
	public TimeDepositAccount(double amt, String nme, double interest, int months)
	{//constructor
		super(amt,nme);
		//creates superclass constructor
		this.interest = interest;
		this.months = months;
		//sets interest and month
	}
	
	public void addinterest()
	{
		super.deposit(super.check()*interest);
		//minuses one month and adds the interest
		months = months - 1;
	}
	
	public void withdraw(double amt)
	{
		if(months<=0)
		{//checks if months is 0 or under
			super.withdraw(amt);
		}
		else
		{	//charges penalty to withdrawal amount
			super.withdraw((amt*penalty));
		}
	}

}
