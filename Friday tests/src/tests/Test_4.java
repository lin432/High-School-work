/** =======================================================================
 * Class:    Computer Science 201 Ex.N//A  Pg..  Author: Lintao Yin
 * Version:  001                                    Date:  Dec 20, 2012
 *
 * Purpose   Timed test 5
 *
 * Course:   Computer Science 201                Teacher:  Mr Blakey
 * School:   Sir Winston Churchill High School, Calgary, Alberta, Canada
 * Language: Java J2SE 6.0    Target Operating System: Java Virtual Machine
 * System:   Intel Celeron 3GHz running under Windows XP     IDE: Eclipse 3.4
 * ========================================================================
Written by: Lintao Yin*/

package tests;

import java.util.Scanner;

public class Test_4 
{
	
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		Scanner keys = new Scanner(System.in);
		//2 scanners
		
		int fifiInteractions[] = new int[7];
		int davidInteractions[] = new int[7];
		
		String fifiDescription[] = new String[7];
		String davidDescription[] = new String[7];
		
		int fifiTime[] = new int[7];
		int davidTime[] = new int[7];
		
		int fifiTotal = 0;
		int davidTotal = 0;
		
		int fifiMax = 0;
		int davidMax = 0;
		
		int fifiDay = 0;
		int davidDay = 0;
		//^all of my variables
		
		System.out.println("This program records information on the two primates");
		//^introduces program
		
		for(int count=0; count<7; count++)
		{
		System.out.println("\nDay " + (count+1));
		//^day and loop for program
		
		//fifi
		System.out.println("\nplease enter the amount of interactions fifi had");

		fifiInteractions[count] = keyboard.nextInt();
		fifiTotal+=fifiInteractions[count];
		//get interactions
		
		if(fifiMax<fifiInteractions[count])
		{
			fifiDay = count+1;
			fifiMax = fifiInteractions[count];
		}//sets max and day of max
			
		
		
		
		System.out.println("please enter the time of the first observation (24 hour clock)");
			fifiTime[count] = keyboard.nextInt();
		//time
		
		System.out.println("please enter the actions (observed) by fifi");
		System.out.println("if no interactions are observed enter 'empty'");
		//creates log
		fifiDescription[count] = keys.nextLine();
		
		if(fifiDescription[count].equalsIgnoreCase("empty"))
			fifiDescription[count] = "no actions were observed";
		
		
		//David
		System.out.println("\nplease enter the amount of interactions david had");
		
		davidInteractions[count] = keyboard.nextInt();
		
		davidTotal+=davidInteractions[count];
		
		if(davidMax<davidInteractions[count])
		{
			davidMax = davidInteractions[count];
			davidDay = count+1;
		}
		
		System.out.println("please enter the time of the first observation (24 hour clock)");
			davidTime[count] = keyboard.nextInt();
		
		
		System.out.println("please enter the actions (observed) by david");
		System.out.println("if no interactions are observed enter 'empty'");
		
		davidDescription[count] = keys.nextLine();
		
		if(davidDescription[count].equalsIgnoreCase("empty"))
			davidDescription[count] = "no actions were observed";
			
		}
		
		//Gui to print data
		System.out.println("\nReport on interactions: \n");
		
		System.out.println("Fifi's interactions:");
		System.out.print(fifiInteractions[0] +", "+ fifiInteractions[1] +", "+ fifiInteractions[2]);
		System.out.print(", "+ fifiInteractions[3] +", "+ fifiInteractions[4] +", "+ fifiInteractions[5]);
		System.out.print(", " + fifiInteractions[6] + "  Total: " + fifiTotal);
		
		System.out.println("\n\nThe interactions started at: ");
		System.out.print(fifiTime[0] +", "+ fifiTime[1] +", "+ fifiTime[2] +", "+ fifiTime[3]);
		System.out.print(", "+ fifiTime[4] +", "+ fifiTime[5] +", "+ fifiTime[6]);
		
		System.out.println("\n\nThe highest amount of interactions occured on day: " + fifiDay);
		System.out.println("With the highest number of interactions being: " + fifiMax);
		
		
		System.out.println("\n\nDavid's interactions:");
		System.out.print(davidInteractions[0] +", "+ davidInteractions[1] +", "+ davidInteractions[2]);
		System.out.print(", "+ davidInteractions[3] +", "+ davidInteractions[4] +", "+ davidInteractions[5]);
		System.out.print(", " + davidInteractions[6] + "  Total: " + davidTotal);
	
