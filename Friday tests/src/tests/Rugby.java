 package tests;

 import java.util.*;
 
public class Rugby {
	
	public int number;
	public String first,last;
	public boolean injury;
	public ArrayList<Integer> points = new ArrayList<Integer>();
	
	public Rugby(int num, String first, String Last, boolean injury)
	{
		number = num;
		this.first = first;
		this.last = Last;
		this.injury = injury; 
	}//sets variables
	
	public void add_points(int x)
	{
		points.add(x);
	}
	
	public int getPoint(int game)
	{
		return points.get(game);
	}
	
	public double getAverage()
	{
		double hold=0;
		for(int count = 0; count<points.size(); count++)
		{
			hold+=points.get(count);
		}
		try
		{
		hold = hold/points.size();
		}
		catch(ArithmeticException e)
		{
			hold = hold/1;
		}
		return hold;
	}

}

