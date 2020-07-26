

package ocjp;

import java.io.IOException;

class X { public void foo() { System.out.print("X "); } }

public class gb extends X
{
   public void foo() 
   {
    // super.foo();
      
       System.out.print("B ");
    }
 public static void main(String[] args)
 {
    new gb().foo();
}
}
