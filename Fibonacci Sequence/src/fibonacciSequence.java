import java.util.*;
public class fibonacciSequence {

	public static void main(String[] args) {
		System.out.println("Enter the Nth number");
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] arr = new int[size];
		for(int i=0; i<size-1; i++)
			arr[i] = i;
		for(int i=0; i<size-1; i++)
		{
			int j = i+1;
			int z = j+1;
			if(z < size && j < size)
			arr[z] = arr[i]+arr[j];
		}
		for(int i=0; i<size; i++)
			System.out.print(arr[i] +" ");
		in.close();

	}

}
