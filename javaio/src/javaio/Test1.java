
package javaio;
import java.io.*;

public class Test1 
{
   
       
    public static void main(String[] args) throws IOException
    {
        FileInputStream m = new FileInputStream("sasi.txt");
        
       FileOutputStream j =new FileOutputStream("vishn.txt");
       
       ByteArrayOutputStream k = new ByteArrayOutputStream();
       
       
       Console c;
       c = System.console();
       String text = c.readLine();
       System.out.println(text);
       
       
       int i=0;
       while((i = m.read())!= -1)
       {
           j.write((byte)i);
       }
        m.close();
        j.close();
        
    }
    
    
}
