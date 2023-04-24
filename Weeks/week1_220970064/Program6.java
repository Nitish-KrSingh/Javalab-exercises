package week1_220970064;
import java.util.Scanner;

class Program6
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int ch;
		do
		{
			System.out.println("1. Km per hr to Meter per second.");
			System.out.println("2. Meter per second to Km per hour.");
			System.out.print("Enter your choice(0 to stop):");
			ch = sc.nextInt();
			switch(ch)
			{
				case 1:
				{
					System.out.print("Enter the speed in km per hr:" );
					double kmph = sc.nextDouble();
					double mps = (0.277778 * kmph);
					System.out.println("Speed in Meter per second: " +mps);
					break;
				}
				case 2:
				{
					System.out.print("Enter the speed in meter per second:" );
					double mps = sc.nextDouble();
					double kmph = (3.6 * mps);
					System.out.println("Speed in Meter per second: " +kmph);
					break;
				}
				default:
					break;
			}
		}while(ch != 0);
	}
}