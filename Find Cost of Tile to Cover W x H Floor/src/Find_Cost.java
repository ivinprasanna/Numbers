import java.util.*;
public class Find_Cost {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	System.out.println("Enter the width: ");
	double width = in.nextDouble();
	System.out.println("Enter the height: ");
	double height = in.nextDouble();
	System.out.println("Enter the cost: ");
	double cost = in.nextDouble();
	
	double total = width * height * cost;
	
	System.out.println("Total Price: " +total);
	in.close();

	}

}