		System.out.println("\n\nThe interactions started at: ");
		System.out.print(davidTime[0] +", "+ davidTime[1] +", "+ davidTime[2] +", "+ davidTime[3]);
		System.out.print(", "+ davidTime[4] +", "+ davidTime[5] +", "+ davidTime[6]);
		
		System.out.println("\n\nThe highest amount of interactions occured on day: " + davidDay);
		System.out.println("With the highest number of interactions being: " + davidMax);
		
		
		//if else to decide who has greater interactions
		if(fifiTotal>davidTotal)
			System.out.println("\nFifi has the most number of interactions: " + fifiTotal);
		else
			System.out.println("\nDavid has the most number of interaction: " + davidTotal);
		
		//for loop prints out the logs
		for(int count = 0;count<7;count++)
		{
			System.out.println("Day " + (count+1) + " logs:");
		
			System.out.println(fifiDescription[count]);
			System.out.println("");
			
			System.out.println(davidDescription[count]);
			System.out.println("");
		}
		}

}
/*
This program records information on the two primates

Day 1

please enter the amount of interactions fifi had
1
please enter the time of the first observation (24 hour clock)
2400
please enter the actions (observed) by fifi
if no interactions are observed enter 'empty'
log example

please enter the amount of interactions david had
4
please enter the time of the first observation (24 hour clock)
1200
please enter the actions (observed) by david
if no interactions are observed enter 'empty'
log example

Day 2

please enter the amount of interactions fifi had
4
please enter the time of the first observation (24 hour clock)
100
please enter the actions (observed) by fifi
if no interactions are observed enter 'empty'
empty

please enter the amount of interactions david had
4
please enter the time of the first observation (24 hour clock)
1400
please enter the actions (observed) by david
if no interactions are observed enter 'empty'
log example

Day 3

please enter the amount of interactions fifi had
8
please enter the time of the first observation (24 hour clock)
1500
please enter the actions (observed) by fifi
if no interactions are observed enter 'empty'
empty

please enter the amount of interactions david had
3
please enter the time of the first observation (24 hour clock)
1300
please enter the actions (observed) by david
if no interactions are observed enter 'empty'
empty

Day 4

please enter the amount of interactions fifi had
10
please enter the time of the first observation (24 hour clock)
1100
please enter the actions (observed) by fifi
if no interactions are observed enter 'empty'
log example

please enter the amount of interactions david had
3
please enter the time of the first observation (24 hour clock)
2300
please enter the actions (observed) by david
if no interactions are observed enter 'empty'
log example

Day 5

please enter the amount of interactions fifi had
5
please enter the time of the first observation (24 hour clock)
2100
please enter the actions (observed) by fifi
if no interactions are observed enter 'empty'
log example

please enter the amount of interactions david had
2
please enter the time of the first observation (24 hour clock)
3100
please enter the actions (observed) by david
if no interactions are observed enter 'empty'
log example

Day 6

please enter the amount of interactions fifi had
12
please enter the time of the first observation (24 hour clock)
1700
please enter the actions (observed) by fifi
if no interactions are observed enter 'empty'
empty

please enter the amount of interactions david had
5
please enter the time of the first observation (24 hour clock)
100
please enter the actions (observed) by david
if no interactions are observed enter 'empty'
log example

Day 7

please enter the amount of interactions fifi had
2
please enter the time of the first observation (24 hour clock)
1300
please enter the actions (observed) by fifi
if no interactions are observed enter 'empty'
empty

please enter the amount of interactions david had
7
please enter the time of the first observation (24 hour clock)
500
please enter the actions (observed) by david
if no interactions are observed enter 'empty'
log example

Report on interactions: 

Fifi's interactions:
1, 4, 8, 10, 5, 12, 2  Total: 42

The interactions started at: 
2400, 100, 1500, 1100, 2100, 1700, 1300

The highest amount of interactions occured on day: 6
With the highest number of interactions being: 12


David's interactions:
4, 4, 3, 3, 2, 5, 7  Total: 28

The interactions started at: 
1200, 1400, 1300, 2300, 3100, 100, 500

The highest amount of interactions occured on day: 7
With the highest number of interactions being: 7

Fifi has the most number of interactions: 42
Day 1 logs:
log example

log example

Day 2 logs:
no actions were observed

log example

Day 3 logs:
no actions were observed

no actions were observed

Day 4 logs:
log example

log example

Day 5 logs:
log example

log example

Day 6 logs:
no actions were observed

log example

Day 7 logs:
no actions were observed

log example

*/