
package net_workin;

import java.io.*;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server 
{
   public static void main(String[] args) throws IOException
    {
        ServerSocket e =new ServerSocket(666);
        
        Socket ss = e.accept();
        
        DataInputStream dis=new DataInputStream(ss.getInputStream());  
        
        
        
        System.out.println(dis.readUTF());
    
        InputStreamReader th =new InputStreamReader(System.in);
        BufferedReader br = new  BufferedReader(th);
        String h =br.readLine();
        DataOutputStream un = new DataOutputStream(ss.getOutputStream());
        un.writeUTF(h);
    } 
    
   
    
}
