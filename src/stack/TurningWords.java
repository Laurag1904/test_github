package stack;

import java.util.Stack;

public class TurningWords {
	
	
	public void reverseString(String input) {
		if (input == null || input.isEmpty())
			return;
		Stack<Character> stack = new Stack<>();
		 for (int i = 0; i < input.length(); i++) {
	            stack.push(input.charAt(i));
	        }
		 StringBuilder reversed = new StringBuilder();
		 while (!stack.isEmpty()) {
	            reversed.append(stack.pop());
	        }

		
	}

}
