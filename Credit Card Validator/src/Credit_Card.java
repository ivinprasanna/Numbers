import java.util.*;
public class Credit_Card {

	public static void main(String[] args) {
		System.out.println("Enter the Credit Card number: ");
		Scanner in = new Scanner(System.in);
		
		String number = in.nextLine();
		boolean status = validator(number);
		if(status == true) 
			System.out.println("Valid");
		else
			System.out.println("Not Valid");
		in.close();
	}
	
	private static boolean validator(String number) {
		int[] arr = new int[15];
		for(int i=0; i<number.length()-1; i++) {
			arr[i] = Integer.parseInt(number.substring(i, i+1));
		}
		int lastDigit = Integer.parseInt(number.substring(15, 16));
		int y=0;
		int[] revArr = new int[15];
		for(int i=number.length()-2; i>=0; i--) {
			revArr[y] = arr[i];
			y++;
		}
		
		int z = 0;
		for(int i=0; i<number.length()-1; i++) {
			z = i + 1;
			if(z % 2 != 0)
				revArr[i] = revArr[i] * 2;
		}
				
		for(int i=0; i<number.length()-1; i++) {
			if(revArr[i] > 9) {
				revArr[i] = revArr[i] - 9;
			}
		}
				
		int total = 0;
		for(int i=0; i<number.length()-1; i++) {
			total = total + revArr[i];
		}
		
		int mod = total % 10;
		if(mod == lastDigit) {
			return true;
		}
		return false;
	}
}
