import java.util.NoSuchElementException;

public class LinkedList {
	
	private class Node {
		private int value;
		private Node next;
		
		public Node(int value) {
			this.value = value;
		}
	}
	
	private Node first;
	private Node last;
	private int size;
	
	private boolean isEmpty() {
		return first == null;
	}
	
	
	// addLast Method
	public void addLast(int item) {
		Node node = new Node(item);
		
		// if the value is empty
		if (isEmpty()) {
			first = last = node;
		}
		else {
			last.next = node;
			last = node;
		}
		size++;
	}

	
	// addFirst Method
	public void addFirst(int item) {
		Node node = new Node(item);
		
		// if the value is empty
		if (isEmpty()) {
			first = last = node;
		}
		else {
			node.next = first;
			first = node;
		}
		size++;
	}
	
	
	// indexOf Method
	public int indexOf(int item) {
		int index = 0;
		Node current = first;
		
		// if the current value is not empty
		while (current != null) {
			if (current.value == item) return index;
			current = current.next;
			index++;
		}
		
		// if the current value is empty or not in the list
		return -1;
	}
	
	
	// contains Method
	public boolean contains(int item) {
		return indexOf(item) != -1;
	}
	
	
	// removeFirst or deleteFirst Method
	public void removeFirst() {
		// if the list is empty
		if (isEmpty())
			throw new NoSuchElementException();
		
		if (first == last) // if the list has only one item
			first = last = null;
		else {
			Node second = first.next;
			first.next = null;
			first = second;
		}
		
		size--;
	}
	
	
	// removeLast or deleteLast Method
	public void removeLast() {
		if (isEmpty())
			throw new NoSuchElementException();
		
		if (first == last) // if the list has only one item
			first = last = null;
		else {
			Node previous = getPrevious(last);
			last = previous;
			last.next = null;
		}
	
		size--;
	}
	
	private Node getPrevious(Node node) {
		Node current = first;
		
		while (current != null) {
			if (current.next == node) return current;
			current = current.next;
		}
		return null;
	}
	
	
	// size Method
	public int size() {
		return size;
	}
	
	
	// Converting LinkedList to Arrays
	public int[] toArray() {
		int[] array = new int[size];
		Node current = first;
		int index = 0;
		while (current != null) {
			array[index++] = current.value;
			current = current.next;
		}
		
		return array;
	}
	
	
	// Reversing the linked list
	public void reverse() {
		if (isEmpty()) return;
		
		Node previous = first;
		Node current = first.next;
		while (current != null) {
			Node next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		
		last = first;
		last.next = null;
		first = previous;
	}
	
	
	// Finding the kth node from the end of a linked list in one pass
	public int getKthFromTheEnd(int k) {
		if (isEmpty())
			throw new IllegalStateException();
		
		Node a = first;
		Node b = first;
		for (int i = 0; i < k - 1; i++) {
			b = b.next;
			if (b == null)
				throw new IllegalArgumentException();
		}
		while (b != last) {
			a = a.next;
			b = b.next;
		}
		return a.value;
	}
	
	
	// Finding the middle of a linked list in one pass
	public void printMiddle() {
		if (isEmpty())
			throw new IllegalStateException();
		
		Node a = first;
		Node b = first;
		while (b != last && b.next != last) {
			b = b.next.next;
			a = a.next;
		}
		
		if (b == last)
			System.out.println(a.value);
		else
			System.out.println(a.value + ", " + a.next.value);
	}
	
	
	// Check to see if a linked list has a loop
	public void hasLoop() {
		// Node list = LinkedList.createWithLoop();
	}
	
}
