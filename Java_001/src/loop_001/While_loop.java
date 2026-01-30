package loop_001;

public class While_loop {
public static void main(String[] args) {
	        // 1. Basic
	        int i = 1;
	        while(i <= 5){
	            System.out.println("Basic: " + i);
	            i++;
	        }

	        // 2. Reverse
	        int j = 5;
	        while(j >= 1){
	            System.out.println("Reverse: " + j);
	            j--;
	        }

	        // 3. Even
	        int e = 2;
	        while(e <= 10){
	            System.out.println("Even: " + e);
	            e += 2;
	        }

	        // 4. Odd
	        int o = 1;
	        while(o <= 10){
	            System.out.println("Odd: " + o);
	            o += 2;
	        }

	        // 5. Sum
	        int s = 1, sum = 0;
	        while(s <= 5){
	            sum += s;
	            s++;
	        }
	        System.out.println("Sum = " + sum);

	        // 6. Continue
	        int c = 1;
	        while(c <= 10){
	            if(c == 5){
	                c++;
	                continue;
	            }
	            System.out.println("Continue skip: " + c);
	            c++;
	        }

	        // 7. Break
	        int b = 1;
	        while(b <= 10){
	            if(b == 5){
	                break;
	            }
	            System.out.println("Break at: " + b);
	            b++;
	        }
	    }
	}

