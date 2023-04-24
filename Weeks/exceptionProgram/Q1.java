package exceptionProgram;

import java.util.Scanner;


class Ivalid_File_Extn extends Exception{
	
	String abc; 
	Ivalid_File_Extn(String str) {
		abc = str;
	}
}
public class Q1 {

	public static void main(String[] args) {
	 
		Scanner sc = new Scanner(System.in);
		String arr[] = new String[2];
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter file name "+ (i+1));
			arr[i]= sc.next();
		}
		
		String ext = ".txt";
		
		try {
			for (int i = 0; i < arr.length; i++) {
				 filepart[i] = arr[i].split(".");
				
				if (!filepart[i].matches(ext)) 
					System.out.println("match");
					throw new Ivalid_File_Extn("not match");
				}
				
			
		} catch (Ivalid_File_Extn e) {
			System.err.println("File Name " + e.abc);
		}
		
	}

}
