package excption;
public class Excption 
{
    public static void main(String[] args) //throws ArithmeticException
    {
         try
         {
                       //      int a=50/0;
      int[] arr= new int[10];
        arr[14]= 467/0;
      
           }
 

         catch(ArithmeticException e)
       {
            System.out.println("arithematic excxption");
          }
         catch(ArrayIndexOutOfBoundsException e)
         {
           System.out.println(e);  
         }
         catch(Exception e)
           {
            System.out.println(" exception");
            }
       
         
         System.out.println("vishnu");
               
       }
}
