package src.calc;

import java.util.EmptyStackException;
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
            long num1 = numbers.pop();
            if(numbers.isEmpty()){
                return num1;
            }
            long num2 = numbers.pop();
            switch(currentOperation){
                case ADDITION:
                    result = num1 + num2;
                    numbers.push(result);
                    break;
                case SUBTRACTION:
                    long subtracted = numbers.pop();
                    result = num2 - num1;
                    numbers.push(result);
                    break;
                case MULTIPLICATION:
                    result = num1 * num2;
                    numbers.push(result);
                    break;
                case DIVISION:
                    if(num1==0){
                        throw new ArithmeticException("Divison by zero");
                    }
                    result = num2/num1;
                    break;
            }
        }
        return result;
    }
}