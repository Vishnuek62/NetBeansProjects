
package net_workin;
import java.io.*;

import java.net.*;

public class Net_workin 
{    
    public static void main(String[] args)
    {
      try
      {
        Socket n =new Socket("localhost",666); 
        System.out.println("established");

        DataOutputStream dout=new DataOutputStream(n.getOutputStream());  
        dout.writeUTF("Hello Server");  
      }
      catch(Exception e)
            {
                
            }
    }
}