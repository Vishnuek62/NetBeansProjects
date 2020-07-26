


package javaconceptoftheday;


public class JavaQuiz 
{
    static 
    {
       try
       {
           throw new Exception();
       }
       catch(Exception e)
       {
          System.out.println("1");
       }
       finally
       {
           System.out.println("2");
       }
       
    }
    
    public static void main(String[] args)
    {
        
    }
        
}
