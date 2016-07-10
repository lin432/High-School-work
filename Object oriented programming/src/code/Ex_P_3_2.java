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

import classes.Bank_account;

public class Ex_P_3_2 
{

	public static void main(String[] args)
	{
		Bank_account martha = new Bank_account(1000);
		//create object^
		
		martha.addInterest(10);
		//^method
		
		System.out.println(martha.balance);
		//^test results
	}
	
}

/*
 * System run:
 * 
 * 1100
 * 
 */
