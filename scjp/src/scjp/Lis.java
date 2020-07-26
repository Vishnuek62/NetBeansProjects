

package scjp;

import java.util.*;

public class Lis 
{
    public static void main(String[] args)
    {
    List lst = new ArrayList ();
      lst.add(34);
          lst.add(6);
         lst.add(2);
    lst.add(8);
          lst.add(7);
       lst.add(10);
            NavigableSet nvset = new TreeSet(lst);
         System.out.println(nvset.headSet(10,true));
    }
}
