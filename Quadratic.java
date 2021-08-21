import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		
		System.out.println("Enter  your input a");
		Scanner scan = new Scanner(System.in);
		double a = scan.nextInt();
		System.out.println("Enter  your input b");
		double b = scan.nextInt();
		System.out.println("Enter your input c");
		double c = scan.nextInt();
		quadraicfn(a, b, c);
	}
	static void quadraicfn(double a, double b, double c) {
		double delta;
		double root1,root2;
		delta = Math.pow(b, 2)-4*a*c;
		root1 = (-b + Math.sqrt(delta))/(2*a);
		root2 = (-b - Math.sqrt(delta))/(2*a);
		System.out.println(delta);
		System.out.println(root1);
		System.out.println(root2);
	}
}	
