
public class Bubble_Sort extends Sort {
	
	/*
	 * Bubble Sort is the simplest sorting algorithm that works by 
	 * repeatedly swapping the adjacent elements if they are in wrong
	 * order.
	 * */
	
	void Sort(int[] arr)
	{
		int size = arr.length;
		for (int i = 0; i < size; i++)
			for (int j = 1; j < size; j++)
				if (arr[j] < arr[j - 1])
				{
					swap(arr, j, j - 1);
				}
	}
	
	// Recursive Bubble Sort
	void Sort1 (int[] arr, int size)
	{
		// Base case
		if (size == 1)
			return;
		
		// One pass of bubble sort. After this pass, the largest element 
		// is moved (or bubbled) to end
		for (int i = 0; i < size - 1; i++)
			if (arr[i] > arr[i + 1])
			{
				swap(arr, i, i + 1);
			}
		
		// Largest element is fixed, recur for remaining array
		Sort1(arr, size - 1);
	}

}
