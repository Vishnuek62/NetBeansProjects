


import java.util.regex.*;

public class Rglr 
{
    
    
    public static void main(String[] args)
    {
       Pattern n= Pattern.compile(".s");
       Matcher b= n.matcher("as");
       
       boolean m= b.matches();
       System.out.println(b);
       
    }
    
}



