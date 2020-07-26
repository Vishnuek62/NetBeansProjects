

package intervuque;
import java.util.*;
public class V 
{
    public static void main(String[] args)
    {
        int a=3;
        char w=6;
        System.out.println(a+w);
        String s3 = "JournalDev";
int start = 1;
char end = 5;
System.out.println(start + end);
System.out.println(s3.substring(start, end));
       // System.out.print(w);
        
        String s1 = "abc";
        String s2 = new String("abc");
              
        System.out.println("s1 == s2 is:" + s1 == s2);
        
        System.out.println(s1.equals(s2));
    
    HashSet shortSet = new HashSet();
      for (short i = 0; i < 100; i++)
      {
    shortSet.add(i);
    shortSet.remove(i-1);
}
System.out.println(shortSet.size());
    
   
   
    String str = null;
    
   String str1="abc";
  System.out.println(str1.equals("abc") );
          System.out.println(str.equals(null));
    
    
    
    
    
    
    }
 }
    

