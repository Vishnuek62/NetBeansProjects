
package collection_frame;
import java.util.*;
public class TestVector1 
{
    
    public static void main(String[] args)
    {
        Vector<String> d =new Vector<String>();
        Vector<Integer> h =new Vector<Integer>();
         Vector q =new Vector();
         d.add("vishnu");
         d.add("najib");
         d.add("vivek");
         d.add("siva");
       
         h.add(3);
         h.add(Integer.valueOf(37));
        
         q.add("siva sakthi");
         q.add(100);
     q.add(2387728.8);
     
     Enumeration t = d.elements();
     
     while(t.hasMoreElements())
     {
         System.out.println(t.nextElement());
     }
     
      Enumeration u = h.elements();
     
     while(u.hasMoreElements())
     {
         System.out.println(u.nextElement());
     }
      Enumeration we = q.elements();
     
     while(we.hasMoreElements())
     {
         System.out.println(we.nextElement());
     }
     
    }
    
}
