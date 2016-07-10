package classes;

public class Black_jack_rules 
{
	private boolean ace[] = new boolean[2000];
	
	public Black_jack_rules(){}
	//^empty constructor
	
	public int royalscheck (int ten)
	{
		int returnvar = ten;
		
		if (ten>10)
			returnvar = 10;
		
		return returnvar;
		//^checks if card is over 10 a.k.a a royal
	}
	
	public int aceset(int c, int card)
	{
		int returnvar = c;
		
		if(c == 1)
		{
			returnvar = 11;
			this.ace[card]=true;
		}
		
		return returnvar;
		//^sets ace array as true if c is equal to 1 (work in progress)
	}
	public int acesetcont (int c)
	{
		int returnvar = c;
		
		if(c==22)
		{
			returnvar -= 10;
			this.ace[c]=false;
		}
		
		return returnvar;
	}
	//^double check to make sure that there isn't two aces
	
	public int acecheck(int c, int card)
	{
	int returnvar = c;
		
	if(c > 21)
	{
		if(this.ace[card] == true)
		{
			returnvar-=10;
			this.ace[card]=false;
			System.out.println("test");
		}
	}
	//^checks if ace is false so that it can minus ten
	return returnvar;
	}
	
	public int bust(int c)
	{
		int returnvar = c;
		
		if(c > 21)
		{
			returnvar = 0;
		}
		
		return returnvar;
	}//^checks if you are over 21


}

