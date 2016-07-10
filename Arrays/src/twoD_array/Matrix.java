package twoD_array;

import code.Matrix_mult;

public class Matrix {
	
	public static void main(String[] args)
	{

		int x[][] = {{1,2,-2,0},{-3,4,7,2},{9,0,3,1}};
		int y[][] = {{-1,3},{0,9},{1,-11},{4,-5}};
		
		int z[][] = Matrix_mult.mult(x,y);
		
		
		for(int row = 0; row<z.length; row++)
		{for(int col = 0; col < z[row].length; col++)
		{
			System.out.print(z[row][col] + "\t");
		}
		System.out.println();
		}
	}

}
/*
-3	43	
18	-60	
-2	-11	
*/