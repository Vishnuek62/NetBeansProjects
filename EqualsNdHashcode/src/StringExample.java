/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vishnu EK
 */
public class StringExample {

    public static void main(String[] args) {

        String a = new String("abc");
        String b = "abc";
        System.out.println(a == b);
        System.out.println(a.equals(b));
        String c = new String("abc");
        System.out.println(a == c);
        String d = "abc";
        System.out.println(b == d);
        String e = a;
        String f = b;
        System.out.println(a==e);
        System.out.println(f==b);
        
        a=a.concat("d");
        b=b.concat("d");
        System.out.println(a==b);
        System.out.println();
        
    }

}
