/** =======================================================================
 * Class:    Computer Science 201 Ex.N//A  Pg..  Author: Lintao Yin
 * Version:  001                                    Date:  Nov 8, 2012
 *
 * Purpose   Name that Celeb project
 *
 * Course:   Computer Science 201                Teacher:  Mr Blakey
 * School:   Sir Winston Churchill High School, Calgary, Alberta, Canada
 * Language: Java J2SE 6.0    Target Operating System: Java Virtual Machine
 * System:   Intel Celeron 3GHz running under Windows XP     IDE: Eclipse 3.4
 * ========================================================================
Written by: Lintao Yin*/

package Excercises;

public class Name_that_celebrity_proj {
	
	public static void main(String[] args){
		
		String s1 = "Allan Alda";
		String s2 = "John Wayne";
		String s3 = "Gregory Peck";
		
		Integer q1 = s1.length();
		Integer q2 = s2.length();
		Integer q3 = s3.length();
		
		Integer b1 = (q1 - 3);
		Integer b2 = (q2 - 3);
		Integer b3 = (q3 - 3);
		
		String p1 = s1.substring(2,b1);
		String p2 = s2.substring(2,b2);
		String p3 = s3.substring(2,b3);

		System.out.println("Guess the names of these actors!");
		System.out.println("\n" + "1. ___" + p1 + "___");
		System.out.println("\n" + "2. ___" + p2 + "___");
		System.out.println("\n" + "3. ___" + p3 + "___");
		
		System.out.println("\n\n\n\n\n\n\n");
		
		System.out.println("Answers!" + "\n" + s1 + "\n" + s2 + "\n" + s3);
	}

}

/*
System run:

Guess the names of these actors!

1. ___lan A___

2. ___hn Wa___

3. ___egory P___








Answers!
Allan Alda
John Wayne
Gregory Peck

*/