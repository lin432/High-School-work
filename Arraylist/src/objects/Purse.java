package objects;

import java.util.*;

public class Purse {
	
	public ArrayList<String> purse = new ArrayList<String>();
	//public ArrayList variable to record the String of coins
	
	public Purse()
	{   		}
	//empty constructor
	
	public void addCoin(String coinName)
	{
		purse.add(coinName);
		//ArrayList method to add a string
	}
	
	
	public String toString()
	{
		String hold = "[";
		//bracket to make it pretty
		//initializes a hold String that will hold our entire Line
		
		for(int count = 0; count< purse.size(); count++)
		{//for loop using a simple counter with size as the max
			
			//if tree to make it prettier
			if(count+1<purse.size())
			{
				hold = hold + purse.get(count) + ","; 	
				//adds next String with Hold and adds a ","
			}
			else
			{
				hold = hold + purse.get(count);
			}	//adds next String with Hold
		}
		
		hold = hold + "]";
		//makes it prettier
		
		return hold;
	}

	
	public void reversePurse()
	{
		for(int first =0; first<(purse.size()/2); first++)
		{//I have purse.size()/2 to the purse size so that we don't go and switch the 
			//numbers twice and end up where we were
			
			int last = purse.size() - (first+1);
			//holder int for place at end
			
			String hold = purse.get(last);
			//Holder for String at end
			
			purse.set(last, purse.get(first));
			//sets first String as last
			
			purse.set(first, hold);
			//sets last string as first using holders
			
		}
	}
	
	public void transfer(Purse b)
	{
		for(int count = 0; count< b.purse.size(); count++)
		{//Uses a loop to get all the Strings
			
			purse.add(b.purse.get(count));
			//adds to our purse
		}
		
		b.purse.removeAll(b.purse);
		//removes from other purse
	}
}
