/** =======================================================================
 * Class:    Computer Science 201 Ex.N//A  Pg..  Author: Lintao Yin
 * Version:  001                                    Date:  Nov 15, 2012
 *
 * Purpose   Start using if/else
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

public class Lesson_9 {

	public static void main(String[] args){
	Scanner keyboard = new Scanner(System.in);
		
	int i = 10, j = 3;
	boolean true_false;
	
	//Question 1
	true_false =(j>i);
	System.out.println(true_false);
	
	//Question 2
	System.out.println(  );
	true_false =(i>j);
	System.out.println(true_false);
	
	//Question 3 
	System.out.println(  );
	true_false =(i==j);
	System.out.println(true_false);
	
	//Question 4
	System.out.println(  );
	true_false =((j<=i)||(j>=i));
	System.out.println(true_false);
	
	//Question 5 
	System.out.println(  );
	true_false =((i>j)&&(j==0));
	System.out.println(true_false);
	
	//Question 6
	System.out.println(  );
	true_false =((j<50)||(j!=33));
	System.out.println(true_false);
	
	//Question 7
	System.out.println(  );
	true_false =(!(j>=0)||(i<=50));
	System.out.println(true_false);
	
	//Question 8
	System.out.println(  );
	true_false =(!(!(!true)));
	System.out.println(true_false);
	
	//Question 9
	System.out.println(  );
	true_false =(5<=5);
	System.out.println(true_false);
	
	//Question 10
	System.out.println(  );
	true_false =(j!=i);
	System.out.println(true_false);
	
	//Question 11
	System.out.println(  );
	int m = 23;
	boolean b;
	
	if(m<=44)
	{
		b= true;
	}
	else
	{
		b= false;
	}
	System.out.println(b);
	
	//Question 12
	System.out.println(  );
	int r = 45;
	if(r>17)
	{
		b = false;
	}
	
	System.out.println(b);
	
	//Question 13
	System.out.println(  );
	System.out.println(!((2>3)||(5==5)&&(7>1)&&(4<15)||(35<=36)&&(89!=34)));
	
	//Question 14
	System.out.println(  );
	
	String s1 = "school BUS";
	if(s1.equals("school bus"))
		System.out.println("equal");
	else
		System.out.println("Not equal");
	
	//Question 15
	System.out.println(  );
	
	if(s1.equalsIgnoreCase("school bus"))
		System.out.println("Equal");
	else
		System.out.println("Not equal");
	
	//Question 16
	System.out.println(  );
	
	int j2 = 19, m2 = 200;
	
	if(j2==18)
		m++;
		j++;
	System.out.println(m);
	System.out.println(j);
	
	//Question 17
	System.out.println(  );
	int g = 56;
	
	if(g!=34)
		b = false;
	else
		b = true;
	System.out.println(b);
	
	//Question 18
	System.out.println(  );
	double k = 13;
	double x = k/2;
	double y = k/Math.round(x);
	
	if(k/x==y)
		b=true;
	else
		b=false;
	
	System.out.println(b);
	
	//Question 19
	System.out.println(  );
	
	String password = "GjGJgj";
	
	System.out.println("Enter password");
	
	String input = keyboard.nextLine();
	
	if(input.equalsIgnoreCase(password))
		System.out.println("Password Entered Succesfully");
	else
		System.out.println("Incorrect Password");
	
	//Question 20
	System.out.println(  );
	
	int k2 = 79;
	
	if(k>50)
		if(k<60)
			{System.out.println("One");}
		else
			{System.out.println("Two");}
	else
		if(k>30)
			System.out.println("Three");
		else
			System.out.println("four");
	
	}
}

/*
System run:

false

true

false

true

false

true

true

false

true

true

true

false

false

Not equal

Equal

23
4

false

false

Enter password
gjgjgj
Password Entered Succesfully

four

*/