package java_important001;

import java.util.Arrays;

public class Array_001 {

	public static void main(String[] args) {


		//Array Declaration and Initialization
		int[] numbers = {10, 20, 30, 40, 50};
		System.out.println("First element: " + numbers[0]);
		System.out.println("Third element: " + numbers[2]);


		//Array Using New Keyword
		String[] names = new String[3];
		names[0] = "John";
		names[1] = "Sam";
		names[2] = "Ravi";

		System.out.println("Names:");
		for(String n : names){
			System.out.println(n);
		}


	///scenario  all method -----------------------------------------------
	        int[] arr = {40, 10, 50, 20, 30};

	        // 1. length
	        System.out.println("Length: " + arr.length);

	        // 2. toString()
	        System.out.println("Array: " + Arrays.toString(arr));

	        // 3. sort()
	        Arrays.sort(arr);
	        System.out.println("Sorted: " + Arrays.toString(arr));

	        // 4. binarySearch()
	        int index = Arrays.binarySearch(arr, 30);
	        System.out.println("Index of 30: " + index);

	        // 5. equals()
	        int[] arr2 = {10, 20, 30, 40, 50};
	        System.out.println("Arrays equal? " + Arrays.equals(arr, arr2));

	        // 6. copyOf()
	        int[] copy = Arrays.copyOf(arr, arr.length);
	        System.out.println("Copy: " + Arrays.toString(copy));

	        // 7. copyOfRange()
	        int[] range = Arrays.copyOfRange(arr, 1, 4);
	        System.out.println("Copy range (1 to 3): " + Arrays.toString(range));

	        // 8. fill()
	        int[] filled = new int[5];
	        Arrays.fill(filled, 99);
	        System.out.println("Filled array: " + Arrays.toString(filled));

	        // 9. stream() - sum, min, max
	        int sum = Arrays.stream(arr).sum();
	        int min = Arrays.stream(arr).min().getAsInt();
	        int max = Arrays.stream(arr).max().getAsInt();

	        System.out.println("Sum: " + sum);
	        System.out.println("Min: " + min);
	        System.out.println("Max: " + max);
	    } 

}


