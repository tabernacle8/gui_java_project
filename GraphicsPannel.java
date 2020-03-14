import java.awt.BorderLayout;
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
      	final int MID = 500;
      	final int TOP = 500;
   	}
   	
	
	/**
	 * Constructor (panel initialization)
	 */
	public GraphicsPannel()
	{
		setPreferredSize(new Dimension(300, 200));
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