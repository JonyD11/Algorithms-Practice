
public class What_is_Stack {
	
	/*
	 * What is Stack?
	 * Stack is a linear data structure which follows the particular order in which
	 * the operations are performed. The order may be LIFO (Last In First Out) or
	 * FILO (First In Last Out).
	 * 
	 *                               _  _  _  _  _  _  _  _
	 *                              | || || || || || || || |
	 *         STACK                | || || || || || || || |<-------- Push
	 * Insertion and Deletion       | || || || || || || || |     Last in, first out
	 * happen on the same end       | || || || || || || || |--------> Pop
	 *                              |_||_||_||_||_||_||_||_|
	 *                                                    |
	 *                                                    |
	 *                                                   Top
	 *                                                   
	 * There are many real-life examples of a stack. Consider an example of plates 
	 * stacked over one another in the canteen. The plate which is at the top is the
	 * first one to be removed, i.e. the plate which has been placed at the 
	 * bottommost position remains in the stack for the longest period of time.
	 * So, it can be simply seen to follow LIFO (Last In First Out)/FILO(First In Last Out) order.
	 * 
	 * 
	 * */
	
	/*
	 * Stack Class in Java
	 * Java Collection framework provides a Stack class that models and implements
	 * a Stack data structure. The class is based on the basic principle of 
	 * last-in-first-out. In addition to the basic push and pop operations, the
	 * class provides three more functions of empty, search, and peek. The class
	 * can also be said to extend Vector and treats the class as a stack with the
	 * five mentioned functions. The class can also be reffered to as the subclass
	 * of Vector.
	 * */
	
	/*
	 * 1. Adding Elements: In order to add an element to the stack, we can use the
	 * push() method. This push() operation place the element at the top of the 
	 * stack.
	 * 
	 * 2. Accessing the element: To retrieve or fetch the first element of the 
	 * Stack or the element present at the top of the Stack, we can use peek()
	 * method. The element retrieved does not get deleted or removed from the stack.
	 * 
	 * 3. Removing elements: To pop an element from the stack, we can use the pop()
	 * method. The element is popped from the top of the stack and removed from 
	 * the same.
	 * 
	 * Note: Please note that the Stack class in Java is a legacy class and 
	 * inherits from Vector in Java. It is a thread-safe class and hence involves
	 * overhead when we do not need thread safety. It is recommended to use 
	 * ArrayDeque for stack implementation as it is more efficient in a 
	 * single-threaded environment.
	 * 
	 * */

}
