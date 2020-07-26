
package ocjp;
class A 
{
    void foo()   throws Exception 
    {
    // throw new Exception();
    }
}

class SubB2 extends A
 {
     void foo() //throws ArithmeticException
     {
        System.out.println("B ");
     }
}
class Tester
{
     public static void main(String[] args)// throws Exception 
      {
             //try{
            
        A a = new SubB2();
         a.foo();
         
             //   }catch(Exception e){}
     }
}
