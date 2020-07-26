package javahungry;
public class Job extends Thread 
{
    private int counter;
    
    public void run()
    {
        synchronized(this)
        {
            for(int i = 0; i<10;i++)
                counter++;
            this.notify();
            System.out.println("completed counting");
         }
        
    }
   public static void main(String[] args) throws InterruptedException
    {
        Job job =new Job();
        job.start();
        Thread.sleep(1000);
        System.out.println("waitin to get End...");
        synchronized(job)
        {
            job.wait();
        }
        System.out.println(job.counter);
    }
}
