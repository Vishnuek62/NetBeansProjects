
package oherjavaprograms;
import java.util.*;

public class allSubString 
{
    public static void main(String[] args)
    {
         Scanner sc= new Scanner(System.in);
         System.out.println("Entr the string");
         String str = sc.nextLine();
         System.out.println(str.length());
         
         for(int i=0;i<str.length();i++)
         {
             for(int j=i+1;j<=str.length();j++)
             {
                System.out.println(str.substring(i, j));  
             }
         }
     }
}
