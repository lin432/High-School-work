/** =======================================================================
 * Class:    Computer Science 201 Ex.N//A  Pg..  Author: Lintao Yin
 * Version:  001                                    Date:  Nov 29, 2012
 *
 * Purpose   Use objects to program and get responses
 *
 * Course:   Computer Science 201                Teacher:  Mr Blakey
 * School:   Sir Winston Churchill High School, Calgary, Alberta, Canada
 * Language: Java J2SE 6.0    Target Operating System: Java Virtual Machine
 * System:   Intel Celeron 3GHz running under Windows XP     IDE: Eclipse 3.4
 * ========================================================================
Written by: Lintao Yin*/

package code;

import classes.Saving_account;

public class Ex_P_3_3 
{
	
	public static void main(String[] args)
	{
		Saving_account brett = new Saving_account(1000,10);
		//^ create object
		
		for(int count = 1; count<=5; count++)
		{
			brett.addInterest();
			System.out.println(brett.balance);
		}
		//^for loop cause I was lazy
	}

}

/*
System run

1100.0
1210.0
1331.0
1464.1000000000001
1610.5100000000002

*/