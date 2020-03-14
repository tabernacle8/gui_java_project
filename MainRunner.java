import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MainRunner {
    public static void main(String[] args) {
        final JFrame frame = new JFrame();

        // Create OK button
        JButton btnOK = new JButton("OK");
        // Add event handler for OK button
        btnOK.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(frame,
                        "You've clicked OK button"
                    );
                }
            });

        // Create Cancel button
        JButton btnCancel = new JButton("Cancel");
        btnCancel.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(frame,
                        "You've clicked Cancel button"
                    );
                }
            });



        // Add buttons to a panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(btnOK);
        buttonPanel.add(btnCancel);


        //Image adding
        JLabel image1 = new JLabel(new ImageIcon(new ImageIcon("X.png").getImage().getScaledInstance(20, 20, 500)), JLabel.TRAILING);
        frame.add(image1);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.getContentPane().add(buttonPanel, BorderLayout.SOUTH);
        frame.setVisible(true);
    }
}
