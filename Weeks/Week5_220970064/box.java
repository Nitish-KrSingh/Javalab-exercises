package Week5_220970064;
import java.util.*;
class b1{
	double w;
	double h;
	double l;

	b1(){
		w =-1;
		h =-1;
		l =-1;
	}

	b1( double width , double height , double length)
	{
		w = width;
		h = height;
		l = length;
	}

	double vol()
	{
		return w*h*l;
	}
}

class b2 extends b1{
	double wh;
	String color;

	b2(double width , double height , double length, double weigth , String c)
		{
		super(width , height , length);
		wh = weigth;
		color =c;
		}

	 public void display()
		 {
			System.out.println("length = " +l);
			System.out.println("Height = " +h);
			System.out.println("Width = " +w);
			System.out.println("volume = " + vol());
			System.out.println("Weigth = " +wh);
			System.out.println("color = " +color);
		}
}

class box{
	public static void main(String args[])
	{
		double wi,he,len,we;
		String ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter width , height , length , weight  and color of the box ");
		wi = sc.nextDouble();
		he = sc.nextDouble();
		len = sc.nextDouble();
		we = sc.nextDouble();
		ch = sc.nextLine();



		b2 box1 = new b2(wi,he,len,we, ch);
		box1.display();

	//	b2 box2 = new b2(len);
	//	volume=  box2.vol();
	}
}

