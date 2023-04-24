package week4_220970064;
import java.util.*;

class stack{

	private static int top=-1;
	private static int size=5;
	private static int arr[] = new int[size];

	public static void push(int v)
	{
		if(top==size-1)
		{
			System.out.println("stack Overflow");
		}
		else
		{
		top++;
		arr[top]=v;
		System.out.println("Inserted Successfully");
		}
	}

	public static void pop()
	{
		if(top==-1)
		{
			System.out.println("Stack Underflow");
		}
		else
		{
			System.out.println("Poped element from stack :" +arr[top]);
			top--;
		}

	}
}
	class S1
	{
		public static void main(String arg[])
		{
			int val,ch,x=1;
			System.out.println("Max Size of Stack is 5 ");
			Scanner sc = new Scanner(System.in);

		do{
			System.out.println("\n\n1.Push\n2.Pop\nEnter Your option");
			ch= sc.nextInt();

			switch(ch){

				case 1:
						System.out.println("Enter the value : ");
						val = sc.nextInt();
						stack.push(val);
						break;
				case 2:

						stack.pop();
						break;
				case 3:
						System.out.println("Exiting .... ");
						x=0;
						break;
				default:
						System.out.println("Invalid option -- ");

			}
		}while(x!=0);
	}
}


