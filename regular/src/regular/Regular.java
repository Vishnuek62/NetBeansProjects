
package regular;

import java.util.regex.*;

public class Regular 
{
    

    
    public static void main(String[] args) 
    {
    //   System.out.println("breadjambread".replace("bread","a "));
        String s = "breadjambread";
        
        char[] gh = s.toCharArray();
        
        for(int i=0;i<gh.length-1;i++)
        {
            for(int j=1;j<i+1;i++)
            {
                if(gh[i] == gh[j])
                {
                       System.out.println("true");
                }
                else
                {
                       System.out.println("false");
                }
            }
        }
        
    //      String[] m=s.split("\\s");
      //    for(int i=m.length-1;i>=0;i--)
        //  {
        //   System.out.print(m[i]+" ");     
        
  //  }
     //     System.out.println(s.replace( "bread",""));
      //    System.out.println(s.indexOf(6));
            
}
}
