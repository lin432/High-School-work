/** =======================================================================
 * Class:    Computer Science 201 Ex.N//A  Pg..  Author: Lintao Yin
 * Version:  001                                    Date:  Nov 21, 2012
 *
 * Purpose   Learn the while loop
 *
 * Course:   Computer Science 201                Teacher:  Mr Blakey
 * School:   Sir Winston Churchill High School, Calgary, Alberta, Canada
 * Language: Java J2SE 6.0    Target Operating System: Java Virtual Machine
 * System:   Intel Celeron 3GHz running under Windows XP     IDE: Eclipse 3.4
 * ========================================================================
Written by: Lintao Yin*/

package codes;

import java.util.*;

public class lesson_12 {

	public static void main(String[] args)
	{
	int x = 5;
		
	//Question 1
	while(x<5)
	{
		//insert code here
	}
	
	//Question 2
	do
	{
	//insert code here
	}
	while(x<5);
	
	//Question 3
	System.out.println(  );
	
	int m = 97, k = 0, p = 0;
	
	while(m<= 195)
	{
		k=k*k+3*m;
		p=p + m +1;
		m++;
	}
	System.out.println(m + "\n" + k + "\n" + p);
	
	//Question 4
	System.out.println(  );
	
	int v = 2;
	k=0;
	double q2=0;
	
	do
	{
		k=k*k+3*v;
		q2 = Math.sqrt(q2+v+1);
		v*=3;
	}
	while(v<=195);
	
	System.out.println(v + "\n" + k + "\n" + q2);
	
	//Question 5
	System.out.println(  );
	System.out.println("the control expression is: !done");
	
	//Question 6
	System.out.println(  );
	System.out.println("The error is on line one, with the semicolon");
	
	//Question 7
	System.out.println(  );
	System.out.println("infinite times");
	
	//Question 14
	System.out.println(  );
	
	Scanner keyboard = new Scanner(System.in); 
	
	System.out.println("enter an integer (entering 0 will stop program)");
	
	
	double x2 = keyboard.nextDouble();
	do
	{
		x2 = Math.sqrt(x2);
		System.out.println("the square root of your number is: " + x2);
		x2 = keyboard.nextDouble();
	}
	while(x2!=0);
	
	}
}

/*
 *System run:
 *
 * 
196
-470283030
14553

486
-787693302
13.066202458572672

the control expression is: !done

The error is on line one, with the semicolon

infinite times

enter an integer (entering 0 will stop program)
45
the square root of your number is: 6.708203932499369
65
the square root of your number is: 8.06225774829855
2
the square root of your number is: 1.4142135623730951
0

 *
 */
