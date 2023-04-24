package week9_220970064;

import java.util.Scanner;
import java.util.Vector;

public class Que1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	Vector<Integer> v1 = new Vector<Integer>(5);
	
	
	int ch , x, val, index;
	
	System.out.println("Enter first 5 odd integer ");
	for (int i = 0; i < 5; i++) {
		x=sc.nextInt();
		v1.add(x);
	}
	
	System.out.println("1.Insert an element at a specified position "
			+ "\n2.Insert an element at the end"
			+ "\n3.Delete an element"
			+ "\n4.Display the contents"
			+ "\n5.Exit");
	

		
	do {
		
		System.out.print("Enter your option :  ");
		ch =  sc.nextInt();
		System.out.println();
		switch (ch) {
			case 1: {
				
				System.out.println("Enter the value and the position ");
				val = sc.nextInt();
				index= sc.nextInt();
				v1.insertElementAt(val, index);
				break;
			}
		
			case 2: {
				System.out.println("Enter the value ");
				val = sc.nextInt();
				
				v1.insertElementAt(val , v1.size());
				break;
			}
			case 3: {
				System.out.println("Enter the value to delete");
				val= sc.nextInt();
				boolean b;
				b = v1.removeElement(val);
				if (b) {
					System.out.println("found and deleted");
				}
				else {
					System.out.println("Not found ");
				}
				break;
			}
			case 4: {
				for (int i = 0; i < v1.size(); i++) {
					System.out.print(v1.get(i)+ " ");
				}
				System.out.println();
				break;
			}
			case 5: {
				System.out.println("Exiting .......");
				break;
			}
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + ch);
			}
	} while (ch!=5);
	
	
	}

}
