
package javaio;
import java.io.*;

public class ByteArray 
{
   public static void main(String[] args) throws IOException    
   {
       FileOutputStream out1 =new FileOutputStream("qwerty.txt"); 
       FileOutputStream out2 = new FileOutputStream("asd.txt");
       
       ByteArrayOutputStream in = new ByteArrayOutputStream();
       
       in.write(65);
       in.writeTo(out1);
       in.writeTo(out2);

   }
    
}
