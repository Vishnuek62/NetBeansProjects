

class Base
{
    int i=99;
    public void amethod() {        System.out.println("Base.amethod()");  }
    
    Base() {   amethod();   }
}

public class Derived extends Base
{
    int i= -1;
    long c=  9009l;
    public void amethod() {   System.out.println("Derived amthod()");    }
    
    public static void main(String[] args)
    {
        Base b =new Derived();
        System.out.println(b.i);
        b.amethod();
    }
}
