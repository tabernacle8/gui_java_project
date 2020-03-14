import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.util.Random;
import javax.swing.JPanel;
import java.awt.*;

/**
 * Draws a snowman to demonstrate drawing methods and use of color.
 * @author Java Foundations, converted to GUI by mvail
 */
public class GraphicsPannel extends JPanel
{

   	/**
   	 * @param page object on which drawing takes place
   	 */
   	public void paintComponent (Graphics page)
	{
      	final int WIDTH = 500;
		  final int HEIGHT = 500;
		  
		  page.setColor(Color.BLACK);

		  //Draw horizontal bars
			page.drawLine(50, 150, 450, 150);
			page.drawLine(50, 300, 450, 300);

		//Draw vertical bars
		page.drawLine(170, 30, 170, 430);
		page.drawLine(320, 30, 320, 430);

		

   	}
   	
	
	/**
	 * Constructor (panel initialization)
	 */
	public GraphicsPannel()
	{
		setPreferredSize(new Dimension(500, 500));
	}
	
	
	/**
	 * Starting point for Snowman application.
	 * @param args unused
	 */
	public static void main (String[] args)
	{
		JFrame frame = new JFrame ("GraphicsPannel");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new GraphicsPannel());
		frame.pack();
		frame.setVisible(true);
	}
}