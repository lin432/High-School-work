package code;

import java.util.*; 
import java.text.*;

import objects.BankAccount;

public class Bigbucksrevisit {
	
	public static void main(String[] args)
	{
		NumberFormat formatter = NumberFormat.getNumberInstance();
		formatter.setMinimumFractionDigits(2);
		formatter.setMaximumFractionDigits(2);
		
		ArrayList<BankAccount> account = new ArrayList<BankAccount>();
		String name = "";
		ListIterator<BankAccount> itr = account.listIterator();
		
		
		while(!name.equalsIgnoreCase("exit"))
		{
			Scanner key = new Scanner(System.in);
			System.out.println("Name please, type exit to abort");
			name = key.nextLine();
			
			if(!name.equalsIgnoreCase("exit"))
			{
				System.out.println("please input deposit");
				Double balance = key.nextDouble();
				
				System.out.println("");
				
				itr.add(new BankAccount(name,balance));
				
				
			}
			
		}
		
		try
		{
		String bname = null;
		Double bala = 0.0;
		
		
		while(itr.hasPrevious())
		{
			BankAccount compare = itr.previous();
			
			if(bala<compare.getbalance())
			{
				bname = compare.getname();
				bala = compare.getbalance();
			}
		}
		
		System.out.println("  ");
		System.out.println("the account with the largest balance is " + bname);
		System.out.println("The account has $" + bala);
		}
		catch(NoSuchElementException e)
		{
			
		}
		
	}

}
/*
package code;

import java.util.*; 
import java.text.*;

import objects.BankAccount;

public class Bigbucksrevisit {
	
	public static void main(String[] args)
	{
		NumberFormat formatter = NumberFormat.getNumberInstance();
		formatter.setMinimumFractionDigits(2);
		formatter.setMaximumFractionDigits(2);
		
		ArrayList<BankAccount> account = new ArrayList<BankAccount>();
		String name = "";
		ListIterator<BankAccount> itr = account.listIterator();
		
		
		while(!name.equalsIgnoreCase("exit"))
		{
			Scanner key = new Scanner(System.in);
			System.out.println("Name please, type exit to abort");
			name = key.nextLine();
			
			if(!name.equalsIgnoreCase("exit"))
			{
				System.out.println("please input deposit");
				Double balance = key.nextDouble();
				
				System.out.println("");
				
				itr.add(new BankAccount(name,balance));
				
				
			}
			
		}
		
		try
		{
		String bname = null;
		Double bala = 0.0;
		
		
		while(itr.hasPrevious())
		{
			BankAccount compare = itr.previous();
			
			if(bala<compare.getbalance())
			{
				bname = compare.getname();
				bala = compare.getbalance();
			}
		}
		
		System.out.println("  ");
		System.out.println("the account with the largest balance is " + bname);
		System.out.println("The account has $" + bala);
		}
		catch(NoSuchElementException e)
		{
			
		}
		
	}

}

 */
