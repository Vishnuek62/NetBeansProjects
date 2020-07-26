/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaio;
import java.util.*;
/**
 *
 * @author Vishnu EK
 */
public class Scanr 
{
    public static void main(String[] args)
    {
    String input = "10 co 20 coffee 30 tea buiscuits";  
     Scanner s = new Scanner(input).useDelimiter("\\s");  
     System.out.println(s.nextInt());  
     System.out.println(s.next());  
     System.out.println(s.nextInt());  
     System.out.println(s.next());  
     s.close();   
    }
}
