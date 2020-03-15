import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
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

    protected static JButton move1 = new JButton("Space 1");
    protected static JButton move2 = new JButton("Space 2");
    protected static JButton move3 = new JButton("Space 3");
    protected static JButton move4 = new JButton("Space 4");
    protected static JButton move5 = new JButton("Space 5");
    protected static JButton move6 = new JButton("Space 6");
    protected static JButton move7 = new JButton("Space 7");
    protected static JButton move8 = new JButton("Space 8");
    protected static JButton move9 = new JButton("Space 9");


    public static void main(String[] args) {
        if (MainRunner.running == false) {
            MainRunner.main(args);
        }
        final JFrame frame = new JFrame();


        //JButton move1 = new JButton("Space 1");
        move1.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (MainRunner.locations.get(0).equals("none")) {
                        MainRunner.locations.set(0, "Player");
                        MainRunner.spacesleft--;
                        MainRunner.computerTurn();
                        move1.setEnabled(false);
                    }
                }
            });
        //JButton move2 = new JButton("Space 2");
        move2.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (MainRunner.locations.get(1).equals("none")) {
                        MainRunner.locations.set(1, "Player");
                        MainRunner.spacesleft--;
                        MainRunner.computerTurn();
                        move2.setEnabled(false);
                    }
                }
            });
        //JButton move3 = new JButton("Space 3");
        move3.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (MainRunner.locations.get(2).equals("none")) {
                        MainRunner.locations.set(2, "Player");
                        MainRunner.spacesleft--;
                        MainRunner.computerTurn();
                        move3.setEnabled(false);
                    }
                }
            });
        //JButton move4 = new JButton("Space 4");
        move4.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (MainRunner.locations.get(3).equals("none")) {
                        MainRunner.locations.set(3, "Player");
                        MainRunner.spacesleft--;
                        MainRunner.computerTurn();
                        move4.setEnabled(false);
                    }
                }
            });
        //JButton move5 = new JButton("Space 5");
        move5.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (MainRunner.locations.get(4).equals("none")) {
                        MainRunner.locations.set(4, "Player");
                        MainRunner.spacesleft--;
                        MainRunner.computerTurn();
                        move5.setEnabled(false);
                    }
                }
            });
        //JButton move6 = new JButton("Space 6");
        move6.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (MainRunner.locations.get(5).equals("none")) {
                        MainRunner.locations.set(5, "Player");
                        MainRunner.spacesleft--;
                        MainRunner.computerTurn();
                        move6.setEnabled(false);
                    }
                }
            });
        // JButton move7 = new JButton("Space 7");
        move7.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (MainRunner.locations.get(6).equals("none")) {
                        MainRunner.locations.set(6, "Player");
                        MainRunner.spacesleft--;
                        MainRunner.computerTurn();
                        move7.setEnabled(false);
                    }
                }
            });
        // JButton move8 = new JButton("Space 8");
        move8.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (MainRunner.locations.get(7).equals("none")) {
                        MainRunner.locations.set(7, "Player");
                        MainRunner.spacesleft--;
                        MainRunner.computerTurn();
                        move8.setEnabled(false);
                    }
                }
            });
        //JButton move9 = new JButton("Space 9");
        move9.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (MainRunner.locations.get(8).equals("none")) {
                        MainRunner.locations.set(8, "Player");
                        MainRunner.spacesleft--;
                        MainRunner.computerTurn();
                        move9.setEnabled(false);

                    }
                }
            });





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

    public static void disable(int number) {
        if (number == 1) {
            move1.setEnabled(false);
        }
        if (number == 2) {
            move2.setEnabled(false);
        }
        if (number == 3) {
            move3.setEnabled(false);
        }
        if (number == 4) {
            move4.setEnabled(false);
        }
        if (number == 5) {
            move5.setEnabled(false);
        }
        if (number == 6) {
            move6.setEnabled(false);
        }
        if (number == 7) {
            move7.setEnabled(false);
        }
        if (number == 8) {
            move8.setEnabled(false);
        }
        if (number == 9) {
            move9.setEnabled(false);
        }
    }
}