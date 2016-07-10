package Main;

import java.util.*;

public class playy {
	public static void main(String []args)
	{
		Scanner key = new Scanner(System.in);
		
		
		ArrayList<Integer> marke = new ArrayList<Integer>();
		ListIterator<Integer> i = marke.listIterator();
		
		
		int c =0;
		while(c!=-1)
		{
			if(c != -1)
			{c = key.nextInt();
			
			marke.add(c);
			}	
		}
		
		System.out.println("x");
		
		int x =-1;
		try{
		while(i.hasNext())
		{
			x++;
			System.out.println("z");
			int bet = i.next();
			System.out.println("m");
			System.out.println(bet);
			System.out.println(x);
		}
		System.out.println("y");
		}catch(ConcurrentModificationException e){System.out.println(e);}
		}
	
}
