package specialPrograme_Interview;

public class Print_starPyramid {
public static void main(String[] args) {
	        int n = 4;

	        for(int i = 1; i <= n; i++) {
	            for(int space = n - i; space > 0; space--) {
	                System.out.print(" ");
	            }
	            for(int star = 1; star <= (2*i - 1); star++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	    }
	}
