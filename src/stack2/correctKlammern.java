package stack2;

import java.util.Stack;

public class correctKlammern {
	
	public static boolean checkBrackets(String expression) {
        Stack<Character> stack = new Stack<>();
        
        for (char ch : expression.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) {
                    return false; // Es gibt keine passende öffnende Klammer im Stack
                }
                
                char top = stack.pop();
                if ((ch == ')' && top != '(') || (ch == ']' && top != '[') || (ch == '}' && top != '{')) {
                    return false; // Klammer ist nicht korrekt geschachtelt
                }
            }
        } return stack.isEmpty();
    }
}
