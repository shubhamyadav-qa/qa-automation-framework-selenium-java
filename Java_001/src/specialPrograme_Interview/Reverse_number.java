package specialPrograme_Interview;

public class Reverse_number {
	    // 1️⃣ Reverse using WHILE loop
	    static int reverseWhile(int num) {
	        int rev = 0;
	        while (num > 0) {
	            rev = rev * 10 + (num % 10);
	            num = num / 10;
	        }
	        return rev;
	    }

	    // 2️⃣ Reverse using FOR loop
	    static int reverseFor(int num) {
	        int rev = 0;
	        for (; num > 0; num = num / 10) {
	            rev = rev * 10 + (num % 10);
	        }
	        return rev;
	    }

	    // 3️⃣ Reverse using StringBuilder
	    static String reverseString(int num) {
	        return new StringBuilder(String.valueOf(num)).reverse().toString();
	    }

	    // 4️⃣ Reverse using Char Array
	    static String reverseCharArray(int num) {
	        char arr[] = String.valueOf(num).toCharArray();
	        String rev = "";
	        for (int i = arr.length - 1; i >= 0; i--) {
	            rev = rev + arr[i];
	        }
	        return rev;
	    }
	    // 5️⃣ Reverse using Recursion
	    static int rev = 0;
	    static void reverseRecursion(int num) {
	        if (num == 0)
	            return;
	        rev = rev * 10 + (num % 10);
	        reverseRecursion(num / 10);
	    }

	    

	    public static void main(String[] args) {

	        int number = 12345;

	        System.out.println("Original Number: " + number);

	        System.out.println("Reverse (While Loop): " + reverseWhile(number));
	        System.out.println("Reverse (For Loop): " + reverseFor(number));
	        System.out.println("Reverse (StringBuilder): " + reverseString(number));
	        System.out.println("Reverse (Char Array): " + reverseCharArray(number));

	        rev = 0; // reset before calling recursion
	        reverseRecursion(number);
	        System.out.println("Reverse (Recursion): " + rev);
	        
	    
	        
	        
	    }
	}


