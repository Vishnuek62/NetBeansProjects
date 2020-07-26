

package intervuque;
class hot
{
    void six()
    {
        System.out.println("superclass run");
    }
}

public class OverRid extends hot
{
     void six()
    {
        System.out.println("subclass run");
    }
    
    public static void main(String[] args)
    {
        hot n = new OverRid();
        n.six();
    }
}
