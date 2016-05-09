import java.util.*;

public class Binary_Decimal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the option: ");
		int input = in.nextInt();
		switch(input) {
		case 1:	
			String inp;
			System.out.println("Enter the binary value: ");
			Scanner str = new Scanner(System.in);
			inp = str.nextLine();
			int val = (int)btod(inp);
			System.out.println("Decimal Value is: " +val);
			break;
		case 2: 
			int inpd;
			System.out.println("Enter the Decimal value: ");
			Scanner strd = new Scanner(System.in);
			inpd = strd.nextInt();
			dtob(inpd);
			break;
		default : System.out.println("Choose a valid Input");
		}
		in.close();
	}
	
	private static double btod(String input) {
		double total = 0;
		double y = 0;
		int len = input.length();
		for(int i=len-1; i>=0; i--) {
			int x = Character.getNumericValue(input.charAt(i));
			total = total + x * Math.pow(2, y);
			y++;
		}
		return total;
	}
	
	private static void dtob (int decimal) {
		int b = decimal;
		String a = "";
		while(b>1) {
			if(b % 2 == 0) {
				b = b/2;
				a = a.concat("0");
			}
			if(b % 2 == 1) {
				b = (b-1)/2;
				a = a.concat("1");
			}
		}
		if(b == 0) a.concat("0");
		else a.concat("1");
		System.out.print("Binary value is: ");
		for(int i=a.length()-1; i>=0; i--) {
			System.out.print(a.charAt(i));
		}
	}
}
