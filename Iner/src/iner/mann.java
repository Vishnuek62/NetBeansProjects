package iner;


import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class mann {
    
    public static void main(String[] args)
    {
      
        boolean n = Pattern.compile("\\s").matcher("welcome papu").matches();
       
       //for(String l : n) 
       System.out.println(n);
       
       
   
    }
    
}
