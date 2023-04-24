package Week5_220970064;
import java.util.Scanner;
class Stringop1
{
	public static void main(String args[])
	{
		String s1;
		String s2;
		int pos,len;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first string:");
		s1=sc.nextLine();
		System.out.println("enter the second string:");
		s2=sc.nextLine();
		System.out.println("Upper case of first string:" + s1.toUpperCase());
		System.out.println("Lower case of second string:" + s2.toLowerCase());
		System.out.println("enter the input pos from which to be extracted:");
		pos=sc.nextInt();
		System.out.println("enter the length to be extracted:");
		len=sc.nextInt();
		System.out.println("Substring of first string from " + pos + " with length " + len + " is:" +s1.substring(pos,pos+len));
		StringBuffer sb = new StringBuffer(s1);
		System.out.println("after Inserting "+s2+" at position "+pos+ " :" +sb.insert(pos,s2));
		System.out.println("after Appending "+s2+" to "+s1+ " :"+s1+s2);
	}
}

