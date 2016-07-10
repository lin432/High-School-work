package main;

import java.awt.Rectangle;
import java.util.*;
import java.awt.Rectangle;

public class Rectangle2 implements Translate {
	//see rectangle 1
	Rectangle box;
	long prev;
	
	public Rectangle2(int sizex, int sizey, long time)
	{
		Rectangle hold = new Rectangle(sizex,sizey);
		box = hold;
		prev = time;
	}

	public void translater(long time)
	{//This is Rectangle 2's translater the other code is identical
		int difference = (int) ((time - prev)/500);
		//got it to move twice as much by dividing the milliseconds by half of 1000
		box.translate(difference, 0);
		//saves x var
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return box.x;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return box.y;
	}

}
