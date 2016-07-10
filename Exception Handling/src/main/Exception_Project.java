
package main;

import java.util.*;

import methods.codes;

public class Exception_Project {
	
	public static void main(String []args)
	{
		String next;
		codes seating = new codes();
		Scanner key = new Scanner(System.in);
		int x, y;
		int row_size = seating.size_row();
		int col_size = seating.size_col();
		//initialize variables and objects
		//I made a row_size and col_size just in case I want to change the array size
		
		System.out.println("Commands");
		System.out.println("-Book to book a spot");
		System.out.println("-Print to print the current seating plan");
		System.out.println("-Exit to quit the program");
		//Guide users
		
		do
		{			
			System.out.println("Please enter the command you wish to use");
			//guide
			
			next = key.next();
			//get the next command
			
			
			//Start of if tree going from booking->print
			if(next.equalsIgnoreCase("book"))
			{
				System.out.println("please enter the seat to be booked Ex(1 1 )");
				x = key.nextInt()-1;
				y = key.nextInt()-1;
				//gets the x,y coordinate
				
				try
				{//checks if the code will throw an error up
					seating.booking(x, y);
				}
				catch(ArrayIndexOutOfBoundsException e)
				{//catches an Index out of bound
					System.out.println("There was an error " + e);
				}
				catch(UnsupportedOperationException e)
				{//catches a booked seat
					System.out.println(e);
				}
			}
			
			
			else
			{	
				if(next.equalsIgnoreCase("print"))
				{
					//uses the row_size and col_size navigate and print the array
					for(int row = 0; row<row_size; row++)
					{
						for(int col = 0; col<col_size; col++)
						{
							System.out.print(seating.print(row,col) + "\t");
						}
						
						
						System.out.println("");
					}
				}
			}
			
			//while loop to continue the loop
		}while(!next.equalsIgnoreCase("exit"));
	}

}

/*
Commands
-Book to book a spot
-Print to print the current seating plan
-Exit to quit the program
Please enter the command you wish to use
books
Please enter the command you wish to use
book
please enter the seat to be booked Ex(1 1 )
1 1
Please enter the command you wish to use
book 1 2
please enter the seat to be booked Ex(1 1 )
Please enter the command you wish to use
book 0 0
please enter the seat to be booked Ex(1 1 )
There was an error java.lang.ArrayIndexOutOfBoundsException: Out of Bounds
Please enter the command you wish to use
book 1 1
please enter the seat to be booked Ex(1 1 )
java.lang.UnsupportedOperationException: Seat is filled
Please enter the command you wish to use
print
1	1	0	0	0	0	0	0	0	0	
0	0	0	0	0	0	0	0	0	0	
0	0	0	0	0	0	0	0	0	0	
0	0	0	0	0	0	0	0	0	0	
0	0	0	0	0	0	0	0	0	0	
0	0	0	0	0	0	0	0	0	0	
0	0	0	0	0	0	0	0	0	0	
0	0	0	0	0	0	0	0	0	0	
0	0	0	0	0	0	0	0	0	0	
0	0	0	0	0	0	0	0	0	0	
Please enter the command you wish to use
exit
*/