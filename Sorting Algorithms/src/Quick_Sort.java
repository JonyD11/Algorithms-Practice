
public class Quick_Sort extends Sort {
	
	/*
	 * Like Merge Sort, QuickSort is a Divide and Conquer algorithm. It picks an 
	 * element as pivot and partitions the given array around the picked pivot.
	 * There are many different versions of quickSort that pick pivot in different
	 * ways.
	 * 1. Always pick first element as pivot.
	 * 2. Always pick last element as pivot .
	 * 3. Pick a random element as pivot.
	 * 4. Pick median as pivot.
	 * 
	 * The key process in quickSort is partition(). Target of partition is, given
	 * an array and an element x of array as pivot, put x at its correct position
	 * in sorted array and put all smaller elements (smaller than x) before x, and
	 * put all greater elements (greater than x) after x. All this should be done
	 * in linear time.
	 * */
	 
	/* This function takes last element as pivot, places
	   the pivot element at its correct position in sorted
	   array, and places all smaller (smaller than pivot)
	   to left of pivot and all greater elements to right
	   of pivot */
	private int partition(int[] arr, int start, int end)
	{
	     
	    // pivot
	    int pivot = arr[end];
	     
	    // Index of smaller element and
	    // indicates the right position
	    // of pivot found so far
	    int boundary = (start - 1);
	 
	    for(int i = start; i <= end - 1; i++)
	    {
	         
	        // If current element is smaller
	        // than the pivot
	        if (arr[i] < pivot)
	        {
	            // Increment index of
	            // smaller element
	            swap(arr, ++boundary, i);
	        }
	    }
	    swap(arr, boundary + 1, end);
	    return (boundary + 1);
	}
	 
	/* The main function that implements QuickSort
	          arr[] --> Array to be sorted,
	          start --> Starting index,
	          end   --> Ending index
	 */
	private void quickSort(int[] arr, int start, int end)
	{
	    if (start < end)
	    {
	         
	        // boundary is partitioning index, arr[p]
	        // is now at right place
	        int boundary = partition(arr, start, end);
	 
	        // Separately sort elements before
	        // partition and after partition
	        quickSort(arr, start, boundary - 1);
	        quickSort(arr, boundary + 1, end);
	    }
	}
	
	public void quickSort(int[] array)
	{
		quickSort(array, 0, array.length - 1);
	}
	
	// Iterative Quick Sort Implementation
	private void quickSortIterative(int[] arr, int start, int end)
	{
		// Create an auxiliary stack
		int[] stack = new int[end - start + 1];
		
		// initialize top of stack
		int top = -1;
		
		// push initial values of start and end to stack
		stack[++top] = start;
		stack[++top] = end;
		
		// Keep popping from stack while is not empty
		while (top >= 0)
		{
			// Pop end and start
			end = stack[top--];
			start = stack[top--];
			
			// Set pivot element at its correct position in sorted array
			int boundary = partition(arr, start, end);
			
			// If there are elements on left side of pivot,
			// then push left side to stack
			if (boundary - 1 > start)
			{
				stack[++top] = start;
				stack[++top] = boundary -1;
			}
			
			// If there are elements on right side of pivot,
			// then push right side to stack
			if (boundary + 1 < end)
			{
				stack[++top] = boundary + 1;
				stack[++top] = end;
			}
		}
	}
	
	public void quickSortIterative(int[] arr)
	{
		quickSortIterative(arr, 0, arr.length - 1);
	}
}
