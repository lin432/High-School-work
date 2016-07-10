/** =======================================================================
 * Class:    Computer Science 201 Ex.N//A  Pg..  Author: Lintao Yin
 * Version:  001                                    Date:  Nov 9, 2012
 *
 * Purpose   use inputs to get java to tell you your name
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
import java.util.*;

public class Whats_my_name {

	public static void main(String[] args){
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is your last name");
		
		String uno = keyboard.nextLine();
		
		System.out.println("What is your first name");
		
		String duo = keyboard.nextLine();
		
		String name = duo + " " + uno;
		String length = duo + uno;
		
		
		System.out.println("your name is... " + name + ", " + "there's " + length.length()+ " " + "characters in your name" );
	}
}


/*
System run:

What is your last name
Yin
What is your first name
Lintao
your name is... Lintao Yin, there's 9 characters in your name

*/