package week9_220970064;
import java.util.ArrayList;
import java.util.Scanner;

import com.sun.tools.sjavac.comp.dependencies.PublicApiCollector;

class Employee{
	int empno;
	String name;
	String designation;
	int age;
	float salary;
	
	Employee(int emp , String n, String d, int ag, float sal){
		empno = emp;
		name = n;
		designation = d;
		age = ag;
		salary = sal;
	}
	
	void display() {
		System.out.println("Emp No: " + empno);
		System.out.println("Name : "+ name);
		System.out.println("Designamtion : "+designation);
		System.out.println("Age : "+ age);
		System.out.println("Salary : "+salary);
	}
}

public class Que2 {
	
	public static void main(String[] args) {
		
//		========================
		Scanner sc = new Scanner(System.in);
//		Employee e1 = new Employee(0, null, null, 0, 0);
		ArrayList<Employee> al = new ArrayList<>();
		System.out.println("1.Insert an object into the arraylist\r\n"
				+ "2.Delete an object from the arraylist\r\n"
				+ "3.Display the contents of the arraylist.\n"
				+ "4.Exit");
		int ch;
		do {
			System.out.println("Enter your option");
			ch= sc.nextInt();
			switch (ch)	 {
			case 1: {
				System.out.println("Enter empno, name, designmtion , age , salary ");
				int emp;
				String n;
				String des;
				int ag;
				float sal;
				emp = sc.nextInt();
				n = sc.next();
				des = sc.next();
				ag =  sc.nextInt();
				sal = sc.nextFloat();
				al.add(new Employee(emp,n,des,ag,sal));
				break;
			}
			case 2:{
				al.remove(0);
				break;
			}
			case 3:{
				for (Employee employee : al) {
					employee.display();
				}
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + ch);
			}
		} while (ch!=4);
		
		
		
	}
	

}
