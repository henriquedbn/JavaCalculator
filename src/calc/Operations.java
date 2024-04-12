package src.calc;

import java.util.Stack;


public class Operations {

    public enum OperationType {
        ADDITION,
        SUBTRACTION,
        MULTIPLICATION,
        DIVISION,
        EXPONENTIATION,
        SQUAREROOT,
        PERCENTILE,
        LOG10
    }
    private Stack<OperationType> operations = new Stack<>();

    public void operation(OperationType type) {
        operations.push(type);
    }

    public double resolve(NumStack numbers){
        double result= 0;
        while(!numbers.isEmpty() && !operations.isEmpty()){
            OperationType currentOperation = operations.pop();
            double num1 = numbers.pop();
            double num2 = 0;
            if(numbers.isEmpty()){
                return num1;
            }
            if(currentOperation != OperationType.SQUAREROOT &&
                    currentOperation != OperationType.LOG10) {
                num2 = numbers.pop();
            }
            switch(currentOperation){
                case ADDITION:
                    result = num1 + num2;
                    numbers.push(result);
                    break;
                case SUBTRACTION:
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
                    numbers.push(result);
                    break;
                case EXPONENTIATION:
                    result = Math.pow(num1,num2);
                    numbers.push(result);
                    break;
                case SQUAREROOT:
                    result = Math.sqrt(num1);
                    numbers.push(result);
                    break;
                case LOG10:
                    result = Math.log10(num1);
                    numbers.push(result);
                    break;
                case PERCENTILE:
                    result = (num2/100) * num1;
                    numbers.push(result);
            }
        }
        return result;
    }
}