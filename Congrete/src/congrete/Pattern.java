
package congrete;

public class Pattern 
{
   
    public static void main(String[] args)
    {
       
        int i=12345;
        for(int j=4;j>-5;j--)
        {
            int p= i/(int)Math.pow(10,Math.abs(j));       
       System.out.println(p); 
        }
        
        int r= -3;
        System.out.println(Math.abs(r));
        
    }
    
}
