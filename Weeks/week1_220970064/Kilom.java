package week1_220970064;
import java.util.Scanner;
class Kilom
{
	public static void main(String args[])
	{
		double kmph, mps;
		int n , a=0;
		Scanner sc = new Scanner(System.in);

		do{
		System.out.println("1. for converting kilo to mtr ");
		System.out.println("2. for converting mtr to kilo ");
		System.out.println("Enter your choice (0 to stop ):  ");

		n=sc.nextInt();
		switch(n)
		{
			case 1 : System.out.println("enter the kilometer_per_hour");
					 kmph=sc.nextFloat();
					 mps= 0.277778 * kmph;
					 System.out.println("mtr per sec = " + mps);
					 break;

			case 2 : System.out.println("enter the mtr _per_sec");
					 mps=sc.nextFloat();
					 kmph = 3.6 * mps;
					 System.out.println("km_per_hour = " + kmph);
					 break;

			case 3 : System.out.println("Exiting......");
					 a=0;
					 break;
		}

	}while(a !=0);
}
}