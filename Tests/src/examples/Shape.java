package examples;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Random;

import javax.swing.*;

/* 
 * A component that draws two rectangles
 */

public class Shape extends JComponent{

	public Shape(int x, int y, int x2, int y2){this.x = x; this.y = y; this.x2 = x2; this.y2 = y2;}
	
	private int x,y,x2,y2;
	
	
	public void paintComponent(Graphics g){

		//Recover Graphics2D
		Graphics2D g2 = (Graphics2D) g;
		
		g2.drawLine(x, y, x2, y2);
		
	}

}

