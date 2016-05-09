import java.util.*;
public class Unit_Converter {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter what you want to convert: ");
		String input = in.nextLine();
		switch(input.toUpperCase()) {
		case "TEMP": 
			System.out.print("Enter 1 for ctof and 2 for ftoc: ");
			int inp = in.nextInt();
			switch(inp) {
			case 1: 
				System.out.print("Enter the Celesius: ");
				double c = in.nextDouble();
				System.out.print("Fahrenheit: " +ctof(c));
				break;
			case 2:
				System.out.print("Enter the Fahrenheit: ");
				double f = in.nextDouble();
				System.out.print("Celesius: " +ftoc(f));
				break;
			}
			break;
		case "CURRENCY":
				System.out.print("Converted amount is: " +(float)currency());
				break;
		case "VOLUME":
				System.out.print("Converted volume is: " +(float)volume());
				break;
		default:
				System.out.print("Enter an appropriate unit");
				break;
		}
		in.close();
	}
	
	private static double ctof(double c) {
		return (c*9/5)+32;
	}
	
	private static double ftoc(double f) {
		return (f-32)*(5/9);
	}
	
	private static double currency() {
		Scanner in = new Scanner(System.in);
		String currency[] = {"USD", "EUR", "JPY", "GBP", "AUD", "CAD", "CHF"};
		for(int i=0; i<currency.length; i++) {
			System.out.println(i+1 +"." +currency[i]);
		}
		double value[] = {1, 0.88, 108.11, 0.68, 1.31, 1.25, 0.97};
		System.out.print("Enter the currency to convert: ");
		int cf = in.nextInt();
		System.out.print("Enter the currency to convert to: ");
		int ct = in.nextInt();
		System.out.print("Enter the amount: ");
		double amt = in.nextDouble();
		double cfValue = value[cf-1];
		double ctValue = value[ct-1];
		in.close();
		return (ctValue/cfValue)*amt;
	}
	
	private static double volume() {
		Scanner in = new Scanner(System.in);
		String metrics[] = {"GALLON", "QUART", "PINT", "CUP", "OUNCE", "TABLESPOON", "TEASPOON"};
		for(int i=0; i<metrics.length; i++) {
			System.out.println(i+1 +"." +metrics[i]);
		}
		double values[] = {0.26, 1.06, 2.11, 4.17, 33.81, 67.63, 202.88, 0.001};
		System.out.print("Enter the metric to convert from: ");
		int mf = in.nextInt();
		System.out.print("Enter the metric to convert to: ");
		int mt = in.nextInt();
		System.out.print("Enter the amount: ");
		double amt = in.nextDouble();
		double mfValue = values[mf-1];
		double mtValue = values[mt-1];
		in.close();
		return (mtValue/mfValue)*amt;
	}
	
	

}
