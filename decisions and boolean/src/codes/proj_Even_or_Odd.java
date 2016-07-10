/** =======================================================================
 * Class:    Computer Science 201 Ex.N//A  Pg..  Author: Lintao Yin
 * Version:  001                                    Date:  Nov 15, 2012
 *
 * Purpose   get an if/else program to tell whether an integer is odd or even
 *
 * Course:   Computer Science 201                Teacher:  Mr Blakey
 * School:   Sir Winston Churchill High School, Calgary, Alberta, Canada
 * Language: Java J2SE 6.0    Target Operating System: Java Virtual Machine
 * System:   Intel Celeron 3GHz running under Windows XP     IDE: Eclipse 3.4
 * ========================================================================
Written by: Lintao Yin*/

package codes;

import java.io.*;
import java.util.*;

public class proj_Even_or_Odd {

	public static void main(String[] args){
		
		//set class as object
		Scanner keyboard = new Scanner(System.in);
		
		//displays what program does
		System.out.println("Enter a number to find whether it's even or odd!");
		
		//create number, of which to use the modulus operation
		Integer number = keyboard.nextInt();
		Integer modulus = number % 2;
		
		//if/else to decide which string to display
		if(modulus==0)
			System.out.println(number + " is an even number");
		else
			System.out.println(number + " is and odd number");

	}
}

/*
System run:

Enter a number to find whether it's even or odd!
45
45 is and odd number

Enter a number to find whether it's even or odd!
64
64 is an even number

*/