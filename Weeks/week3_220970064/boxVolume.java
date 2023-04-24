package week3_220970064;
import java.util.*;
class box
{
	 double width;
	 double height;
     double depth;

     box()
     {
		 width = -1;
		 height = -1;
		 depth = -1;
	 }

	 box(double w ,double h, double d)
	 {
		width = w;
 		height = h;
 		depth = d;
	}
	double calvolume() {
 		return width * height * depth;
	}
}
	 class boxVolume
	 {
		 		public static void main(String args[])
		 		{
					Scanner sc = new Scanner(System.in);

					double volume , wi , he ,de ;
					System.out.println("Enter the width height depth of box : ");

					wi = sc.nextDouble();
					he = sc.nextDouble();
					de = sc.nextDouble();
		 			box b1=new box(wi,he,de);

		 			volume = b1.calvolume();
		 			System.out.println("\nVolume of Box : " +volume);



		 		}
	}
