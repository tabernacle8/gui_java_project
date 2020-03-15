import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
//Carter K...
//Java Tic-Tac-Toe
//Period 6 Java (Anw...)

//This class handles drawing the tic-tac-toe board and winnings
public class GraphicsPannel extends JPanel {

	public void paintComponent(Graphics page) {

		//Check if anybody won and draw it first
		drawWin(page, MainRunner.checkPlayerWin());
		drawWin(page, MainRunner.checkComputerWin());

		page.setColor(Color.BLACK);

		//Draw horizontal bars
		page.drawLine(50, 150, 450, 150);
		page.drawLine(50, 300, 450, 300);

		//Draw vertical bars
		page.drawLine(170, 30, 170, 430);
		page.drawLine(320, 30, 320, 430);

		//Calculate which row / which columb is each space
		for (int i = 0; i < 9; i++) {
			int row = 0;
			int collum = 0;

			if (i == 0 || i == 1 || i == 2) {
				row = 1;
			}
			if (i == 3 || i == 4 || i == 5) {
				row = 2;
			}
			if (i == 6 || i == 7 || i == 8) {
				row = 3;
			}

			if (i == 0 || i == 3 || i == 6) {
				collum = 1;
			}

			if (i == 1 || i == 4 || i == 7) {
				collum = 2;
			}
			if (i == 2 || i == 5 || i == 8) {
				collum = 3;
			}

			//Print X or O depending on if a player or computer owns that spot
			//Yes: Collum and row are backwards, it just works like that
			if (MainRunner.locations.get(i).equals("Player")) {
				drawx(page, collum, row);
			}
			if (MainRunner.locations.get(i).equals("Computer")) {
				drawo(page, collum, row);
			}

		}

		//If the game is still in session, live update the display
		if (MainRunner.gameInSession == true) {
			repaint();
		} else {

			//If somebody won, force disable all buttons
			ButtonPannel.move1.setEnabled(false);
			ButtonPannel.move2.setEnabled(false);
			ButtonPannel.move3.setEnabled(false);
			ButtonPannel.move4.setEnabled(false);
			ButtonPannel.move5.setEnabled(false);
			ButtonPannel.move6.setEnabled(false);
			ButtonPannel.move7.setEnabled(false);
			ButtonPannel.move8.setEnabled(false);
			ButtonPannel.move9.setEnabled(false);
		}

	}

	//Function to draw a little line through who won
	//IMPLEMENTS: check(Player/Computer)Win()
	public void drawWin(Graphics page, String outcome) {

		if (outcome.equals("none") || MainRunner.gameInSession == false) {
			//Do nothing
		} else {
			page.setColor(Color.RED);
			if (outcome.equals("r1")) {
				page.drawLine(50, 100, 450, 100);
			}
			if (outcome.equals("r2")) {
				page.drawLine(50, 240, 450, 240);
			}
			if (outcome.equals("r3")) {
				page.drawLine(50, 380, 450, 380);
			}


			if (outcome.equals("c1")) {
				page.drawLine(100, 50, 100, 400);
			}
			if (outcome.equals("c2")) {
				page.drawLine(240, 50, 240, 400);
			}
			if (outcome.equals("c3")) {
				page.drawLine(380, 50, 380, 400);
			}

			if (outcome.equals("d1")) {
				page.drawLine(80, 80, 400, 380);
			}
			if (outcome.equals("d2")) {
				page.drawLine(400, 80, 80, 380);
			}
			MainRunner.gameInSession = false;
		}
	}

	//Draws an X as a previous method requested
	public void drawx(Graphics page, int row, int collum) {

		row = row - 1;
		collum = collum - 1;

		page.drawLine(60 + (140 * row), 50 + (collum * 140), 160 + (140 * row), 140 + (collum * 140));
		page.drawLine(60 + (140 * row), 140 + (collum * 140), 160 + (140 * row), 50 + (collum * 140));
	}

	//Draws an O as a previous method requested
	public void drawo(Graphics page, int row, int collum) {

		row = row - 1;
		collum = collum - 1;

		page.drawOval(60 + (140 * row), 40 + (collum * 140), 100, 100);
	}

	//Init the pannel and set dimensions
	public GraphicsPannel() {
		setPreferredSize(new Dimension(500, 500));
	}

	//Main Method
	public static void main(String[] args) {

		//Force this file to be in sync with the MainRunner class
		if (MainRunner.running == false) {
			MainRunner.main(args);
		}

		//Init the frame and append it / display it
		JFrame frame = new JFrame("GraphicsPannel");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new GraphicsPannel());
		frame.pack();
		frame.setVisible(true);
	}
}