package com.interview.string;

/**
 *
 * @author Vishnu EK
 * @since Aug 11, 2018
 * @version 1.0
 */
public class Swap {

    public static void main(String[] args) {
        Integer x = 0b1010;
        Integer y = 0b0101;

        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("After swap: x = "
                + x + ", y = " + y);
        
    }
}
