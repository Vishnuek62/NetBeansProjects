
package ocjp;

public class Thread4 
{
 
    public static void main (String[] args)
    {

      Thread4 p =   new Thread4();
      p.go();
    }
    
    public void go() 
    {
        
       Runnable r = new Runnable() 
        {
              public void run() 
                {
                      System.out.println("foo");
                }
       };
       Thread t = new Thread(r);
       t.start();
          // t.start();
     }
}