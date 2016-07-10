package tests;

import java.util.*;
import tests.Rugby;

public class Arraylist {
	
	public static void main(String[]args)
	{
		ArrayList<Object> csTeam = new ArrayList<Object>();
		String command;
		//sets variables		
		
		
		System.out.println("commands to manage are: addpoints,remove,printbest,checkinjury,print,exit");
		System.out.println("addpoints adds points for a new game");
		System.out.println("Add adds a player");
		System.out.println("Remove removes a player");
		System.out.println("printbest prints best score after average for all games");
		System.out.println("Checkinjury prints uninjured players");
		System.out.println("print prints all the scores of all players\n");
		
		
		do//while loop to continue to manage team
		{
			Scanner key = new Scanner(System.in);
			
			System.out.println("enter a command");
			command = key.next();
			//^^guide^^
			
			if(command.equalsIgnoreCase("addpoints"))
			{
				for(int count = 0; count< csTeam.size(); count++)
				{
					Rugby player = (Rugby) csTeam.get(count);
					//gets object and adds points by creating one
					System.out.println("please enter any points to add to player " + player.number );
					try
					{
					player.add_points(key.nextInt());
			
					csTeam.set(count, player);
					}//sets the object
					catch(InputMismatchException e)
					{
						System.out.println("wrong input, no points added " + e);
					}
				}
			}
			
			
			else
			{
				if(command.equalsIgnoreCase("remove"))
				{
					System.out.println("please enter the playernumber to be removed");
					try
					{
					int hold = key.nextInt();
					
					for(int count = 0; count < csTeam.size(); count++)
					{//creates holder
						Rugby player = (Rugby) csTeam.get(count);
						if(hold == player.number)
							{//checks if entered number equals the location
							csTeam.remove(count);
							}
					}
					}
					catch(InputMismatchException e)
					{
						System.out.println("wrong input " + e);
					}
				}
				
				
				else
				{
					if(command.equalsIgnoreCase("printbest"))
					{
						double hold = 0;
						int holdcount = 0;
						for(int count = 0; count < csTeam.size(); count++)
						{//holder variables
							Rugby player = (Rugby) csTeam.get(count);
							double points = player.getAverage();
							if(points>hold)
							{//creates and checks points, sets hold variables
								hold = points;
								holdcount = count;
							}
							
						}
						//retrieves player using hold variable
						Rugby player = (Rugby) csTeam.get(holdcount);
						System.out.println("the best player is...");
						System.out.println(player.first + " " + player.last + "  number " + player.number + " with " + player.getAverage() + " points average");
					}
					
					
					else
					{
						if(command.equalsIgnoreCase("checkinjury"))
						{
							String injuryhold = "players: ";
							//creates String to hold everything
							for(int count = 0; count <csTeam.size(); count++)
							{
								Rugby playercheck = (Rugby) csTeam.get(count);
								
								boolean status = playercheck.injury;
								//checks
								if(status == false)
								{
									injuryhold = injuryhold+playercheck.number + ", ";
								}	//adds to super string
								
							}
							System.out.println(injuryhold+ "are uninjured");//adds last guide
						}
						else
						{
							if(command.equalsIgnoreCase("add"))
								{
								try
									{
									System.out.println("please enter their jersey number");
									int number = key.nextInt();
									System.out.println("please enter their first name");
									String first = key.next();
									System.out.println("please enter their last name");
									String last = key.next();
									System.out.println("please enter weither they're injured, true or false");
									boolean injured = key.nextBoolean();
									//saves variables and guides user
								
									Rugby player = new Rugby(number,first,last,injured);
									//creates object and adds to array
									csTeam.add(player);
									}
									catch(InputMismatchException e)
									{
										System.out.println("wrong input, player not saved " + e);
									}
								}
							else
							{
								if(command.equalsIgnoreCase("print"))
								{
									for(int count = 0; count<csTeam.size(); count++)
									{
										Rugby player = (Rugby) csTeam.get(count);
										System.out.print(player.last + " " + player.first + ": ");
										for(int counter =0; counter< player.points.size(); counter++)
										{
											System.out.print(" " + player.points.get(counter));
										}
										System.out.print("\n");
									}
								}
								else
								{
									if(!command.equalsIgnoreCase("exit"))
									{System.out.println("Not a valid input");}
								}
							}
						}
					}
				}
			}
		}while(!command.equalsIgnoreCase("exit"));
	}
}
/*
an array list is appropriate for this kind of work as it allows you to easily manage lots of objects like
in this case in which one Rugby(player) object may require 30 objects and you'll need to manage them by 
removing objects and the like. It raises memory efficiency and since work like adding variables is not 
very difficult, you don't need to use up a large amount of RAM or CPU
*/

/*
commands to manage are: addpoints,remove,printbest,checkinjury,print,exit
addpoints adds points for a new game
Add adds a player
Remove removes a player
printbest prints best score after average for all games
Checkinjury prints uninjured players
print prints all the scores of all players

enter a command
add
please enter their jersey number
2
please enter their first name
a
please enter their last name
a
please enter weither they're injured, true or false
false
enter a command
4
Not a valid input
enter a command
add
please enter their jersey number
4
please enter their first name
b
please enter their last name
b
please enter weither they're injured, true or false
true
enter a command
add
please enter their jersey number
5
please enter their first name
c
please enter their last name
c
please enter weither they're injured, true or false
false
enter a command
checkinjury
players: 2, 5, are uninjured
enter a command
addpoints
please enter any points to add to player 2
3
please enter any points to add to player 4
4
please enter any points to add to player 5
5
enter a command
addpoints
please enter any points to add to player 2
5
please enter any points to add to player 4
2
please enter any points to add to player 5
2
enter a command
addpoints
please enter any points to add to player 2
6
please enter any points to add to player 4
7
please enter any points to add to player 5
5
enter a command
print
a a:  3 5 6
b b:  4 2 7
c c:  5 2 5
enter a command
remove
please enter the playernumber to be removed
5
enter a command
print
a a:  3 5 6
b b:  4 2 7
enter a command
printbest
the best player is...
a a  number 2 with 4.666666666666667 points average
enter a command
exit
*/
