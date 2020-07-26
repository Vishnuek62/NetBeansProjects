
package multi;


class Multi implements Runnable
{
    public void run()
    {
        System.out.println("Running");
    }

    public static void main(String[] args) 
    {
       Multi s=new Multi();
       Thread t1=new Thread(s);
       t1.start();
         
    }
    
}