import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		float distance;
		System.out.println("enter x cordinate");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		System.out.println("enter y cordinate");
		int y = scan.nextInt();
		distance = (float) Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
		System.out.println(distance+ " is the distance");
	}

}
