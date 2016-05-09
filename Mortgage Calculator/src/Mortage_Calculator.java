
public class Mortage_Calculator {

	public static void main(String[] args) {
	double int_rate = 0.06;
	double loan = 500;
	double period = 12;
	double total = monthlyPayment(int_rate, loan, period);
	double mon = monthlyPayment(int_rate, loan, period)/12;
	System.out.println("Monthly Payment is: " +mon);
	double time = payBack(mon, total);
	System.out.println("Pay Back time will be: " +time);
	}
	
	private static double monthlyPayment(double rate, double loan, double time) {
		double pay;
		double num;
		double den;
		
		num = loan*(Math.pow(1+rate, time));
		den = Math.pow(1+rate, time) - 1;
		pay = num/den;
		return pay;
	}
	
	private static double payBack(double mon, double total) {
		double time = 0;
		double tot = 0;
		while(tot < total) {
			tot = tot + mon;
			time++;
		}		
		return time;
	}
}
