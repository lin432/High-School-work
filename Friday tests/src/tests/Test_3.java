/** =======================================================================
 * Class:    Computer Science 201 Ex.N//A  Pg..  Author: Lintao Yin
 * Version:  001                                    Date:  Nov 30, 2012
 *
 * Purpose   Timed test 3, create a number guess game
 *
 * Course:   Computer Science 201                Teacher:  Mr Blakey
 * School:   Sir Winston Churchill High School, Calgary, Alberta, Canada
 * Language: Java J2SE 6.0    Target Operating System: Java Virtual Machine
 * System:   Intel Celeron 3GHz running under Windows XP     IDE: Eclipse 3.4
 * ========================================================================
Written by: Lintao Yin*/

package tests;

import java.util.*;

public class Test_3 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		//create scanner object
		
		
		System.out.println("I have chosen a number between one and a hundred");
		System.out.println("Can you guess what number it is?");
		//Gui
		
		
		int count = 1, guess = keyboard.nextInt();
		double number = Math.random() * 100;
		number = Math.round(number);
		//Variables, count is at 1 to account for first guess and not checking on last run
		//number is double random, rounded to get whole number
		
		
		
		while ( guess != (int) number)
		{//number is treated as int
			if(guess < number)
			{	
				if(guess > (number-5))
					System.out.println("your guess is just a bit low");
				else
					System.out.println("your guess was too low");
				
				System.out.println("Guess again?");
				guess = keyboard.nextInt();
			}
			
			if(guess > number)
			{
				if(guess < (number+5))
					System.out.println("your guess is just a bit too high");
				else
					System.out.println("your guess was too high");
				
				System.out.println("Guess again?");
				guess = keyboard.nextInt();
			}
			//if tree that decides response
			count++;
			//count to check the times guessed
		}
		
		
		System.out.println("you guessed correctly!");
		System.out.println("You had to guess " + count + " times");
		//victory is coming out of while loop

	
	}
	
}


/*

System run:

I have chosen a number between one and a hundred
Can you guess what number it is?
50
your guess was too high
Guess again?
40
your guess was too high
Guess again?
30
your guess is just a bit low
Guess again?
31
your guess is just a bit low
Guess again?
33
your guess is just a bit too high
Guess again?
32
you guessed correctly!
You had to guess 5 times

*/