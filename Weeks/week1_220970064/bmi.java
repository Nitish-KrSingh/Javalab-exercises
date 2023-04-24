package week1_220970064;
import java.util.*;

class bmi{
	public static void main(String args[])
	{

		float weight, bmi;
		float height, heightm;

		System.out.println("Body Mass Index calculation");
		System.out.println("Enter weight in KG : ");
		Scanner sc = new Scanner(System.in);

		weight = sc.nextFloat();
		System.out.println("Enter height in cm : ");
		height = sc.nextInt();

		heightm = height / 100;



		bmi = weight / (heightm * heightm );

		System.out.println("BMI = "+bmi);

		if(bmi<18.5)
		{
			System.out.println("Underweight !");
		}
		else if(bmi>18.5 && bmi< 24.9 )
		{
			System.out.println("Normal!");
		}
		else if(bmi>25 && bmi< 29.9 )
		{
			System.out.println("Overweight!");
		}
		else if( bmi >= 30)
		{
			System.out.println("Obese!");
		}
	}
}