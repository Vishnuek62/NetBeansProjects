
package collection_frame;
import java.util.*;
public class Test_Gen 
{
    
    public static void main(String[] args)
    {
        ArrayList<String> ls= new ArrayList<String>();
        
        ls.add("najeeb");
        ls.add("siava");
        ls.add("likz");
        ls.add("vivek");
        
        String s= ls.get(1);
        System.out.println(s);
        
        Iterator<String> r = ls.iterator();
        while(r.hasNext())
        {
            System.out.println(r.next());
        }
        
        
        
    }
    
}
