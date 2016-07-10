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

import classes.Employee;

public class Ex_P_3_4 
{

	public static void main(String[] args)
	{
		Employee adam = new Employee("Adam",250);
		//^create object
		
		System.out.println("your name is " + adam.name());
		System.out.println("your salary is " + adam.salary() + " a month");
		//^test
	}
	
}

/*
System run:

your name is Adam
your salary is 250.0 a month

*/