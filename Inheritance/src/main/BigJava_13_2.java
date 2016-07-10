package main;

import classes.TimeDepositAccount;

import java.text.NumberFormat;
import java.util.*;

public class BigJava_13_2 {
	
	public static void main(String[]args)
	{
		Scanner key = new Scanner(System.in);
		//creates scanner
		
		System.out.println("Please enter the name of the account");
		String name = key.nextLine();
		
		System.out.println("please enter the amount of the first deposit");
		double amount = key.nextDouble();
		
		System.out.println("please enter the interest rate");
		double interest = key.nextDouble();
		
		System.out.println("please enter the months required");
		int months = key.nextInt();
		//^^ guide above ^^^
		
		TimeDepositAccount account = new TimeDepositAccount(amount,name,interest,months);
		//creates account with variables above
		
		String command;
		System.out.println("please enter commands, pass to pass time, withdraw to withdraw money");
		System.out.println("Exit to exit or check to check your balance");
		//sets String variable command and prints available commands
		do
		{
			
			command = key.next();
			//next key to decide what to do
			
			//if tree to decide what was entered
			if(command.equalsIgnoreCase("pass"))
			{account.addinterest();}
			else
			{
				if(command.equalsIgnoreCase("withdraw"))
				{
					System.out.println("please enter the amount");
					account.withdraw(key.nextDouble());
				}
				else
				{
					if(command.equalsIgnoreCase("check"))
					{System.out.println(account.check());}
				}
			}	
			
			//asks for next input
			System.out.println("please enter next command");
		}while(!command.equalsIgnoreCase("exit"));
	}

}
/*
Please enter the name of the account
Lin Tao
please enter the amount of the first deposit
500
please enter the interest rate
1
please enter the months required
3
please enter commands, pass to pass time, withdraw to withdraw money
Exit to exit or check to check your balance
withdraw
please enter the amount
100
please enter next command
check
396.0
please enter next command
pass
please enter next command
pass
please enter next command
pass
please enter next command
check
3168.0
please enter next command
withdraw
please enter the amount
1000
please enter next command
check
2168.0
please enter next command
exit
please enter next command
*/
