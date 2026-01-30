package frijuly;

public class frijuly11 {

	public static void main(String[] args) {
//		cloth();
//		businesstrip();
//		jucieBar();
//		traveling();
//		methodForSalary();
//		student();
//		travel();
		
	int a=1;//
	
//	int b=2;
		
	 int number = 3; // you can change this to any number

     for (int i = 1; i <= 10; i++) {
         System.out.println(number + " x " + i + " = "+number*i);
     }
 }
		
		
		

	

	public static void cloth() {
		int jeans = 1200;
		int jeansqty = 2;
		int shirt = 800;
		int shirtqty = 3;
		int jacket = 2500;
		int jacketqty = 1;
		int total = jeans * jeansqty + shirt * shirtqty + jacket * jacketqty;
		double discount = 0;
		if (total > discount) {
			discount = 0.10 * total;
		}
		double finalamount = total - discount;
		System.out.println(finalamount);
	}

	public static void businesstrip() {
		int stay = 1200;
		int stayqty = 3;
		int food = 500;
		int foodqty = 3;
		int transport = 300;
		int transportqty = 3;
		int total = (stay * stayqty + food * foodqty + transport * transportqty);
		double reimbursesamount = total * 0.80;
		double Pprice = total - reimbursesamount;
		System.out.println(reimbursesamount);
		System.out.println(Pprice);
	}

	public static void jucieBar() {
		int mangojuice = 80;
		System.out.println();
		int bananasmoothie = 90;
		int mixedjuice = 100;
		int combojuice = 240;
		int numberofcombo = 2;
		int extrabananasmoothie = 1;
		int totalpricecombo = numberofcombo * combojuice;
		int extrasmoothieprice = extrabananasmoothie * bananasmoothie;
		int finalcost = totalpricecombo + extrasmoothieprice;
		System.out.println(finalcost);
	}

	public static void traveling() {
		int ticketFare = 3200;
		int numberofFriend = 4;
		int oneFriendpaid = 800;
		int toallpay = ticketFare / numberofFriend;
		int onealreadypaid = ticketFare;
		int Amountremaining = onealreadypaid - oneFriendpaid;
		int remainingfriend = numberofFriend - 2;
		int amountreamingpay = Amountremaining / remainingfriend;
		System.out.println(amountreamingpay);
	}

	public static void methodForSalary() {
		int salary = 50000;// declaration
		int food = 8000;
		int rent = 12000;
		int transport = 3000;
		int enterianment = 2000;
		int savingthought = 10000;
		int totalexpenses = rent + food + transport + enterianment;
		int requiredamount = salary - savingthought;
		int spandable = requiredamount - totalexpenses;
		System.out.println(spandable);
	}

	public static void student() {
		int hours = 3;
		int minutes = 15;
		int totalMinutes = (hours * 60) + minutes;
		int firsthourcharge = 20;
		int halfhourcharge = 10;

		int remainingMinutes = totalMinutes - 60;
		int additionalhalfhours = remainingMinutes - (firsthourcharge + halfhourcharge);
		System.out.println(additionalhalfhours);
	}

	public static void travel() {
		double caraverage = 15; //
		double Pperlitre = 105;
		double distance = 225;
		double fuelused = distance / caraverage;
		System.out.println(fuelused * Pperlitre);
	}
}
