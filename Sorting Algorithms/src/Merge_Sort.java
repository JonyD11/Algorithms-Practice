
public class Merge_Sort extends Sort {
	
	/*
	 * Like Quick Sort, Merge Sort is a Divide and Conquer algorithm. It divides the
	 * input array into two halves, calls itself for the two halves, and then merges
	 * the two sorted halves. The merge() function is used for merging two halves. 
	 * */
	
	public void Sort(int[] arr)
	{	
		int n = arr.length;
		
		if (n < 2)
			return;
		
		// Divide this array into half
		int middle = n / 2;
		
		int[] left = new int[middle];
		for (int i = 0; i < middle; i++)
			left[i] = arr[i];
		
		int[] right = new int[n - middle];
		for (int i = middle; i < n; i++)
			right[i - middle] = arr[i];
		
		// Sort each half
		Sort(left);
		Sort(right);
		
		// Merge the result
		merge(left, right, arr);
	}
	
	private void merge(int[] left, int[] right, int[] result)
	{
		int i = 0, j = 0, k = 0, l = left.length, r = right.length;
		
		while (i < l && j < r)
		{
			if (left[i] <= right[j])
				result[k++] = left[i++];
			else
				result[k++] = right[j++];
		}
		
		while (i < l)
			result[k++] = left[i++];
		
		while (j < r)
			result[k++] = right[j++];
	}
	
	// Iterative Merge Sort
	public static void Sort1(int[] arr, int n)
	{
		// For current size of subarrays to be merged curr_size 
		// varies from 1 to n/2
		int curr_size;
		
		// For picking starting index of left subarray to be merged
		int left_start = 0;
		
		
		/*
		 * Merge subarrays in bottom up manner. First merge subarrays
		 * of size 1 to create sorted subarrays of size 2, then merge
		 * subarrays of size 2 to create sorted subarrays of size 4,
		 * and so on.
		 * */
		for (curr_size = 1; curr_size <= n - 1; curr_size = 2 * curr_size)
		{
			// Find ending point of left subarray.
			// mid+1 is starting point of right
			int mid = Math.min(left_start + 2*curr_size - 1, n-1);
			
			int right_end = Math.min(left_start + 2*curr_size - 1, n-1);
			
			// Merge Subarrays arr[left_start...mid] & arr[mid+1...right_end]
			merge1(arr, left_start, mid, right_end);
		}
	}
	
	private static void merge1(int arr[], int l, int m, int r)
	{
		int i = 0, j = 0, k = 0;
		int n1 = m - l + 1;
		int n2 = r - m;
		
		// create temp arrays
		int L[] = new int[n1];
		int R[] = new int[n2];
		
		// Copy data to temp arrays L[] and R[]
		for (i = 0; i < n1; i++)
			L[i] = arr[l + i];
		for (j = 0; j < n2; j++)
			R[j] = arr[m + 1 + j];
		
		// Merge the temp arrays back into arr[l..r]
		while (i < n1 && j < n2)
		{
			if (L[i] <= R[j])
			{
				arr[k] = L[i];
				i++;
			}
			else
			{
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		
		// Copy the remaining elements of L[], if there are any
		while (i < n1)
		{
			arr[k] = L[i];
			i++;
			k++;
		}
		
		// Copy the remaining elements of R[], if there are any
		while (j < n2)
		{
			arr[k] = R[j];
			j++;
			k++;
		}
	}
	
	public void printArray1(int A[], int size)
	{
		int i;
		for (i = 0; i < size; i++)
			System.out.printf("%d ", A[i]);
		System.out.println();
	}

}
