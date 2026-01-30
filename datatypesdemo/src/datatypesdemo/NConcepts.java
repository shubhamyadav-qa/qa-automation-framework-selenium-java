package datatypesdemo;

public class NConcepts {
	 int adharcard ;
	 
	public static void main(String[] args) {
		
		NConcepts ab=new NConcepts();
//		ab.adhaarNumber(2);
//		ab.adhaarNumber(10);

		ab.employeeCompantyName();
//		
//		employeeCompantyName();
	}

 public void adhaarNumber(int a) {
	 System.out.println(a);
 }

	public  void employeeCompantyName() {
		
		for (int i = 1; i <= 10; i++) {
			for (int q= 1;q<=10;q++) {
				
			

			System.out.print("("+ q + "*" + i + "=" + (q * i)+")");
		}
		System.out.println();
		
		}
	}

	public void employeeId() {
		
     System.out.println("x");
	}

}
