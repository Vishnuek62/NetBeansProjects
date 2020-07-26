//Type mismatch : cannot convert from void to String

package congrete;

public class Congrete 
{
   String time;
   
   void setTime(String t)
   {
       time= t;
   }
    String getTime()
    {
         return time;
    }
    
    public static void main(String[] args)
    {
       Congrete j =new Congrete();
       j.setTime("10.10");
       String to= j.getTime();
       System.out.println(to.toString());
 //       System.out.println(null);
       
    }
    
}
