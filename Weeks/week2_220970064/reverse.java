package week2_220970064;
import java.util.*;
class reverse
{
	public static void main(String args[])
	{
		int n ,number,i;
		int r=0;

		System.out.println("Number of element");
		Scanner sc= new Scanner(System.in);

		n= sc.nextInt();
		int[] arr = new int[n];
		int[] arr2 = new int[n];

		System.out.println("Input " + n + " integers " );
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Content of the two arrays : " );
		for(i=0;i<n;i++)
		{

				number=arr[i];
				while(number != 0)
				{
				int remainder = number % 10;
				r = r * 10 + remainder;
				number = number/10;
				}
				arr2[i]= r;
				r=0;
				System.out.println(" Number " + arr[i] + " \t reverse  : " + arr2[i]  );
		}

	}
}
