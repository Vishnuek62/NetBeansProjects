
package oherjavaprograms;
import java.util.*;

public class reverseString 
{
    public static void revers(String st)
    {
      char[] strarray = st.toCharArray();
      StringBuilder strbui = new StringBuilder();
      
      for(int i=strarray.length-1;i>=0;i--)
      {
          strbui.append(strarray[i]);
      }
      //for(int y=0;y<strarray.length;y++)
      System.out.println(strbui.toString());
        
    }
   public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the string");
        String str = sc.nextLine();
        revers(str);
    }
    
}
