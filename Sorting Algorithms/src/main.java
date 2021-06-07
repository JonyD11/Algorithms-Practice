
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Selection Sort Implementation
		Selection_Sort ob = new Selection_Sort();
		
		int arr[] = {53, 22, 48, 15, 10, 5, 75};
		ob.Sort(arr);
		System.out.println("Selection Sort");
		ob.printArray(arr);
		System.out.println();
		
		// Bubble Sort Implementation
		Bubble_Sort ob1 = new Bubble_Sort();
		
		int arr1[] = {53, 22, 48, 15, 10, 5, 75};
		ob1.Sort(arr1);
		System.out.println("Bubble Sort");
		ob1.printArray(arr1);
		System.out.println();
		
		// Recursive Bubble Sort Implementation
		Bubble_Sort ob1_1 = new Bubble_Sort();
		
		int arr1_1[] = {53, 22, 48, 15, 10, 5, 75};
		ob1_1.Sort1(arr1_1, arr1_1.length);
		System.out.println("Recursive Bubble Sort");
		ob1_1.printArray(arr1_1);
		System.out.println();
		
		// Insertion Sort Implementation
		Insertion_Sort ob2 = new Insertion_Sort();
		
		int arr2[] = {53, 22, 48, 15, 10, 5, 75};
		ob2.Sort(arr2);
		System.out.println("Insertion Sort");
		ob2.printArray(arr2);
		System.out.println();
		
		// Recursive Insertion Sort Implementation
		Insertion_Sort ob2_2 = new Insertion_Sort();
		
		int arr2_2[] = {53, 22, 48, 15, 10, 5, 75};
		ob2_2.Sort1(arr2_2, arr2_2.length);
		System.out.println("Recursive Insertion Sort Implementation");
		ob2_2.printArray(arr2_2);
		System.out.println();
		
		// Merge Sort Implementation
		Merge_Sort ob3 = new Merge_Sort();
		
		int arr3[] = {53, 22, 48, 15, 10, 5, 75};
		ob3.Sort(arr3);
		System.out.println("Merge Sort Implementation");
		ob3.printArray(arr3);
		System.out.println();
		
		// Iterative Merge Sort Implementation
		Merge_Sort ob3_2 = new Merge_Sort();
		
		int arr3_3[] = {53, 22, 48, 15, 10, 5, 75};
		ob3_2.Sort(arr3_3);
		System.out.println("Iterative Merge Sort Implementation");
		ob3_2.printArray1(arr3_3, arr3_3.length);
		System.out.println();
		
		
	}

}
