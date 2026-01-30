package specialPrograme_Interview;

public class Factorial_number {
	
	    public static void main(String[] args) {

	        int num = 5;

	        // 1. Factorial using for loop
	        int factFor = 1;
	        for (int i = num; i >= 1; i--) {
	            factFor *= i;
	        }
	        System.out.println("Factorial using for loop: " + factFor);

	        // 2. Factorial using while loop
	        int factWhile = 1;
	        int j = num;
	        while (j >= 1) {
	            factWhile *= j;
	            j--;
	        }
	        System.out.println("Factorial using while loop: " + factWhile);

	        // 3. Factorial using do-while loop
	        int factDo = 1;
	        int k = num;
	        do {
	            factDo *= k;
	            k--;
	        } while (k >= 1);
	        System.out.println("Factorial using do-while loop: " + factDo);

	        // 4. Factorial using normal method
	        System.out.println("Factorial using method: " + factorialMethod(num));

	        // 5. Factorial using recursion
	        System.out.println("Factorial using recursion: " + factorialRec(num));
	    }

	    // Method
	    public static int factorialMethod(int n) {
	        int fact = 1;
	        for (int i = n; i >= 1; i--) {
	            fact *= i;
	        }
	        return fact;
	    }

	    // Recursion
	    public static int factorialRec(int n) {
	        if (n == 1) {
	            return 1;
	        }
	        return n * factorialRec(n - 1);
	    }
	}


