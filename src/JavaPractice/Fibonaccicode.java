package JavaPractice;



	public class Fibonaccicode {
	    public static void main(String[] args) {
	    	/*
	    	Fibonaccicode fibonacci = new Fibonaccicode();
	    	
	    	
	    	 // Test Case 1: n = 6
	        // Expected output: 8
	    	int result1 = fibonacci.calculateFibonacci(0);
	        System.out.println(result1); // Output: 8
	        
	        // Test Case 2: n = 0
	        // Expected output: 0
	        int result2 = fibonacci.calculateFibonacci(0);
	        System.out.println(result2); // Output: 0
	        
	        // Test Case 3: n = 10
	        // Expected output: 55
	        
	    	int result3 = fibonacci.calculateFibonacci(10);
	        System.out.println(result3); 
	    	*/
	        
	    	int numTerms = 11; // Change this to the desired number of terms

	        System.out.println("Fibonacci Sequence:");
	        for (int i = 0; i < numTerms; i++) {
	            int fibonacci = calculateFibonacci(i);
	            System.out.print(fibonacci + " ");
	        }
	    }

	    public static int calculateFibonacci(int n) {
	        if (n <= 1) {
	            return n;
	        }
	        return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
	    }
	}

