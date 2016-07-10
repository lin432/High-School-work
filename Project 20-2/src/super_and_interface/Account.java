package super_and_interface;

import java.util.*;

public class Account implements Information {
	//this is a simple account used as an archetype to make the rest
	Date date = new Date();
	//use date!
	
	private double balance = 0;
	private short pin = 0;
	public String name = "";
	private double interest; 
	private double tax = 0.05;
	private int year = date.getYear();
	
	
	public Account(short pin, String name, double interest, double taxrate)
	{//constructor saves variables
		this.tax = taxrate;
		this.pin = pin;
		this.name = name;
		this.interest = interest;
	}
	
	public void setTax(double taxrate)
	{
		this.tax = taxrate;
	}//sets tax
	
	public void update(int year)
	{		
		for(int count = this.year; count < year; count++)
		{
		balance += balance * interest;
		}
		
		this.year = year;
	}//updates interest, uses for loop as the machine updates every month
	
	
	public void withdraw(double amount)
	{
		double hold = amount - amount * tax; 
		
		if(balance < hold)
		{//checks if not enough cash
			String reason = "Not enough cash";
			UnsupportedOperationException e = new UnsupportedOperationException(reason);
			throw e;
		}
		else
		{
		balance = balance - amount*tax;
		}
	}
	
	public void deposit(double amount)
	{
		balance = (balance + amount) - amount*tax;
	}//adds amount
	
	public boolean pinCheck(short check) {
		if(check == pin)
		{return true;}
		else
		{return false;}
	}//use this first when in main
	
	
	//get commands below
	public double getBalance()
	{return balance;}
	
	public String getName()
	{return name;}
	
	public int getYear()
	{return year;}
	
	public long getTime()
	{return date.getTime();}
	
}
	


