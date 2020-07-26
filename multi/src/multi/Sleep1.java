
package multi;


public class Sleep1 extends Thread 
{
    public void run()
    {
       for(int i=0;i<=5;i++)
       {
        try
        {
        Thread.sleep(100);
        
        }
        catch(Exception e)
        {
            System.out.println("excetion");
        }
        System.out.println("vishnu");
      }
    }
    
    
    
    public static void main(String[] args)
    {
        Sleep1 ne=new Sleep1();
        Sleep1 ni = new Sleep1();
        
        ne.start();
        ni.start();
    }
    
}
