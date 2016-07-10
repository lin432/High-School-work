package main;

import java.util.*;

public class Polymorphism {

	public static void main(String[]args)
	{
		//creates preliminary objects
		Date hold = new Date();
		Rectangle1 one = new Rectangle1(2,2,hold.getTime());
		Rectangle2 two = new Rectangle2(4,4,hold.getTime());
		
		//creates checker for code
		String command = "";
		Scanner key = new Scanner(System.in);
		
		System.out.println(hold.getTime() - hold.getTime() + " milliseconds have passed");
		System.out.println(one.getX() + " " + one.getY());
		System.out.println(two.getX() + " " + two.getY());
		//prints seconds passed as well as current data
		
		do
		{
			command = key.next();
		}while(command.equalsIgnoreCase(""));
		//while loop to let me decide when to stop
		
		Date now = new Date();
		one.translater(now.getTime());
		two.translater(now.getTime());
		//creates a new date and updates the location of the objects
		
		//prints info
		System.out.println(now.getTime() - hold.getTime() + " Milliseconds have passed");
		System.out.println(one.getX() + " " + one.getY());
		System.out.println(two.getX() + " " + two.getY());
	}
	
}

/*
0 milliseconds have passed
0 0
0 0
x
4430 Milliseconds have passed
4 0
8 0
*/
