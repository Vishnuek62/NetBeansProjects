
package pdf;

public interface p
{
    public void yu();
}

public abstract class tr
        {
}
class PingPong2 extends Thread 
{
    synchronized void hit(long n) throws  Exception
      {
         for(int i = 1; i < 3; i++)
         {   Thread.sleep(1000);
             System.out.print(n + "-" + i + " ");
         }
         }
 }

 public class Tester implements Runnable
 {
      static PingPong2 pp2 = new PingPong2();
        
      public static void main(String[] args) 
        {
            new Thread(new Tester()).start();
            new Thread(new Tester()).start();
        }
         
      public void run() 
      { 
          
          //pp2.hit(Thread.currentThread().getId());
      }
 }