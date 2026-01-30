package frijuly;
public class ReverseWithSpaces {
	public static void main(String[] args) {
		String input = "my name is ram";
		char[] inputArr = input.toCharArray();
		char[] result = new char[inputArr.length];

		// Step 1: Mark spaces in the result array
		for (int i = 0; i < inputArr.length; i++) {
			if (inputArr[i] == ' ') {
				result[i] = ' ';
			}
		}	
		
		// Step 2: Reverse characters while skipping spaces
		int j = inputArr.length - 1;
		System.out.println(j);
		for (int i = 0; i < inputArr.length; i++) {
			System.out.println(inputArr[i]);
			System.out.println(inputArr[i] != ' ');
			if (inputArr[i] != ' ') {
				while (j >= 0 && result[j] == ' ') {
					j--;
				}
				result[j--] = inputArr[i];
			}
		}
		System.out.println(new String(result));
	}
}