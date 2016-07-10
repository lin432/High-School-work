/** =======================================================================
 * Class:    Computer Science 201 Ex.N//A  Pg..  Author: Lintao Yin
 * Version:  001                                    Date:  Nov 9, 2012
 *
 * Purpose   project to test input and find radius form area of circle
 *
 * Course:   Computer Science 201                Teacher:  Mr Blakey
 * School:   Sir Winston Churchill High School, Calgary, Alberta, Canada
 * Language: Java J2SE 6.0    Target Operating System: Java Virtual Machine
 * System:   Intel Celeron 3GHz running under Windows XP     IDE: Eclipse 3.4
 * ========================================================================
Written by: Lintao Yin*/

package project;

import java.io.*;
import java.util.*;

public class going_in_circles {

	public static void main(String[] args){
		
		Scanner kbReader = new Scanner(System.in);
		
		System.out.print("Enter the area of your circle");
		
		double area = kbReader.nextDouble();
		double r = Math.sqrt(area/Math.PI);
		
		System.out.println("The radius of your circle is " + r);

	}
}

/*
System run:

Enter the area of your circle

31415
The radius of your circle is 99.99852536144613
*/