


package oherjavaprograms;


public class singleton_class 
{
    public static singleton_class my;
    
    private singleton_class()
    {
    }
    
    static
    {
        my = new singleton_class();
    }
    public static singleton_class getInstance()
    {
          return my;
    }
    
    
    public static void main(String[] args)
    {
        singleton_class ms = getInstance();
        
    }
    
    
}
