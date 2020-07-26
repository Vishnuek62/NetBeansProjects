
package collection_frame;

import java.util.*;

public class SortinG 
{

    
    public static void main(String[] args)
    {
        ArrayList<String> al=new ArrayList<String>();
        al.add("vishnu");
        al.add("siva");
        al.add("vivk");
        
        Collections.sort(al);
        
        for(String a :al)
        {
            System.out.println(al);
        }
        
        Iterator mk = al.iterator();
        while(mk.hasNext())
        {
            System.out.println(mk.next());
        }
        
        ArrayList<Integer> f = new ArrayList<Integer>();
        
        f.add(3);
        ArrayList g = new ArrayList();
        g.add(10);
        g.add(9);
        g.add(Integer.valueOf(100));
        
        Collections.sort(g);
        
        Iterator j= g.iterator();
        while(j.hasNext())
        {
            System.out.println(j.next());
        }
        
        
    }
    
}


//public void sort(List ls) 