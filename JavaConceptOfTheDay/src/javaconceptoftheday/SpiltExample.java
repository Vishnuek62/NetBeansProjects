

package javaconceptoftheday;

import java.util.Scanner;


public class SpiltExample
{  
public static void main(String args[])
{  
    Scanner sc = new Scanner(System.in);
     
        System.out.println("Enter the string");
        
        String s1 = sc.nextLine();  
   String[] words=s1.split("\\s");
   for(String w:words)
   {    
     System.out.println(w);  
   }  
}
}  