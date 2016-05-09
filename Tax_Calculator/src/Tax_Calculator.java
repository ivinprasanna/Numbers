import java.util.*;
public class Tax_Calculator {

	public static void main(String[] args) {
		System.out.print("Enter the cost: ");
		Scanner in = new Scanner(System.in);
		double cost = in.nextDouble();
		
		System.out.print("Enter the state tax: ");
		double tax = in.nextDouble();
		
		System.out.print("Cost after Tax included: " +afterDeduction(cost,tax));
		in.close();
	}
	private static double afterDeduction(double cost, double tax) {
		double taxMoney = cost * (tax/100);
		double afterDeduction = cost + taxMoney;
		return afterDeduction;
	}

}
