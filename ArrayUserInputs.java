import java.util.Scanner;

public class ArrayUserInputs {

	public static void main(String[] args) {
		System.out.println("Enter the lenght of an array");
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		System.out.println("array elements");
		int arr[]=new int[length];
		for (int i = 0; i < length; i++) {
			arr[i]=(int) scan.nextInt();
		}
		System.out.println("array elements are : ");
		for (int i=0; i<length;i++) {
			System.out.println(arr[i]);	
		}
		
	}

}
