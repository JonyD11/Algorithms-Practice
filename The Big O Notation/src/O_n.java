
public class O_n {
	
	/*
	 * O(n) describes an algorithm whose performance will grow linearly and in 
	 * direct proportion to the size of the input data set.
	 * 
	 * */

	public void log(int [] numbers) {
		// O(n)
		for (int i = 0; i < numbers.length; i++)
			System.out.println(numbers[i]);
	}
	
	public void log1(int [] numbers) {
		/*
		 * If we use the for each loop than also we are iterating all the loops in 
		 * this array
		 * We can also use a while loop or do while loop
		 * 
		 * */
		
		// O(n)
		for (int number : numbers)
			System.out.println(number);
	}
	
	public void log2(int [] numbers) {
		// O(1 + n + 1) = O(2 + n) 
		
		/*
		 * If we use big O notation than adding two extra operations or a million it
		 * doesn't really matter because the cost of this algorithm increases 
		 * linearly and direct proportion to the size of our input
		 * If we have a five items in our input than we have 5 operations and if we 
		 * have million items than we have million operations
		 * 
		 * */
		
		// O(n)
		System.out.println(); // O(1)
		for (int i = 0; i < numbers.length; i++) // O(n)
			System.out.println(numbers[i]);
		System.out.println(); // O(1)
	}
	
	public void log3(int [] numbers) {
		// O(n + n) = O(2n)
		
		/*
		 * This is an another example where we drop the constant because all we need 
		 * here is the approximation of the cost of this algorithm relative to it's
		 * input size. So, n or 2n still represents the linear growth.
		 * 
		 * */
		
		// O(n)
		for (int number : numbers)
			System.out.println(number);
		
		for (int number : numbers)
			System.out.println(number);
	}
	
	public void log4(int [] numbers, String[] names) {
		// O(n + m)
		
		/*
		 * Still this method is increasing linearly 
		 * 
		 * */
		
		// O(n)
		for (int number : numbers) // O(n)
			System.out.println(number);
		
		for (String name : names) // O(m)
			System.out.println(name);
	}
}
