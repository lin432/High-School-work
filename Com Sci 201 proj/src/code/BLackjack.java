package code;

import java.util.Scanner; 

import classes.Black_jack_rules;
import classes.Deck;

public class BLackjack {
	
	
	public static void main(String[] args)
	{
		Deck deck = new Deck();
		Scanner keyboard = new Scanner(System.in);
		//^import objects
		
		
		System.out.println("Welcome to virtual blackjack, please enjoy your stay\n");
		
		
		String game = "y";
		while(game.equalsIgnoreCase("y"))
		{//^loops the game
		
			
		System.out.println("Please enter the number of players");
		
		int players = keyboard.nextInt();
		if(players<1||players>1000)
			System.out.println("That is not a valid player count");
		//^checks if input would crash system
		
		
		else
		{
			Black_jack_rules rules = new Black_jack_rules();
			int cards[] = new int[(players*2)];
			int greaters = 0, tie = 0, lose =0;
			//^create players, cards array is *2 cause everyone draws 2 cards players sets things in blackjack rules
			
			
			for (int draw = 0; draw<cards.length;draw++)
			{
				cards[draw] = deck.draw_int();
				cards[draw] = rules.royalscheck(cards[draw]);
				cards[draw] = rules.aceset(cards[draw], draw);
			}
			//^deal out cards
			
			System.out.println("You have a " + cards[0] + " and a " + cards[1]);
			for(int count = 2;count<cards.length;count+=2)
			{
			System.out.println("Player " + count/2 + " has a " + cards[count] + " facing up");	
			}
			//^guides player like a word game version of blackjack also presents cards
			
			
			
			for(int count = 0; count<cards.length-1;count+=2)
			{
				cards[count]+= cards[count+1];
				cards[count] = rules.acesetcont(cards[count]);
			}
			//^add the cards up to get total value, checks if the card is 2 aces
			
			System.out.println("You are at " + cards[0]);
			//^finally prints total
			
			
			
		System.out.println("would you like to draw? (y/n)");
		String finish = keyboard.next();
		//^gui for draw if you want another card
		
		
		while(finish.equalsIgnoreCase("y"))
		{
			int tempadd = deck.draw_int();	
			tempadd = rules.royalscheck(tempadd);
			//^checks if royal
			
			
			System.out.println("you drew a " + tempadd);
			cards[0]+= tempadd;
			//^announces and adds cards
			
			cards[0] = rules.acecheck(cards[0], 0);
			cards[0] = rules.acecheck(cards[0],1);
			System.out.println("You're at " + cards[0]);
			//^announces new total, checks if you're over and whether you can minus 10
			
			if(cards[0]>21)
			{
				System.out.println("You're over 21!");
				break;
			}
			//^ends loop if neccesary
			
			//ask for another card
			System.out.println("would you like another card? (y/n)");
			finish = keyboard.next();
			}
		//^tempadd to ease flow, adds card
		
		
		for(int count = 2; count<cards.length;count+=2)
		{
			while(cards[count]<15)
			{
				int tempadd = deck.draw_int();
				tempadd = rules.royalscheck(tempadd);
				//^checks for royals
				
				
				cards[count] += tempadd;
				System.out.println("player " + count/2 +" has drawn");
				//^adds card to ai and announces how many times they drew
				
				cards[count] = rules.acecheck(cards[count], count/2);
				cards[count] = rules.acecheck(cards[count], (count/2)+1);
				//^checks the ace rule
			}
			
			
			System.out.println("player " + count/2 + " has finished drawing");
			//^prints when they're out of the while loop
		}
		//^adds cards for other players (ai)
		
		
		for(int count = 0; count<cards.length;count+=2)
		{
			cards[count] = rules.bust(cards[count]);
		}
		//^checks if anyone has busted
		
		
		
		
		System.out.println("");
		//^makes it look nicer when outputted
		
		for(int count = 2; count<cards.length;count+=2)
		{
			if(cards[count] == 0)
				System.out.println("player " + count/2 + " has busted");
			else
				System.out.println("player " + count/2 + " has a total of " + cards[count]);
			//^lets you know whether the ai has busted or hasn't if it hasn't, it lets you know their total
			
			if (cards[0]>cards[count])
			{
				greaters++;
			}//^also known as filler
			
			if (cards[0]==21 && cards[count]==21)
			{
				tie++;
			}//^checks if tie of 21
			
			if(cards[0]<cards[count])
			{
				lose++;
			}//^adds a lose
			
			//^if tree helps decide if tie or if lose, or win		
		}
		
		
		if(tie!=0)
			System.out.println("you tied");
			//^ first an if tie, as they are least likely to happen
		else
			{
				if(lose!=0)
					System.out.println("you lost");
					//^checks if it's a loss
				if(greaters==players-1)
					System.out.println("you win!");
			}		//checks if it's a win
		//^if tree prints out final result
		
		System.out.println("you had " +cards[0]);
		//^displays your total hand again
		}
		//That while loop you saw at the beginning ends soon
		
		
		System.out.println("would you like to play again? (y/n)");
		//asks if you want to play again
		game = keyboard.next();
		}
	}
	
}


/*
System run:

Welcome to virtual blackjack, please enjoy your stay

Please enter the number of players
2
You have a 5 and a 3
Player 1 has a 10 facing up
You are at 8
would you like to draw?
y
you drew a 10
You're at 18
would you like another card? (y/n)
n
player 1 has finished drawing

player 1 has a total of 19
you lost
you had 18
would you like to play again? (y/n)
y
Please enter the number of players
0
That is not a valid player count
would you like to play again? (y/n)
y
Please enter the number of players
4
You have a 7 and a 5
Player 1 has a 11 facing up
Player 2 has a 10 facing up
Player 3 has a 8 facing up
You are at 12
would you like to draw?
y
you drew a 10
You're at 22
You're over 21!
player 1 has finished drawing
player 2 has finished drawing
player 3 has drawn
player 3 has drawn
player 3 has finished drawing

player 1 has a total of 21
player 2 has a total of 15
player 3 has a total of 18
you lost
you had 0
would you like to play again? (y/n)
n

*/