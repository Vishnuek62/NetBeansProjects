

package ocjp;
import java.util.Scanner;

public class JavaStr 
{
    
    
    public static void main(String[] args)
    {
       
        
        
        
        
        try{
        String p = null;
        String o = "vishnu,yt,3836";
        
        String[] r= o.split("\\d");
        for(String s : r)
       System.out.println(s + "   ");
        
        System.out.println(o.length());
     //   System.out.println(p.length());
        }
        catch(Exception e)
        {
            
        }
    }
    
}
