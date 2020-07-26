

package intervuque;

class A1 extends Thread
{
    int count=0;
    public void run()
    {
        System.out.println("run");
        synchronized(this)
        {
            for(int i=0;i<50;i++)
            {
                count=count+i;
            }
            notify();
        }
    }
}
public class Test1 
{
    public static void main(String[] args)
    {
        A1 r = new A1();
        r.start();
        synchronized(r)
        {
            System.out.println("waitin");
            try{
                r.wait();
            }catch(InterruptedException e0)
            {}
            System.out.println(r.count);

        }
        }
        
        
        
    }
}
