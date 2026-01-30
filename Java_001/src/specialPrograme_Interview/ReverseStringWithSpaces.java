package specialPrograme_Interview;

public class ReverseStringWithSpaces {
	
	    public static void main(String[] args) {

	        String str = "my name is shubham";

	        System.out.println("Original : " + str);

	        System.out.println("Method 1 (Char Array):     " + method1(str));
	        System.out.println("Method 2 (Two Pointer):    " + method2(str));
	        System.out.println("Method 3 (StringBuilder):  " + method3(str));
	        System.out.println("Method 4 (Stack):          " + method4(str));
	        System.out.println("Method 5 (Collections):    " + method5(str));
	    }
	    // -------------------------------------------------------
	    // 1️⃣ METHOD-1: Character Array Manual Logic
	    // -------------------------------------------------------
	    public static String method1(String str) {
	        char[] input = str.toCharArray();
	        char[] result = new char[input.length];

	        for (int i = 0; i < input.length; i++) {
	            if (input[i] == ' ')
	                result[i] = ' ';
	        }

	        int j = input.length - 1;
	        for (int i = 0; i < input.length; i++) {
	            if (input[i] != ' ') {
	                while (result[j] == ' ')
	                    j--;
	                result[j] = input[i];
	                j--;
	            }
	        }
	        return new String(result);
	    }

	    // -------------------------------------------------------
	    // 2️⃣ METHOD-2: Two Pointer Approach
	    // -------------------------------------------------------
	    public static String method2(String str) {
	        char[] arr = str.toCharArray();
	        int left = 0, right = arr.length - 1;

	        while (left < right) {
	            if (arr[left] == ' ') {
	                left++;
	            } else if (arr[right] == ' ') {
	                right--;
	            } else {
	                char temp = arr[left];
	                arr[left] = arr[right];
	                arr[right] = temp;

	                left++;
	                right--;
	            }
	        }
	        return new String(arr);
	    }
	    // -------------------------------------------------------
	    // 3️⃣ METHOD-3: Using StringBuilder Reverse + Fix Spaces
	    // -------------------------------------------------------
	    public static String method3(String str) {

	        StringBuilder sb = new StringBuilder(str.replace(" ", ""));
	        sb.reverse();
	        char[] result = str.toCharArray();
	        int index = 0;

	        for (int i = 0; i < result.length; i++) {
	            if (result[i] != ' ')
	                result[i] = sb.charAt(index++);
	        }
	        return new String(result);
	    }

	    // -------------------------------------------------------
	    // 4️⃣ METHOD-4: Using Stack
	    // -------------------------------------------------------
	    public static String method4(String str) {

	        java.util.Stack<Character> stack = new java.util.Stack<>();

	        for (char c : str.toCharArray()) {
	            if (c != ' ')
	                stack.push(c);
	        }

	        StringBuilder sb = new StringBuilder();

	        for (char c : str.toCharArray()) {
	            if (c == ' ')
	                sb.append(' ');
	            else
	                sb.append(stack.pop());
	        }
	        return sb.toString();
	    }

	    // -------------------------------------------------------
	    // 5️⃣ METHOD-5: Using List + Collections.reverse()
	    // -------------------------------------------------------
	    public static String method5(String str) {

	        java.util.List<Character> list = new java.util.ArrayList<>();

	        for (char c : str.toCharArray()) {
	            if (c != ' ')
	                list.add(c);
	        }

	        java.util.Collections.reverse(list);

	        char[] result = new char[str.length()];
	        int index = 0;

	        for (int i = 0; i < result.length; i++) {
	            if (str.charAt(i) == ' ')
	                result[i] = ' ';
	            else
	                result[i] = list.get(index++);
	        }
	        return new String(result);
	    }
	}


