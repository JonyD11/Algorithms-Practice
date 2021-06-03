
public class Insertion_Sort extends Sort {
	
	/*
	 * Insertion Sort is a simple sorting algorithm that works similar to the way you
	 * sort playing cards in your hands. The array is virtually split into a sorted and 
	 * an unsorted part. Values from the unsorted part are picked and placed at the correct
	 * position in the sorted part.
	 * Algorithm
	 * To sort an array of size n in ascending order: 
	 * 1: Iterate from arr[1] to arr[n] over the array. 
	 * 2: Compare the current element (key) to its predecessor. 
	 * 3: If the key element is smaller than its predecessor, compare it to the 
	 * elements before. Move the greater elements one position up to make space 
	 * for the swapped element.
	 * */
	
	void Sort(int[] arr)
	{
		int size = arr.length;
		for (int i = 0; i < size; i++)
		{
			int current = arr[i];
			int j = i - 1;
			
			/*
			 * Move elements of arr[0..i-1], that are
			 * greater than current, to one position ahead
			 * of their current position
			 * */
			while (j >= 0 && arr[j] > current)
			{
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = current;
		}
	}

}
