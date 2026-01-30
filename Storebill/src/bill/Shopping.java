package bill;

public class Shopping {
	static int rice = 13;

	public static void main(String[] args) {

		double value = Shopping.calculate(1, 02, 03, 04, 50);
		System.out.println("total price of shirt and jeans  =  " + value);
		double tvaluen = Shopping.calculatetotal(10, 20, 30, 40, 50);
		System.out.println("total price of cap and towels=  " + tvaluen);

		for (int e = 1; e <= 123; e++) {
			System.out.println(e);
		}
	}

	public static double calculate(int shirtquantity, double shirtprice, int jeansquantity, double jeansprice,
			double discountPercent) {
		double total = (shirtquantity * shirtprice) + (jeansquantity * jeansprice);
		double discount = rice + total * discountPercent / 100;
		System.out.println(rice);
		System.out.println("price of shirt =" + 1 * 2);
		return total - discount;
	}

	public static double calculatetotal(int towelqty, double towelprice, int capQty, double capprice,
			double discountpercent) {
		double total = (towelqty * towelprice) + (capQty * capprice);
		double discount = total * discountpercent / 100;

		return total - discount;
	}

	public static double calculate(int underwear, int underwearprice, int shoes, int shoesprice, double discountprice) {
		double total = (underwear * underwearprice) + (shoes * shoesprice);
		double discount = total * discountprice / 100;
		System.out.println("price of shirt shubham =" + 1 * 2);

		for (int e = 1; e <= 123; e++) {
			System.out.println(e);
		}
		return discount;

	}
}
	

