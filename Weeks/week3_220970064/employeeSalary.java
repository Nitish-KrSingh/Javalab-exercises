package week3_220970064;
import java.util.*;
class employee
{
	int empid;
	String name;
	float basic , hra , it, pf , netsalary, grossSalary;

	public void getdata()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the EMP ID : " );
		empid = sc.nextInt();
		System.out.println("Enter the Employee name : " );
		name = sc.next();
		System.out.println("Enter the basic salary : " );
		basic = sc.nextFloat();
		if(basic >= 0){
			System.out.println("Salary should be greater then 0 " );
		System.exit(0);
		}
	}

	public void calSalary()
	{
		it=200;
		pf=(basic*12)/100;
		hra = (basic*75)/1000;
		grossSalary= basic+hra;
		netsalary = grossSalary-(it+pf);
	}

	public void display()
	{
		System.out.println("EMP ID : " +empid);

		System.out.println("\nBasic Salary : " +name );
		System.out.println("IT : "+ it + "\nPF : " + pf + "\nHRA : " + hra );
		System.out.println("\nGross Salary : " + grossSalary );
		System.out.println("\nNet Salaary : " +netsalary );
	}
}

	class employeeSalary
	{
		public static void main(String args[])
		{
			employee e1 = new employee();
			e1.getdata();
			e1.calSalary();
			e1.display();
		}
	}

