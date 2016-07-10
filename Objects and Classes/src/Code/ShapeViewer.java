import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JFrame;
import javax.swing.JComponent;
import javax.swing.*;

public class ShapeViewer {

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		final int FRAME_WIDTH = 300;
		final int FRAME_HEIGHT = 400;
			
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setTitle("Rectangle box print");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		Shape component = new Shape();
		frame.add(component);
		frame.setVisible(true);
	}

}
