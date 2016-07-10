package examples;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.*;


public class ShapeViewer {

	public static void main(String[] args) {

		JPanel b = new JPanel();
		b.setLayout(new BorderLayout());
		
		
		
		JFrame frame = new JFrame();
		final int FRAME_WIDTH = 300;
		final int FRAME_HEIGHT = 400;
		
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setTitle("Rectangle box print");
		frame.setLayout(new BorderLayout());
		
		b.setSize(300,400);

		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JComponent component = new Shape(0,300,400,0);
		component.setBackground(Color.blue);
		
		JComponent component2 = new Shape(20,20,200,200);
		
		b.setBackground(Color.red);
		b.add(component,BorderLayout.CENTER);
		
		frame.add(b,BorderLayout.CENTER);
		
		frame.setVisible(true);
		
		b.add(component2,BorderLayout.CENTER);
		
		//frame.add(new JPanel(),BorderLayout.EAST);
		
		frame.setVisible(true);
	}

}
