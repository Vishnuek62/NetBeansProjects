
package multi;

public class createthrd extends Thread
{
    public void run()
            
    {
        System.out.println("running");
    }
    
    public static void main(String[] args)
    {
         createthrd t =new createthrd(); 
                       //     Thread t =new Thread();
       
                      //   Thread r =new Thread(t,"hui");
        
                    //    Thread e=new Thread(t);
        
                    //      Thread i = new Thread("bnm");
        
         t.start();
        
    }
    
}
