package multi;

class Multi1 extends Thread 
{
    public void run()
    {
        System.out.println("thread running");
    }
    
    public static void main(String[] args)
    {
        Multi1 t1 =new Multi1();
        t1.start();
        System.out.println(t1.getId());
    }
    
}
