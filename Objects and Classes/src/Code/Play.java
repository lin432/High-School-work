package Code;

import java.awt.Rectangle;

public class Play 
{
	public static void main(String[] args)
	{
		Circle cir = new Circle(5);
		
		Rectangle box = new Rectangle(20, 35, 20, 30);
		
		box.translate(15,25);
		
		System.out.println(box.getX());
		System.out.println(box.getY());
	}
}
