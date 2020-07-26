package com.interview.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Vishnu EK
 */
public class ReverseString {
    
    public static void main(String[] args) {
        //1
        String itemString = "Vishnu";
        StringBuilder builder = new StringBuilder(itemString);
        System.out.println("reverser->"+builder.reverse());
        
        //2
        byte [] strAsByteArray = itemString.getBytes();
        byte [] result = new byte [strAsByteArray.length];
        for (int i = 0; i<strAsByteArray.length; i++)
        {
            System.out.println("byteArray->"+strAsByteArray[i]);
            result[i] = strAsByteArray[strAsByteArray.length-i-1];
        }
        System.out.println(new String(result));
        
        //3
        char[] try1 = itemString.toCharArray();
        for (int i = try1.length-1; i>=0; i--)
            System.out.print(try1[i]);
        
        System.out.println();
        
        //4
        char[] hello = itemString.toCharArray();
        List<Character> trial1 = new ArrayList<>();
 
        for (char c: hello)
            trial1.add(c);
 
        Collections.reverse(trial1);
        trial1.forEach(item -> System.out.print(item));
    }   
}