
public class O_1 {
	
	/*
	 * What is O(1)?
	 * An algorithm is said to be constant time (also written in O(1) time) if the
	 * value of T(n) is bounded by a value that does not depend on the size of the
	 * input. For example, accessing any single element in an array takes constant
	 * time as only one operation has to be performed to locate it.
	 * 
	 * */

	public void log(int[] numbers) {
		// O(1)
		System.out.println(numbers[0]);
	}
	
	public void log1(int[] numbers) {
		/*
		 * According to this example if our items run 1 or 1 million times our
		 * method will runs at constant time.
		 * */
		
		// O(2)
		System.out.println(numbers[0]);
		System.out.println(numbers[0]);
	}
}
