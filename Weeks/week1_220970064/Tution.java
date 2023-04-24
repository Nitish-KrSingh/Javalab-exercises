package week1_220970064;
import java.util.Scanner;
class Tution
{
	public static void main(String args[])
	{
		float tution_fee;
		int i,years;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the tution fee");
		tution_fee=sc.nextFloat();
		System.out.println("enter the number of years");
		years=sc.nextInt();
		for(i=0;i<years;i++)
		{
			 tution_fee+=(tution_fee * 0.05);
			 System.out.println("The fees after:"+ i +"year ="+ tution_fee);
		 }
	 }
 }