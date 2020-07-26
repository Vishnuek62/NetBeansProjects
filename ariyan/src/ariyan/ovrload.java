
package ariyan;

public class ovrload 
{
    
    
   
   int sum(int a,int b)
   {
       System.out.println(a+b);
       return 0;
   }  
  double sum(int a,int b, int c)
  {
      System.out.println(a+b);
      return 0;
  }  
 
    public static void main(String[] args)
    {
       ovrload obj=new ovrload();  
      double  result=obj.sum(20,20);   
  
  }  
}
    
    
}
