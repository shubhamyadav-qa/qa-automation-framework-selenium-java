package java_important001;

public class Return_type001 {

	 public static void main(String[] args) {
		 int val=Return_type001.add();
		Return_type001.subtract(val);
		 
	}
	    public static int add() {
	    	int a = 20;
	    	int b= 40;
	    	int c= a+b;
	    	return c;
	    }
	    public static  void subtract (int a) {
	    	int d = 23;
			int h =d+a;
			System.out.println(h);
		}
	    
	    
	    ///////////////when it non static  so how it can return----------------////////////////////////
	    ///public void show() {
//	        System.out.println("This is void method");
//	    }
//
//	    public int getNumber() {
//	        return 100;
//	    }
//
//	    public String getMessage() {
//	        return "Hello Java";
//	    }
//
//	    public boolean check() {
//	        return false;
//	    }
//
//	    public static void main(String[] args+
//	    		) {
//	    	Return_type001 obj = new Return_type001();
//
//	        obj.show();
//	        System.out.println(obj.getNumber());
//	        System.out.println(obj.getMessage());
//	        System.out.println(obj.check());
//	        
//	        
//	        
//	        
//	        
//	    }
	    
	}




