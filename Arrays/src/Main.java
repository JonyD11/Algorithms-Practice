import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Array numbers = new Array(3);
		
		// Using the insert method to add numbers in array
		numbers.insert(10);
		numbers.insert(20);
		numbers.insert(30);
		numbers.insert(40);
		numbers.insert(50);
		numbers.insert(60);
		numbers.insert(70);
		
		// Removing the index 6 using the removeAt method
		numbers.removeAt(6); 
		
		// Using toString Method to print numbers
		System.out.println("Using toString Method to print numbers");
		System.out.println(numbers.toString());
		System.out.println();
		
		// Using print Method from Array class to print the numbers
		System.out.println("Using print Method from Array class to print the numbers");
		numbers.print();
		System.out.println("\n");
		
		// Using indexOf method to find the position of a value 30 is 2
		System.out.println("Using indexOf method to find the position of a value 30 is 2");
		System.out.println(numbers.indexOf(30));
		
		
		int numbers1[] = {10, 30, 20, 40, 50, 70, 60};
		int n = numbers1.length;
		System.out.println();
		
		// Find minimum (lowest) value in array using loop
		System.out.println("Find minimum (lowest) value in array using loop");
		System.out.println(Array.getMinValue(numbers1));
		System.out.println();
		
		// Find maximum (largest) value in array using loop
		System.out.println("Find maximum (largest) value in array using loop");
		System.out.println(Array.getMaxValue(numbers1));
		System.out.println();
		
		// Find minimum (lowest) value in array using array sort
		System.out.println("Find minimum (lowest) value in array using array sort");
		System.out.println(Array.minValue(numbers1));
		System.out.println();
		
		// Find maximum (largest) value in array using array sort
		System.out.println("Find maximum (largest) value in array using array sort");
		System.out.println(Array.maxValue(numbers1));
		System.out.println();
		
		// function to return minimum element using recursion 
		System.out.println("function to return minimum element using recursion");
		System.out.println(Array.findMinRec(numbers1, n));
		System.out.println();
		
		// function to return maximum element using recursion
		System.out.println("function to return maximum element using recursion");
		System.out.println(Array.findMaxRec(numbers1, n));
		System.out.println();
		
		
		System.out.println("Finding Common Elements between two Arrays Using iterate method");
		// create Array 1 
        String[] arr1 = {"Article", "in", "Geeks","for","Geeks"}; 
        
        // create Array 2 
        String[] arr2 = {"Geeks","for","Geeks"}; 
        
        // print Array 1 
        System.out.println("Array 1: " + Arrays.toString(arr1)); 
        
        // print Array 2 
        System.out.println("Array 2: " + Arrays.toString(arr2)); 
        
        System.out.print("Common Elements: "); 
        
        // Find the common elements 
        Array.intersect(arr1,arr2); 
        System.out.println("\n");
		
		
        System.out.println("Finding Common Elements between two Arrays Using hashsets and retainAll method");
        // create Array 1 
        int[] array1 
            = { 1, 4, 9, 16, 25, 36, 49, 64, 81, 100 }; 
        
        // create Array 2 
        int[] array2 = { 100, 9, 64, 7, 36, 5, 16, 3, 4, 1 }; 
        
        // print Array 1 
        System.out.println("Array 1: "
                           + Arrays.toString(array1)); 
        // print Array 2 
        System.out.println("Array 2: "
                           + Arrays.toString(array2)); 
        Array.FindCommonElements(array1, array2);
        System.out.println();
        
        
        System.out.println("function that reverses array and stores it in another array");
        int [] arr = {10, 20, 30, 40, 50, 60, 70};
        System.out.println(Arrays.toString(arr));
        Array.reverse(arr, arr.length);
        System.out.println("\n");
        
        
        System.out.println("Program that reverses array in less number of swaps");
        int [] array = {10, 20, 30, 40, 50, 60, 70};
        System.out.println(Arrays.toString(array));
        Array.arrayReverse(array, array.length);
        System.out.println("\n");
        
        
        System.out.println("Java Program to Insert an element at a specific position in an Array ");
        // Java Program to Insert an element 
        // at a specific position in an Array 
        int n1 = 10;
        
        // initial array of size 10
        int arr_1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        
        // print the original array
        System.out.println("Initial Array: " + Arrays.toString(arr_1));
        
        // element to be inserted
        int x = 50;
        
        // position at which element
        // is to be inserted
        int pos = 5;
        
        // call the method to insert x
        // in arr_1 at position pos
        arr_1 = Array.insertX(n1, arr_1, x, pos);
        
        // print the updated array
        System.out.println("Array with " + x
        					+ " inserted at position "
        					+ pos + ":\n"
        					+ Arrays.toString(arr_1));
        System.out.println();
        
        
        System.out.println("Java Program to Insert an element at a specific position in an Array using ArrayList");
        // Java Program to Insert an element 
        // at a specific position in an Array 
        // using ArrayList
        
        // Sample array
        Integer[] array_1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        
        // Element to be inserted
        int element = 50;
        
        // Position to insert
        int position = 5 ;
        
        // Calling the function to insert
        Array.addElement(array_1, element, position);
	}

}
