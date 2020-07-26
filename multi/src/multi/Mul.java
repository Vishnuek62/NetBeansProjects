
package multi;

public class Mul 
{
    
    

    public static void main(String[] args)
    {
        Thread t1 =new Thread()
        {
            public void run()
            {
                System.out.println("vishnu");
            }
        };
        
        t1.start();
        
        
        Thread t2 = new Thread()
        {
            public void run()
            {
               System.out.println("vivek");
            }
        };
        
        
        t2.start();
        
        
    }    
}
