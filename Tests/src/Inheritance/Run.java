package Inheritance;

import java.util.*;

public class Run {
	
	public static void main(String[]args)
	{
		String command = "";
		
		ArrayList<Object> workers = new ArrayList<Object>();

		System.out.println("commands are add, week,full");
		do//do loop to always get commands
		{
			Scanner key = new Scanner(System.in);
			System.out.println("\n\nplease enter a command");
			command = key.next();
			//gets next command and creates scanner
			
			if(command.equalsIgnoreCase("add"))
			{//start of add worker
				System.out.println("'hourly' wage or 'salary' wage?");
				command =key.next();
				//asks for worker type
				
				if(command.equalsIgnoreCase("hourly"))
				{
					//gets info for super
					System.out.println("please enter their name");
					String name = key.next();
					System.out.println("please enter their pay per hour");
					Double rate = key.nextDouble();
					
					//creates and adds to ArrayList
					HourlyWorker hold = new HourlyWorker(name,rate);
					
					workers.add(hold);
				}
				else{if(command.equalsIgnoreCase("Salary"))
				{
					System.out.println("please enter their name");
					String name = key.next();
					System.out.println("please enter their pay per hour");
					Double rate = key.nextDouble();
					//see Hourly
					SalariedWorker hold = new SalariedWorker(name,rate);
					
					workers.add(hold);
				}}
			}
			
			
			
			else{if(command.equalsIgnoreCase("week"))
			{//adds salary by hours worked in a week
				
				//gets weeks that passed
				System.out.println("please enter the amount of weeks passed");
				int count = key.nextInt();
				double total = 0;
				
				//loop for weeks
				for(int x = 0; x<count; x++)
				{
					//loop for workers
					for(int y= 0; y<workers.size(); y++)
					{
						//creates temp object and guides user
						Object hold = workers.get(y);
						System.out.println("Adding hours for " + ((Worker)hold).getName());
						
						//decides type
						if(hold instanceof HourlyWorker)
						{
							//computes pay
							System.out.println("please enter the hours worked for week " + (x+1));
							total += ((HourlyWorker) hold).computePay(key.nextInt());
						}
						else{if(hold instanceof SalariedWorker)
						{
							System.out.println("please enter the hours worked for week " + (x+1));
							total += ((SalariedWorker)hold).computePay(key.nextInt());}
						}
					}
				}
				//prints total for the weeks entered
				System.out.println("the total amount to pay the workers these weeks is $" + total);
			}
			
			
			
			else{if(command.equalsIgnoreCase("full"))
			{//start of all print
				double total = 0;
				//hold variable for all cash payed
				
				//loop for going through workers
				for(int counter = 0; counter<workers.size(); counter++)
				{
					Object hold = workers.get(counter);
					//creates temp object and hold string
					String str = ((Worker)hold).getName();
					
					str += " has an hourly salary of " + ((Worker)hold).getRate() + ". \n";
					//adds basic info from worker
					
					//checks type
					if(hold instanceof HourlyWorker)
					{
						str += ((Worker)hold).getName() + " is an Hourly worker. \n";
						//adds rest
						str += "We have payed him $" +((HourlyWorker)hold).getTotal() + " for working " + ((Worker)hold).getHour() + " hours";
					
						total += ((HourlyWorker)hold).getTotal();
					}
					else{if(hold instanceof SalariedWorker)
					{
						str += ((Worker)hold).getName() + " is an Salary worker. \n";
						//adds rest
						str += "We have payed him $" +((SalariedWorker)hold).getTotal() + " for working " + ((Worker)hold).getHour() + " hours";

						total += ((SalariedWorker)hold).getTotal();
					}}
					//prints string
					System.out.println(str + "\n");
				}
				//prints total payed
				System.out.println("\nin total we have payed $" + total + " in salaries");
			}}}
		}while(!command.equalsIgnoreCase("exit"));
	}

}

/*
commands are add, week,full


please enter a command
add
'hourly' wage or 'salary' wage?
hourly
please enter their name
lintao
please enter their pay per hour
20


please enter a command
add
'hourly' wage or 'salary' wage?
President


please enter a command
add
'hourly' wage or 'salary' wage?
salary
please enter their name
President
please enter their pay per hour
20


please enter a command
week
please enter the amount of weeks passed
4
Adding hours for lintao
please enter the hours worked for week 1
40
Adding hours for President
please enter the hours worked for week 1
1
Adding hours for lintao
please enter the hours worked for week 2
40
Adding hours for President
please enter the hours worked for week 2
1
Adding hours for lintao
please enter the hours worked for week 3
60
Adding hours for President
please enter the hours worked for week 3
1
Adding hours for lintao
please enter the hours worked for week 4
60
Adding hours for President
please enter the hours worked for week 4
1
the total amount to pay the workers these weeks is $6800.0


please enter a command
full
lintao has an hourly salary of 20.0. 
lintao is an Hourly worker. 
We have payed him $3600.0 for working 200 hours

President has an hourly salary of 20.0. 
President is an Salary worker. 
We have payed him $3200.0 for working 4 hours
 */
