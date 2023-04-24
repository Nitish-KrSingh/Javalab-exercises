package week4_220970064;
import java.util.*;

class bill{
	int id;
	String name;
	int phoneNo;
	static int billNo=1;
	int numOfCalls;
	double billamount;

	public void getdata()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Customer ID" );
		id= sc.nextInt();
		System.out.println("Enter The Customer Name : ");
		name = sc.next();
		System.out.println("Enter The Customer Phone Number  : ");
		phoneNo = sc.nextInt();
		System.out.println("Enter The Customer Number of calls : ");
		numOfCalls = sc.nextInt();
	}

	public void CalculateBillamt()
	{
		if( numOfCalls <100)
		{
			billamount = 100;
		}
		else if(  numOfCalls <150)
		{
			billamount = 100+((0.60)*(numOfCalls-100));
		}
		else if(  numOfCalls <200)
		{
			billamount = 100+((0.60)*(numOfCalls-100))+((0.50)*(numOfCalls-150));
		}
		else if(numOfCalls>200)
		{
			billamount = 100+((0.60)*(numOfCalls-100))+((0.50)*(numOfCalls-150))+((0.40)*(numOfCalls-200));
		}

  	}


  	public void display()
  	{
		System.out.println("\n\nBill Number : " + billNo);
		billNo++;
		System.out.println("Customer ID : " +id);
		System.out.println("Customer Name : " +name);
		System.out.println("Customer Ph No : " +phoneNo);
		System.out.println("Number of calls : " +numOfCalls);
		System.out.println("Total Bill Amount : " +billamount);

	}

}
class telephoneBill
{
	public static void main(String args[])
	{

		int n,ch,a=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of customer : ");
		n= sc.nextInt();
		bill[] obj = new bill[n];;



		for(int i=0;i<n;i++)
		{
			obj[i] = new bill();
		}


		do{
			System.out.println("\n\nEnter your choice \n1. Enter details : \n2. Display Bill : \nEnter your choice(0 for stop): ");
			ch=sc.nextInt();
			switch(ch){

			case 1:
					for(int i=0;i<n;i++)
						{
							System.out.println("\n\nCustomer No: " + (i+1));
							obj[i].getdata();
						}
					break;

				case 2:
					for(int i=0;i<n;i++)
						{
							obj[i].CalculateBillamt();
							obj[i].display();
						}
					break;

				case 3:

					System.out.println("Exiting... " );
					a=0;
					break;

				default :
					System.out.println("Enter the correct option : " );
					break;

			}
				}while(a!=0);

	}
}