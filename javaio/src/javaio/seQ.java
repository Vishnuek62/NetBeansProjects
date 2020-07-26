
package javaio;
import java.util.*;
import java.io.*;
public class seQ 
{
 
    
    public static void main(String[] args) throws IOException
    {
        FileInputStream q =new  FileInputStream("q.txt");
    FileInputStream w = new FileInputStream("w.txt");
    FileInputStream e = new FileInputStream("e.txt");
    FileInputStream r = new FileInputStream("r.txt");
   
    Vector n = new Vector();
    
    n.add(q);
    n.add(w);
    n.add(e);
    n.add(r);
    
    Enumeration k  = n.elements();
    
    SequenceInputStream bin=new SequenceInputStream(k);  
int i=0;  
  
while((i=bin.read())!=-1){  
System.out.print((char)i);  
}  
    
    
    
    }
}
