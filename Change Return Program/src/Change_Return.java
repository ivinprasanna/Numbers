import java.util.*;

public class Change_Return {

	public static void main(String[] args) {
		System.out.println("Enter the Total amount: ");
		Scanner in = new Scanner(System.in);
		float total = in.nextFloat();
		System.out.println("Enter the money given: ");
		float money = in.nextFloat();
		float change = money - total;
		System.out.println("Change is: " +change);
		returnChange(change);
		in.close();
	}
	private static void returnChange(float change) {
		int iChange = (int)change;
		float bal = (change - iChange) * 100;
		int tBal = (int)bal;
		System.out.println("Dollars: " +iChange);
		int quarters, dime, nickel;
		if(tBal >= 25) {
			quarters = tBal / 25;
			tBal = tBal - (25*quarters);
			System.out.println("Quarters: " +quarters);
		}
		if(tBal >= 10) {
			dime = tBal / 10;
			tBal = tBal - (10*dime);
			System.out.println("Dime: " +dime);
		}
		if(tBal >= 5) {
			nickel = tBal / 5;
			tBal = tBal - (5*nickel);
			System.out.println("Nickel: " +nickel);
		}
		if(tBal < 5){
			System.out.println("Cents: " +tBal);
		}
			
	}
}
