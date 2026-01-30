package java_important001;

public class Constructor_001 {
	
	    int id;
	    String name;

	    // Parameterized Constructor
	    Constructor_001(int i, String n) {
	        id = i;
	        name = n;
	    }

	    void display() {
	        System.out.println(id + " " + name);
	    }

	    public static void main(String[] args) {
	    	Constructor_001 s1 = new Constructor_001(101, "Rahul");
	    	Constructor_001 s2 = new Constructor_001(102, "Amit");

	        s1.display();
	        s2.display();
	    }
	}


