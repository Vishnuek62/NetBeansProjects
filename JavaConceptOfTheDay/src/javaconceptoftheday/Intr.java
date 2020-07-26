package javaconceptoftheday;

interface t 
{
    int g=8;
    void vishnu();
}
public class Intr implements t
{
  public void vishnu()
    {
        
    }
    
    
    public static void main(String[] args)
    {
       
        t as = new Intr();
        
        as.vishnu();
        
        
       // Intr qw= new Intr();
    }
    
}
