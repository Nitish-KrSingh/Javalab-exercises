package week1_220970064;
import java.util.Scanner;
class Workhours
{
	public static void main(String args[])
	{
		float hours_worked,hourly_rate,total_pay;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the hours worked");
		hours_worked=sc.nextFloat();
		System.out.println("enter horly rate ");
		hourly_rate=sc.nextFloat();
		if(hours_worked<40)
		{
		total_pay = hours_worked * hourly_rate;
		System.out.println("the total pay is = " + total_pay);
	    }
	    else
	    {
			total_pay = hours_worked * hourly_rate + ((hours_worked - 40) * hourly_rate) / 2;
							System.out.println("total pay:"+ total_pay);
		}
	}

}