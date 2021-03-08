
public class Diff_btw_Arrays_ArrayList_And_LinkedList {
	
	/*                                   |
	 *    ArrayList                      |    LinkedList
	 *                                   |
	 * 1) ArrayList internally uses a    |    LinkedList internally
	 *    dynamic array to store the     |    uses a doubly linked
	 *    elements.                      |    list to store the elements.
	 *                                   |
	 * 2) Manipulation with ArrayList    |    Manipulation with LinkedList
	 *    is slow because it internally  |    is faster than ArrayList
	 *    uses an array. If any element  |    because it uses a doubly
	 *    is removed from the array, all |    linked list, so no bit
	 *    the bits are shifted in        |    shifting is required in 
	 *    memory.                        |    memory.
	 *                                   |
	 * 3) An ArrayLit class can act as   |    LinkedList class can act as
	 *    a list only because it         |    a list and queue both because
	 *    implements List only.          |    it implements List and 
	 *                                   |    Deque interfaces.
	 *                                   |    
	 * 4) ArrayList is better for        |    LinkedList is better for 
	 *    storing and accessing data.    |    manipulating data.
	 *                                   |
	 *                                   |
	 * */
	
	
	/*                                   |
	 *    Arrays                         |    LinkedList
	 *                                   |
	 * 1) An array is a collection of    |    LinkedList is an order collection
	 *    elements of a similar data     |    of elements of the same type in 
	 *    type.                          |    which each element is connected
	 *                                   |    to the next using pointers.
	 *                                   |
	 * 2) Array elements can be          |    Random accessing is not possible
	 *    accessed randomly using        |    in LinkedList. The elements will
	 *    the array index.               |    have to be accessed sequentially.
	 *                                   |
	 * 3) Data elements are stored in    |    New elements can be stored
	 *    contiguous locations in        |    anywhere and a reference is
	 *    memory.                        |    created for the new element using
	 *                                   |    pointers.
	 *                                   |    
	 * 4) Insertion and Deletion         |    Insertion and Deletion operations
	 *    operations are costlier        |    are fast and easy in a linked list.
	 *    since the memory locations     |
	 *    are consecutive and fixed.     |
	 *                                   |
	 * 5) Memory is allocated            |    Memory is allocated during the
	 *    during the compile time        |    run-time
	 *    (Static memory allocation).    |    (Dynamic memory allocation).
	 *                                   |
	 * 6) Size of the array must be      |    Size of a Linked list grows/shrinks
	 *    specified at the time of       |    as and when new elements are 
	 *    array                          |    inserted/deleted.
	 *    declaration/initialization.    |
	 *                                   |
	 * */

}
