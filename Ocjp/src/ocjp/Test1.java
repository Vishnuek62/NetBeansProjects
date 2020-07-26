

package ocjp;


public class Test1
{
   public enum Dogs {collie, harrier, shepherd};
   public static void main(String [] args)
   {
      Dogs myDog = Dogs.collie;
      switch (myDog)
      {
        case collie:
         System.out.print("collie ");
        
        
       case harrier:
     System.out.print("harrier ");
           case default:
         System.out.print("retriever ");

   }
 }
}