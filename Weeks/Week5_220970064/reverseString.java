package Week5_220970064;
import java.util.*;

 class  reverseString{

     public static boolean isPalindrome(String str)
     {

         String rev = "";


         boolean ans = false;

         for (int i = str.length() - 1; i >= 0; i--) {
             rev = rev + str.charAt(i);
         }


         if (str.equals(rev)) {
             ans = true;
         }
         return ans;
     }


     public static void main(String[] args)
     {
         System.out.println("Enter a String : ");
		 Scanner sc = new Scanner(System.in);
         String str;

         str= sc.nextLine();

         boolean A = isPalindrome(str);

         if(A)
     	    {
     	    System.out.println("Palindrome");
	 		}
         else
         	{
			System.out.println("Not Palindrome");
			}

     }
}