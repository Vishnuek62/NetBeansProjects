
package javaio;

import java.io.*;

public class outputStream 
{
    
    
    
    public static void main(String[] args) throws IOException
    {
        
        FileOutputStream fout = new FileOutputStream("abc.txt");
        
        String s = "vishnu is bad boy . he cannot do anythimg";
        
        byte[] e = s.getBytes();
        
        fout.write(e);
        
        fout.close();
        
        
    }
}
