package stack;

import java.util.LinkedList;

public class TurningWords {
	
	
	public static String reverseString(String input) {
		LinkedList<Character>stack = new LinkedList<Character>();
		for(char c : input.toCharArray()) {
			stack.push(c);
		}
		StringBuilder reversedString = new StringBuilder();
		while(!stack.isEmpty()) {
			reversedString.append(stack.pop());
		}
		return reversedString.toString();
	}
}