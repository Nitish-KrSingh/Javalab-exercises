package week8_220970064;

class calSum
{
	int sum[][]={
		{1, 2, 3},
		{4, 5, 6},
		{7, 8, 9}
	};
	int calculateData(String Name, int index)
	{
		System.out.println(Name + " is Executing....");
		int rowSum=0;
		try
		{
			for(int i=0; i<sum[index].length; i++)
			{
				rowSum +=sum[index][i];
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		System.out.println(Name+ "\nSum of row "+(index + 1)+":"+rowSum+"\n");
		System.out.println(Name+ " Exited..\n");
		return rowSum;
	}
}
class multiThread implements Runnable
{
	Thread t;
	calSum c;
	int index;
	private int rowSum;
	multiThread(calSum c, int index)
	{
		t=new Thread(this,"Threadd " +index);
		this.c = c;
		this.index = index;
		t.start();
	}
	public void run()
	{
		rowSum = c.calculateData(t.getName(),index - 1);
	}
	int getRowSum()
	{
		return rowSum;
	}
}
public class Que4
{
	public static void main(String args[])
	{
		calSum c=new calSum();
		multiThread t1=new multiThread(c, 1);
		multiThread t2=new multiThread(c, 2);
		multiThread t3=new multiThread(c, 3);
		try
		{
			t1.t.join();
			t2.t.join();
			t3.t.join();
			System.out.println("Main Thread : Sum of Array:" + (t1.getRowSum() + t2.getRowSum()+ t3.getRowSum()));
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
}
