
package javaconceptoftheday;
import java.util.Scanner;

public class JavaConceptOfTheDay
{
    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Given Digit");
       
        int GivenDigit= sc.nextInt();
      
        char c=Integer.toString(GivenDigit).charAt(0);
       
        System.out.println("Enter the Given Number");
    
        int GivenNO=sc.nextInt();
        
        
        
        for(int i= GivenNO ; i>0;--i)
        {
          if(Integer.toString(i).indexOf(c)==-1)
          {
               System.out.println("largest No without Givn Digit");
               System.out.println(i);
               break;
          }
      }
        System.out.println(Integer.toString(157).indexOf(c));
   }
}