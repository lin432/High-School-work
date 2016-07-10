package linkedList;

import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String [] args)
	{
		try {
			Scanner input = new Scanner(new File("H:\\actorData.txt "));//gets file
			
			LinkedList<Actor> x = new LinkedList<Actor>();//creates list
			
			
			
			while(input.hasNext())//gets ready to fill list
			{
				Actor te = new Actor(input.next(), input.next());//creates object with the first two inputs being name
				while(input.hasNextLong())//gets next gross for a movie
				{
					te.addRevenue(input.nextLong());//adds the gross
				}
				x.add(te);//adds to Actor linkedlist
			}

			print(x);//prints to confirm it's loaded
			
			
			Scanner key = new Scanner(System.in);//new input scanner for user decisions
			
			
			System.out.println("would you like to delete an actor? Y/N");//asks if they want to delete a user
			
			if(key.next().equalsIgnoreCase("Y"))//if yes
			{
				System.out.println("Please enter the first name of your actor");//asks for first name
				String name = key.next();//gets
				ListIterator<Actor> a = x.listIterator();//creates an iterator to check
				while(a.hasNext())//goes through iterator
				{
					Actor te = a.next();//gets actor object
					String check = te.firstname;//gets name

					if(check.equalsIgnoreCase(name)){a.remove();//checks
					print(x);//prints new list
					break;}//breaks loop since the actor was found
					
					else
					{a.next();}//goes to next spot on iterator 
				}
			}
			
			
			String best = "no one";//default message is no one
			long highest=0;//lowest gross is 0
			
			
			ListIterator<Actor> a = x.listIterator();//creates a new iterator to check highest
			while(a.hasNext())//goes through linked list
			{
				Actor te = a.next();//gets Actor
				if(te.getTotal()>highest)//checks if they made more
				{
					highest = te.getTotal();//it replaces
					best = te.firstname + " " + te.lastname;//sets name
				}
			}
			System.out.println("The best of the best is..." + best +  "  with a whopping gross of: $" + highest);//prints
			
			System.out.println("Would you like to organize the array by highest average?  Y/N");//asks if you want to sort
			
			if(key.next().equalsIgnoreCase("Y"))//checks for yes
			{
				x = printAverage(x);//organizes
				print(x);//prints
			}
			
			else{System.out.println("Would you like to organize the array by highest total gross?  Y/N");//asks for gross organization if you don't want average
			{if(key.next().equalsIgnoreCase("Y"))//if yes
			{
				x = printTotal(x);//organizes by average
				print(x);//prints
			}
				
			}}
			
			
			System.out.println("Would you like to save the file? Y/N");//asks for save
			
			if(key.next().equalsIgnoreCase("Y"));//checks for okay
			{
				save(x);//saves
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void print(LinkedList<Actor> x)//a basic iterator that prints the values of the actor class
	{
		ListIterator<Actor> y = x.listIterator();//iterator created
		while(y.hasNext())//checks that iterator still has things
		{
			Actor te = y.next();//gets object
			System.out.println(te.getName() + " Average: $" + te.getAverage() + "  Total: $" + te.getTotal());//prints name and then average and then total
		}
	}

	
	public static LinkedList<Actor> printAverage(LinkedList<Actor> x)//organize for average using insertions sort
	{
		ArrayList<Actor> a = new ArrayList<Actor>();//fills an array list
		while(!x.isEmpty())
		{
			a.add(x.getFirst());
			x.removeFirst();
		}
		
		int j;
		Boolean go;
		
			for (int y = 1; y< a.size(); y++)
			{
				Actor item = a.get(y);
				j = y-1;
				go = true;
				//goes through with more variables
				
				while((j>=0)&& go)
				{
					try
					{
						if(item.getAverage()>a.get(j).getAverage())
						{//compares and finds the position
							a.set(j+1, a.get(j));
							j--;
							if(j==-1)
							{
								a.set(0, item);
							}
						}
						else{
							go = false;
							a.set(j+1, item);
						}
					}
					catch(RuntimeException e){break;}
				}
				
			}

			for(int b = 0; b<a.size(); b++)
			{
				x.add(a.get(b));
			}
			return x;
			
			
	}
	public static LinkedList<Actor> printTotal(LinkedList<Actor> x)
	{
		ArrayList<Actor> a = new ArrayList<Actor>();
		while(!x.isEmpty())
		{
			a.add(x.getFirst());
			x.removeFirst();
		}
		
		int j;
		Boolean go;
		
			for (int y = 1; y< a.size(); y++)
			{
				Actor item = a.get(y);
				j = y-1;
				go = true;
				//goes through with more variables
				
				while((j>=0)&& go)
				{
					try
					{
						if(item.getTotal()>a.get(j).getTotal())
						{//compares and finds the position
							a.set(j+1, a.get(j));
							j--;
							if(j==-1)
							{
								a.set(0, item);
							}
						}
						else{
							go = false;
							a.set(j+1, item);
						}
					}
					catch(RuntimeException e){break;}
				}
				
			}

			for(int b = 0; b<a.size(); b++)
			{
				x.add(a.get(b));
			}
			return x;
			
			
	}
	public static void save(LinkedList<Actor> x)//prints file
	{
		try{
			FileWriter write = new FileWriter("H:\\actorData2.txt");//////change this
			PrintWriter t = new PrintWriter(write);
			//creaets writers
			
			ListIterator<Actor> b = x.listIterator();//creates Iterator
			
			while(b.hasNext())//while there is still stuff in iterator
			{
				Actor a = b.next();//gets object
				t.print(a.getName() + " ");//prints name out first
				LinkedList<Long> y = a.x;//creates new list of gross
				while(!y.isEmpty())//while the gross array is not empty
				{
					t.print(y.getFirst() + " ");//prints numbers
					y.removeFirst();//removes so no double print
				}
				t.println("\n");//prints line break
			}
			
			write.close();
			t.close();
			//closes printers
			}
	
					
		catch(IOException e){}
	}
	
}
