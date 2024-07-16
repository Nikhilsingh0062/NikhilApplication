package Sample;

public class ArraySum {
	    public static void main(String[] args) {
	        // Sample array
	        int[] numbers = {1, 2, 3, 4, 5, 6, 8, 9, 10};

	         // Calculate the sum
	        int sum = 0;
	        for (int number : numbers) {
	            sum += number;
	        }

	        // Print the result
	        System.out.println("Sum of the array elements: " + sum);
	    }
	}