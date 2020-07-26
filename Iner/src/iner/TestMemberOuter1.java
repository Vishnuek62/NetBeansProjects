
package iner;

import java.lang.Class.*;
public static Class forName()
{}
class TestMemberOuter1
{  
       private int data=30;  
   class Inner
    {  
       void msg(){System.out.println("data is "+data);}  
    }  
    static class vg{}
    void display()
    {  
       Inner in=new Inner();  
        in.msg();  
     }  
 public static void main(String args[])
    {  
       TestMemberOuter1 obj=new TestMemberOuter1();  
     // obj.display();
      TestMemberOuter1.Inner in= obj.new Inner();
      in.msg();
    }  
}