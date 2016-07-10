package methods;

public class codes {
	
	private	int[][] seats = new int[10][10];
	//array has hardcoded bounds as you can't change the theatre
	
	public codes()
	{
		//empty constructor
	}
	
	public void booking(int x, int y)
	{
		//algorithim to catch if it is out of bounds
		if(x<seats.length && x>=0  &&  y<seats[0].length && y>=0)
		{
			if(seats[x][y] == 1)
			{//checks if it's filled
				String err = "Seat is filled";
			
				UnsupportedOperationException error = new UnsupportedOperationException(err);
				//throws error
				throw error;
			}
			else
			{//books seat
				seats[x][y] = 1;
			}
		}
		else
		{
			String err = "Out of Bounds";
			
			ArrayIndexOutOfBoundsException error = new ArrayIndexOutOfBoundsException(err);
			//thorws out of bound error
			throw error;
		}
	}
	
	public int size_row()
	{//a method to return the size of the array
		return seats.length;
	}
	public int size_col()
	{
		int hold=0;
		for(int count = 0; count<seats.length; count++)
		{//checks the greatest col size
			if(hold<seats[count].length)
			{
				hold = seats[count].length;
			}
		}
		//returns greatest col size
		return hold;
	}
	
	public int print(int x, int y)
	{//prints the occupation of the seat
		return seats[x][y];
	}

}

