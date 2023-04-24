package week1_220970064;
import java.util.*;

class tuitionFee{
	public static void main(String args[])
	{

	float tuitionfee ,totalfee=0 , fee;
	int time , rate ,a ;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the tuition fee : ");
		tuitionfee =  sc.nextFloat();
	System.out.println("Enter the increase rate per year : ");
		rate =  sc.nextInt();
	System.out.println("Enter the time duration in year  ");
		time =  sc.nextInt();
	for(int i = 1 ; i <= time ; i++)
	{

		totalfee =  totalfee + (rate * tuitionfee / 100 )  ;
		fee = totalfee + tuitionfee;
		System.out.println("The fee after "+ i + " year = " +fee );
	}






	}
}