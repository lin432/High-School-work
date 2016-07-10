package main;

import java.io.*;
import java.util.*;
import classes.LinearFunction;

public class Tester {
	public static void main(String[]args)
	{//copied from BPJ with exception of scanner created and called key
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("what is the slope of your line?");
		double slope = key.nextDouble();
		
		System.out.println("what is the Y-intercept of your line?");
		double yintc = key.nextDouble();
		
		LinearFunction line = new LinearFunction(slope,yintc);
		
		
		System.out.println("\nSlope of this line is: " + line.getSlope());
		
		System.out.println("Y-intercept of this line is: " + line.getYintercept());
		
		System.out.println("Root of this line is: " + line.getRoot());
		
		System.out.print("\nWhat is an x value for which you wish to solve for y");
		double x = key.nextDouble();
		double yValue = line.getYvalue(x);
		System.out.println("The y value corresponding to x=" + x + " is " + yValue);
		
		System.out.print("\n what is a y value for which you wish to solve for x?");
		double y = key.nextDouble();
		double xValue = line.getXvalue(y);
		System.out.println("The x value corresponding to y= " + y + " is " + xValue);
	}
}

/*
what is the slope of your line?
-3
what is the Y-intercept of your line?
2.5

Slope of this line is: -3.0
Y-intercept of this line is: 2.5
Root of this line is: 0.8333333333333334

What is an x value for which you wish to solve for y-4.61
The y value corresponding to x=-4.61 is 16.330000000000002

 what is a y value for which you wish to solve for x?5.0
The x value corresponding to y= 5.0 is -0.8333333333333334
*/