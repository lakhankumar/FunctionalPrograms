import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of t");
		double t = scan.nextDouble();
		System.out.println("Enter the value of v");
		double v = scan.nextDouble();
		if (t<50 && 3<v && v<120) {
			double windchill=35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v, 0.16);
			System.out.println(windchill);
		}
		else
			System.out.println("invalid value for t or v");
	}

}
