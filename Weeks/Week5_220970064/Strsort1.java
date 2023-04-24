package Week5_220970064;

import java.util.Scanner;
import java.io.*;
class Strsort1
{
	public static void main(String args[])
	{
		String s;
		char tmp;
		int i,j;
		Scanner inp=new Scanner(System.in);
		System.out.println("enter string:");
		s=inp.nextLine();
		char ar[]=s.toCharArray();
		for(i=0;i<=ar.length;i++)
		{
			for(j=i+1;j<ar.length;j++)
			{
				if(ar[i]>ar[j])
				{
					tmp=ar[i];
					ar[i]=ar[j];
					ar[j]=tmp;
				}
			}
		}
		System.out.println("Output String (with Case): " +new String(ar));
		for(i=0;i<=ar.length;i++)
		{
			for(j=i+1;j<ar.length;j++)
			{
				String si=String.valueOf(ar[i]);
				String sj=String.valueOf(ar[j]);

				if(si.compareToIgnoreCase(sj)>0)
				{
					tmp=ar[i];
					ar[i]=ar[j];
					ar[j]=tmp;
				}
			}
		}
		System.out.println("Output String (without Case): " + new String(ar));

	}
}
