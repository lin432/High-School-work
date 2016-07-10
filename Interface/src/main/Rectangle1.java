package main;

import java.awt.Rectangle;

public class Rectangle1 implements Translate {

	private Rectangle box;
	private long prev;
	//rectangle and old time is recodred
	
	public Rectangle1(int sizex, int sizey, long time)
	{//constructor that makes rectangle and gets time and saves them
		Rectangle hold = new Rectangle(sizex,sizey);
		box = hold;
		prev = time;
	}

	public int getX() {
		// returns x var
		return box.x;
	}

	public int getY() {
		// returns y var
		return box.y;
	}
	
	public void translater(long time) 
	{	//the difference is found by the current time	
		int difference = (int) ((time-prev)/1000);
		//saves difference
		box.x = difference;
	}

}
