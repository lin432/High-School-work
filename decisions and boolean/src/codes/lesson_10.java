/** =======================================================================
 * Class:    Computer Science 201 Ex.N//A  Pg..  Author: Lintao Yin
 * Version:  001                                    Date:  Nov 15, 2012
 *
 * Purpose   learn how to use switch
 *
 * Course:   Computer Science 201                Teacher:  Mr Blakey
 * School:   Sir Winston Churchill High School, Calgary, Alberta, Canada
 * Language: Java J2SE 6.0    Target Operating System: Java Virtual Machine
 * System:   Intel Celeron 3GHz running under Windows XP     IDE: Eclipse 3.4
 * ========================================================================
Written by: Lintao Yin*/

package codes;

import java.util.*;

public class lesson_10 {

	public static void main(String[] args){
		//Scanner 
		Scanner keyboard = new Scanner (System.in);
		
		//Question 1
		
		System.out.println("The permissible data types for x are:char,int,short,byte");
		
		//Question 2
		System.out.println(  );
		// ^ makes program look better run
		
		int x = 3, p = 5, y = -8;
		//Variables ^
		
		//Decision structure
		switch(x)
		{	
			case 2:
				p++;
			case 3:
			case 4:
				y+=(--p);
				break;
			case 5:
				y+=(p++);
		}
		//run answer
		System.out.println(y);
		
		//Question 3
		System.out.println(  );
		
		int y2 = 56;
		char myChar = 'g';
		//variables char and y
		
		//Decision structure, has both upper case lower case and default
		switch(myChar)
		{
		case 'G':
		case 'g':
			++y2;
			break;
		case 'M':
		case 'm':
			--y2;
			break;
		default:
			y2 += y2+100;
			break;
		}
		System.out.println(y2);
		//^ run program
		
		//Question 4
		System.out.println(  );
		
		int z=2, q=0;
		//^ variables
		
		//Decision structure
		switch(z)
		{
		case 1:
			q++;
		case 2:
			q++;
		case 3:
			q++;
		case 4:
			q++;
		default:
			q++;
		}
		System.out.println(--q);
		//^ system output
		
		//Question 5
		System.out.println(  );
		
		char chr = 'z';
		//^variable
		
		//system output
		System.out.println(chr);
		
		//Question 6
		System.out.println(  );
		
		int x2=10, y3 = 12;
		
		System.out.println("The sum is " + x2 + y3);
		System.out.println("The sum is " + (x2 + y3));
		
		//Question 7
		System.out.println(  );
		
		int speed = 69;
		//^variable
		
		
		//textbook had equal for everything so it's equal for decision
		switch(speed)
		{
		default:
			System.out.println("Very slow");
			break;
		case 75:
			System.out.println("exceeding speed limit");
			break;
		case 69:
		case 70:
			System.out.println("getting close");
			break;
		case 65:
			System.out.println("cruising");
			break;
		}
		
		//Question 8
		System.out.println(  );
		
		System.out.println("default is not mandatory in a switch structure");
		
		//Question 9
		System.out.println(  );
		
		String s = "X";
		chr = s.charAt(0);
		
		System.out.println(chr);
		
	}
}

/*
System run:

The permissible data types for x are:char,int,short,byte

-4

57

3

z

The sum is 1012
The sum is 22

getting close

default is not mandatory in a switch structure

X

*/