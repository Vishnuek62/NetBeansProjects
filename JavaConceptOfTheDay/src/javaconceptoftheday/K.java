

package javaconceptoftheday;

import java.util.Arrays;
import java.util.Scanner;
public class K 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
     
        System.out.println("Enter the string");
        
        String str = sc.next();
        
        String[] words = str.split(" ");
        
          for(String w:words)
          {  
              System.out.println(w);  
           }
  }
}
