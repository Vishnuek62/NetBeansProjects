
package multi;

public class daemon1 extends Thread
{
    public void run()
    {
        if(Thread.currentThread().isDaemon())
            
        {
          System.out.println("yes");           
        }
        else
        {
            System.out.println("No");
        }
    }
    
    
    public static void main(String[] args)
    {
        daemon1 q = new daemon1();
        daemon1 w = new daemon1();
        daemon1 e = new daemon1();
        
        q.setDaemon(true);
        
        q.start();
        w.start();
        e.start();
    }
    
}
