/** =======================================================================
 * Class:    Computer Science 201 Ex.N//A  Pg..  Author: Lintao Yin
 * Version:  001                                    Date:  Nov 29, 2012
 *
 * Purpose   Timed test 4, record points for a game of some sort using loops
 *
 * Course:   Computer Science 201                Teacher:  Mr Blakey
 * School:   Sir Winston Churchill High School, Calgary, Alberta, Canada
 * Language: Java J2SE 6.0    Target Operating System: Java Virtual Machine
 * System:   Intel Celeron 3GHz running under Windows XP     IDE: Eclipse 3.4
 * ========================================================================
Written by: Lintao Yin*/

package tests;

import java.util.*;

public class Points 
{
	
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		//^set input
		
		System.out.println("Please enter the name of the player");
		//these two lines ask and record name
		String name = keyboard.next();
		
		
		System.out.println("what game are you storing points for");
		//records game name
		String gamename = keyboard.next();
		
		
		System.out.println("How much games do you wish to store?");
		//^gui
		
		int games = keyboard.nextInt();
		int score[] = new int[games];
		//^creates array w/ max as the games entered
		
		for(int count = 0; count<score.length;count++)
		{
			System.out.println("please enter the score of game " + (count+1));
			
			score[count] = keyboard.nextInt();
		}
		//^for loop is used due to its simple condition that is easy to access
		
		int lplace = 100;
		int hplace = -2;
		int total = 0;
		double average = 0;
		//^create variables to record statistics (finally
		
		for(int count = 0; count<score.length; count++)
		{
			total+= score[count];
			//^record game total
			
			if (score[count]<lplace)
			{
				lplace=score[count];
			}
			if(score[count]>hplace)
			{
				hplace = score[count];
			}
			//^while an if tree decides on the lowest and highest scores
		}
		
		average=(double) total/score.length;
		//calculate the average^^
		
		System.out.println("Results for: \t" + name + "\n");
		System.out.println("Game played: \t" + gamename);
		System.out.println("lowest score: \t" + lplace);
		System.out.println("Highest score: \t" + hplace);
		System.out.println("total score: \t" + total);
		System.out.println("average score: \t" + average);
		System.out.println("\nall results were out of " + score.length + " games");
		//^final printout of all the scores and etc
		//I added the game name as different games have varying score averages
		//I also added the total amount of games calculated for statistics sake
	}

}

/*System run

Please enter the name of the player
Lee.Jackson
what game are you storing points for
Freestyle
How much games do you wish to store?
12
please enter the score of game 1
5
please enter the score of game 2
4
please enter the score of game 3
3
please enter the score of game 4
4
please enter the score of game 5
5
please enter the score of game 6
4
please enter the score of game 7
5
please enter the score of game 8
3
please enter the score of game 9
4
please enter the score of game 10
2
please enter the score of game 11
4
please enter the score of game 12
3
Results for: 	Lee.Jackson

Game played: 	Freestyle
lowest score: 	2
Highest score: 	5
total score: 	46
average score: 	3.8333333333333335

all results were out of 12 games

 */
