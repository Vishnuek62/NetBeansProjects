
public class DeadLock

{
    
  public static void main(String[] args) 
  {  
      
    // t1 tries to lock resource1 then resource2  
    Thread t1 = new Thread()
    {  
      public void run()
      {  
            String resource1 = "ratan jaiswal";  
          synchronized (resource1)
          {
              System.out.println("Thread 1: locked resource 1");  
  
           
              String resource2 = "vimal jaiswal";
           synchronized (resource2)
           {  
            System.out.println("Thread 1: locked resource 2");  
           }  
         }  
      }  
    };  
  
    // t2 tries to lock resource2 then resource1  
    Thread t2 = new Thread()
    {  
              
      public void run()
      {  String resource2 = "vimal jaiswal"; 
        synchronized (resource2)
        {  
            System.out.println("Thread 2: locked resource 2");  
            String resource1 = "ratan jaiswal";
            synchronized (resource1)
           {  
            System.out.println("Thread 2: locked resource 1");  
           }  
        }  
      }  
    };  
  
      
    t1.start();  
    t2.start();  
  }  
}  