
package javaio;
import java.io.*;

public class readPassword 
{
    
    public static void main(String[] args) throws IOException
    {
        try{
        Console c =System.console();
        
        System.out.println("Enter ur PAssword");
        char[] ch = c.readPassword();
        String pass = String.valueOf(ch);
        
        System.out.println("password"  +pass);
        }catch(Exception e){}
        }
    
}
