package intervuque;
class Y
{
    public synchronized void printName()
    {
        try{
            System.out.println("printName");
            Thread.sleep(5*1000);
            
          }catch(Exception e){}
    }
    public synchronized void printValue()
    {
        System.out.println("printValue");
    }
}
public class summ extends Thread 
{
    Y y = new Y();
   public void run()
    {
        if(Thread.currentThread().getName().equals("t1"))
        {
            y.printName();
            
        }
        else
        {
            y.printValue();
        }
    }
    
   public static void main(String[] args) throws Exception
    {
        summ t= new summ();
        Thread t1 = new Thread(t,"t1");
        Thread t2 = new Thread(t,"t2");
        t1.start();
        t2.start();
    }
}
