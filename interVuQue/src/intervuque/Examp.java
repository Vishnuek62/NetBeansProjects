

package intervuque;
import java.io.*;
public class Examp 
{
    public static void main(String[] args) throws IOException
    {
        
        FileOutputStream out= null;
        try{
            out = new FileOutputStream("tes.txt");
            out.write(122);
            out.close();
         }
        finally
       {
            
        }
        
    }
}