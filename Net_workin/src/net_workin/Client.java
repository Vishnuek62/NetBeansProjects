
package net_workin;

import java.io.*;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client 
{
    public static void main(String[] args)
    {
      try
      {
        Socket n =new Socket("localhost",666); 
        System.out.println("established");

        InputStreamReader in =new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        String se=br.readLine();
        DataOutputStream dout=new DataOutputStream(n.getOutputStream());  
        dout.writeUTF(se);  
        
        
        DataInputStream k =new DataInputStream(n.getInputStream());
        
        System.out.println(k.readUTF());
        
        
        
      }
      catch(Exception e)
            {
                
            }
    }
}
