package stack2;

import java.util.LinkedList;

public class correctKlammern {
	
	public static boolean checkBrackets(String input) {
        LinkedList<Character> stack = new LinkedList<>();
        
        for (char ch : input.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) {
                    return false; // Es gibt keine passende öffnende Klammer im Stack
                }
                
                char lastOpen = stack.peek();
                if ((ch == ')' && lastOpen != '(') || (ch == ']' && lastOpen != '[') || (ch == '}' && lastOpen != '{')) {
                    return false; // Klammer ist nicht korrekt geschachtelt
                }
                stack.pop();
            }
        } return stack.isEmpty();
    }
}
