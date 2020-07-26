
package javaio;

import java.io.*;
public class FileRead 
{
    
    public static void main(String[] args) throws IOException
    {
        FileWriter fc = new FileWriter("abc.txt");
        
        fc.write("my name khan");
        fc.close();
    }
    
}
