
package javaio;

import java.io.*;
public class fromKeyboard 
{
    public static void main(String[] args) throws IOException
    {
        InputStreamReader j =new InputStreamReader(System.in);
        BufferedReader br =new BufferedReader(j);
        
        String name = br.readLine();
        
        System.out.println(name);
    }
    
}
