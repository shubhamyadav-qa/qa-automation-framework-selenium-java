package java_important001;


public class OverLoading {

	public static void main(String[] args) {
		
		Overridingclass over= new Overridingclass();
		over.Marks(0);
		over.markse();
		over.Student(null, 0);
		
		
		Overriding2 overide= new Overriding2();
		overide.Marks(0);
		overide.markse();
		overide.markset();
		overide.Student(null, 0);
		overide.main(args);
		
		
		Overridingclass parentchild  = new Overriding2();
		parentchild.Marks(0);
		parentchild.markse();
		parentchild.Student(null, 0);
		
		Inheritance1 inhert= new Inheritance1 ();
		inhert.name();
		inhert.print1();
		inhert.name1();
		inhert.print();
	}

}
