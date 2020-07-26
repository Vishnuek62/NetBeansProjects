
package string;

import java.util.regex.*;


public class man12
{
    
    
    
    public static void main(String[] args)
    {
       Pattern p = Pattern.compile("....s");
          Matcher m=p.matcher("fgast");
          boolean b =m.matches();
          System.out.println(b);
    
    }
    
}
