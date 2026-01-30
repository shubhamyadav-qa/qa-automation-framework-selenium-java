package specialPrograme_Interview;

import java.util.Scanner;

import org.openqa.selenium.support.ui.Select;

public class Palindrome_number {
	
	    // Method
	    public static boolean isPalindrome(int num){
	        int temp = num, rev = 0;

	        while(temp > 0){
	            rev = rev * 10 + (temp % 10);
	            temp /= 10;
	        }
	        return num == rev;
	    }

	    public static void main(String[] args) {

	        // Scanner
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number: ");
	        int num = sc.nextInt();

	        // While loop
	        if(isPalindrome(num))
	            System.out.println(num + " → Palindrome (Method + While)");
	        else
	            System.out.println(num + " → Not Palindrome");

	        // For loop example
	        int num2 = 121;
	        int rev = 0;
	        for(int temp = num2; temp > 0; temp /= 10){
	            rev = rev * 10 + (temp % 10);
	        }
	        System.out.println(num2 + " Palindrome using For loop? " + (num2 == rev));

	        // String method
	        String s = String.valueOf(num2);
	        String rs = new StringBuilder(s).reverse().toString();
	        System.out.println(num2 + " Palindrome using String? " + s.equals(rs));
	        
	    }
	}


