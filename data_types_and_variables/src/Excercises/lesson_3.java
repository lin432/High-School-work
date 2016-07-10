/** =======================================================================
 * Class:    Computer Science 201 Ex.N//A  Pg..  Author: Lintao Yin
 * Version:  001                                    Date:  Nov 8, 2012
 *
 * Purpose   Questions to Blue pelican TXT book lesson 3
 *
 * Course:   Computer Science 201                Teacher:  Mr Blakey
 * School:   Sir Winston Churchill High School, Calgary, Alberta, Canada
 * Language: Java J2SE 6.0    Target Operating System: Java Virtual Machine
 * System:   Intel Celeron 3GHz running under Windows XP     IDE: Eclipse 3.4
 * ========================================================================
Written by: Lintao Yin*/

package Excercises;

public class lesson_3 {

	public static void main(String[] args){
		
		//practice below
		String xx = "Hello ";
		String yy = "my friend ";
		String xy = xx+yy;
		String cat = "what a nice cat you have";
		int len = xy.length();
		
		System.out.println(xy);
		
		System.out.println(len + " years of age now");
		
		System.out.println(cat.substring(3,12));
		
		System.out.print(xx.toLowerCase());
		System.out.print(yy.toUpperCase());
		
		System.out.println("\nHe shouted \"forward!\"");
		
		//Question 1
		String s = "\nThe number of rabbits is ";
		int argh = 129;
		
		System.out.println(s + argh);
		
		//Question 2
		String p = "Groovy Dude";
		
		System.out.println("\nWhat is the output of P.toUppercase?");
		System.out.println(p.toUpperCase());
		
		// Question 3
		String g = "\nComputer Science is for nerds";
		
		System.out.println(g.toLowerCase());
		
		//Question 4
		String m = "The \nGettysburg Address";
		String c = m.substring(4);
		
		System.out.println(c);
		
		//Question 5
		String b = "Four score and seven years ago,";
		String j = b.substring(7,12);
		
		System.out.println("\n" + j);
		
		//Question 6
		String q = "Surface tension";
		int count = q.length();
		
		System.out.println("\n" + count);
		
		//Question 7
		String sailor = "Look here!";
		int sail = sailor.length();
		
		System.out.println("\n" + sailor + sail);
		
		//Question 8
		
		System.out.println("\nAll \"good\" men should come to the aid of their country");
		
		//Question 9
		
		System.out.println("\nHello \nHello again");
		
		//Question 10
		
		System.out.println("\nA backslash looks like this \\, ...right?");
		
		//Question 11
		
		String pq ="Eddie Haskel";
		int hm = pq.length();
		String ed = pq.substring(hm - 4);
		
		System.out.println("\n" + ed);
		
		//Question 12
		
		String name = "Herman Munster";
		String letter = name.substring(5,6);
		
		System.out.println("\nWhat is the fifth letter of the variable name?");
		System.out.println("Answer:" + letter);
		
	}
}

/*
System run:

//Exercise:
	Hello my friend 
	16 years of age now
	t a nice 
	hello MY FRIEND 
	He shouted "forward!"

The number of rabbits is 129

What is the output of P.toUppercase?
GROOVY DUDE

computer science is for nerds

Gettysburg Address

ore a

15

Look here!10

All "good" men should come to the aid of their country

Hello 
Hello again

A backslash looks like this \, ...right?

skel

What is the fifth letter of the variable name?
Answer:n
*/