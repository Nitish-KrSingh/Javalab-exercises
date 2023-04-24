package Week6_220970064;
import java.util.*;

class game{
	public void type(){
	System.out.println("indoor & outdoor games" );
	}
}

class cricket extends game{
	public void type(){
	System.out.println("cricket is an outdoor game");

	}
}

class chess extends cricket {
	public void type(){
	System.out.println("chess is an indoor game");

	}
}

class ab1{
	public static void main(String args[]){

	game g1 = new game();
	cricket cr = new cricket();
	chess ch = new chess();

	g1.type();
	cr.type();
	ch.type();

	game g2 = new cricket();
	game g3 = new chess();

	g2.type();
	g3.type();

}
}
