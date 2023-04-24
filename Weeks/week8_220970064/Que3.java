package week8_220970064;

import java.util.Scanner;

class thread1 extends Thread
{
	int n;
	thread1(String name, int n)
	{
		super(name);
		this.n=n;
		start();
	}
	public void run()
	{
		int sq;
		int cube;
		try
		{
			if(Thread.currentThread().getName()=="sq")
			{
				for(int i=1; i<=n; i++)
				{
					sq=i*i;
					System.out.println("Square of "+i+":"+sq);
					Thread.sleep(1000);
				}
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Caught Exception: "+e);
		}
		try
		{
			if(Thread.currentThread().getName()=="cube")
			{
				for(int i=1; i<=n; i++)
				{
					cube=i*i*i;
					System.out.println("Cube of "+i+":"+cube);
					Thread.sleep(1000);
				}
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Caught Exception: "+e);
		}
	}
}
public class Que3 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int n=sc.nextInt();
		
		thread1 sq=new thread1("sq", n);
		thread1 cube=new thread1("cube", n);
		try
		{
			sq.join();
			cube.join();
		}
		catch(InterruptedException e)
		{
			System.out.println("Caught Exception: "+e);
		}
	}
}

