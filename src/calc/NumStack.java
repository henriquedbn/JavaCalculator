package src.calc;

import java.util.EmptyStackException;
import java.util.Stack;

public class NumStack{
    private Stack<Double> calculation = new Stack<>();

    public void addToCurrent(double buttonPressed){
        double currentNumber = calculation.isEmpty() ? 0 : calculation.pop();
        calculation.push(currentNumber*10+buttonPressed);
    }

    public double getCurrentNumber(){
        return calculation.isEmpty() ? 0: calculation.peek();
    }

    public void setCurrentNumber(double number){
        calculation.push(number);
    }

    public void push(double number){
        calculation.push(number);
    }

    public boolean isEmpty(){
        return calculation.isEmpty();
    }

    public double pop(){
        if (calculation.isEmpty()) {
            throw new EmptyStackException();
        }
        return calculation.pop();
    }

}
