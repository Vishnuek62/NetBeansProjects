/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package collection_frame;
import java.io.*;
import java.util.*;
public class Test1 
{
    public static void main(String[] args) throws Exception
    {
        Properties n = new Properties();
        
        FileReader j = new FileReader("v.java");
        
            
      
        
        
        
        n.setProperty("vishnu", "vishnuek62@gmail.com");
       try{ 
        n.store(new FileWriter("info.properties"),"Javatpoint Properties Example"); 
       }catch(Exception e){}
    }
    
}
