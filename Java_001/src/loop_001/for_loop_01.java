package loop_001;

public class for_loop_01 {
public static void main(String[] args) {
	
	        // 1. Simple for loop
	        System.out.println("1. Simple loop 1 to 5");
	        for (int i = 1; i <= 5; i++) {
	            System.out.println(i);
	        }

	        // 2. Reverse loop
	        System.out.println("\n2. Reverse loop 5 to 1");
	        for (int i = 5; i >= 1; i--) {
	            System.out.println(i);
	        }

	        // 3. Increment by 2
	        System.out.println("\n3. Loop increment by 2");
	        for (int i = 1; i <= 10; i += 2) {
	            System.out.println(i);
	        }

	        // 4. Decrement by 2
	        System.out.println("\n4. Loop decrement by 2");
	        for (int i = 10; i >= 1; i -= 2) {
	            System.out.println(i);
	        }

	        // 5. Print even numbers
	        System.out.println("\n5. Even numbers 1 to 20");
	        for (int i = 2; i <= 20; i += 2) {
	            System.out.println(i);
	        }

	        // 6. Print odd numbers
	        System.out.println("\n6. Odd numbers 1 to 20");
	        for (int i = 1; i <= 20; i += 2) {
	            System.out.println(i);
	        }

	        // 7. Nested for loop (table of 5)
	        System.out.println("\n7. Table of 5");
	        for (int i = 1; i <= 10; i++) {
	            System.out.println("5 x " + i + " = " + (5 * i));
	        }

	        // 8. Nested loop (rows and columns)
	        System.out.println("\n8. Nested loop: Pattern");
	        for (int i = 1; i <= 3; i++) {     // rows
	            for (int j = 1; j <= 5; j++) { // columns
	                System.out.print("* ");
	            }
	            System.out.println();
	        }

	        // 9. Using break
	        System.out.println("\n9. Using break");
	        for (int i = 1; i <= 10; i++) {
	            if (i == 5) break;
	            System.out.println(i);
	        }

	        // 10. Using continue
	        System.out.println("\n10. Using continue (skip 5)");
	        for (int i = 1; i <= 10; i++) {
	            if (i == 5) continue;
	            System.out.println(i);
	        }

	        // 11. Infinite loop with break
	        System.out.println("\n11. Infinite loop with break");
	        int count = 1;
	        for (;; ) {        // no condition → infinite
	            System.out.println(count);
	            if (count == 5) break;
	            count++;
	        }

	        // 12. Loop through char values
	        System.out.println("\n12. Print A to Z");
	        for (char c = 'A'; c <= 'Z'; c++) {
	            System.out.print(c + " ");
	        }
	        System.out.println();

	        // 13. Loop through array using for loop
	        System.out.println("\n13. Loop through array");
	        int[] arr = {10, 20, 30, 40, 50};
	        for (int i = 0; i < arr.length; i++) {
	            System.out.println(arr[i]);
	        }

	        // 14. Reverse loop through array
	        System.out.println("\n14. Reverse loop array");
	        for (int i = arr.length - 1; i >= 0; i--) {
	            System.out.println(arr[i]);
	        }
	    }
	}

