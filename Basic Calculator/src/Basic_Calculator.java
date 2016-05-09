import java.util.*;

public class Basic_Calculator {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the option: ");
		String input = in.nextLine();
		switch(input) {
		case "+": 
			System.out.print("Enter the operand 1: ");
			int a = in.nextInt();
			System.out.print("Enter the operand 2: ");
			int b = in.nextInt();
			int c = add(a,b);
			System.out.println("On adding: " +c);
			break;
		case "-":
			System.out.print("Enter the operand 1: ");
			int e = in.nextInt();
			System.out.print("Enter the operand 2: ");
			int f = in.nextInt();
			System.out.print("On Subtracting:" +sub(e,f));
			break;
		case "*":
			System.out.print("Enter the operand 1: ");
			int g = in.nextInt();
			System.out.print("Enter the operand 2: ");
			int h = in.nextInt();
			System.out.print("On mulitiplying: " +multiply(g,h));
		case "/":
			System.out.print("Enter the operand 1:");
			int i = in.nextInt();
			System.out.print("Enter the operand 3: ");
			int j = in.nextInt();
			System.out.print("On dividing: " +divide(i,j));
			break;
		case "!":
			System.out.print("Enter the operand: ");
			int k = in.nextInt();
			System.out.print("Factorial is: " +factorial(k));
			break;
		case "^":
			System.out.print("Enter the number: ");
			int l = in.nextInt();
			System.out.print("Enter the power: ");
			int m = in.nextInt();
			System.out.print("The value is: " +power(l,m));
			break;
		case "<":
			System.out.print("Enter the LHS operand: ");
			int n = in.nextInt();
			System.out.print("Enter the RHS operand: ");
			int o = in.nextInt();
			lt(n,o);
			break;
		case ">":
			System.out.print("Enter the LHS operand: ");
			int p = in.nextInt();
			System.out.print("Enter the RHS operand: ");
			int q = in.nextInt();
			gt(p,q);
			break;
		case "=":
			System.out.print("Enter the operands: ");
			int r = in.nextInt();
			System.out.print("Enter the operands: ");
			int s = in.nextInt();
			boolean status = equals(r, s);
			if(status == true) System.out.print("A equals B");
			else System.out.print("A is not equeal to B");
			break;
		default:
			System.out.println("Enter a valid operator");
		}
		in.close();
	}
	private static int add(int a, int b) {
		return a + b;
	}
	
	private static int sub(int a, int b) {
		return a-b;
	}
	
	private static int multiply(int a,int b) {
		return a * b;
	}
	
	private static int divide(int a, int b) {
		return a / b;
	}
	
	private static int factorial(int a) {
		int total = 1;
		for(int i=a; i>=1; i--) {
			total = total * i; 
		}
		return total;
	}
	
	private static int power(int a, int b) {
		return (int)Math.pow(a, b);
	}
	
	private static void lt(int a, int b) {
		if(a<b) System.out.print("A is lesser");
		else System.out.print("B is lesser");
	}
	
	private static void gt(int a, int b) {
		if(a > b) System.out.print("A is greater");
		else System.out.print("B is greater");
	}
	
	private static boolean equals(int a, int b) {
		return a==b;
	}
}
