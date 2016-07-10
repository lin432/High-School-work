/** =======================================================================
 * Class:    Computer Science 201 Ex.N//A  Pg..  Author: Lintao Yin
 * Version:  001                                    Date:  Nov 13, 2012
 *
 * Purpose   Timed test 1
 *
 * Course:   Computer Science 201                Teacher:  Mr Blakey
 * School:   Sir Winston Churchill High School, Calgary, Alberta, Canada
 * Language: Java J2SE 6.0    Target Operating System: Java Virtual Machine
 * System:   Intel Celeron 3GHz running under Windows XP     IDE: Eclipse 3.4
 * ========================================================================
Written by: Lintao Yin*/

package tests;

import java.io.*;
import java.util.*;

public class number_1 {

	public static void main(String[] args){
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is your Name? (first and last)");
	
		String name = keyboard.nextLine();
		
		System.out.println("What subject is this test on?");
		
		String subject = keyboard.nextLine();
		
		System.out.println("What is the score for your first test?");
		
		float T1 = keyboard.nextFloat();
		
		System.out.println("what is the total of that test?");
		
		int A1 = keyboard.nextInt();
		
		System.out.println("What is the score for your second test?");
		
		float T2 = keyboard.nextFloat();
		
		System.out.println("what is the total of that test?");
		
		int A2 = keyboard.nextInt();
		
		System.out.println("What is the score for your third test?");
		
		float T3 = keyboard.nextFloat();
		
		System.out.println("what is the total of that test?");
		
		int A3 = keyboard.nextInt();
		
		double F1 = (T1/A1) * 100, F2 = (T2/A2) * 100, F3 = (T3/A3) * 100;
		
		double FF =((F1 + F2 + F3)/3);
		
		System.out.println("Name:" + name + "  Subject:" + subject);
		
		System.out.println("\nfirst test: " + F1 + "%");
		System.out.println("\nsecond test: " + F2 + "%");
		System.out.println("\nthird test: " + F3 + "%");
		
		System.out.println("\nStudent average: " + FF + "%");
		
		/*System run:
		
		What is your Name? (first and last)
		Lintao Yin
		What subject is this test on?
		Computer Science
		What is the score for your first test?
		33
		what is the total of that test?
		43
		What is the score for your second test?
		54
		what is the total of that test?
		60
		What is the score for your third test?
		13
		what is the total of that test?
		15
		Name:Lintao Yin  Subject:Computer Science

		first test: 76.74418640136719%

		second test: 90.0%

		third test: 86.66666412353516%

		Student average: 84.47028350830078%

		*/	
	}
}
