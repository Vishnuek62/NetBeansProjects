/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex;

import java.util.Arrays;
import sun.security.util.Length;

/**
 *
 * @author Vishnu EK
 */
public class reverseCharArray {
    private static void reverseString(String inputString) {
        char inputArray[] = inputString.toCharArray();
        char newArray[] = new char[inputArray.length];
        for (int i = inputArray.length - 1, j = 0; i >= 0; i--, j++) {
            newArray[j] = inputArray[i];
        }
        char tempArray[] = new char[inputArray.length];
        for (int i = 0,j=0; i <= newArray.length-1; i++,j++) {
            if (newArray[i] == ' ') {
                swaping(tempArray);
               tempArray =new char[inputArray.length];
                continue;
            }
            tempArray[j] = newArray[i];
        }
    }
    private static void swaping(char[] tempArray) {
        for(int i=0;i<tempArray.length;i++)
        {
            System.out.print(tempArray[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        reverseString("This is a java program"); //program java a is This
    }

}
