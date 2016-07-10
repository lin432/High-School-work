/** =======================================================================
 * Class:    Computer Science 201 Ex.N//A  Pg..  Author: Lintao Yin
 * Version:  001                                    Date:  Nov 28, 2012
 *
 * Purpose   record the satisfaction of customers with a 1-4 number system
 *
 * Course:   Computer Science 201                Teacher:  Mr Blakey
 * School:   Sir Winston Churchill High School, Calgary, Alberta, Canada
 * Language: Java J2SE 6.0    Target Operating System: Java Virtual Machine
 * System:   Intel Celeron 3GHz running under Windows XP     IDE: Eclipse 3.4
 * ========================================================================
Written by: Lintao Yin*/

package code;

import java.util.*;

public class Donut_happiness 
{
	public static void main(String[] args)
	{	
		System.out.println("Please enter your level of satisfaction");
		System.out.println("1, 2, 3, or 4: 1 being highest rating, and 4 being lowest");
		//Gui^
		
		int score[]= new int[20];
		int input,tests = 0;
		Scanner keyboard = new Scanner(System.in);
		//set arrays and keyboard scanner
		
		System.out.println(  );
		//Break for Gui
		
		
		for(int count=0;count<score.length;count++)
		//Simple count for loop, w/ score.length as limit
		{
			input = keyboard.nextInt();
			//input variable from keyboard
			if(input<5)
			{
				if(input>=1)
				{
				//Nested if's to determine limits of score rating
				score[count]= input;
				tests+=score[count];
				System.out.println("Thank you for taking your time and assisting us");
				//input saved in score[], score[] added to tests for average
				}
				else
				{
					System.out.println("improper answer please enter 1, 2, 3, or 4");
					--count;
					//^minus count for person to re-input
				}
			}
			else
			{
				System.out.println("improper answer please enter 1, 2, 3, or 4");
				--count;
			}
			
		}
		
		System.out.println("Out of 20 polls the average is...");
		System.out.println((double) tests/20);
		//^announce total poll results
	}

}

/*
 * System run:
 * 
Please enter your level of satisfaction
1, 2, 3, or 4: 1 being highest rating, and 4 being lowest

1
Thank you for taking your time and assisting us
2
Thank you for taking your time and assisting us
4
Thank you for taking your time and assisting us
8
improper answer please enter 1, 2, 3, or 4
4
Thank you for taking your time and assisting us
2
Thank you for taking your time and assisting us
3
Thank you for taking your time and assisting us
1
Thank you for taking your time and assisting us
4
Thank you for taking your time and assisting us
21
improper answer please enter 1, 2, 3, or 4
1
Thank you for taking your time and assisting us
1
Thank you for taking your time and assisting us
2
Thank you for taking your time and assisting us
3
Thank you for taking your time and assisting us
1
Thank you for taking your time and assisting us
2
Thank you for taking your time and assisting us
4
Thank you for taking your time and assisting us

2
Thank you for taking your time and assisting us
1
Thank you for taking your time and assisting us
2
Thank you for taking your time and assisting us
1
Thank you for taking your time and assisting us
3
Thank you for taking your time and assisting us
Out of 20 polls the average is...
2.2

 * 
 */
