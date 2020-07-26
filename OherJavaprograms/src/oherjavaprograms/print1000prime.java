

package oherjavaprograms;


public class print1000prime 
{
    public static boolean ifnoprime(int number)
    {
        for(int j=2;j<=number/2;j++)
        {
            if(number%2==0)
            {
                return false;
            }
            
        }
        return true;
    }
    public static void main(String[] args)
    {
        int count=0;
        int i=2;
        
        while(count<1000)
        {
            if(ifnoprime(i))
            {
                System.out.println(i);
               count++; 
            }
            i++;
        }
     }
    
}
