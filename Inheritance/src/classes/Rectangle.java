package classes;

public class Rectangle {

	public int sizex;
	public int sizey;
	public int x;
	public int y;
	//all the variables
	
	public Rectangle(){}

	public void setSize(int x, int y)
	{
		sizex = x;
		sizey = y;
	}
	
	public void setLocation(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	//^^methods to set location and size
	
	public String toString()
	{
		if(sizex < 3 || sizey <3)
				{
				String s = "error size to small to print";
				RuntimeException x = new RuntimeException(s);
				throw x;
				}
		//hard to print a 2x2 square with string
		else
		{
		
			String hold = "";
			//null string starter
		
			for(int col = 0; col <sizey; col++)
			{//for loop to count columns
			
				if(col==0 || col ==sizey-1)
				{//checks if it's first or last
					for(int row = 0; row < sizex; row++)
					{
						hold = hold + "--";
					}	//adds bottom or top border, it's 2 as two - are closer to the height of|
				}
				else
				{//if it isn't the top or middle rows
					for(int row =0; row < sizex; row++)
					{//goes through if it is first or last columns 
						if(row == 0 || row == sizex-1)
						{//checks to set the proper border
							if(row == 0)
							{hold = hold + "| ";}
							else
							{hold = hold + " |";}
						}
						else
						{//else it's empty (two spaces once again)
							hold = hold + "  ";
						}
					}
				}//creates a new line
				hold = hold +"\n";
			}
		
			return hold;
		}
	}
	
	
	
	
	
}
