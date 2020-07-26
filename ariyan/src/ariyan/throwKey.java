
package ariyan;

public class throwKey 
{
    static void validate(int age)
    {
        if(age<18)
            throw new ArithmeticException("exception occurss");
    }
    
    
    public static void main(String[] srgs)
    {
        validate(13);
    }
    
}
