package src.calc;

import java.util.EmptyStackException;
import java.util.Stack;

public class NumStack{
    private Stack<Long> calculation = new Stack<>();

    public void addToCurrent(int buttonPressed){
        long currentNumber = calculation.isEmpty() ? 0 : calculation.pop();
        calculation.push(currentNumber*10+buttonPressed);
    }

    public long getCurrentNumber(){
        return calculation.isEmpty() ? 0: calculation.peek();
    }

    public void setCurrentNumber(long number){
        calculation.push(number);
    }

    public void push(long number){
        calculation.push(number);
    }

    public boolean isEmpty(){
        return calculation.isEmpty();
    }

    public long pop(){
        if (calculation.isEmpty()) {
            throw new EmptyStackException();
        }
        return calculation.pop();
    }

}
