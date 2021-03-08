import java.util.Arrays;

public class Main {
	
	/* Most used methods in the LinkedList
	 * 
	 * Methods of LinkedList
	 * 1) addLast() is to add an element at the end of the list
	 * 2) addFirst() is to add an element at the start of the list
	 * 3) removeLast() or deleteLast() is to remove an element from the end of the list
	 * 4) removeFirst() or deleteFirst() is to remove the element from the start of the list
	 * 5) remove() is to remove the element from the index that we have choose
	 * 6) contains() is to check weather the element is on the list or not
	 * 7) indexOf() will return the index of the give element
	 * 8) size() will return the number of items in the list
	 * 9) toArray() will convert the LinkedList to Array
	 * 
	 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.addFirst(5);
		list.addFirst(0);
		list.removeLast(); // Removing the last item from the list
		list.removeFirst(); // Removing the last item from the list
		
		// Converting the linked list to array
		System.out.println("Printing the Linked List into Array");
		int[] array = list.toArray();
		System.out.println(Arrays.toString(array));
		System.out.println();
		
		// Finding the middle of a linked list in one pass
		System.out.println("Finding the middle of a linked list in one pass");
		list.printMiddle();
		System.out.println();
		
		// Finding the kth node from the end of a linked list in one pass
		System.out.println("Finding the kth node from the end of a linked list in one pass");
		System.out.println(list.getKthFromTheEnd(1));
		System.out.println();
		
		// Finding the index number of the given element
		System.out.println("Finding the index number of the element 10 in the list is");
		System.out.println(list.indexOf(10));
		System.out.println();
		
		// Checking the value weather it's exist or not
		System.out.println("Checking the value 10 if it exists in the given list");
		System.out.println(list.contains(10));
		System.out.println();
		
		// Reversing the linked list
		System.out.println("Reversing the linked list");
		list.reverse();
		int[] array1 = list.toArray();
		System.out.println(Arrays.toString(array1));
		System.out.println();
		
		// Getting the size of the list
		System.out.println("Total Size of the Array");
		System.out.println(list.size());
		System.out.println();
		
		// Finding the middle of a linked list in one pass
		System.out.println("Finding the middle of a linked list in one pass after reversing the list");
		list.printMiddle();
		System.out.println();
		
	}

}
