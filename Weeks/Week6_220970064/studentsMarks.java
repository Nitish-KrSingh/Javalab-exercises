package Week6_220970064;
import java.util.*;
class Student{
	String name;
	String course;
	int sem , regno;
	Scanner in=new Scanner(System.in);

	void getdata(){
		System.out.print("Enter the following Details ----------------\nRegistration Number: ");
		regno=in.nextInt();
		System.out.print("Student Name: ");
		name=in.next();
		System.out.print("Course name: ");
		course=in.next();
		System.out.print("Semester: ");
		sem=in.nextInt();
	}

	void display(){
		System.out.println("register number:"+regno);
		System.out.println("name:"+name);
		System.out.println("course:"+course);
		System.out.println("semester:"+sem);

	}
}

class exam extends Student{

	double m1,m2,m3;
	Scanner in=new Scanner(System.in);
	void getdata(){
			super.getdata();
			System.out.println("Enter marks of 3 subjects ");
			m1=in.nextInt();
			m2=in.nextInt();
			m3=in.nextInt();
		}

		void display(){
			super.display();
			System.out.println("marks1:"+m1);
			System.out.println("marks2:"+m2);
			System.out.println("marks3:"+m3);

	}


}

class result extends exam{
	double totalmarks=0;

	void calculation()
		{
			totalmarks=super.m1+super.m2+super.m3;
			double avg=totalmarks/3;
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
		void display()
		{

			super.display();
			calculation();
			System.out.println("total marks:"+totalmarks);
		}

}

class studentsMarks{
	public static void main(String args[]){

			result s1 = new result();
			s1.getdata();
			s1.display();
	}
}


