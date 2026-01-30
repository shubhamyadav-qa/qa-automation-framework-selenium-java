package test_01;


public class pratice_reverse {
	public static void main(String[] args) {
		String name = "i am qa tester";

//	for(int i=0; i<input.length; i++) {
//		if(input[i] !=' ') {
//			while(result[j] ==' ')
//				j--;
//			 result[j]= input[i];
//			 j--; }	}
//	System.out.println(result);
		
		
		
		char[] input=name.toCharArray();
	    char[] result = new char[input.length];
	    
	    for(int i =0; i<name.length(); i++) {
	    	if(input[i] == ' ') {
	    		result[i]= ' ';
	    	}
	    }
	    int j= input.length-1;
	    for(int i=0; i<input.length; i++) {
	    	if(input[i] !=' ') {
	    		while(result[j]==' ') 
	    			j--;
	    			result[j]= input[i];
	    			j--;
	    		}
	    	}
	    
	    System.out.println(result);
	}}
       
