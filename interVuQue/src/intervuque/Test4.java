
package intervuque;

class Exc0 extends Exception
{
    
}

class Exc1 extends Exc0
{
    
}

public class Test4 
{
    public static void main(String[] args)
    {
        try
        {
            throw new Exc0();
        }
        catch(Exc0 e)
        {
            System.out.println("ex0 caught");
        }
        
    }
    
}
