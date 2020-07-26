
package net_workin;
import java.io.*;
import java.net.*;
public class Net_workin1 
{
    public static void main(String[] args) throws IOException
    {
        ServerSocket e =new ServerSocket(666);
        
        Socket ss = e.accept();
        
        DataInputStream dis=new DataInputStream(ss.getInputStream());  
        
        String  str=(String)dis.readUTF();  
        
        System.out.println("message= "+str);  
    }
    
}
