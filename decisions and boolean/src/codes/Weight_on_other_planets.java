/** =======================================================================
 * Class:    Computer Science 201 Ex.N//A  Pg..  Author: Lintao Yin
 * Version:  001                                    Date:  Nov 15, 2012
 *
 * Purpose   Use a switch program to calculate your weight on imaginary planets
 *
 * Course:   Computer Science 201                Teacher:  Mr Blakey
 * School:   Sir Winston Churchill High School, Calgary, Alberta, Canada
 * Language: Java J2SE 6.0    Target Operating System: Java Virtual Machine
 * System:   Intel Celeron 3GHz running under Windows XP     IDE: Eclipse 3.4
 * ========================================================================
Written by: Lintao Yin*/

package codes;

import java.util.*;

public class Weight_on_other_planets {

	public static void main(String[] args){
		
		//set scanner and variables as doubles 
		Scanner keyboard = new Scanner (System.in);
		double Voltar, Krypton, Fertos, Servontos;
		
		System.out.println("This machine calculates your weight on different planets\n");
		System.out.println("What is your weight?");
		//^user interface
		
		int weight = keyboard.nextInt();
		//^find weight
		
		System.out.println("What planet would you like your weight at?\n");
		System.out.println("1. Voltar\n2. Krypton\n3. Fertos\n4. Servontos");
		System.out.println("\nPlace your selection");
		//^user interface
		
		//Switch, decision structure
		switch(keyboard.nextInt())
		{
		case 1:
			//Calculation done in case with a break
			Voltar = (weight * 0.091);
			System.out.println("\nYour weight on Voltar is: " + Voltar + " Earth units");
			break;
		case 2:
			Krypton = (weight * 0.72);
			System.out.println("\nYour weight on Krypton is: " + Krypton + " Earth units");
			break;
		case 3:
			Fertos = (weight * 0.865);
			System.out.println("\nYour weight on Fertos is: " + Fertos + " Earth units");
			break;
		case 4:
			Servontos = (weight * 4.612);
			System.out.println("\nYour weight on Servontos is: " + Servontos + " Earth units");
			break;
		}
	}
}

/*
System run:

This machine calculates your weight on different planets

What is your weight?
100
What planet would you like your weight at?

1. Voltar
2. Krypton
3. Fertos
4. Servontos

Place your selection
1

Your weight on Voltar is: 9.1 Earth units

This machine calculates your weight on different planets

What is your weight?
100
What planet would you like your weight at?

1. Voltar
2. Krypton
3. Fertos
4. Servontos

Place your selection
2

Your weight on Krypton is: 72.0 Earth units

This machine calculates your weight on different planets

What is your weight?
100
What planet would you like your weight at?

1. Voltar
2. Krypton
3. Fertos
4. Servontos

Place your selection
4

Your weight on Servontos is: 461.2 Earth units

*/