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

		  //System.out.println(MainRunner.location1);
		  
		  page.setColor(Color.BLACK);

		  //Draw horizontal bars
			page.drawLine(50, 150, 450, 150);
			page.drawLine(50, 300, 450, 300);

		//Draw vertical bars
		page.drawLine(170, 30, 170, 430);
		page.drawLine(320, 30, 320, 430);

		for(int i=0;i<9;i++){
			int row = 0;
			int collum = 0;

			if(i==0 || i==1 || i==2){
				row= 1;
			}
			if(i==3 || i==4 || i==5){
				row= 2;
			}
			if(i==6 || i==7 || i==8){
				row= 3;
			}

			if(i==0 || i==3 ||i==6){
				collum=1;
			}

			if(i==1 || i==4 || i==7){
				collum=2;
			}
			if(i==2 || i==5 || i==8){
				collum=3;
			}

			System.out.println(MainRunner.locations);
			if(MainRunner.locations.get(i).equals("Player")){
				drawx(page,collum,row);
			}
			if(MainRunner.locations.get(i).equals("Computer")){
				drawo(page,collum,row);
			}

		}
		repaint();

	   }
	   
	   public void drawx(Graphics page, int row,int collum){

		row = row -1;
		collum = collum-1;

			page.drawLine(60+(140*row),50+(collum*140),160+(140*row),140+(collum*140));
			page.drawLine(60+(140*row),140+(collum*140),160+(140*row),50+(collum*140));
	   }

	   public void drawo(Graphics page, int row,int collum){
		
		row = row -1;
		collum = collum-1;

				page.drawOval(60+(140*row), 40+(collum*140), 100, 100);
	   }
   	
	
	/**
	 * Constructor (panel initialization)
	 */
	public GraphicsPannel()
	{
		setPreferredSize(new Dimension(500, 500));
	}
	
	
	/*
	 * @param args unused
	 */
	public static void main (String[] args)
	{

		if(MainRunner.running==false){
			MainRunner.main(args);
		}
		JFrame frame = new JFrame ("GraphicsPannel");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new GraphicsPannel());
		frame.pack();
		frame.setVisible(true);
	}
}