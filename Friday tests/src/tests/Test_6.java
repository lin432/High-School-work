/** =======================================================================
 * Class:    Computer Science 201 Ex.N//A  Pg..  Author: Lintao Yin
 * Version:  001                                    Date:  Jan.9, 2012
 *
 * Purpose   Timed test 6
 *
 * Course:   Computer Science 201                Teacher:  Mr Blakey
 * School:   Sir Winston Churchill High School, Calgary, Alberta, Canada
 * Language: Java J2SE 6.0    Target Operating System: Java Virtual Machine
 * System:   Intel Celeron 3GHz running under Windows XP     IDE: Eclipse 3.4
 * ========================================================================
Written by: Lintao Yin*/

package tests;

import java.util.Scanner;

import Classes.Employee;

public class Test_6 {

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		//^creates keyboard scanner
		
		System.out.println("welcome to employee pay tracker");
		System.out.println("This program can input information for 52 weeks\n\n");
		
		System.out.println("how much people are you inputting information for?");
		int people = keyboard.nextInt();
		//^sets the number of employees to input info for
		
		for(int c = 0; c<people; c++)
		{
		System.out.println("\nWhat is the name of the employee?");
		String alias = keyboard.next();
		//^asks for name
		
		System.out.println("what is their pay per hour?");
		int pay = keyboard.nextInt();
		//^asks for pay rate
		
		Employee Name = new Employee(alias, pay);
		//^creates contructor
		
		System.out.println("how many weeks have they worked?");
		int weeks = keyboard.nextInt();
		//^gets weeks worked
		
		for(int count = 0; count<weeks;count++)
		{
		System.out.println("how many hours have they worked this week?");
		int hour = keyboard.nextInt();
		//asks for hour worked on this week
		
		Name.weeklywage(hour, count);
		//^records
		}
		
		Name.resultsname();
		//^prints results
		}
	}
	
}

/*
System run:

welcome to employee pay tracker
This program can input information for 52 weeks


how much people are you inputting information for?
2

What is the name of the employee?
mark
what is their pay per hour?
100
how many weeks have they worked?
10
how many hours have they worked this week?
10 10 10 10 10 20 21 21
how many hours have they worked this week?
how many hours have they worked this week?
how many hours have they worked this week?
how many hours have they worked this week?
how many hours have they worked this week?
how many hours have they worked this week?
how many hours have they worked this week?
how many hours have they worked this week?
21
how many hours have they worked this week?
10
mark

Rate of pay is: 100/hr
Week:1		total pay: 1000.0	hours worked: 10
Week:2		total pay: 1000.0	hours worked: 10
Week:3		total pay: 1000.0	hours worked: 10
Week:4		total pay: 1000.0	hours worked: 10
Week:5		total pay: 1000.0	hours worked: 10
Week:6		total pay: 2000.0	hours worked: 20
Week:7		total pay: 2150.0	hours worked: 21
Week:8		total pay: 2150.0	hours worked: 21
Week:9		total pay: 2150.0	hours worked: 21
Week:10		total pay: 1000.0	hours worked: 10
total pay is: 14450

What is the name of the employee?
Greg
what is their pay per hour?
10
how many weeks have they worked?
5
how many hours have they worked this week?
12
how many hours have they worked this week?
21
how many hours have they worked this week?
10
how many hours have they worked this week?
21
how many hours have they worked this week?
32
Greg

Rate of pay is: 10/hr
Week:1		total pay: 120.0	hours worked: 12
Week:2		total pay: 215.0	hours worked: 21
Week:3		total pay: 100.0	hours worked: 10
Week:4		total pay: 215.0	hours worked: 21
Week:5		total pay: 380.0	hours worked: 32
total pay is: 1030
*/