package class_tests;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;



public class MasterArray {

	private static ArrayList<Card> master = new ArrayList<Card>();
	private int size=0;
	private static LinkedList<Integer> string = new LinkedList<Integer>() ,g3D = new LinkedList<Integer>();
	
	public MasterArray()
	{	}//initializes array
	
	public void addCard(Card oneToAdd)
	{
		master.add(oneToAdd);//adds to master array
		
		int g3DCheck = oneToAdd.getG3D();
		String stringCheck = oneToAdd.getTitle();
		//gets the variables of the card to add
		
		ListIterator<Integer> G3DIterator = g3D.listIterator();
		//creates iterator for G3D linkedlist
		while(G3DIterator.hasNext())
		{
			Card hold = master.get(G3DIterator.next());
			int G3DToCheck = hold.getG3D();
			//gets the current nodes data
			
			if(g3DCheck<G3DToCheck)//checks that the node variable is higher so it belongs in the position previous
			{
				G3DIterator.previous();
				G3DIterator.add(size);
				break;//breaks loop as it is done finding the position
			}
		}
		
			
		ListIterator<Integer> stringIterator = string.listIterator();
		while(stringIterator.hasNext())
		{
			Card hold = master.get(stringIterator.next());
			String oneToCheck = hold.getTitle();
			//gets node to check
			
			if(stringCheck.compareTo(oneToCheck)<0)//the node variable is higher so it belongs to the previous
			{
				stringIterator.previous();
				stringIterator.add(size);
				//adds and size increases here for ease of use in the master array
				size++;
				return;//ends as the next line of code is for if a spot cannot be found
			}
		}
		
		//this line of code executes if the variables are greater than everything, therefore belonging at the end of the iterators
		stringIterator.add(size);
		G3DIterator.add(size);
		size++;
		
	}
	
	public void printG3D()
	{
		ListIterator<Integer> g = g3D.listIterator();
		while(g.hasNext())
		{
			Card h = master.get(g.next());
			int x = h.getG3D();
			
			System.out.println(x);
		}
	}
	public void printString()
	{	ListIterator<Integer> s = string.listIterator();
		while(s.hasNext())
		{
			Card h = master.get(s.next());
			String x = h.getTitle();
		
			System.out.println(x);
		}
	}
	
}
