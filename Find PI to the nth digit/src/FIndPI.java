import java.util.*;
import java.text.*;
public class FIndPI {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = in.nextInt();
		double pi = 22/7.0;
		System.out.println("The PI value is: " +pi);
		String z = "#.";
		for(int i=0; i<num; i++)
		{
			String b = "#";
			z = con(z,b);
		}
		DecimalFormat df = new DecimalFormat(z);
		System.out.println("The precisioned PI value is: " +df.format(pi));
		in.close();
	}
	static String con(String a, String b)
	{
		a = a+b;
		return a;
	}
		
}
