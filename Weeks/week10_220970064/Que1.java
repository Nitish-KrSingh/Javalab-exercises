package week10_220970064;

class numb extends Thread{
	public numb(String name) {
		super(name);
	}
	
	public void run() {
		try {
			if (Thread.currentThread().getName()=="odd") {
				for (int i = 1; i < 10; i++) {
					System.out.println( "Odd thread : " +i);
					i++;
					Thread.sleep(500);
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		try {
			if (Thread.currentThread().getName()=="even") {
				for (int i = 0; i < 10; i++) {
					System.out.println(" Even thread :"+ i);
					i++;
					Thread.sleep(500);
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
public class Que1 {

	public static void main(String[] args) {
	numb n1	= new numb("odd");
	numb n2 = new numb("even");
	
	n1.start();
	try {
		n1.join();
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	n2.start();
	
	try {
		n2.join();
	} catch (Exception e) {
		// TODO: handle exception
	}
	}

}
