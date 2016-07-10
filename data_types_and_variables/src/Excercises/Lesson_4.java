/** =======================================================================
 * Class:    Computer Science 201 Ex.N//A  Pg..  Author: Lintao Yin
 * Version:  001                                    Date:  Nov 8, 2012
 *
 * Purpose   Questions to Blue pelican TXT book lesson 4
 *
 * Course:   Computer Science 201                Teacher:  Mr Blakey
 * School:   Sir Winston Churchill High School, Calgary, Alberta, Canada
 * Language: Java J2SE 6.0    Target Operating System: Java Virtual Machine
 * System:   Intel Celeron 3GHz running under Windows XP     IDE: Eclipse 3.4
 * ========================================================================
Written by: Lintao Yin*/

package Excercises;

public class Lesson_4 {

	public static void main(String[] args){
		
		//Question 1
		int h = 103;
		int p =5;
		
		System.out.println(++h + p);
		System.out.println(h);
		
		//Question 2
		
		System.out.println(   );
		
		int j1 = 1;
		System.out.println(++j1);
		
		int j2 = 1;
		System.out.println(j2 + 1);
		
		int j3 = 1;
			j3 = j3+=1;
		System.out.println(j3);
		
		//Question 3 
		System.out.println(  );
		
		double def;
		double f = 1992.37;
		def = f;
		
		System.out.println(def);
		
	
		//Question 4
		System.out.println(  );
		
		int zulu = 4;
		
		zulu-=1;
		
		System.out.println(zulu);
		
		//Question 5
		System.out.println(  );
		
		int a = 100;
		int b = 200;
		
		b/=a;
		System.out.println(b+1);
		
		//Question 6
		System.out.println(  );
		
		int v = 70;
		int p2 = 40;
		
		v-=p2-30;
		
		System.out.println(v);
		
		//Question 7
		System.out.println();
		
		int v2 = 70;
		
		v2=(v2-(p2-30));
		
		System.out.println(v2);
		
		//Question 8
		System.out.println(  );
		
		int q3 = 4;
		
		System.out.println(2+8*q3/2-p2);
		
		//Question 9
		System.out.println(  );
		
		int sd = 12;
		int x = 4;
		
		System.out.println(sd%(++x));
		
		System.out.println(x);
		
		//Question 10
		System.out.println(  );
		
		int g;
		g=3;
		
		System.out.println((++g*19) + "  should not have worked but I made it work");
		
		//Question 11
		System.out.println(  );
		
		double m=3.14,b2=3.14,f2=3.14;
		
		System.out.println(m + "\n" + b2 + "\n" + f2);
		
		//Question 12
		System.out.println(  );
		
		int x2,y,z;
		x2 = 12;
		y = 14;
		z = 4;
		
		System.out.println(x2 + " " + y + " " + z );
		
		//Question 13
		System.out.println(  );
		
		int m2 = 36;
		int j = 5;
		
		m=m/j;
		
		System.out.println(m);
		
		//Question 14
		System.out.println(  );
		
		System.out.println(3/4+5*2/33-3+8*3);
		
		//Question 15
		System.out.println(  );
		
		System.out.println("The assignment operator is the equal sign, the equal sign gives the variable \nthe value, so it assigns the value to the variable");
		
		//Question 16
		System.out.println(  );
		
		int i = 24;
		int j4 = 3;
		
		int k = i / j4;
		
		System.out.println( k );
		
		//Question 17
		System.out.println(  );
		
		int j5 = 2;
		
		System.out.println(7%3+j5++ + (j-2));
		
		//Question 18
		System.out.println(  );
		
		int j6 = 2;
		int j7 = 2;
		int j8 = 2;
		
		j6-=1;
		System.out.println(j6);
		
		System.out.println(--j7);
		
		System.out.println(j8 - 1);
		
		
	}
}


/*
System run:

109
104

2
2
2

1992.37

3

3

60

60

-22

2
5

76  should not have worked but I made it work

3.14
3.14
3.14

12 14 4

0.628

21

The assignment operator is the equal sign, the equal sign gives the variable 
the value, so it assigns the value to the variable

8

6

1
1
1

*/