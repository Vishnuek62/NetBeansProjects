

package ocjp;

public class Venus 
{
    
   public static void main(String[] args)
   {
       String u = "12345";
System.out.println(u.toString() + " ");
       int[] x = {1,2,3};
       int y[] ={4,5,6};
       new Venus().go(x,y);
       
       
   }
   void go(int[]... z)
   {
       for(int[] a : z)
       {
           System.out.println(a[0]);
           System.out.println(a[2]);
           
       }
           
           
   }
}
