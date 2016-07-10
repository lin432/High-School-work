/** =======================================================================
 * Class:    Computer Science 201 Ex.N//A  Pg..  Author: Lintao Yin
 * Version:  001                                    Date:  Nov 21, 2012
 *
 * Purpose   Reverse your name!
 *
 * Course:   Computer Science 201                Teacher:  Mr Blakey
 * School:   Sir Winston Churchill High School, Calgary, Alberta, Canada
 * Language: Java J2SE 6.0    Target Operating System: Java Virtual Machine
 * System:   Intel Celeron 3GHz running under Windows XP     IDE: Eclipse 3.4
 * ========================================================================
Written by: Lintao Yin*/

package codes;

import java.util.*;

public class Name_Reversal {

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		//^Scanner object
		
		System.out.println("please enter your name");
		//^ user prompt
		
		String name = keyboard.nextLine();
		int length = name.length();
		//^set name and length of name
		
		//for loop
		for(int sd = length;sd!=0;sd--)
		{
			String nam = name.substring((length-1),length);
			//isolate letter^
			length--;
			//^remove length
			System.out.print(nam.toLowerCase());
			//^print in lowercase w/o a new line
		}
	}
}

/*
System run:

1.
please enter your name
Lintao Yin
niy oatnil

2.
please enter your name
Briar Maple jr.
.rj elpam rairb

*/