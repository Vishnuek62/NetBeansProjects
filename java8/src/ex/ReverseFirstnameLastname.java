/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex;

/**
 *
 * @author Vishnu EK
 */
public class ReverseFirstnameLastname {

    public static void main(String[] args) {
        String intro = "This is a java";
        System.out.println(reverse(intro));
    }

    private static String reverse(String intro) {
        char[] split = intro.toCharArray();
        char[] combine = new char[split.length + 1];
        
        int c = 0;
        for (int i = split.length - 1, j = split.length - 1; i >= 0; i--) {
            if (split[i] == ' ' || i == 0) {
                int start = i == 0 ? i : i + 1;
                for (; start <= j; start++) {
                    combine[c++] = split[start];
                }
                if (j == split.length - 1) {
                    combine[c++] = ' ';
                }

                j = i;
            }
        }
        return new String(combine);
    }
}
