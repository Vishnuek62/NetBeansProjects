package excption;
public class ExpPrpgtion 
{
    void n()
    {
     m();
    }
    void m()
    {
       // int data=50/0;
        throw new ArithmeticException("g");
        System.out.println("fgh");
    }
    void p()
    {
       try
       {
            n();
        }
      catch(ArithmeticException e)
     {
            System.out.println(e);
        }
    }
    public static void main(String[] args)
    {
        ExpPrpgtion rt =new ExpPrpgtion();
        rt.p();
        System.out.println("Normal flow");
    }
    
}
