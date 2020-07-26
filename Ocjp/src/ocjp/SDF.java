

package ocjp;


public class SDF 
{
    public void testIfA()
    {
         if (testIfB("Vishnu"))
         {    
               System.out.println("True");
         }
         else
         {
              System.out.println("Not true");
          }
    }
    public Boolean testIfB(String str) 
    {
        System.out.println(Boolean.valueOf(str));
             return Boolean.valueOf(str); 
    }
       public static void main(String[] args)
           {
           new SDF().testIfA();
            }
}
