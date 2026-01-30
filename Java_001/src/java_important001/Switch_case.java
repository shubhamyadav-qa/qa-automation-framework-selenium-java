package java_important001;


public class Switch_case {

		  // enum type
	    enum Level { LOW, MEDIUM, HIGH }
	    public static void main(String[] args) {

	        // 1) int
	        int num = 2;
	        switch (num) {
	            case 1: System.out.println("Number: One"); break;
	            case 2: System.out.println("Number: Two"); break;
	            default: System.out.println("Number: Other");
	        }

	        // 2) char
	        char grade = 'B';
	        switch (grade) {
	            case 'A': System.out.println("Grade: Excellent"); break;
	            case 'B': System.out.println("Grade: Good"); break;
	            case 'C': System.out.println("Grade: Average"); break;
	            default:  System.out.println("Grade: Fail");
	        }

	        // 3) String
	        String fruit = "Apple";
	        switch (fruit) {
	            case "Apple":  System.out.println("Fruit: Apple is Red"); break;
	            case "Banana": System.out.println("Fruit: Banana is Yellow"); break;
	            default:       System.out.println("Fruit: Unknown");
	        }

	        // 4) enum
	        Level level = Level.MEDIUM;
	        switch (level) {
	            case LOW:    System.out.println("Level: Low"); break;
	            case MEDIUM: System.out.println("Level: Medium"); break;
	            case HIGH:   System.out.println("Level: High"); break;
	        }
	    }

}