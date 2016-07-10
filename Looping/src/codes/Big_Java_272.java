/** =======================================================================
 * Class:    Computer Science 201 Ex.N//A  Pg..  Author: Lintao Yin
 * Version:  001                                    Date:  Nov 21, 2012
 *
 * Purpose   US dollar to Euro converter
 *
 * Course:   Computer Science 201                Teacher:  Mr Blakey
 * School:   Sir Winston Churchill High School, Calgary, Alberta, Canada
 * Language: Java J2SE 6.0    Target Operating System: Java Virtual Machine
 * System:   Intel Celeron 3GHz running under Windows XP     IDE: Eclipse 3.4
 * ========================================================================
Written by: Lintao Yin*/

package codes;

import java.util.*;

public class Big_Java_272 
{

	public static void main(String[] args)
	{
	//(this is exercise 7.1 on pg.270)
		
		//Work on THis *********
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter your US Dollar to return its value in Euro");
		
		int Q= 1;
		float money = keyboard.nextFloat();
		
		while(Q!=0)
		{
			System.out.println("You would have " + (money*0.78) + " Euros" );
			System.out.println("Would you like to quit? (q)");
			String line = keyboard.next();
			if(line.equalsIgnoreCase("q"))
			{
				break;
			}
			else
			{
				System.out.println("please enter your dollar amount");
				money = keyboard.nextFloat();
			}
			Q++;
		}
		System.out.println("you have exited the loop");
		System.out.println("it ran " + Q + " times");
	}
}


/*

System run:

Enter your US Dollar to return its value in Euro
98
You would have 76.44 Euros
Would you like to quit? (q)
no
please enter your dollar amount
65
You would have 50.7 Euros
Would you like to quit? (q)
no
please enter your dollar amount
1
You would have 0.78 Euros
Would you like to quit? (q)
q
you have exited the loop
it ran 3 times

*/