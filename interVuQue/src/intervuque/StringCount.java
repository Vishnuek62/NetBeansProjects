
package intervuque;
import java.util.*;

public class StringCount 
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the string");
        String str= sc.next();
        int h= count(str);
        System.out.println(h);
    }
    public static int count(String st)
    {
        ArrayList<Character> n =new ArrayList<Character>();
        Character c;
        int count=0;
        for(int v=0;v<st.length();v++)
        {
          c= (char) st.charAt(v);
          
          n.add(c);
          
          if(((v>0)&&(n.get(v)!=' ')&&(n.get(v-1)==' ')) || ((n.get(0)!=' ')&&(v==0)))
                 count++;
               
        }
       // Iterator<Character> b = n.iterator();
        for(char d : n)
        {
          System.out.println(d);
        }
        return count;
    }
}
