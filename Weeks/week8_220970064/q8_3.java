package week8_220970064;
import java.util.Scanner;

class square extends Thread{
	int a;

	 square( String name , int n) {
		super(name);
		a= n ;
		start();
		

	}
	public void run()
	{
		try {
			if (Thread.currentThread().getName()=="Square") {
				for (int i = 1; i < a; i++) {
					System.out.println("Square of " +i + " = " + i*i);
					Thread.sleep(1000);
				}
			}
		} catch (Exception e) {
			System.out.println("caught exception ");
		}

		try{
			if (Thread.currentThread().getName()=="cube") {
				for (int i = 1; i < a; i++) {
					System.out.println("cube of " +i + " = " + i*i*i);
					Thread.sleep(1000);
				}
			}
		} catch (Exception e) {
			System.out.println(" caught exception");
		}
		}
	}





public class q8_3 {
	public static void  main(String Args[]) {
		int n ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of element ");
		n= sc.nextInt();
		
		square T1 = new square("Square" , n);
		square T2 = new square("cube", n);
		
		try {
			T1.join();
			T2.join();
		} catch (InterruptedException e) {
			System.out.println("==================");
		}
		
		
	}
}
