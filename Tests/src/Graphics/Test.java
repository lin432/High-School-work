package Graphics;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test extends JFrame{

	public Test()
	{
		JPanel one = new JPanel();
		JPanel two = new JPanel();
		JPanel three = new JPanel();
		JPanel four = new JPanel();
		JButton notEmpty = new JButton("asdkaws");
		
		one.setLayout(new BorderLayout());
		four.setLayout(new BorderLayout());
		three.setLayout(new BorderLayout());
		
		
		final int width = 100;
		final int height = 100;
		two.setMinimumSize(new Dimension(width,height));//does nothing even with border layout disabled
		
		one.add(three,BorderLayout.CENTER);//sets center as green
		one.add(notEmpty,BorderLayout.NORTH);//will work//sets button at top
		//one.add(two,BordetLayout.NORTH); will not work as the center will override the size
		three.add(four,BorderLayout.CENTER);//sets center to add four at center making it grey
		
		four.add(two,BorderLayout.WEST);//works as long as there is not center//sets west of grey as blue
		
		four.remove(two);
		
		four.add(two,BorderLayout.WEST);
		
		one.setBackground(Color.red);
		two.setBackground(Color.blue);
		three.setBackground(Color.green);
	
		add(one);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
}
