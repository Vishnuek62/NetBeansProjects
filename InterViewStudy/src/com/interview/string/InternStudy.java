package com.interview.string;

/**
 *
 * @author Vishnu EK
 * @since Aug 12, 2018
 * @version 1.0
 */
public class InternStudy {
    public static void main(String[] args) {
        String a = new String("abc");
        String c=a.intern();
        String b ="abc";
        System.out.println(a==b);
        System.out.println(b==c);
    }
}
