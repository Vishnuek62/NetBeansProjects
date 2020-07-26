
package multi;

public class Syn extends Thread
{
   
    
    
    public static void main(String[] args)
    {
      printVal qwe =new printVal();
      
      thread1 qw= new thread1(qwe);
      thread2 q=new thread2(qwe);
      
     qw.start();
     q.start();
      
    }
    
}

class printVal extends Thread
{
  synchronized void printV(int r)
    {
        for(int i=1;i<5;i++)
        {
            try
            {
                Thread.sleep(1500);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
             System.out.println(r*i);
            
        }
    }
}
class thread1 extends Thread
{
    printVal t;
    thread1(printVal t)
    {
        this.t=t;
    }
    public void run()
    {
        t.printV(5);
    }
}
class thread2 extends Thread
{
    printVal t;
    thread2(printVal t)
    {
        this.t=t;
    }
    public void run()
    {
        t.printV(200);
    }
}