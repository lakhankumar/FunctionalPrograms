import java.util.Scanner;
import java.util.Arrays;

public class SumOfIntegers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int array[];
        array=new int[3];
        int i=0;
        int j=1;
        int k=2;
        System.out.println("Enter the elements of an array");
        for (int l = 0; l < 3; l++) {
			array[l]=scan.nextInt();
		}
        System.out.println(Arrays.toString(array));
        if(array[i]+array[j]+array[k]==0)
		{
			System.out.println(array[i]+ "+" + array[j]+"+" +array[k] +"=0");
		}
        else if(array[i]-array[j]+array[k]==0)
		{
			System.out.println(array[i]+ "-" + array[j]+ "+" +array[k] +"=0");
		}
        else if(array[i]-array[j]-array[k]==0)
		{
			System.out.println(array[i]+ "-" + array[j]+"-" +array[k] +"=0");
		}
        else if(array[i]+array[j]-array[k]==0)
		{
			System.out.println(array[i]+ "+" + array[j]+ "-" +array[k] +"=0");
		}
        else {
			System.out.println("Sum of Three integers zero doesnot exist");
		}
	}

}
