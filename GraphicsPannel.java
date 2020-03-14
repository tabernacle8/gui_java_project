
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
      	final int MID = 150+20;
      	final int TOP = 50;
      	
      	page.setColor(Color.CYAN);
      	page.fillRect(0, 0, getWidth(), getHeight());
      	
      	Color groundColor = new Color(127, 0, 64);

    	page.setColor (groundColor);
      	page.fillRect (0, 175, 300, 50);  // ground

      	page.setColor (Color.yellow);
      	page.fillOval (255,-40, 80, 80); // sun 

      	page.setColor (Color.white);
      	page.fillOval (MID - 20, TOP, 40, 40);      // head
      	page.fillOval (MID - 35, TOP + 35, 70, 50); // upper torso
      	page.fillOval (MID - 50, TOP + 80, 100, 60);  // lower torso
      	
      	//Buttons
      	page.setColor (Color.black);
      	page.fillOval(MID - 5, TOP + 40, 10, 10);
      	page.fillOval(MID - 5, TOP + 60, 10, 10);

      	page.setColor (Color.black);
      	page.fillOval (MID - 10, TOP + 10, 5, 5);   // left eye
      	page.fillOval (MID + 5, TOP + 10, 5, 5);    // right eye

      	page.drawArc (MID - 10, TOP + 20, 20, 10, 5, 180);   // smile (Now frown)

      	page.drawLine (MID - 25, TOP + 60, MID - 50, TOP + 40);  // left arm
      	page.drawLine (MID + 25, TOP + 60, MID + 55, TOP + 60);  // right arm

      	page.drawLine (MID - 20, TOP + 5, MID + 20, TOP + 5);  // brim of hat
      	page.fillRect (MID - 15, TOP - 20, 30, 25);        // top of hat
      	
      	//My Additions
      	//Makes Snow
      	
      	int snows = 0;
      	Random rand = new Random();
      	page.setColor (Color.white);
      	while(snows<=100){
      		int x_set = rand.nextInt(300);
      		int y_set = rand.nextInt(300);
      		page.fillOval(x_set,y_set,3,3);
      		snows++;
      	}
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