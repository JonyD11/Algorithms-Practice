import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.Stack;

public class Stacks {
	// Using Stack class for stack implementation
	static Stack<Character> stack = new Stack<>();
	
	private final List<Character> leftBrackets
								= Arrays.asList('(', '<', '[', '{');
	private final List<Character> rightBrackets
								= Arrays.asList(')', '>', ']', '}');
	
	// Reversing the Stack
	public String reverse1(String input) {
		
		// Using for loop to iterate 
		// for (int i = 0; i < input.length(); i++)
		// stack.push(input.charAt(i));
		
		for (char ch : input.toCharArray())
			stack.push(ch);
		
		StringBuffer reversed = new StringBuffer(); // For String manipulation operations we used StringBuffer
		while (!stack.empty())
			reversed.append(stack.pop());
		
		return reversed.toString();
	}
	
	// Balanced Expressions
	public boolean isBalanced(String input) {
		
		// Code which is difficult to read
		/*for (char ch : input.toCharArray()) {
			if (ch == '(' || ch == '<' || ch == '{' || ch == '{')
				stack.push(ch);
			
			if (ch == ')' || ch == '>' || ch == '}' || ch == '}') {
				if (stack.empty()) return false;
				Character top = stack.pop();
				if (ch == ')' && top != '(' || ch == '>' && top != '<' || ch == ']' && top != '[' || ch == '}' && top != '{') return false;
			}
		} */
		
		
		// Clean code
		for (char ch : input.toCharArray()) {
			if (isLeftBracket(ch))
				stack.push(ch);
			
			if (isRightBracket(ch)) {
				if (stack.empty()) return false;
				
				Character top = stack.pop();
				if (!bracketsMatch(top,ch)) return false;
			}
		}
		
		return stack.empty();
	}
	
	private boolean isLeftBracket(char ch) {
		// return ch == '(' || ch == '<' || ch == '{' || ch == '{'; // An Ugly Code
		
		// Clean Code
		// List<Character> leftBrackets = Arrays.asList('(', '<', '[', '{'); // By using private final on top of this class to make this code even more clean
		return leftBrackets.contains(ch);
	}
	
	private boolean isRightBracket(char ch) {
		// return ch == ')' || ch == '>' || ch == '}' || ch == '}'; // An Ugly Code
		
		// Clean Code
		// List<Character> rightBrackets = Arrays.asList(')', '>', ']', '}'); // By using private final on top of this class to make this code even more clean
		return rightBrackets.contains(ch);
	}
	
	private boolean bracketsMatch(char left, char right) {
		/*return (left == ')' && right != '(' || 
				left == '>' && right != '<' || 
				left == ']' && right != '[' || 
				left == '}' && right != '{'); */ // An Ugly Code
		
		// Clean Code
		// Created two ArrayList which contains left bracket and right bracket
		return leftBrackets.indexOf(left) == rightBrackets.indexOf(right);
	}
	
	
	// Balanced Expression 2.0
	public static boolean areBracketsBalanced(String input)
	{
		// Using ArrayDeque is faster than using Stack class
		Deque<Character> stack = new ArrayDeque<Character>();
		
		// Traversing the Expression
		for (int i = 0; i < input.length(); i++)
		{
			char x = input.charAt(i);
			
			if (x == '(' || x == '[' || x == '{')
			{
				// Push the element in the stack
				stack.push(x);
				continue;
			}
			
			// If current character is not opening
			// bracket, then it must be closing. So stack
			// cannot be empty at this point.
			if (stack.isEmpty())
				return false;
			char check;
			switch (x) {
			case ')':
				check = stack.pop();
				if (check == '{' || check == '[')
					return false;
				break;
				
			case '}':
				check = stack.poll();
				if (check == '(' || check == '[')
					return false;
				break;
				
			case ']':
				check = stack.pop();
				if (check == '(' || check == '{')
					return false;
				break;
			}
		}
		
		// Check Empty Stack
		return (stack.isEmpty());
	}
}
