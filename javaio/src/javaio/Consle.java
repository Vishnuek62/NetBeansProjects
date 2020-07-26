
package javaio;
import java.io.*;
public class Consle 
{
    
    public static void main(String[] args) 
    {
        try
        {
      Console c=System.console();  
System.out.println("Enter your name: ");  
String n=c.readLine();  
System.out.println("Welcome "+n); 
        }
        catch(Exception e)
        {
            
        }
        
    }
    
}
