import java.util.*;
public class Next_Prime {

	public static void main(String[] args) {
		int a = 0;
		int i = 2;
		Scanner in = new Scanner(System.in);
		while(a != -1) {
			boolean stat = isPrime(i);
			System.out.println("Number is: " +i +" " +stat);
			i++;
			a = in.nextInt();
		}
		in.close();
	}
	private static boolean isPrime(int i) {
		for(int j=2; j<i; j++) {
			if(i % j == 0 && i != 2)
				return false;
		}
		return true;
	}

}
