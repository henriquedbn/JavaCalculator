package src.calc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private JButton resultButton;
    private JPanel panelMain;
    private JLabel screenField;
    private JButton plusButton;
    private JButton num3;
    private JButton num2;
    private JButton num1;

    public App() {
        NumStack numberStack = new NumStack();
        Operations operationStack = new Operations();
        resultButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                long result = operationStack.resolve(numberStack);
                numberStack.addToCurrent((int) result);
                screenField.setText(String.valueOf(numberStack.getCurrentNumber()));
            }
        });
        num1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberStack.addToCurrent(1);
                screenField.setText(String.valueOf(numberStack.getCurrentNumber()));
            }
        });
        num2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberStack.addToCurrent(2);
                screenField.setText(String.valueOf(numberStack.getCurrentNumber()));
            }
        });
        num3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberStack.addToCurrent(3);
                screenField.setText(String.valueOf(numberStack.getCurrentNumber()));
            }
        });
        plusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operationStack.operation(Operations.OperationType.ADDITION);
                numberStack.push(0L);
                screenField.setText(String.valueOf(numberStack.getCurrentNumber()));
            }
        });
    }

    public static void main(String[] args) {
        JFrame window = new JFrame("App");
        window.setContentPane(new App().panelMain);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.pack();
        window.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
