package week3_220970064;
import java.util.*;
class shop
{
	int itemid;
	String name;
	int quantity;
	float unitprice;
	float  total, totalbill , discount ;

	public void inputdata()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Item ID : " );
		itemid = sc.nextInt();

		System.out.println("Enter the Item Name :  " );
		name = sc.next();

		System.out.println("Enter the quantity of the item : " );
		quantity = sc.nextInt();

		System.out.println("Enter the price : " );
		unitprice = sc.nextFloat();

	}

	public void discountCalculation()
	{
		total = quantity*unitprice;
		if(total>2000)
		{
			discount= (total*15)/100;
			totalbill = total - discount ;
		}
		else if (totalbill<2000 && totalbill>1000)
		{
			discount=  (total*12)/100;
			totalbill = total - discount ;
		}
		else if (totalbill<1000 && totalbill>500 )
		{
			discount=  (total*10)/100;
			totalbill = total - discount ;
		}
		else if(totalbill<500)
		{
			System.out.println(" No discount " );
			totalbill = total;

		}
	}

		public void display()
		{

			System.out.println("Item ID : "  +itemid );
			System.out.println("Item Name: " + name);
			System.out.println("Item Quantity: " + quantity );
			System.out.println("Unit Price : " + unitprice );
			System.out.println("Discount Amount : " + discount );
			System.out.println("Total Price : " + totalbill );
		}
	}

	class shopDiscount {
		public static void main(String args[])
		{

			int ch , i=1;
			shop s1 = new shop();
			Scanner ac = new Scanner(System.in);
			do{
				System.out.println("\n1.Input the item details. \n2. Get bill.  \nEnter your choice (0 for stop) \n\n ");
				ch= ac.nextInt();

				switch(ch)
				{
					case 1:
						s1.inputdata();

						break;
					case 2:
						s1.discountCalculation();
						s1.display();
						break;
					case 0:
						System.out.println("Exiting... ");
						i=0;
						break;

					default :
						System.out.println("Enter correct number:" );
						break;
				}

				}while(i != 0);

			}
		}





