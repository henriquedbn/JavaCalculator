package src.calc;

import java.util.Stack;


public class Operations {

    public enum OperationType {
        ADDITION,
        SUBTRACTION,
        MULTIPLICATION,
        DIVISION
    }
    private Stack<OperationType> operations = new Stack<>();

    public void operation(OperationType type) {
        operations.push(type);
    }

    public long resolve(NumStack numbers){
        long result= 0;
        while(!numbers.isEmpty() && !operations.isEmpty()){
            OperationType currentOperation = operations.pop();
            switch(currentOperation){
                case ADDITION:
                    result += numbers.pop();
                    break;
                case SUBTRACTION:
                    long subtracted = numbers.pop();
                    result = numbers.pop() - subtracted;
                    break;
                case MULTIPLICATION:
                    result *= numbers.pop();
                    break;
                case DIVISION:
                    long divider = numbers.pop();
                    result = numbers.pop()/divider;
                    break;
            }
        }
        return result;
    }
}