package week4_220970064;
import java.util.*;

class point{
	int x, y;

	point(int x, int y)
	{
		this.x=x;
		this.y=y;
	}

	double distance(point point){
		return Math.sqrt((this.x-point.x)*(this.x-point.x)+(this.y-point.y)*(this.y-point.y));
	}
}

	public class distBwPoints{
		 public static void main(String args[])
		 {
			 int x1, y1 , x2, y2 , x3,y3;
			 Scanner sc= new Scanner(System.in);
			 System.out.println("Enter  P1(x1,y1) coordinate");
			 x1= sc.nextInt();
			 y1= sc.nextInt();

			 System.out.println("Enter P2(x2,y2) coordinate");
			 x2= sc.nextInt();
			 y2= sc.nextInt();

			 System.out.println("Enter P3(x2,y2) coordinate");
			 x3= sc.nextInt();
			 y3= sc.nextInt();

			 point p1 = new point(x1,y1);
			 point p2 = new point(x2,y2);
			 point p3 = new point(x3,y3);


			// Calculating distance between P1 and P2
			 double dist1 = p1.distance(p2);
			 System.out.println("Distance between P1 and P2 : " + dist1);

			// Calculating distance between P1 and P2
			 double dist2 = p1.distance(p3);
			 System.out.println("Distance between P1 and P3 : " + dist2);

		 }
	 }

