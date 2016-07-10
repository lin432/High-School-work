package main;

import classes.*;

public class BigJava_13_4 {
	
	public static void main(String[]args)
	{
		Student max = new Student(1990,"Max");
		Instructor phil = new Instructor(1870, "Phil");
		
		int x = 6;
		
		x= x/4;
		
		max.set_major("English");
		phil.set_salary(30000);
		
		System.out.println(x);
		System.out.println(phil.toString());
		
	}

}
