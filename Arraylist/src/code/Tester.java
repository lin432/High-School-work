package code;

import java.util.*;
import java.text.*;
import objects.BankAccount;

public class Tester {

	public static void main(String[]args)
	{
		NumberFormat formatter = NumberFormat.getNumberInstance();
		formatter.setMinimumFractionDigits(2);
		formatter.setMaximumFractionDigits(2);
		//sets the max decimal spots (taken from BPJ textbook)
		
		Scanner key = new Scanner(System.in);
		ArrayList arylist = new ArrayList();
		//ArrayList
		
		String name;
		
		do//Basic while loop copied of the BPJ textbook
		{			
			
			System.out.println("Please enter the name of the Bankaccount or type Exit to abort");
			//Guidance
			
			name = key.nextLine();
			//saves name for checking
			
			if(!name.equalsIgnoreCase("exit"))
			{
				
				System.out.println("please enter the amount of deposit");
				//guide
				
				double amount = key.nextDouble();
				//saves amount
				
				System.out.println("");
				
				BankAccount bank = new BankAccount(name, amount);
				arylist.add(bank);
				//creates account and adds it to array list
			}
			
		}while(!name.equalsIgnoreCase("exit"));
			
		
		BankAccount ba = (BankAccount) arylist.get(0);
		double maxBalance = ba.balance;
		String maxname =ba.name;
		//set variables (Sorta copied from BPJ)
		
		for( int count = 1; count<arylist.size(); count++)
		{
			BankAccount test = (BankAccount) arylist.get(count);
			double balance = test.balance;
			//saves the object to be tested
			
			if(maxBalance<balance)
			{
				maxBalance = balance;
				maxname = test.name;
				//sets the bigger object as the new max
			}
		}
		
		System.out.println("The account with the largest balance belongs to " + maxname);
		System.out.println("The amount is " + maxBalance);
		//prints
	}
	
}
/*Please enter the name of the Bankaccount or type Exit to abort
Jim Jones
please enter the amount of deposit
186.22

Please enter the name of the Bankaccount or type Exit to abort
Bill Gates
please enter the amount of deposit
102.15

Please enter the name of the Bankaccount or type Exit to abort
Helen Hunt
please enter the amount of deposit
1034.02

Please enter the name of the Bankaccount or type Exit to abort
Charles Manson
please enter the amount of deposit
870.85

Please enter the name of the Bankaccount or type Exit to abort
exit
The account with the largest balance belongs to Helen Hunt
The amount is 1034.02
*/
