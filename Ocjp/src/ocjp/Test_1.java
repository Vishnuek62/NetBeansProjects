

package ocjp;
class Az extends Thread
{
    public void run()
    {
        for(int i=0;i<2;i++)
        {
            System.out.println(i);
        }
    }
    
}

public class Test_1 extends Thread
{
    public void check(Test_1 x)
    {
        x.start();
    }

    public static void main(String[] args)
    {
        int i=9;
        Test_1 w = new Test_1();
        w.check(w);
        
        
        
    }
    
}
