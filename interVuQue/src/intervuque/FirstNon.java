
package intervuque;
import java.util.Scanner;
import java.util.*;
public class FirstNon 
{
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str;
        str= sc.next();
        char d = NonCharacter(str);
        System.out.println("non charaaa    "+d);
    }
    
    public static  char NonCharacter(String u)
    {
        
        HashMap<Character, Integer> jk = new HashMap<Character, Integer>();
        Character c;
        for(int i=0;i<u.length();i++)
        {
            
            c=u.charAt(i);
            
            if(jk.containsKey(c))
            {
                jk.put(c, jk.get(c)+1);
            }
            
            else
            {
                jk.put(c,1);
            }
        }
        for(int i=0;i<u.length();i++)
        {
            c= u.charAt(i);
            if(jk.get(c)==1)
            {
                return c;
            }
        }
        return 1;
    }
}
