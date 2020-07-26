

package intervuque;

class Calculation3
{  
  int sum(int a,long  b)
  {
      return a+b;
  }  
  double sum(long a,int b)
  {
      return (a+b);}  
  
      public static void main(String args[])
      {  
        Calculation3 obj=new Calculation3();  
    int result=obj.sum(20,20); //Compile Time Error  
  
  }  
} 
