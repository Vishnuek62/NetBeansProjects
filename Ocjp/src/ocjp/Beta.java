

package ocjp;


class Alpha 
{
   public void foo() { System.out.print("Afoo "); }
}

public class Beta extends Alpha 
{
  public void foo() { System.out.print("Bfoo "); }
 
  public static void main(String[] args)
  {
   Alpha a = new Beta();
  Alpha b = (Alpha)a;
   a.foo();
  b.foo();
  }
}