

package iner;

interface man
{
    void gh();
}

public class Inn_Interface implements man 
{
    public void gh()
    {
        System.out.println("vishnu");
    }
    
    
    
    public static void main(String[] args)
    {
        man v = new Inn_Interface();
        v.gh();
        
        
    }
    
    
}
