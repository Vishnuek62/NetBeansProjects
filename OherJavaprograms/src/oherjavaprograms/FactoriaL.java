

package oherjavaprograms;

import java.util.Scanner;


public class FactoriaL 
{
    static int fact(int a)
    {
        if(a==0)
        {
            return 1;
        }
        else
        {
            int e= a * fact(a-1);
            return e;
        }
    }
    
    
     public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
         System.out.println("enter the no.");
          int q= sc.nextInt();
           int r= fact(q);
           System.out.println(r);
    }
    
}
