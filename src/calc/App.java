package src.calc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private JButton resultButton;
    private JPanel panelMain;
    private JTextPane textPane1;

    public App() {
        resultButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Result will be displayed here");
            }
        });
    }

    public static void main(String[] args) {
        JFrame window = new JFrame("App");
        window.setContentPane(new App().panelMain);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.pack();
        window.setVisible(true);
        window.setVisible(true);
    }
}
