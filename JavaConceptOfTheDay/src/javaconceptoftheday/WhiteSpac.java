

package javaconceptoftheday;
import java.util.*;
public class WhiteSpac 
{
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        
        String str = sc.nextLine();
       
        for(int i= 0; i< str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch!=' ')
            {
                  System.out.print(ch);
            }
        }
    }
    
    
}
