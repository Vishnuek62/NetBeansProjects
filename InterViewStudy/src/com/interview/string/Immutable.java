package com.interview.string;

/**
 *
 * @author Vishnu EK
 * @since Aug 12, 2018
 * @version 1.0
 */
public class Immutable {

    public static void main(String[] args) {
        String a = "sa";
        String s = "s";
        String b = s.concat("a");
        System.out.println(b == a);
        System.out.println("test" == "te" + "st");

    }
}
