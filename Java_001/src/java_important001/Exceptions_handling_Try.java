package java_important001;

public class Exceptions_handling_Try {
public static void main(String[] args) {
	  try{
		  int a = 100/0;
	  }
	  catch(ArithmeticException e){
		  System.out.println(e.toString());
	  }
	  System.out.println("hello java");
	  System.out.println("hi");
	  System.out.println("");
}
}
