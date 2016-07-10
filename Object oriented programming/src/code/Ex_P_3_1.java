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

public class Ex_P_3_1 
{
	
	public static void main(String[] args)
	{
		Bank_account phil = new Bank_account(0);
		//initialize account
		
		
		//do what book asks of it
		System.out.println(phil.deposit(1000));
		System.out.println(phil.withdraw(500));
		System.out.println(phil.withdraw(400));
	}
	
}

/*
System run:

1000
500
100

*/