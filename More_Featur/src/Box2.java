
class Box2
{  
  static void m(int i, int i2){System.out.println("int int");}  
  static void m(Integer... i){System.out.println("Integer...");}  
  
  public static void main(String args[])
  {  
  // short s1=30,s2=40; 
    Integer s1 = new Integer(30);
    Integer s2 = new Integer(30);  
      m(s1,s2);  
 }   
} 