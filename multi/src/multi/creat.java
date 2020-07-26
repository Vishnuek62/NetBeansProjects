
package multi;



public class creat implements Runnable 
{
    static int t =10;
    public creat() {
        
    Thread t = new Thread(this);
    t.start();
    System.out.println("one");
    }
    
    
    public void run()
    {
        System.out.println("Running "+t++);
    }
    
    
    
    public static void main(String[] args)
    {
        creat r= new creat();
       Thread t1 = new Thread(r);
        t1.start();
        
    }
    
}
