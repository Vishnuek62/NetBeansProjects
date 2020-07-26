
package net_workin;
import java.net.*;
public class Url 

{
    public static void main(String[] args)
    {
        try
        {
            
        URL n = new URL("http://www.google.com:80/");
        System.out.println(n.getProtocol());
        
        System.out.println(n.getPort());
        
        System.out.println(n.getHost());
        
        }
        catch(Exception e)
        {
        }
    }
    
}
