
package string;

public class man10 
{
   public static void main(String[] args)
   {
       String s1= "abcdefgh";
       byte[] barr;
       barr =s1.getBytes();
       for(int i=0; i<barr.length;i++)
       {
           System.out.println(barr[i]);
       }
       
   }
}
