package week2_220970064;
import java.util.*;
class pairs
{
	public static void main(String args[])
	{
		int n , i ,j ;

		System.out.println("Number of element");
		Scanner sc= new Scanner(System.in);

		n= sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Input " + n + " integers " );
				for(i=0;i<n;i++)
				{
					arr[i]=sc.nextInt();
				}

		for(i=0;i<n;i++)
			{
				for(j=0;j<n;j++)
				{
					if(arr[i]>arr[j])
					{
					System.out.print("(" + arr[i] + "," + arr[j] + ") " );
					}
				}
			}
		}
	}