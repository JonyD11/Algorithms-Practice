
public class O_n_2 {
	
	/*
	 * This approach runs on quadratic time
	 * O(n^2) represents a function whose complexity is directly proportional to
	 * the square of the input size. Adding more nested iterations through the input
	 * will increase the complexity which could then represent O(n^3) with 3 total
	 * iterations and O(n^4) with 4 total iterations.
	 * 
	 * */

	public void log(int[] numbers) {
		// O(n * n) = O(n ^ 2)
		for (int first : numbers) // O(n)
			for (int second : numbers) // O(n)
				System.out.println(first + ", " + second);
	}
	
	public void log1(int[] numbers) {
		// O(n + n ^ 2)
		
		/*
		 * The square of this number is always greater than the number itself
		 * In this expression n^2 will always grows faster than n
		 * We used Big O notation to understand the cost of this algorithm and all
		 * we need is an approximation
		 * Here we can drop n and conclude that this method is runs on O(n^2)
		 * */
		
		// O(n ^ 2)
		for (int number : numbers) // O(n)
			System.out.println(number);
		
		for (int first : numbers) // O(n)
			for (int second : numbers) // O(n)
				System.out.println(first + ", " + second);
	}
	
	public void log2(int[] numbers) {
		// O(n ^ 3)
		
		/*
		 * This algorithm would get far slower than the algorithm O(n^2)
		 * 
		 * */
		for (int first : numbers) // O(n)
			for (int second : numbers) // O(n)
				for (int third : numbers) // O(n)
					System.out.println(first + ", " + second + ", " + third);
	}
	
	/*
	 * What is the difference between O(n) and O(n^2)?
	 * 
	 * 
	 * */
}
