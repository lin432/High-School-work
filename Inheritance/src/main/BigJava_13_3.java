package main;

import classes.Square;
import java.util.*;

public class BigJava_13_3 {
	
	public static void main(String[]args)
	{
		Scanner key = new Scanner(System.in);
		
		System.out.println("What is the x coordinate for the center of your square?");
		int x = key.nextInt();
		
		System.out.println("What is the y coordinate for the center of your square?");
		int y = key.nextInt();
		
		System.out.println(" what is the side length of your square?");
		int size = key.nextInt();
		//^^Guide^^
		
		Square s = new Square(x,y,size);
		//creates square
		
		//catches a small square
		try
		{
		System.out.println(s.toString());
		}
		catch(RuntimeException v)
		{
			System.out.println(v);
		}
		
		//prints square using rectangle method and prints the area
		System.out.println("The area of this square is " + s.getArea());
	}

}
/*
What is the x coordinate for the center of your square?
0 0 10
What is the y coordinate for the center of your square?
 what is the side length of your square?
--------------------
|                  |
|                  |
|                  |
|                  |
|                  |
|                  |
|                  |
|                  |
--------------------

The area of this square is 100
*/