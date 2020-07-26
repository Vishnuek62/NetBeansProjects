

package ocjp;
import java.io.*;

public class JavaSt 
{
    public static void main(String[] args) 
    {
        NumberFormat nf = NumberFormat.getInstance();
           nf.setMaximumFractionDigits(4);
              nf.setMinimumFractionDigits(2);

               String a = nf.format(3.1415926);
                String b = nf.format(2);
        
        
        
                Object r =new Object();
               File u = new File("balaganapathy.java");
               
               
       String str = "null";
       if (str == null) 
       {
           System.out.println("null");
       }
       else if (str.length() == 0) 
         {
          System.out.println("zero");
          } else
         { 
              System.out.println("some");
         }
}
    
}
