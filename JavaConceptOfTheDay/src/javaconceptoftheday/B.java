package javaconceptoftheday;
interface r
{}
class A
{
    
    static int i=1111;
    
    static
    {
        i=i-- - --i;
        System.out.println(i);
    }
    {
        i= i++ + ++i;
        System.out.println(i);
    }
}
class B extends A implements r
{
    static
    {
        i=--i - i--;
        System.out.println(i);
    }
    {
        i= ++i + i++;
        System.out.println(i);
    }
 
    
    public static void main(String[] args)
   {
      r jk = new B(); 
  //    r km =String.valueOf('b');
       
       
      B b= new B();
      System.out.println(i);
      for(;;);
   }
    
}
