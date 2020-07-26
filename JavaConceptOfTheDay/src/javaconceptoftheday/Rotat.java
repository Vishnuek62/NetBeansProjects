

package javaconceptoftheday;
import java.util.*;
public class Rotat 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String1");
       String str1 = sc.next();
       System.out.println("Enter the String2");
       String str2 = sc.next();
       
       if(str1.length() != str2.length())
       {
           System.out.println("not rotatable");
       }
       else
       {
           String str3 = str1 + str2;
           if(str3.contains(str1))
           {
               System.out.println("rotatble");
           }
           else
           {
            System.out.println(" not rotatble");
              
           }
       }
        
    }
    
    
    
}
