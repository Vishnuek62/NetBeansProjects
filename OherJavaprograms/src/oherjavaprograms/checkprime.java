

package oherjavaprograms;
import java.util.*;
public class checkprime 
{
    public static boolean checkprim(int number)
    {
        for(int i=2;i<=number/2;i++)
        {
            if(number%i==0)
            {
                return false;
            }
        }
        return true;
    }
    
    
    
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
       System.out.println("enter the n.");
       int r = sc.nextInt();
       if(checkprim(r))
       {
         System.out.println("prime aanu");  
       }
       else
       {
           System.out.println("prime alla");
       }
       
       
     }
    
}
