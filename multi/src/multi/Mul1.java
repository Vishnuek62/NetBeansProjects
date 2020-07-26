
package multi;

public class Mul1 //implements Runnable 
{
    public static void main(String[] args)
    {
        
        
        Runnable r1=new Runnable()
        {  
    public void run()
    {
        System.out.println("task one");  
    }  
  };
        
       Runnable r2 =new Runnable()
        
        {
            public void run(){ System.out.println("task one");  }
            
        };
       Thread t1 =new Thread(r1);
       Thread t2 = new Thread(r2);
       
       t1.start();
       
       t2.start();
        
    }
}
