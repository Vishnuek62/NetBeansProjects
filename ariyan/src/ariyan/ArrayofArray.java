
package ariyan;

import com.sun.org.apache.bcel.internal.generic.InstructionConstants;

public class ArrayofArray 
{
    
    public static void main(String[] args)
    {
   //     String[] n = new String[20];
   //     String[] t = {};
   //     System.out.println(t);
   //     System.out.println(n);
        
   //     String[] o =new String[76];
        
  //      char[] i = {'s','f'};
  //      String[] k={"d"};
        
  //      String[][] l =new String[10][20];
        
        String[][] q = {{"vishnu","nji","duisjshd","dfghjkl"},{"cbvhv","ffjhdh","fghjk","fhfjfj"}};
        System.out.println(q.length);
        for(int i=0;;i++)
        {
            for(int j=0;;j++)
            {
                System.out.print(q[i][j]+"     ");
        
            }
        }
        
        
        
      for(int x=0;x<q.length;x++)
      {
            System.out.print(q[x][0]+" : ");
            
                for(int j=0;j<q.length;j++)
                {
                    System.out.println(q[x][j]);
                }
                
            
      }
    }
        
}
 