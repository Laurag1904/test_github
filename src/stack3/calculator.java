package stack3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class calculator {

	public static List<String> tokenize(String expression) {
        List<String> tokens = new ArrayList<>(); 
        Scanner scanner = new Scanner(expression);
        while (scanner.hasNext()) {
        	String token = scanner.next();
            tokens.add(token);
        }

        return tokens;
	    	    		
	}	 
	public static double evaluate(String expression) {
        Stack<Double> stack = new Stack<>();
        String[] tokens = expression.split("\\s+");

        for (String token : tokens) {
            if (isNumeric(token)) {
                stack.push(Double.parseDouble(token));
            } else {
                double operand2 = stack.pop();
                double operand1 = stack.pop();
                double partialResult = zerlegen(operand1, operand2, token);
                stack.push(partialResult);
            }
        }

        return stack.pop();
    }
	
	 public static boolean isNumeric(String str) {
	        return str.matches("-?\\d+(\\.\\d+)?");
	    }
	
	public static double zerlegen (double operator1, double operator2, String operator) {
		switch(operator) {
		case "+": 
			return operator1 + operator2;
		case "-": 
			return operator1 - operator2;
			
		case "*":
			return operator1 * operator2;
			
		case "/":
			return operator1 / operator2;
		
		default:
        throw new IllegalArgumentException("Unbekannter Operator: " + operator);
		}
	}
	

	
}
