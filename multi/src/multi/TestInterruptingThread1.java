/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package multi;

class TestInterruptingThread1 extends Thread
{  
   public void run()
   {  
        try
        {
            Thread.sleep(1000);  
            System.out.println("task");  
            }catch(InterruptedException e){  
            throw new RuntimeException("Thread interrupted..."+e);  
                }  
  
    }  
  
        public static void main(String args[])
            {  try{
                    TestInterruptingThread1 t1=new TestInterruptingThread1();  
       
                    
                    t1.start();  
                  
                    t1.interrupt();  
                }catch(Exception e){System.out.println("Exception handled "+e);}  
  
            }  
}