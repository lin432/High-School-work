package code;

public class Matrix_mult {
	
	public static int[][] mult(int a[][],int b[][])
	{
		//set max columns in final and is a setter of max size 

		
		int x[][] = new int[a.length][b[0].length];
		//creates array
		
		
		for(int row = 0; row < a.length; row++)
		{
			for(int col = 0; col< b[0].length; col++)
			{
				//start of 2d array loop
				
				int test = 0;
				//creates a variable of the int
				
			
					for(int matrix = 0; matrix < b.length; matrix++)
						{//adds the different  multiplications to variable
						
						test = test + a[row][matrix]*b[matrix][col];
						}
				
				
				
				x[row][col] = test;
				//assigns variable to spot in array
			}
		}
		
		return x;
	}

}
