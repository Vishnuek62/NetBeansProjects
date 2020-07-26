

package ocjp;


class A5 
{
     void foo() throws Exception
     {
         //throw new Exception(); 
     }
}


 class Tester1 extends A5
 {
    void foo() { System.out.println("B "); }
     public static void main(String[] args)
 {
    A5 a = new Tester1();
     a.foo();
 }
 }