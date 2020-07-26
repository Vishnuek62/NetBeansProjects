
package javareflection;
import java.lang.Class;
class Simple
{}


public class JavaReflection 
{

    public static void main(String[] args) throws ClassNotFoundException
    {
        
        
       try{ 
      Class c = Class.forName("Simple");
      
      System.out.println(c.getName());
       }
       catch(Exception e)
       {
           
       }
    }
    
}
