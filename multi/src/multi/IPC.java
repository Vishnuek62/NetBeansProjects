
package multi;

public class IPC 
{
    int amount=1000;
    
   synchronized void withdraw(int amount)
    {
        System.out.println("goin to withdraw");
        
        if(this.amount < amount)
        {
            System.out.println("Less balance waitin for deposit");
            try{wait();}catch(Exception e){}
        }
        this.amount -=amount;
        System.out.println("withdraw completed");
    }
   synchronized  void deposit(int amount)
    {
       System.out.println("Goin to deposit"); 
       this.amount +=amount;
       System.out.println("Deposit completed");
       notify();
    }
    
    public static void main(String[] args)
    {
       final IPC n =new IPC();
        
        new Thread()
        {
            public  void run()
            {
                n.withdraw(15000);
            }
            
        }.start();
        
       new Thread()
       {
           public void run()
           {
               n.deposit(10000);
           }
       }.start();
        
    }
    
}
