
package javaconceptoftheday;
import java.util.*;
public class anagraM 
{
    
    public static void main(String[] args)
    {
        boolean an;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String1");
        String str1 =sc.nextLine();
        System.out.println("Enter your String2");
        String str2 =sc.nextLine();
        
        char[] p =str1.replace(" ", "").toLowerCase().toCharArray();
        char[] r =str2.replace(" ","").toLowerCase().toCharArray();
        Arrays.sort(p);
        Arrays.sort(r);
        
        for(int i=0;i<p.length;i++)
        {
        System.out.print(p[i]);
        }
        System.out.println();
        for(int i=0;i<r.length;i++)
        {
        System.out.print(r[i]);
        }
        System.out.println();
        if(p.length!=r.length)
        {
            System.out.println(" NOt Anagram");
        }
        else
        {
            System.out.println(Arrays.equals(p, r));
        }
     }
}
