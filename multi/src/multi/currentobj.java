
package multi;

public class currentobj extends Thread 
{
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
    }
    
    
    
    public static void main(String[] args)
    {
        currentobj m= new currentobj();
        currentobj n= new currentobj();
        
        m.start();
        n.start();
        
        
    }
    
}
