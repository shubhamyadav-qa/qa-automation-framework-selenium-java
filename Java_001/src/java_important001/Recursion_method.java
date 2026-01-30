package java_important001;

public class Recursion_method {

		
		    public static void countdown(int n) {
		        if (n == 0) {
		            System.out.println("Done!");
		        } else {
		            System.out.println(n);
		            countdown(n - 1); // Recursive call
		        }
		    }

		    public static void main(String[] args) {
		        countdown(5);
		    }
		}


