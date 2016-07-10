package classes;

public class Square extends Rectangle {

	public Square(int x, int y, int size)
	{
		super();
		
		super.setLocation(x, y);
		super.setSize(size, size);
		//constructor of square and sets location and size of the rectangle class as well
	}
	
	public int getArea()
	{//gets the area
		int hold;
		hold = sizex*sizey;
		
		return hold;
	}
	
}
