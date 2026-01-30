package bill;

public class Java_Programming {

	public static void main(String[] args) {
		starPrint();
		
	}
		public static void reverseString() {

		String str = "sunil yadav";
		// StringBuilder sb=new StringBuilder(str);
		// sb.reverse();

		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			System.out.print(ch);

		}
	}
		
		public  static void starPrint() {
			String word="shubham";
			int size=word.length();
			for(int i=size-1;i>=0;i--) {
				char ch=word.charAt(i);
				System.out.print (ch);
			}
		}

}
