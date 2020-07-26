

package javaconceptoftheday;
class A1
{
    int i;
    public A1(int i)
    {
        this.i=i;
    }
}

public class nallavan 
{
    public static void main(String[] args)
    {
         class B extends A1
         {
             A1 a;
             public B(int i)
             {
                 super(i);
             }
             
         }
         System.out.println(new B(50).a.i);
    }
    
}
