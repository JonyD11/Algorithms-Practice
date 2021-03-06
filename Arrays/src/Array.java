import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Array {
	private static int[] items;
	private static int count;
	
	public Array(int length) {
		items = new int[length];
	}
	
	public void insert(int item) {
		// If the array is full, resize it
		if (items.length == count) {
			// Create a new array (twice the size)
			int[] newItems = new int[count * 2];
			
			// Copy all the existing items
			for (int i = 0; i < count; i++)
				newItems[i] = items[i];
			
			// Set "items" to this new array
			items = newItems;
		}
		
		// Add the new item at the end
		items[count++] = item;
	}
	
	public void removeAt(int index) {
		// Validate the index
		if (index < 0 || index >= count)
			throw new IllegalArgumentException();
		
		// Shift the items to the left to fill the hole
		// [10, 20, 30, 40]
		// index: 1
		// 1 <- 2
		// 2 <- 3
		for (int i = index; i < count; i++)
			items[i] = items[i + 1];
		// Decreasing the size of the array after removing an item
		count--;
	}
	
	public int indexOf(int item) {
		// If we find it, return index
		// Otherwise, return -1
		for (int i = 0; i < count; i++)
			if (items[i] == item)
				return i;
		
		return -1;
	}
	
	@Override
	public String toString() {
		return Arrays.toString(items);
	}

	public void print() {
		for (int i = 0; i < count; i++)
			System.out.print(items[i] + " ");
	}
	
	
	// Find maximum (largest) value in array using loop
	public static int getMaxValue(int[] items){
		  int maxValue = items[0];
		  for(int i = 1; i < count; i++){
		    if(items[i] > maxValue){
		      maxValue = items[i];
		    }
		  }
		  return maxValue;
		}
	

	// Find minimum (lowest) value in array using loop
	public static int getMinValue(int[] items){
	  int minValue = items[0];
	  for(int i = 1; i < count; i++){
	    if(items[i] < minValue){
	      minValue = items[i];
	    }
	  }
	  return minValue;
	}
    
    
    //Find maximum (largest) value in array using array sort
    public static int maxValue(int[] items){
    	count = items.length;
      Arrays.sort(items);
      return items[count - 1];
    }
    
    
    //Find minimum (lowest) value in array using array sort
    public static int minValue(int[] items){
      Arrays.sort(items);
      return items[0];
    }
    
    
    // function to return maximum element using recursion 
    public static int findMaxRec(int A[], int n) 
    { 
      // if size = 0 means whole array 
      // has been traversed 
      if(n == 1) 
        return A[0]; 
          
        return Math.max(A[n-1], findMaxRec(A, n-1)); 
    } 
    

    // function to return minimum element using recursion 
    public static int findMinRec(int A[], int n) 
    { 
      // if size = 0 means whole array 
      // has been traversed 
      if(n == 1) 
        return A[0]; 
          
        return Math.min(A[n-1], findMinRec(A, n-1)); 
    } 
    
    
    // Finding common elements in two arrays using iterative method
    public static void intersect(String[] arr1, String[] arr2) {
    	Set<String> set = new HashSet<>();
    	
    	for(int i = 0; i < arr1.length; i++) {
    		
    		for(int j = 0; j < arr2.length; j++) {
    			
    			if(arr1[i] == arr2[j]) {
    				
    				// add common elements
    				set.add(arr1[i]);
    				break;
    			}
    		}
    	}
    	
    	for(String i:set) {
    		System.out.print(i + " ");
    	}
    }
    
    
    // Finding common elements in two arrays using hashsets and retainAll() method
    public static void FindCommonElements(int[] arr1, int[] arr2) {
    	// create hashsets
    	Set<Integer> set1 = new HashSet<>();
    	Set<Integer> set2 = new HashSet<>();
    	
    	// Adding elements from array1
    	for (int i : arr1) {
    		set1.add(i);
    	}
    	
    	// Adding elements from array2
    	for (int i : arr2) {
    		set2.add(i);
    	}
    	
    	// Using retainAll method to find common elements
    	set1.retainAll(set2);
    	System.out.println("Common elements- " + set1);
    }
    
    
    // Function that reverses array and stores it in another array
    public static void reverse(int a[], int n) {
    	int[] b = new int[n];
    	int j = n;
    	for (int i = 0; i < n; i++) {
    		b[j - 1] = a[i];
    		j = j - 1;
    	}
    	
    	// Printing the reversed array
    	System.out.println("Reversed array is: ");
    	for (int k = 0; k < n; k++) {
    		System.out.print(b[k] + "  ");
    	}
    }
    
    
    // Function swaps the array's first element with last element, 
    // second element with last second element and so on
    public static void arrayReverse(int a[], int n) {
    	int i, k, t;
    	for (i = 0; i < n / 2; i++) {
    		t = a[i];
    		a[i] = a[n - i - 1];
    		a[n - i - 1] = t;
    	}
    	
    	// Printing the reversed array
    	System.out.println("Reversed array is: ");
    	for (k = 0; k < n; k++) {
    		System.out.print(a[k] + "  ");
    	}
    }
    
    
    // Function to insert x in array at position pos
    public static int[] insertX(int n, int arr[], int x, int pos) {
    	int i;
    	
    	// Create a new array of size n+1
    	int newarr[] = new int[n + 1];
    	
    	/*
    	 * insert the elements from
    	 * the old array into the new array
    	 * insert all elements till pos
    	 * then insert x at pos
    	 * then insert rest of the elements
    	 * */
    	for (i = 0; i < n + 1; i++) {
    		if (i < pos - 1)
    			newarr[i] = arr[i];
    		else if (i == pos - 1)
    			newarr[i] = x;
    		else
    			newarr[i] = arr[i - 1];
    	}
    	return newarr;
    	
    }
    
    
    // Method to add element at position in an Array using ArrayList
    public static void addElement(Integer[] array_1, int element, int position) {
    	// Converting array to ArrayList
    	List<Integer> list = new ArrayList<>(Arrays.asList(array_1));
    	
    	// Adding the element at position
    	list.add(position - 1, element);
    	
    	// Converting the list back to array
    	array_1 = list.toArray(array_1);
    	
    	// Printing the original array
    	System.out.println("Initial Array: " + Arrays.toString(array_1));
    	
    	// Printing the updated array
    	System.out.println("Array with " + element
    						+ " inserted at position "
    						+ position + ": "
    						+ Arrays.toString(array_1));
    }
    
}
