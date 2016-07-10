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

import classes.Circle;

public class Tester_Diameter 
{

	public static void main(String[] args)
	{
		Circle cir1 = new Circle(35.5);
		//initialize circle
		
		System.out.println(cir1.diameter());
		//test
	}
	
}

/*
System run:

71.0

*/