package javaconceptoftheday;


public class onlyJava //implements myInterface
{
     class Myclass
        {
           int mymethod(int i)
           {
               i+=20;
               return i;
           }
        }
     int man()
     {
         Myclass j = new Myclass();
         int u= j.mymethod(50);
         return u;
     }
     
    public static void main(String[] args)
    {
        
        System.out.println(new onlyJava().man());
    }
    
    
}
