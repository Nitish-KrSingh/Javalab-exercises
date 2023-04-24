package week8_220970064;
import java.util.*;

public class q8_2 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int x,y;
	System.out.println("Enter the size for 1st Array and 2nd Array");
	x= sc.nextInt();
	y= sc.nextInt();
	int []arr1 = new int[x];
	int []arr2 = new int[y];
		System.out.println("Enter the " + x + " element of array");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i]= sc.nextInt();
		}
	
		System.out.println("Enter the " + y + " element of array");
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = sc.nextInt();
		}
		
		try {
			for (int i = 0; i < arr2.length; i++) {
				System.out.print(arr1[i]/arr2[i] + " ");
			}
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException Error ");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException Error");
		}
	}

}
