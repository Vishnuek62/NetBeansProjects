
package ocjp;

class qwe
{
   void vb()
    {
        System.out.println("likitha"); 
    }
}
class as extends qwe
{
   void vb()
    {
        System.out.println("vishnu");
    }
}
public class Over extends Thread
{
     public static void main(String[] args)
    {
        qwe m =new as();
          Thread jk = new Thread();
          jk.yield();
        
    }
    
}
