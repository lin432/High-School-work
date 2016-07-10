package code;

import java.util.Scanner;
import classes.Deck;

public class Run 
{
	
	public static void main(String[] args)
	{
		Deck cards = new Deck();
		Scanner keyboard = new Scanner(System.in);
		//^imported objects
		
		System.out.println("\nIn this game you play a game of chance, two cards are");
		System.out.println("drawn and the one with the higher sum wins the round");
		System.out.println("The cards are put back into the deck, shuffled and you");
		System.out.println("draw again\n");
		//Gui
		
		
		System.out.println("enter the amount of games you would like to play");
		int plays = keyboard.nextInt();
		//^sets amount of repetition
		
		boolean record_p1[] = new boolean[plays+1];
		boolean record_p2[] = new boolean[plays+1];
		boolean record_tie[] = new boolean[plays+1];
		//^arrays to record results
		int p1w=0, p2w=0, tie = 0;
		int p1a, p1b;
		int p2a, p2b;
		//p1a p1b are the two drawn cards
		//p1w and p2w are the wins, tie is to count tie(s)
		
		
		for(int counts = 0; counts<=record_p1.length-1; counts++)
		{
			record_p1[counts] = false;
			record_p2[counts] = false;
			record_tie[counts] = false;
		}
		
		
		//game code below
		for (int count = 1;count<=plays;count++)
		{
			p1a = cards.draw_int();
			p1b = cards.draw_int();
			p2a = cards.draw_int();
			p2b = cards.draw_int();
			//^draw
			
			System.out.println("round " + count);
			
			System.out.println("\nyou drew " + p1a + " " + p1b + " Which equals " + (p1a+p1b));
			System.out.println("They drew " + p2a + " " + p2b + " Which equals " + (p2a+p2b));
			//^lets player know what was drawn
			
			if(p1a+p1b > p2a+p2b)
			{
				p1w++;
				System.out.println("\nyou won!\n\n");
				record_p1[count] = true;
				
			}
			if(p2a+p2b > p1a+p1b)
			{
				p2w++;
				System.out.println("\nthey won, better luck next time\n\n");
				record_p2[count] = true;
			}
			if(p1a+p1b == p2a+p2b)
			{
				tie++;
				System.out.println("\nit was a draw, better luck next time\n\n");
				record_tie[count] = true;
			}
			//^if tree decides what variable goes up
		}
		
		
		if(p1w>p2w)
		{
			System.out.println("congrats, You won with a whooping " + p1w + " out of " + plays);
		}
		if(p2w>p1w)
		{
			System.out.println("sadly you lost with them getting " + p2w + " out of " +plays);
		}
		if(p1w==p2w)
		{
			System.out.println("wow! it was a tie, both of you getting " + p1w + " out of " + plays);
		}
		//^if tree diplays possibilities
		
		System.out.println("there was " + tie + " tie(s)");
		//^lets you know the amount of ties
		

		
		//from here down, arrays show the results of matches
		if (keyboard.next().equalsIgnoreCase("results"))
		{
			for(int p1count = 1; p1count<=plays;p1count++)
			{
				if(record_p1[p1count]==true)
				{
					System.out.println("round " + p1count + " was a win");
				}
				if(record_p2[p1count]==true)
				{
					System.out.println("round " + p1count + " was a loss");
				}
				if(record_tie[p1count]==true)
				{
					System.out.println("round " + p1count + " was a tie");
				}

			}
		}
	}
	
}
