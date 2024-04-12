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
    private JButton num4;
    private JButton num5;
    private JButton num6;
    private JButton num7;
    private JButton num8;
    private JButton num9;
    private JButton num0;
    private JButton minusButton;
    private JButton multButton;
    private JButton divButton;
    private JButton expButton;
    private JButton sqrtButton;
    private JButton logButton;
    private JButton prcButton;
    private JButton numPi;

    public App() {
        NumStack numberStack = new NumStack();
        Operations operationStack = new Operations();
        resultButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double result = operationStack.resolve(numberStack);
                numberStack.setCurrentNumber(result);
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
        num4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberStack.addToCurrent(4);
                screenField.setText(String.valueOf(numberStack.getCurrentNumber()));
            }
        });
        num5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberStack.addToCurrent(5);
                screenField.setText(String.valueOf(numberStack.getCurrentNumber()));
            }
        });
        num6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberStack.addToCurrent(6);
                screenField.setText(String.valueOf(numberStack.getCurrentNumber()));
            }
        });
        num7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberStack.addToCurrent(7);
                screenField.setText(String.valueOf(numberStack.getCurrentNumber()));
            }
        });
        num8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberStack.addToCurrent(8);
                screenField.setText(String.valueOf(numberStack.getCurrentNumber()));
            }
        });
        num9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberStack.addToCurrent(9);
                screenField.setText(String.valueOf(numberStack.getCurrentNumber()));
            }
        });
        num0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberStack.addToCurrent(0);
                screenField.setText(String.valueOf(numberStack.getCurrentNumber()));
            }
        });

        numPi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberStack.addToCurrent(Math.PI);
                screenField.setText(String.valueOf(numberStack.getCurrentNumber()));
            }
        });

        plusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operationStack.operation(Operations.OperationType.ADDITION);
                numberStack.push(0);
                screenField.setText(String.valueOf(numberStack.getCurrentNumber()));
            }
        });
        minusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operationStack.operation(Operations.OperationType.SUBTRACTION);
                numberStack.push(0);
                screenField.setText(String.valueOf(numberStack.getCurrentNumber()));
            }
        });
        multButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operationStack.operation(Operations.OperationType.MULTIPLICATION);
                numberStack.push(0);
                screenField.setText(String.valueOf(numberStack.getCurrentNumber()));
            }
        });


        divButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operationStack.operation(Operations.OperationType.DIVISION);
                numberStack.push(0);
                screenField.setText(String.valueOf(numberStack.getCurrentNumber()));
            }
        });
        expButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operationStack.operation(Operations.OperationType.EXPONENTIATION);
                numberStack.push(0);
                screenField.setText(String.valueOf(numberStack.getCurrentNumber()));
            }
        });
        sqrtButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operationStack.operation(Operations.OperationType.SQUAREROOT);
                screenField.setText(String.valueOf(numberStack.getCurrentNumber()));
            }
        });


        logButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operationStack.operation(Operations.OperationType.LOG10);
                screenField.setText(String.valueOf(numberStack.getCurrentNumber()));
            }
        });


        prcButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operationStack.operation(Operations.OperationType.PERCENTILE);
                numberStack.push(0);
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
