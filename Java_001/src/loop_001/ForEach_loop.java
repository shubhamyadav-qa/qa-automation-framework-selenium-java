package loop_001;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ForEach_loop {
public static void main(String[] args) {

	        // 1. For-each with int array
	        int[] numbers = {10, 20, 30};
	        System.out.println("Int Array:");
	        for (int n : numbers) {
	            System.out.println(n);
	        }

	        // 2. For-each with String array
	        String[] fruits = {"Apple", "Banana", "Mango"};
	        System.out.println("\nString Array:");
	        for (String f : fruits) {
	            System.out.println(f);
	        }

	        // 3. For-each with List
	        List<String> names = Arrays.asList("John", "Sara", "David");
	        System.out.println("\nList:");
	        for (String name : names) {
	            System.out.println(name);
	        }

	        // 4. For-each with Map (key-value)
	        Map<String, Integer> scores = Map.of(
	                "Math", 90,
	                "English", 85,
	                "Science", 92
	        );
	        System.out.println("\nMap:");
	        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
	            System.out.println(entry.getKey() + " = " + entry.getValue());
	        }
	    }
	}


