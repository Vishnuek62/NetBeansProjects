
package multi;

public class gar1 
{
    public void finalize()
    {
        System.out.println("obj garbage collected");
    }
    
    
    
    public static void main(String[] args)
    {
        int i =4;
        
        i= --i + ++i;
        
        System.out.println(i);
        
        
        
        gar1 b =new gar1();
        
        gar1 v= new gar1();
        
        b = null;
        v=null;
        
        System.gc();
    }
    
    
}
