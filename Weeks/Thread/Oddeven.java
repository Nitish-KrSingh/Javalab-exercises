package Thread;

class number extends Thread{
	
	number(String name){
		super(name);
	}
	public void run() {
		try {
			if (Thread.currentThread().getName().matches("odd")) {
				for (int i = 1; i < 10; i++) {
					System.out.println(getName() + i);
					i++;
					sleep(1000);
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		try {
			if (Thread.currentThread().getName().matches("even")) {
				for (int i = 0; i < 10; i++) {
					System.out.println(i);
					i++;
					sleep(1000);
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
public class Oddeven {

	public static void main(String[] args) {
		number n1 = new number("odd");
		number n2 = new number("even");
		
		n1.start();
		try {
			n1.join();
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		n2.start();
		try {
			n2.join();
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		
	}

}
