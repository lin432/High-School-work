package Main;

import java.util.Scanner;
import bank.Bank_account;

public class Object_review {
	
		public static void main(String[] args)
		{
			Scanner keyboard = new Scanner(System.in);
			Bank_account account = new Bank_account();
			//setting objects
			
			System.out.println("welcome please create a new account");
			System.out.println("Please enter the money you wish to depsoit");
			System.out.println("please then enter the name of this account");
			System.out.println();
			//Guiding the user
			
			account.new_account(keyboard.nextDouble(),keyboard.nextLine());
			//creating the account
			
			System.out.println();
			System.out.println("Congratulations, you have set up a new account");
			System.out.println("your new balance is " + account.balance);
			System.out.println();
			//presentation of account
			
			System.out.println("Good day " + account.name);
			//greeting
			
			for(int x = 1; x>0; x++)
			{//infinite for loop until user press n to break
				System.out.println();
				System.out.println("Would you like to deposit or Withdraw");
				System.out.println("or check your balance? type d,w,b");
				System.out.println("If you wish to quit press n");
				System.out.println();
				//Guiding user
				
				String k = keyboard.next();
				//Set next string
				
				
				//If tree to lead to correct choice
				if(k.equalsIgnoreCase("d"))
				{
					System.out.println("how much do you wish to deposit?");
					account.deposit(keyboard.nextDouble());
				}
				if(k.equalsIgnoreCase("w"))
				{
					System.out.println("how much would you like to withdraw?");
					account.withdraw(keyboard.nextDouble());
				}
				if(k.equalsIgnoreCase("b"))
				{
					System.out.println(account.name + "'s current balance is " + account.balance);
				}
				if(k.equalsIgnoreCase("n"))
				{break;}
				//break
			}
			
		}
}
/*
welcome please create a new account
Please enter the money you wish to depsoit
please then enter the name of this account

1000 Sally Jones

Congratulations, you have set up a new account
your new balance is 1000.0

Good day  Sally Jones

Would you like to deposit or Withdraw
or check your balance? type d,w,b
If you wish to quit press n

d
how much do you wish to deposit?
505.22

Would you like to deposit or Withdraw
or check your balance? type d,w,b
If you wish to quit press n

w
how much would you like to withdraw?
100

Would you like to deposit or Withdraw
or check your balance? type d,w,b
If you wish to quit press n

b
 Sally Jones's current balance is 1405.22

Would you like to deposit or Withdraw
or check your balance? type d,w,b
If you wish to quit press n

n

*/