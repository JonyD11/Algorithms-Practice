
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
		
		//
		
	}

}
