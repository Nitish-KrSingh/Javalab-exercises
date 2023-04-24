package week8_220970064;
import java.util.Scanner;

public class Que2 {

	public static void main(String[] args) {
		int x,y;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of both array");
			x = sc.nextInt();
			y = sc.nextInt();
			
			int arr1[] = new int[x];
			int arr2[] = new int[y];
			
			System.out.println("Enter the element of first array");
			for (int i = 0; i < arr1.length; i++) {
				arr1[i] = sc.nextInt();
			}
			System.out.println("Enter the element of Second array");
			for (int i = 0; i < arr1.length; i++) {
				arr2[i] = sc.nextInt();
			}
			
			try {
				for (int i = 0; i < arr2.length; i++) {
					System.out.println(arr1[i]/arr2[i] + " ");
				}
				
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
			catch (ArithmeticException e) {
				System.out.println(e);
			}
	}

}
