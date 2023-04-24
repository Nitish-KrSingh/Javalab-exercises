package week7_220970064;
import java.awt.geom.Area;
import java.util.*;

abstract class findarea{
	double l, w;
	
	findarea( double y){
		l = y;
		w =y;
	}
	
	findarea( double y , double x){
		l = y;
		w = x;
	}
	
	abstract double areacal();
}

//==================================

class triangle extends findarea{
	
	triangle( double y , double x){
		super(y,x);
	}
	
	double areacal() {
		return 0.5*l*w;
	}
	}

//=============================

class square extends findarea{
	
	square( double y){
		super(y);
	}
	
	double areacal() {
		return l*w;
	}
	}

//================================
	
class Rectangle extends findarea{
	
	Rectangle( double y , double x){
		super(y,x);
	}
	
	double areacal() {
		return l*w;
	}
}

class q1 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int x , y;
		findarea f1;
		
		System.out.println("Enter the length and height of triangle  ");
		x= sc.nextInt();
		y=sc.nextInt();
		triangle t1 = new triangle(y, x);
		
		System.out.println("Enter the length of the square");
		y=sc.nextInt();
		square s1 = new square(y);
		
		
		System.out.println("Enter the length and width of ractangle ");
		x= sc.nextInt();
		y=sc.nextInt();
		Rectangle r1 = new Rectangle(y, x);
		
		f1 = t1;
		System.out.println (" Area of triangle  : " + f1.areacal());
		
		f1 = s1;
		System.out.println (" Area of square : " + f1.areacal());
		
		f1 = r1;
		System.out.println (" Area  of ractangle  : " + f1.areacal());
		
		
		
	}


	
}
	
	
	


	
