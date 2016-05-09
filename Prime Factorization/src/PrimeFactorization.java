import java.util.*;
public class PrimeFactorization {

	public static void main(String[] args) {
		int size;
		int z = 1;
		System.out.println("Enter a number: ");
		Scanner in = new Scanner(System.in);
		size = in.nextInt();
		int[] arr = new int[size];
		arr[0] = 2;
		for(int i=2; i<size; i++) {
			boolean is = isPrime(i);
			if(is == true) {
				arr[z] = i;
				z++;
			}
		}
	
		for(int i=1; i<z; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("");
		for(int i=0; i<z-1; i++) {
			if(size % arr[i] == 0) {
				size = size / arr[i];
				System.out.print(arr[i] +" ");	
				i = 0;
			}
		}	
		in.close();
	}
	
	private static boolean isPrime(int num) {
		for(int i=2; i<num; i++) {
			if(num % i == 0)
				return false;
		}
		return true;
	}

}
