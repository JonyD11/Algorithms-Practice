import java.util.Stack;

public class main {
	
	// Using Stack class for stack implementation
	static Stack<Character> stack = new Stack<>();
	static Stacks reverser = new Stacks();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "abcd";
		
		System.out.println("Original String");
		System.out.println(str);
		System.out.println();
		
		String result = reverser.reverse1(str);
		
		System.out.println("After reversing the given string(using reverse1 method)");
		System.out.println(result);
		System.out.println();
		
		
		// push elements into the stack
		stack.push('1');
		stack.push('2');
        stack.push('3');
        stack.push('4');
        
        System.out.println("Original Stack");
        System.out.println(stack);
        
        // function to reverse the stack
        reverse2();
        
        System.out.println();
        System.out.println("Reversed Stack");
        System.out.println(stack);
        System.out.println();
        
        String str1 = "(1 + 2>";
        Stacks exp = new Stacks();
        boolean result1 = exp.isBalanced(str1);
        System.out.println("For checking the balanced expression");
        System.out.println(str1);
        System.out.println(result1);
        System.out.println();
        
        String expr = "([{}])";
        // Function call
        System.out.println("For checking the balanced expression");
        System.out.println(expr);
        if (Stacks.areBracketsBalanced(expr))
        	System.out.println("Balanced");
        else
        	System.out.println("Not Balanced");
        
	}
	
	
	// Reverse a Stack using recursion
	// Below is a recursion function that inserts an element at the bottom of a stack.
	public static void insert_at_bottom(char x)
	{
		if(stack.isEmpty())
			stack.push(x);
			
		else
		{
			// All items are held in Function
	        // Call Stack until we reach end
	        // of the stack. When the stack becomes
	        // empty, the stack.size() becomes 0, the
	        // above if part is executed and 
	        // the item is inserted at the bottom
			char a = stack.peek();
			stack.pop();
			insert_at_bottom(x);
				
				// push all the items held 
	            // in Function Call Stack
	            // once the item is inserted 
	            // at the bottom
				stack.push(a);
			}
		}
		// Below is the function that 
	    // reverses the given stack using
	    // insert_at_bottom()
		public static void reverse2()
		{
			if(stack.size() > 0)
			{
				// Hold all items in Function
	            // Call Stack until we
	            // reach end of the stack 
				char x = stack.peek();
				stack.pop();
				reverse2();
				
				// Insert all the items held 
	            // in Function Call Stack
	            // one by one from the bottom
	            // to top. Every item is
	            // inserted at the bottom 
	            insert_at_bottom(x);
			}
		}

}
