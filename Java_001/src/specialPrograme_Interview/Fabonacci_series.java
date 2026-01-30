
package specialPrograme_Interview;

public class Fabonacci_series {

	    // ---------- 1. Recursion Method ----------
	    static int fibRec(int n) {
	        if (n <= 1) return n;
	        return fibRec(n - 1) + fibRec(n - 2);
	    }

	    public static void main(String[] args) {

	        int n = 10;

	        // ---------- 2. Fibonacci using FOR loop ----------
	        System.out.println("Fibonacci Using For Loop:");
	        int a = 0, b = 1;
	        System.out.print(a + " " + b + " ");
	        for (int i = 2; i < n; i++) {
	            int c = a + b;
	            System.out.print(c + " ");
	            a = b;
	            b = c;
	        }

	        // ---------- 3. Fibonacci using WHILE loop ----------
	        System.out.println("\n\nFibonacci Using While Loop:");
	        a = 0; b = 1;
	        int i = 2;
	        System.out.print(a + " " + b + " ");
	        while (i < n) {
	            int c = a + b;
	            System.out.print(c + " ");
	            a = b;
	            b = c;
	            i++;
	        }

	        // ---------- 4. Fibonacci Using Recursion ----------
	        System.out.println("\n\nFibonacci Using Recursion:");
	        for (int j = 0; j < n; j++) {
	            System.out.print(fibRec(j) + " ");
	        }

	        // ---------- 5. Fibonacci Using Array ----------
	        System.out.println("\n\nFibonacci Using Array:");
	        int[] fib = new int[n];
	        fib[0] = 0;
	        fib[1] = 1;

	        for (int k = 2; k < n; k++) {
	            fib[k] = fib[k - 1] + fib[k - 2];
	        }

	        for (int x : fib) {
	            System.out.print(x + " ");
	        }

	        // ---------- 6. Fibonacci Using For-Each Loop ----------
	        System.out.println("\n\nFibonacci Using For-Each:");
	        for (int x : fib) {
	            System.out.print(x + " ");
	        }
	    }
	}
