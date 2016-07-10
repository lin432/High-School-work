/** =======================================================================
 * Class:    Computer Science 201 Ex.N//A  Pg..  Author: Lintao Yin
 * Version:  001                                    Date:  Nov 21, 2012
 *
 * Purpose   Make a program that calculates fibonacci sequence
 *
 * Course:   Computer Science 201                Teacher:  Mr Blakey
 * School:   Sir Winston Churchill High School, Calgary, Alberta, Canada
 * Language: Java J2SE 6.0    Target Operating System: Java Virtual Machine
 * System:   Intel Celeron 3GHz running under Windows XP     IDE: Eclipse 3.4
 * ========================================================================
Written by: Lintao Yin*/

package codes;

import java.util.*;

public class Big_Java_Ex_75 
{

	public static void main(String[] args)
	{
	//Comment!
		
		//Set Scanner object
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Put in an integer for the (N) value in the fibonacci sequence");
		//^introductory sentence
		
		int quit, n = keyboard.nextInt();
		//set loop repetitions^
		
		//decision (if) n is = to 0 or 1 in fibonacci sequence
		if(n == 1)
		{
			System.out.println("The number in the fibonacci sequence is 0");
		}
		else
		{	if(n <= 3)
			{
			System.out.println("The number in the fibonacci sequence is 1");
			}
			else	
			{
				int f1=0,f2=1,Fnew = 0;
				//create variables for loop
				for(quit=2;quit<=n;quit++)//quit is equal to two as we are already 2 variables in
				{
					Fnew= f1+f2;
					f2=f1;
					f1=Fnew;
				}
				System.out.println("The " + n + "th number in the fibonacci sequence is: " + Fnew);
				//^Gui
			}
		}
		
	}
	
}

/*System run:
 * 
 * 1.
Put in an integer for the (N) value in the fibonacci sequence
6
The 6th number in the fibonacci sequence is: 5
 * 
 * 2.
Put in an integer for the (N) value in the fibonacci sequence
2
The number in the fibonacci sequence is 1

 */
