
package multi;

public class MULTI3 extends Thread
{
    public void run()
    {
        for(int i=1;i<6;i++)
        {
           try
          {
               Thread.sleep(500);
           }
            catch(Exception e)
             {
                 System.out.println(e);
             }
         System.out.println(i);   
        }
    }
    
    
    public static void main(String[] args)
    {
        MULTI3 t1 = new MULTI3();
         MULTI3 t2 = new MULTI3();
          MULTI3 t3 = new MULTI3();
          t1.start();
          try
          {
              t1.join();
          }
         catch(Exception e){
         System.out.println(e);}
          t2.start();
          t3.start();
    }
          
    
}
