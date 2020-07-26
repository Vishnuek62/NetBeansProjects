
package intervuque;
class d1
{
  //  d1(){}
    d1(int a)
    {
        System.out.println("super construct");
    }
}

public class supe extends d1
{
    supe()
    {
        super(6);
     System.out.println("sub construct");   
    }
    public static void main(String[] args)
    {
        supe n =new supe();
    }
}
