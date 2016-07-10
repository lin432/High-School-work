/** =======================================================================
 * Class:    Computer Science 201 Ex.N//A  Pg..  Author: Lintao Yin
 * Version:  001                                    Date:  Nov 28, 2012
 *
 * Purpose   generate a dice number generator w/ arrays
 *
 * Course:   Computer Science 201                Teacher:  Mr Blakey
 * School:   Sir Winston Churchill High School, Calgary, Alberta, Canada
 * Language: Java J2SE 6.0    Target Operating System: Java Virtual Machine
 * System:   Intel Celeron 3GHz running under Windows XP     IDE: Eclipse 3.4
 * ========================================================================
Written by: Lintao Yin*/

package code;

public class Dice_num_gen 
{
	public static void main(String[] args)
	{
		double roll;
		int dice[] = new int[1000];
		int ro[] = {0,0,0,0,0,0};
		//roll is temp double, dice[] is seperate rolls, ro[] is amount of certain numbers rolled
		
		for(int count=0;count<dice.length;count++)
		{
			//dice.length is used for obvious reasons
			
			roll=Math.random();
			roll*=10;
			roll=Math.round(roll);
			//get random number, times by ten, then round to get nice whole number saved to roll
			
			if(roll>6)
				--count;
			if(roll==0)
				--count;
			//if the roll is not equal to 6 or is equal to 0 --count
			else
			{
				switch((int) roll)
				{
				case 1:
					ro[0]++;
					break;
				case 2:
					ro[1]++;
					break;
				case 3:
					ro[2]++;
					break;
				case 4:
					ro[3]++;
					break;
				case 5:
					ro[4]++;
					break;
				case 6:
					ro[5]++;
					break;
				//Switch to break up the numbers into the ro[] categories
				}
			}
				
		}
		
		System.out.println("The dice rolled 1, " + ro[0] + " times out of 1000" );
		System.out.println("\nThe dice rolled 2, " + ro[1] + " times out of 1000" );
		System.out.println("\nThe dice rolled 3, " + ro[2] + " times out of 1000" );
		System.out.println("\nThe dice rolled 4, " + ro[3] + " times out of 1000" );
		System.out.println("\nThe dice rolled 5, " + ro[4] + " times out of 1000" );
		System.out.println("\nThe dice rolled 6, " + ro[5] + " times out of 1000" );
		//Display output
	}
}

/*
System run:

The dice rolled 1, 183 times out of 1000

The dice rolled 2, 153 times out of 1000

The dice rolled 3, 162 times out of 1000

The dice rolled 4, 159 times out of 1000

The dice rolled 5, 169 times out of 1000

The dice rolled 6, 174 times out of 1000

*/