/** =======================================================================
 * Class:    Computer Science 201 Ex.N//A  Pg..  Author: Lintao Yin
 * Version:  001                                    Date:  Nov 21, 2012
 *
 * Purpose   timed test 2
 *
 * Course:   Computer Science 201                Teacher:  Mr Blakey
 * School:   Sir Winston Churchill High School, Calgary, Alberta, Canada
 * Language: Java J2SE 6.0    Target Operating System: Java Virtual Machine
 * System:   Intel Celeron 3GHz running under Windows XP     IDE: Eclipse 3.4
 * ========================================================================
Written by: Lintao Yin*/

package tests;

import java.util.*;

public class Test_2 
{

	public static void main(String[] args)
	{
	
		System.out.println("This program calculates your commission");
		Scanner keyboard = new Scanner(System.in);
		//^introduces use of program
		
		System.out.println("please enter your name");
		String name = keyboard.nextLine();
		
		double choco = 0.80, caramel = 1, choco_nut = 1.20;
		//^values to calculate prices
		
		System.out.println("please enter the number of items you have sold");
		System.out.println("please enter the amount of plain chocolate you have sold");
		int ch_sales = keyboard.nextInt();
		System.out.println("please enter the amount of Caramel you have sold");
		int ca_sales = keyboard.nextInt();
		System.out.println("please enter the amount of chocolate nut you have sold");
		int cn_sales = keyboard.nextInt();
		//^get sales record
		
		choco = ch_sales*choco;
		caramel = ca_sales*caramel;
		choco_nut = cn_sales*choco_nut;
		float total = (float) (choco+caramel+choco_nut);
		//*= to store sales into variable, total is float as doubles had invisible decimals
		
		System.out.println("Ice cream sales:");
		System.out.println("Sales Associate:\t" + name);
		System.out.println("\nPlain chocolate:\t" + "$" + choco);
		System.out.println("Caramel:\t\t\t" + "$" + caramel);
		System.out.println("Chocolate nut:\t\t" + "$" + choco_nut);
		System.out.println("total sales:\t\t" + "$" + total);
		//^print all sales and name 
		
		if(total<100)
			total*=0.15;
		else
			if(total<200)
				total*=0.20;
			else
				total*=0.30;
		//^ I have the if/else structure to determine commission percent
		System.out.println("\ntotal Comission:\t" + "$" + total);
 	}
}

/*
System run:

//10%:

Sales Associate:	Briar Maple

Plain chocolate:	$8.0
Caramel:		/t$24.0
Chocolate nut:		$14.399999999999999
total sales:		$46.4

total Comission:	$6.96


//20%:

This program calculates your commission
please enter your name
Lintao Yin
please enter the number of items you have sold
please enter the amount of plain chocolate you have sold
50
please enter the amount of Caramel you have sold
46
please enter the amount of chocolate nut you have sold
24
Ice cream sales:
Sales Associate:	Lintao Yin

Plain chocolate:	$40.0
Caramel:		/t$46.0
Chocolate nut:		$28.799999999999997
total sales:		$114.8

total Comission:	$22.960001


//30%:

This program calculates your commission
please enter your name
Mark Asdin
please enter the number of items you have sold
please enter the amount of plain chocolate you have sold
112
please enter the amount of Caramel you have sold
24
please enter the amount of chocolate nut you have sold
89
Ice cream sales:
Sales Associate:	Mark Asdin

Plain chocolate:	$89.60000000000001
Caramel:		/t$24.0
Chocolate nut:		$106.8
total sales:		$220.4

total Comission:	$66.119995
*/