package twoD_array;

import java.util.Scanner;
import code.checkerboard;

public class Checkerboard {
	public static void main(String[] args)
	{
		Scanner Key = new Scanner(System.in);
		//guide user
		System.out.println("Please enter the size of the board");
		int x = Key.nextInt();
		//decide board size
		checkerboard board = new checkerboard(x);
		//construct methods
		
		int[][] holder = new int[x][x];
		//saves positions
		
		//for loop to find row and column
		for(int row = 0; row < x; row++)
		{
			for(int col = 0; col < x; col++)
			{
				//make board
				holder[row][col] = board.colour(row, col);
				
				if(holder[row][col] == 1)
				{//populate
					holder[row][col] = board.piece(row);
				}
				//print
				System.out.print( holder[row][col] + "\t");  
			}
			System.out.println("");
		}
		
		//variables for the while loop and check
		int y = 0;
		boolean check = true;
		
		while( y != -1)
		{
			y++;
			//adds number
			
			System.out.println("Please enter any key except n");
			System.out.println("to check for possible moves");
			System.out.println("enter n to quit");
			//guide
			
			if(Key.next().equalsIgnoreCase("n"))
			{break;}
			//ends loop
			
			else
			{
				System.out.println("Please enter the row you desire to move to");
				int row = Key.nextInt() -1;
				//row number
				
				System.out.println("Please enter the column you desire to move to");
				int col = Key.nextInt() -1;
				//column number
				
				check = board.check(holder, row, col);
				//method to check
				
				if(check == true)
				{System.out.println("that move is valid");}
				else
				{System.out.println("that move is invalid");}
				//print legality
				
			}
			
		}
	}
}
/* test


Please enter the size of the board
8
0	2	0	2	0	2	0	2	
2	0	2	0	2	0	2	0	
0	2	0	2	0	2	0	2	
1	0	1	0	1	0	1	0	
0	1	0	1	0	1	0	1	
3	0	3	0	3	0	3	0	
0	3	0	3	0	3	0	3	
3	0	3	0	3	0	3	0	
Please enter any keys except n
to check for possible moves
enter n to quit

g
Please enter the row you desire to move to
2
Please enter the column you desire to move to
1
that move is invalid
Please enter any keys except n
to check for possible moves
enter n to quit
h
Please enter the row you desire to move to
4
Please enter the column you desire to move to
1
that move is valid
Please enter any keys except n
to check for possible moves
enter n to quit
h
Please enter the row you desire to move to
0
Please enter the column you desire to move to
0
that move is invalid
Please enter any keys except n
to check for possible moves
enter n to quit
h
Please enter the row you desire to move to
1
Please enter the column you desire to move to
1
that move is invalid
Please enter any keys except n
to check for possible moves
enter n to quit
*/
