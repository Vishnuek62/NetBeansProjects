
package ariyan;
class ariayl
{
    static
    {
       System.out.println("1");
    }  

    {
        System.out.println("3");
    }
    
    ariayl()
    {
        System.out.println("4");
    }

}

public class ariyanam extends ariayl 
{
    static
    {
        System.out.println("2");
    }
    
    {
        System.out.println("5");
    }
    
    ariyanam()
    {
        System.out.println("6");
    }
    
    public static void main(String[] args)
    {
        ariyanam j = new ariyanam();
    }  
    
 }
