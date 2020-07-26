

package javahungry;


public class JavaHungry 
{
   // void asd(String s)
    {
        System.out.println("String");
    }
    void asd(Object e)
    {
       System.out.println("object");
    }
    void asd(Integer d)
    {
        
        System.out.println("Integer");
    }
    
    public static void main(String[] args) 
    {
        JavaHungry m = new JavaHungry();
        
        m.asd(null);
        if(null==null)
        {
            
        System.out.println("equal");
        }
    }
}
