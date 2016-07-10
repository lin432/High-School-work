package classes;

import java.util.Random;

public class Deck {

	public Deck ()
	{
		boolean counters[] = new boolean[51];
		
		for(int count = 0; count<=50;count++)
		{
			counters[count] = true;
		}
		counter=counters;
	}//^tried to make a deck of 52 (didn't work p.s also wasn't neccesary)

	public int draw_int()
	{
		int resource[] = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		//^what variable name says
		
		Random rndm = new Random();
		int rdm = rndm.nextInt(13);
		int returnvar = 0; 
		//create random int and the return variable
		
		returnvar = resource[rdm];
		//set returnvar
		
		return returnvar;
	}
	
	//public String[] cards;
	public boolean[] counter;

}
