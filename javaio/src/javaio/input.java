
package javaio;
import java.io.*;

public class input 
{
    
  public static void main(String[] args) throws IOException
  {
      FileInputStream in = new FileInputStream("abc.txt");
      
      int i=0;
       
      while((i=in.read())!=-1)
       {
           System.out.println((char)i);
       }
   in.close();
  }
}
