package code;

public class checkerboard {

	public int row_col_size;
	public int row_gap;
	//public variables
	
	public checkerboard(int x)
	{//constructor
		
		row_col_size=x;
		row_gap = (x-2)/2;
		//set variables
	}
	
	public int colour(int x, int y)
	{	//x, is the row the loop is on and y is the column it's on
		
		int num;
		
		if((x+y)%2==0)
		{num = 0;}
		// if to set the black squares
		
		else
		{num = 1;}
		//else is white
		
		return num;
	}
	
	public int piece(int x)
	{
		int num = 1;
		
		if(row_col_size - x > row_col_size - row_gap)
		{//logic to check position
			num = 2;
		}
		if(x-row_col_size >= -row_gap )
		{//logic
			num = 3;
		}
		
		return num;
	}
	
	public boolean check(int z[][], int x,int y)
	{
		//checks for row invalidation
		if(x > row_col_size || x < 0)
		{return false;}
		
		else
		{
			//checks for column invalidation
			if(y > row_col_size || y < 0)
			{return false;}
			
			else
			{
				//checks for if its blank blank spot
				if(z[x][y] == 0 || z[x][y] == 2 || z[x][y] == 3)
				{return false;}
				
				else
				{return true;}
			}
		}
	}

}
