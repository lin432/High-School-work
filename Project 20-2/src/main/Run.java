package main;

import java.util.*;

import sub.*;
import super_and_interface.*;
public class Run {

	public static void main(String []args)
	{//things to do, file input/output(optional)
		
		
		
		String command = "";
		//String command to hold the inputed command
		Object hold = null;
		//object to hold temp logged in account
		int spot = -3;
		//just a random number to hold the spot the object holds
		System.out.println("Commands are, new, withdraw, deposit, login, logout, chequeuse");
		
		ArrayList<Object> accounts = new ArrayList<Object>();
		do
		{
			//creates date and prints it
			Date news = new Date();
			System.out.println("It is now the " + news.getMonth() + " month of the year " + (news.getYear()+1900));
			

			
			//updates temp account by date
			if(hold instanceof Account){((Information)hold).update(news.getMonth()); accounts.set(spot, hold);}

			
			
			try
			{
			Scanner key = new Scanner(System.in);
			//creates scanner and asks for command
			
			System.out.println("please enter a command");
			command = key.next();
			
			
			
			
			if(command.equals("new"))
			{//start of creating a new account tree
				System.out.println("Please enter the type of account. Savings, chequing, or an Advanced one");
				command = key.next();
			
			
				if(command.equalsIgnoreCase("Chequing"))
				{//if the account is a basic chequing
					System.out.println("please enter your new pin");
					short pin = key.nextShort();
					System.out.println("please enter the interest rate per month");
					double interest = key.nextDouble();
					System.out.println("please enter the taxrate");
					double taxrate = key.nextDouble();
					System.out.println("please enter the name of this account");
					String name = key.next();
				
					
				Chequing_Account holdvar = new Chequing_Account(pin,name,interest,taxrate);	
				System.out.println("please enter the amount of cheques allowed per month");
				int checks = key.nextInt();
				//sets cheque amount
				holdvar.setCheque(checks);
				
				
				
				accounts.add(holdvar);
				System.out.println("Account succesfully made, please login");
				//adds account
				
				
				}
				else{if(command.equalsIgnoreCase("Savings"))
				{//start of basic savings, timed or minimum balance
					System.out.println("Timed or Minimum balance");

					command = key.next();
					if(command.equalsIgnoreCase("timed"))
					{
						//basic account constructor
						System.out.println("please enter your new pin");
						short pin = key.nextShort();
						System.out.println("please enter the interest rate per month");
						double interest = key.nextDouble();
						System.out.println("please enter the taxrate");
						double taxrate = key.nextDouble();
						System.out.println("please enter the name of this account");
						String name = key.next();
						
						//savings account
						Savings_Account holdvar = new Savings_Account(pin,name,interest,taxrate);
						
						//the release date and the tax penalty
						System.out.println("please enter the release month");
						int releasemonth = key.nextInt();
						
						System.out.println("please enter the release year");
						int releaseyear = key.nextInt() - 1900;
						
						System.out.println("please enter the penalty tax");
						double tax = key.nextDouble();
						
						
						
						//sets variables and objects
						holdvar.timed(releasemonth,releaseyear, tax);	
						accounts.add(holdvar);
						System.out.println("Account succesfully made, please login");
					}
					
					
					else{if(command.equalsIgnoreCase("minimum"))
					{// basic account constructor
						System.out.println("please enter your new pin");
						short pin = key.nextShort();
						System.out.println("please enter the interest rate per month");
						double interest = key.nextDouble();
						System.out.println("please enter the taxrate");
						double taxrate = key.nextDouble();
						System.out.println("please enter the name of this account");
						String name = key.next();
						
						Savings_Account holdvar = new Savings_Account(pin,name,interest,taxrate);
						
						//gets minimum balance
						System.out.println("please enter the minimum balance");
						double minimium = key.nextDouble();
						
						//sets variables and object
						holdvar.setMinimium(minimium);
						accounts.add(holdvar);
						System.out.println("Account succesfully made, please login");
					}}
				}
				
				
				
				
				else{if(command.equalsIgnoreCase("advanced"))
				{
					System.out.println("please enter your new pin");
					short pin = key.nextShort();
					System.out.println("please enter the interest rate per month");
					double interest = key.nextDouble();
					System.out.println("please enter the taxrate");
					double taxrate = key.nextDouble();
					System.out.println("please enter the name of this account");
					String name = key.next();
					//basic account constructor
					Advanced_Account holdvar = new Advanced_Account(pin,name,interest,taxrate);
					
					
					//starts asking for options
					System.out.println("does this account have chequing? Y/N");
					command = key.next();
					
					
					if(command.equalsIgnoreCase("Y"))
					{
						System.out.println("please enter the amount of cheques allowed per month");
						int number = key.nextInt();
						holdvar.setCheque(number);
					}
					
					
					System.out.println("does this account have a minimum balance? Y/N");
					command = key.next();
					if(command.equalsIgnoreCase("Y"))
					{
						System.out.println("please enter the minimum");
						double minimum = key.nextDouble();
						holdvar.setMinimium(minimum);
					}
					
					
					System.out.println("is this account timed? Y/N");
					command = key.next();
					if(command.equalsIgnoreCase("Y"))
					{
						System.out.println("please enter the release month");
						int releasemonth = key.nextInt();
						
						System.out.println("please enter the release year");
						int releaseyear = key.nextInt() - 1900;
						
						System.out.println("please enter the penalty tax");
						double taxpenalty = key.nextDouble();
						
						holdvar.timed(releasemonth,releaseyear, taxpenalty);
					}
					
					
					//sets variables
					accounts.add(holdvar);
					System.out.println("Account succesfully made, please login");
				}
				else{System.out.println("no selection made");}}
				}
				
			}
			
			
			
			
			else{
			if(command.equalsIgnoreCase("deposit"))
			{//start of deposit
				if(hold == null)
				{System.out.println("no user logged in");}
				else
				{	//checks pin
					System.out.println("please enter your pin");
					short pin = key.nextShort();
					if(((Account) hold).pinCheck(pin) == true)
					{
						
						//gets variable and uses account object to withdraw
						System.out.println("please enter the amount to deposit");
						double deposit = key.nextDouble();
						((Account) hold).deposit(deposit);
						accounts.set(spot, hold);
					
						
						//prints
					System.out.println("your balance is " + ((Account)hold).getBalance());
					}
					
					else{System.out.println("Wrong pin");}
				}
			}
			
			
			
			
			else{if(command.equalsIgnoreCase("login"))
			{//Start of login
				System.out.println("please enter the name of the account");
				String check = key.next();
				
				
				//checks database for name
				for(int count = 0; count<accounts.size(); count++)
				{
				Account test = (Account) accounts.get(count);
					
				
					if(test.getName().equals(check))
					{
						//checks if their pin is right
						System.out.println("please enter your pin");
						short pincheck = key.nextShort();
						
						if(test.pinCheck(pincheck)==true)
						{//finds it
						spot = count;
						hold = accounts.get(count);
						}
						
						else{System.out.println("incorrect password");}
					}
				}
				
				
				if(hold == null)	{System.out.println("No user found");}
				else	{System.out.println("user found");}
				
				
			}
			
			
			
			
			
			else{
			if(command.equalsIgnoreCase("withdraw"))
			{//start of withdraw
				if(hold!=null){
				
					
				System.out.println("please enter your pin");
				short pin = key.nextShort();
				if(((Account) hold).pinCheck(pin)==true)
				{//checks pin
				
					
					System.out.println("please enter the amount to withdraw");
				double withdraw = key.nextDouble();
				((Account) hold).withdraw(withdraw);
				accounts.set(spot, hold);
				//gets amount and save object
				
				
				System.out.println("your balance is " + ((Account)hold).getBalance());
				}//prints
				
				
				else{System.out.println("you entered the wrong pin");}
			}else{System.out.println("no user logged in");}}
			
			
			
			
			else{
			if(command.equalsIgnoreCase("logout"))
			{//start of logout
				accounts.set(spot,hold);
				hold = null;
				//sets temp to null after saving it
				System.out.println("you have logged out");
			}
			
			
			
			else{
				if(command.equalsIgnoreCase("chequeuse"))
				{//start of using cheque
				if(hold !=null)
				{try{
				System.out.println("please enter your pin");
				short pin = key.nextShort();
				((Account) hold).pinCheck(pin);
				//checks pin
					
				double[] deposit;
					
				//array to hold all the numbers
				//needs to check which account it is
				if(hold instanceof Chequing_Account)
				{
				deposit = new double[((Chequing_Account) hold).getCheque()];
				}
					else{
					if(hold instanceof Advanced_Account)
					{deposit = new double[((Advanced_Account) hold).getCheque()];}
					else{deposit = new double[0];}
					}
						
				//gets amount used
				System.out.println("please enter the amount of checks used");
				int holder = key.nextInt();
						
						
				//checks if there's enough space for the checks
				if(holder>deposit.length){System.out.println("not enough cheques please try later");}	
				else//starts entering info
				{try{
					for(int count = 0; count < holder; count++)
					{//loop to enter variables to be withdrawn
						System.out.println("please enter the amount used for cheque " + (count+1));
						deposit[count] = key.nextInt();
					}
					
					
					((Chequing_Account) hold).chequeWithdraw(deposit); 
					//processes and saves transaction 
					accounts.set(spot, hold);
					System.out.println("Transaction successful");
					}	
				catch(UnsupportedOperationException e)
				{//catches lack of money
				System.out.println("not enough cash, please contact manager");
				}}
						
						//catches savings accounts
						}catch(ClassCastException e)
						{
							System.out.println("Wrong user type");
						}}
					else{System.out.println("no user found");}
				}
				else{}
			}
			}}}}}
			
			
			
		catch(InputMismatchException e)
		{System.out.println("Wrong input");}
			
			
			
			System.out.println("\n");
		}while(!command.equalsIgnoreCase("exit"));
		
		
		
		
		
		
		
		//start of session print
		System.out.println("At the end of this session:");
		

		
		hold = accounts.get(accounts.size()-1);
		long time = ((Account)hold).getTime();		//just to make sure we have a variable;
		
		spot = accounts.size()-1;
		int spottime = accounts.size()-1;
		int check=0,saving=0,advanced=0;
		double holder = -500;
		hold = null;
		//creates hold and comparing variables
		//also resets the user
		//loop
		for(int count = 0; count< accounts.size(); count++)
		{
			hold = accounts.get(count);
			//creates temp account 
			
			
			//checks if its highest
			if(((Account)hold).getBalance()>holder)
			{
				holder = ((Account)hold).getBalance();
				spot = count;
			}
			
			
			//checks the oldest
			if(((Account)hold).getTime() < time)
			{
				
				spottime = count;
			}
			
			
			hold = accounts.get(count);
			//records type
			if(hold instanceof Chequing_Account)
			{
				check++;
			}
			else{if(hold instanceof Savings_Account)
			{
				saving++;
			}
			else{if(hold instanceof Advanced_Account)
			{
				advanced++;
			}}}
		}
		
		for(int count = 0; count<accounts.size(); count++)
		{
			hold = accounts.get(count);
			//checks if it's the oldest

		}
		
		hold = accounts.get(spot);
		//gets object
		System.out.println("The greatest balance is in account " + ((Account) hold).getName() + " with $" + holder);
		//prints
		
		hold = accounts.get(spottime);//gets object using spot
		System.out.println("The oldest account is " + ((Account)hold).getName() +"\n");
		//prints
		System.out.println("out of all " + accounts.size() + " accounts");
		System.out.println("There are " + check + " Chequing accounts");
		System.out.println("There are " + saving + " Savings accounts");
		System.out.println("There are " + advanced + " Advanced accounts");
		//prints
	}
	
}
/*
Commands are, new, withdraw, deposit, login, logout, chequeuse
It is now the 3 month of the year 2014
please enter a command
new
Please enter the type of account. Savings, chequing, or an Advanced one
chequing
please enter your new pin
3331
please enter the interest rate per month
0.03
please enter the taxrate
0.02
please enter the name of this account
lin
please enter the amount of cheques allowed per month
10
Account succesfully made, please login


It is now the 3 month of the year 2014
please enter a command
login
please enter the name of the account
lin
please enter your pin
3331
user found


It is now the 3 month of the year 2014
please enter a command
deposit
please enter your pin
3331
please enter the amount to deposit
5000
your balance is 4900.0sx


It is now the 3 month of the year 2014
please enter a command
chequeuse
please enter your pin
3331
please enter the amount of checks used
2
please enter the amount used for cheque 1
200
please enter the amount used for cheque 2
1000
Transaction successful


It is now the 3 month of the year 2014
please enter a command
chequeuse
please enter your pin
3331
please enter the amount of checks used
8
please enter the amount used for cheque 1
0
please enter the amount used for cheque 2
0
please enter the amount used for cheque 3
0
please enter the amount used for cheque 4
0
please enter the amount used for cheque 5
0
please enter the amount used for cheque 6
0
please enter the amount used for cheque 7
0
please enter the amount used for cheque 8
0
Transaction successful


It is now the 3 month of the year 2014
please enter a command
logout
you have logged out


It is now the 3 month of the year 2014
please enter a command
deposit
no user logged in


It is now the 3 month of the year 2014
please enter a command
exit


At the end of this session:
The greatest balance is in account lin with $4876.0
The oldest account is lin

out of all 1 accounts
There are 1 Chequing accounts
There are 0 Savings accounts
There are 0 Advanced accounts
*/