

package javahungry;


public class NewClass 
{
    public static void main(String[] args)
    {
        try
        {
             System.out.println(1);
             System.out.println(2);
            
            
            int a=4/0;
            System.out.println(a);
            
             System.out.println(3);
        }
        catch(Exception e)
        {
             System.out.println("catch");
        }
        
        
    }
    
}
