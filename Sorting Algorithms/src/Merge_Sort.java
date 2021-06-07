
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

}
