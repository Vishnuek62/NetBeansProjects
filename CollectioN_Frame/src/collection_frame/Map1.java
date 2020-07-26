
package collection_frame;

import java.util.*;
public class Map1 
{
    public static void main(String[] args)
    {
        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(1, "vishnu");
        map.put(2, "siva");
        
        Set<Map.Entry<Integer,String>> set=map.entrySet();
        
        Iterator <Map.Entry<Integer,String>> it =set.iterator();
        
        while(it.hasNext())
        {
            Map.Entry e=it.next();
            System.out.println(e.getKey()+" "+e.getValue());  
        }
    }
    
}
