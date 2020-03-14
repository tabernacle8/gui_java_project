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
import java.awt.*;
import java.applet.Applet;

public class ButtonPannel extends JPanel {

    public static void main(String[] args) {
        if(MainRunner.running==false){
			System.out.println("ERROR!!!\n\nPlease run the MainRunner file! ");
			System.exit(0);
		}
        final JFrame frame = new JFrame();

       
        JButton move1 = new JButton("Space 1");
        move1.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                   MainRunner.locations.set(0,"Player");
                   MainRunner.computerTurn();
                }
            });
            JButton move2 = new JButton("Space 2");
            move2.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        MainRunner.locations.set(1,"Player");
                        MainRunner.computerTurn();
                    }
                });
                JButton move3 = new JButton("Space 3");
                move3.addActionListener(
                    new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            MainRunner.locations.set(2,"Player");
                            MainRunner.computerTurn();
                        }
                    });
                    JButton move4 = new JButton("Space 4");
                    move4.addActionListener(
                        new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                MainRunner.locations.set(3,"Player");
                                MainRunner.computerTurn();
                            }
                        });
                        JButton move5 = new JButton("Space 5");
                        move5.addActionListener(
                            new ActionListener() {
                                public void actionPerformed(ActionEvent e) {
                                    MainRunner.locations.set(4,"Player");
                                    MainRunner.computerTurn();
                                }
                            });
                            JButton move6 = new JButton("Space 6");
                            move6.addActionListener(
                                new ActionListener() {
                                    public void actionPerformed(ActionEvent e) {
                                        MainRunner.locations.set(5,"Player");
                                        MainRunner.computerTurn();
                                    }
                                });
                                JButton move7 = new JButton("Space 7");
                                move7.addActionListener(
                                    new ActionListener() {
                                        public void actionPerformed(ActionEvent e) {
                                            MainRunner.locations.set(6,"Player");
                                            MainRunner.computerTurn();
                                        }
                                    });
                                    JButton move8 = new JButton("Space 8");
                                    move8.addActionListener(
                                        new ActionListener() {
                                            public void actionPerformed(ActionEvent e) {
                                                MainRunner.locations.set(7,"Player");
                                                MainRunner.computerTurn();
                                            }
                                        });
                                        JButton move9 = new JButton("Space 9");
                                        move9.addActionListener(
                                            new ActionListener() {
                                                public void actionPerformed(ActionEvent e) {
                                                    MainRunner.locations.set(8,"Player");
                                                    MainRunner.computerTurn();
                                                }
                                            });



        // Add buttons to a panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(move1);
        buttonPanel.add(move2);
        buttonPanel.add(move3);
        buttonPanel.add(move4);
        buttonPanel.add(move5);
        buttonPanel.add(move6);
        buttonPanel.add(move7);
        buttonPanel.add(move8);
        buttonPanel.add(move9);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 100);
        //frame.setBounds(0, 0, 1000, 10);
        frame.getContentPane().add(buttonPanel, BorderLayout.SOUTH);
        frame.setVisible(true);
    }
}
