

class Box
{  
   static void m(int i) { System.out.println("int"); }   
   static void m(Integer i) { System.out.println("Integer"); }  
  
    public static void main(String args[])
    {  
        
       
        Integer s = new Integer(50);  
        short q=s;
    m(s);
     
      
 }   
}  
     