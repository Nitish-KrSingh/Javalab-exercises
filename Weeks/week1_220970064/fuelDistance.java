package week1_220970064;
import java.util.*;

class fuelDistance{
	public static void main(String args[])
	{

	int distance , fuelconsumed , dist ,fuel, ch , i=1 ;
	float fueleconomy;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the distance ( in KM) : ");
	distance = sc.nextInt();
	System.out.println("Enter the fuel consumed (in Liter ) : ");
	fuelconsumed = sc.nextInt();

	fueleconomy = distance / fuelconsumed;
	System.out.println("Average fuel economy = " +fueleconomy + "kmpl");

	while(i > 0){

		System.out.println("\n1.Dist Estimation \n2.Fuel Estimation \n\nEnter your choice (0 to stop ):");
		ch = sc.nextInt();

		switch(ch){
			case 1:
				System.out.println("Enter the fuel ( in liter) : ");
				fuel = sc.nextInt();
				System.out.println("Estimated distance  : " + fuel*fueleconomy);
				break;
			case 2:
				System.out.println("Enter the distance ( in KM) : ");
				dist = sc.nextInt();
				System.out.println("Estimated fuel  : " + dist/fueleconomy);
				break;
			default:
				System.out.println("Exiting.... ");
				i=0;
			}

		}
	}
}



