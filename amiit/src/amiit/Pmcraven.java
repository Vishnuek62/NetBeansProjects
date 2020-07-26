
package amiit;

class Pmcraven extends Thread
{
       private String sTname="";
       Pmcraven(String s)
        {
           sTname=s;
        }
    
        public void run()
         {
             for(int i=0;i<2;i++)
              {
                  try
              {
                
                sleep(6000);
                System.out.println(sTname);
                }
                catch(InterruptedException e)
                {
                  }
          //  yield();
        }
    }
   public static void main(String[] args)
    {
        Pmcraven pm1 =new Pmcraven("One");
        pm1.start();
        Pmcraven pm2 =new Pmcraven("Two");
        pm2.run();
        
    }
    
}