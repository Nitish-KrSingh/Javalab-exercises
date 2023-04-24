package week2_220970064;
import java.util.*;
class week2program3
{
	public static void main(String args[])
	{
		int x, y , i ,j , n , loX =0 ,loY=0 ;
		float  smallest=0, largest=0 ;
		System.out.println(" Enter Row size");
		Scanner sc= new Scanner(System.in);
		x= sc.nextInt();

		System.out.println("Enter column size ");
		y= sc.nextInt();

		float[][] arr = new float[x][y];
		System.out.println("Enter array element ");

		for(i=0;i<x;i++)
		{
			for(j=0;j<y;j++)
			{
				arr[i][j] = sc.nextFloat();
			}
		}




		for(i=0;i<x;i++)
				{
					for(j=0;j<y;j++)
					{
						if(arr[i][j]>largest)
						{
							largest = arr[i][j];
							loX=i;
							loY=j;
						}
					}
				}

		System.out.println("The largest element = " + largest + " Location = ( " + loX + ","+ loY+")" );
		loY=loX=0;

		smallest = arr[0][0];
				for(i=0;i<x;i++)
				{
					for(j=0;j<y;j++)
					{
						if(arr[i][j]<smallest)
						{
							smallest = arr[i][j];
							loX=i;
							loY=j;
						}
					}
				}
		System.out.println("The smallest element = " + smallest + " Location = ( " + loX + ","+ loY+")" );

	}
}


