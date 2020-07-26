
package multi;

public class Tesr extends Thread
{
    public void run()
    {
        System.out.println("vih");
    }
    
    public static void main(String[] args)
    {
        Tesr j=new Tesr();
        
        j.start();
        
        
    }
    
}
