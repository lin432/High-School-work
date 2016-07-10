/** =======================================================================
 * Class:    Computer Science 201 Ex.N//A  Pg..  Author: Lintao Yin
 * Version:  001                                    Date:  Nov 23, 2012
 *
 * Purpose   plot objects and arrange them
 *
 * Course:   Computer Science 201                Teacher:  Mr Blakey
 * School:   Sir Winston Churchill High School, Calgary, Alberta, Canada
 * Language: Java J2SE 6.0    Target Operating System: Java Virtual Machine
 * System:   Intel Celeron 3GHz running under Windows XP     IDE: Eclipse 3.4
 * ========================================================================
Written by: Lintao Yin*/

package Code;

import java.awt.Rectangle;

public class ex_2_3 
{
	public static void main(String[] args)
	{
	
		Rectangle box = new Rectangle(5,5,5,10);
		Rectangle box2 = new Rectangle(5,5,5,10);
		Rectangle box3 = new Rectangle(5,5,5,10);
		Rectangle box4 = new Rectangle(5,5,5,10);
		//Create 4 entities
		
		box2.translate(0, -10);
		box3.translate(-5, 0);
		box4.translate(-5, -10);
		//translate X steps and Y steps
		
		System.out.println(box.getX() + ", " + box.getY());
		System.out.println(box2.getX() + ", " + box2.getY());
		System.out.println(box3.getX() + ", " + box3.getY());
		System.out.println(box4.getX() + ", " + box4.getY());
		//Print current location on X,Y graph
	}
}

/*
System run:

5.0, 5.0
5.0, -5.0
0.0, 5.0
0.0, -5.0

*/