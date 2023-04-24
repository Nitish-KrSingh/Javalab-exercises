package week8_220970064;
import java.util.Scanner;

class MarkOutofBoundsException extends Exception{}
public class Que1{

	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			String name , rollno ;
			int regno;

			float m1 , m2 , m3 , totalmarks , avg;

			System.out.print("Enter the following Details ----------------\nNAME : ");
			name = sc.nextLine();
			System.out.print("Reg. Number : ");
			rollno = sc.nextLine();
			System.out.print("Enter 1st Marks : ");
			m1 = sc.nextInt();
			System.out.print("Enter 2nd Marks : ");
			m2 = sc.nextInt();
			System.out.print("Enter 3rd Marks : ");
			m3 = sc.nextInt();
			try{

				regno = Integer.valueOf(rollno);

				if( m1<0 || m1 >100  ||  m2<0 || m2 >100 ||  m3<0 || m3 >100 )
				throw new MarkOutofBoundsException();

				} catch (MarkOutofBoundsException e)
				{
				System.out.print("\nInvalid marks  \n  ");
				System.exit(0);
				}

				catch (NumberFormatException e)
				{
				System.out.print("\nIncorrect Roll number   \n  ");
				System.exit(0);
				}


			System.out.println("register number:"+rollno);
			System.out.println("name:"+ name);
			System.out.println("marks1:"+ m1);
			System.out.println("marks2:"+ m2);
			System.out.println("marks3:"+ m3);


			totalmarks=m1+m2+m3;
			System.out.println("total marks:"+ totalmarks);
			avg=totalmarks/3;
			if(avg>80)
			{
				System.out.println("Grade:A");
			}
			else if(avg>70)
			{
				System.out.println("Grade:B");
			}
			else if(avg>50)
			{
				System.out.println("Grade:C");
			}
			else if(avg>35)
			{
				System.out.println("Grade:D");
			}
			else
			{
				System.out.println("Grade:E");
			}



		}
	}
	
