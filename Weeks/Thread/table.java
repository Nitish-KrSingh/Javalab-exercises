package Thread;

import java.util.*;

class tables extends Thread{
    int n;
    tables( int a)
    {
         n = a;
    }

    public void run()
    {
        System.out.println("Table of " + n);
        for (int i = 1; i <=10; i++) {
            int res = n * i;
        System.out.print( res + " "); }
        try {
            Thread.sleep(1000);
            
        } catch (InterruptedException e) {
           System.out.println(e);
        }
        System.out.println("");
        
        
    }
    
}

class table{
    public static void main(String[] args) {
        tables nn1 = new tables( 5);
        tables nn2 = new tables( 7);
        tables nn3 = new tables( 8);
           
            nn1.start();
            try {
                nn1.join();
               
            } catch (Exception e) {
             System.err.println("eeeeeeeeeee");
            }

            nn2.start();
            try {
                nn2.join();
              
            } catch (Exception e) {
             System.err.println("eeeeeeeeeee");
            }

            nn3.start();
        try {
          
            nn3.join();
        } catch (Exception e) {
         System.err.println("eeeeeeeeeee");
        }

    }
}
