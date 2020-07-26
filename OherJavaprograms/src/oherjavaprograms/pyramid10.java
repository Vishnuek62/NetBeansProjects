

package oherjavaprograms;

public class pyramid10 
{
    public static void main(String[] args)
    {
        
        for(int i=1;i<=5;i++)
        {
            for(int k=i;k>=i;k--)
                System.out.print(k);
            for(int k=2;k<=i;k++)
                System.out.print("  "+k);
            System.out.println();
        }
        
        
    }
}
