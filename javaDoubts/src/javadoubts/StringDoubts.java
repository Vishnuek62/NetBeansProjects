/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadoubts;

/**
 *
 * @author Vishnu EK
 */
public class StringDoubts {
    public static void main(String[] args) {
        
        String a="abc";
        String c="abc";
        String b = new String("abc");
        String d = b;
        
        System.out.println(a.equals(b));
        System.out.println(a == b);
        
        System.out.println(a.equals(c));
        System.out.println(a == c);
        
        System.out.println(b.equals(d));
        System.out.println(b == d);
        
        
    }
    
    
    
}
