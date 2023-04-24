package week9_220970064;

import java.util.Vector;

public class vec {

	public static void main(String[] args) {
		
		Vector<Integer> souju = new Vector<>(5);
		
		souju.add(10);
		souju.add(20);
		souju.add(30);
		souju.add(50);
		
		souju.insertElementAt(120, souju.size());
		
//		souju.remove(1);
		
		
//		souju.removeElement(30);
		
		for (int i = 0; i < souju.size(); i++) {	
			System.out.println(  souju.get(i)  );
		}
	}

}
