/** =======================================================================
 * Class:    Computer Science 201 Ex.N//A  Pg..  Author: Lintao Yin
 * Version:  001                                    Date:  Nov 23, 2012
 *
 * Purpose   learn about objects
 *
 * Course:   Computer Science 201                Teacher:  Mr Blakey
 * School:   Sir Winston Churchill High School, Calgary, Alberta, Canada
 * Language: Java J2SE 6.0    Target Operating System: Java Virtual Machine
 * System:   Intel Celeron 3GHz running under Windows XP     IDE: Eclipse 3.4
 * ========================================================================
Written by: Lintao Yin*/

package Code;

import java.awt.Rectangle;

public class ex_2_1 
{
	
	public static void main(String[] args)
	{
	
		Rectangle box = new Rectangle(5,5,8,7);
		//^ call object
		
		double width = box.getWidth();
		double height = box.getHeight();
		//^find width and height set variables
		
		//print answer
		System.out.println(width*height);
	}

}

/*
System run:

56.0

*/