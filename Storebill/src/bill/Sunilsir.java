package bill;

public class Sunilsir {
//	global variable
//	outside method,block,constructor
	static int x = 10;
	int y = 9;

	static {
		System.out.println(x);

	}

	public static void main(String[] args) {//entry
		System.out.println("shubham");
		name1();
		
		Sunilsir abc=new Sunilsir();
		
		
	name2();
//		result.name3();
	}
//	special  
	 Sunilsir(){
		System.out.println("ram");
	}
	
	 Sunilsir(String s){
		System.out.println(s);
	}
	
	static {
//		System.out.println("sunil123");
	}
	public static void name1() {
		System.out.println("name1");

	}

	public static void name2() {
		System.out.println("name2");
	

	
for (int i= 0;i<10;i++) {
	for(int g =0; g<=i;g++) {
			System.out.print("^$");
		}
	
	System.out.println("");

}
//same row   
for (int j=10;j>=0;j--) {
	for(int z=0;z<=j;z++) {
		System.out.print("^$");
	}
	System.out.println("");
	
}

}
}
