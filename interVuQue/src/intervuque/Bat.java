
package intervuque;
import java.io.*;
class Abc
{
   public void printName() throws ArithmeticException 
   {
       System.out.println("super");
   }

}

public class Bat extends Abc
{
    public void printName() throws NullPointerException
    {
        System.out.println("subclass1");
    }
    
    public static void main (String[] args) throws Exception
    {
        Abc a = new Bat();

        a.printName();
    }
}

