

package intervuque;
class d
{
    d get()
    {
        return this;
    }
}

public class Covariant extends d 
{
    Covariant get()
    {
        return this;
    }
    void mnb()
    {
    }
 
    public static void main(String[] args)
    {
        new Covariant().get().mnb();
        
    }
    
}
