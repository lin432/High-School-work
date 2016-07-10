/** =======================================================================
 * Class:    Computer Science 201 Ex.N//A  Pg..  Author: Lintao Yin
 * Version:  001                                    Date:  Nov 28, 2012
 *
 * Purpose   start using arrays
 *
 * Course:   Computer Science 201                Teacher:  Mr Blakey
 * School:   Sir Winston Churchill High School, Calgary, Alberta, Canada
 * Language: Java J2SE 6.0    Target Operating System: Java Virtual Machine
 * System:   Intel Celeron 3GHz running under Windows XP     IDE: Eclipse 3.4
 * ========================================================================
Written by: Lintao Yin*/

package code;

public class Lesson_18 
{
	
	public static void main(String[] args)
	{
		//Question 1
		double sgt[] = new double[800];
		System.out.println(sgt.length);
		
		//Question 2
		System.out.println(  );
		double []dfw = new double[21];
		System.out.println(dfw.length);
		
		//Question 3
		System.out.println(  );
		
		for(int count=0;count<sgt.length;count++)
			sgt[count]=count*count;
		
		System.out.println(sgt[20]);
		
		//Question 4
		System.out.println(  );
		
		double rtl[] = new double[50];
		//double rtl_len = rtl.length();
		
		System.out.println("rtl length does not need the ()" );
		
		//Question 6
		System.out.println(  );
		
		char cr[]= {'a','b','c','d','e'};
		System.out.println(cr.length);
		
		//Question 7
		System.out.println(  );
		
		int ref[] = new int[10];
		int total = 0;
		
		for(int count=1;count<ref.length;count++)
		{
			ref[count]=count*count;
			total+= ref[count];
		}
		
		System.out.println(total);
		
		//Question 8
		System.out.println(  );
		
		int homer[] = new int[100];
		
		for(int k = 2;k < homer.length;k++);
			//homer[k+1] = k;
		
		System.out.println("There isn't enough space for the index of the array");
		
		//Question 10
		System.out.println(  );
		
		int adc[] = {34,56,-102,18,5};
		
		System.out.println(adc[1]);
		
		//Question 11
		System.out.println(  );
		
		System.out.println(adc[3] + adc[4]);
		
		//Question 12
		System.out.println(  );
		
		System.out.println("invalid as there are only 0-4 indexes");
		
		//Question 13
		System.out.println(  );
		
		System.out.println("for every loop, it finds the absolute value");
		System.out.println("of b[j] and stores it");
		
		//Question 14
		System.out.println(  );
		
		int c[] = {1,2,3,4};
		
		String ss = ">>>";
		int len = ss.length();
		
		for(int j=0;j<len;j++)
			ss+=c[j];
		
		System.out.println(ss);
		
		//Question 15
		System.out.println(  );
		
		int indx = 0, pg[] = {45,2,6,12,-8,97,-45};
		
		for(int count=0;count<pg.length;count++)
		{
			if(pg[count]<0)
			{
				indx = pg[count];
				break;
			}
			else
				indx = pg.length;
		}
		
		System.out.println(indx);
		
		//Question 16
		System.out.println(  );
		
		String wc = "Whooping crane";
		String sp[] = wc.split("oo");
		
		for(int count = 0;count<sp.length;count++)
			System.out.println(sp[count]);
	}

}

/*
 * System run:
 * 
800

21

400.0

rtl length does not need the ()

5

285

There isn't enough space for the index of the array

56

23

invalid as there are only 0-4 indexes

for every loop, it finds the absolute value
of b[j] and stores it

>>>123

-8

Wh
ping crane

 * 
 */
