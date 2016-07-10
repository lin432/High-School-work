package main;

import java.util.*;

import classes.*;

public class BJ_11_1 {
	
	public static void main(String[]args)
	{
		Die one = new Die(6);
		DataSet x = new DataSet();
		Scanner key = new Scanner(System.in);
		String hold = null;
		//^Creates variables
		
		
		do//While loop to roll multiple times
		{
			x.add(one);
			System.out.println("The die has been rolled");
			System.out.println("stop rolling? |E|");
			hold = key.next();
			
		}while(!hold.equalsIgnoreCase("e"));
		
		//prints average
		System.out.println(x.getAverage());
	}

}

/*
The die has been rolled
stop rolling? |E|
n
The die has been rolled
stop rolling? |E|
n
The die has been rolled
stop rolling? |E|
n
The die has been rolled
stop rolling? |E|
n
The die has been rolled
stop rolling? |E|
e
2.6

*/
