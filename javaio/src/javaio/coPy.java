
package javaio;
import java.io.*;

public class coPy 
{
    
    public static void main(String[] args) throws IOException
    {
         FileOutputStream out =new FileOutputStream("asd.java");
         FileInputStream in = new FileInputStream("abc.txt");
         
         int i=0;
         while((i=in.read())!=-1)
         {
             out.write((char)i);
         }
         
    }
    
}
