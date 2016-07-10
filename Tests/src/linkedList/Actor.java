package linkedList;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class Actor {

	public String firstname, lastname;//two strings for first and last name
	
	public LinkedList<Long> x = new LinkedList<Long>();//long linkedlist for all gross values
	
	public Actor(String first, String last)//constructor to get name
	{
		firstname = first;
		lastname = last;
	}
	
	public String getName()//returns full name
	{
		return firstname + " " + lastname;
	}
	
	public void addRevenue(Long v)//adds gross to list
	{
		x.add(v);
	}
	
	
	public long getAverage()//gets average by 
	{
		ListIterator<Long> l = x.listIterator();
		long v = 0;//creating total value
		int a = 0;//counting number of iterations
		
		
		while(l.hasNext())//checks that values still exist
		{	
			v = v + l.next();//adds
			a++;//counts
		}
		
		v = v/a;//calculates
		
		return v;//returns
	}
	
	public Long getTotal()//returns total
	{
		ListIterator<Long> l = x.listIterator();
		long v = 0;//total

		while(l.hasNext())
		{	
			v = v + l.next();//adds
		}
		
		return v;//returns
	}
	
}
