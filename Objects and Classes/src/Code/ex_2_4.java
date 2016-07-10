/** =======================================================================
 * Class:    Computer Science 201 Ex.N//A  Pg..  Author: Lintao Yin
 * Version:  001                                    Date:  Nov 23, 2012
 *
 * Purpose   test intersection objects
 *
 * Course:   Computer Science 201                Teacher:  Mr Blakey
 * School:   Sir Winston Churchill High School, Calgary, Alberta, Canada
 * Language: Java J2SE 6.0    Target Operating System: Java Virtual Machine
 * System:   Intel Celeron 3GHz running under Windows XP     IDE: Eclipse 3.4
 * ========================================================================
Written by: Lintao Yin*/

package Code;

import java.awt.Rectangle;

public class ex_2_4 
{
	public static void main(String[] args)
	{
		Rectangle box1 = new Rectangle(0,0,5,10);
		Rectangle box2 = new Rectangle(0,0,10,5);
		//Create intersecting rectangles
		
		Rectangle box3 = box1.intersection(box2);
		//create new rectangle with intersect
		
		System.out.println(box3.getWidth() + ", " + box3.getHeight());
		//print info
		
		box1.translate(20, 20);
		//move box 1
		
		Rectangle box4 = box2.intersection(box1);
		//create box 4 w/o intersection
		
		System.out.println(box4.getWidth() + ", " + box4.getHeight());
		//Print info
		
		//my guess to what happens is that the method used to get the intersection deals with 
		//Subtraction of the x and y along with width and height
	}
}

/*
System run:

5.0, 5.0
-10.0, -15.0

*/
