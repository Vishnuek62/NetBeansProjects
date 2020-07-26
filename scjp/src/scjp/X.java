

package scjp;

class Y
{
    Y()
    {
    System.out.println("Y constructer");
    }
}
class Z extends Y
{
    Z()
    {
        System.out.println("Z constructer");
    }
}

public class X extends Z
{
    X()
    {
        System.out.println("X");
    }
    public static void main(String[] args)
    {
        new X();
    }
    
}
