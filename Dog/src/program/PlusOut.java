/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

/**
 *
 * @author Vishnu EK
 */
public class PlusOut {

    public static void main(String[] args) {
        System.out.println(plusOut("1qwe111rty123qwer12311111a", "1"));
    }

    private static String plusOut(String a, String b) {
        StringBuilder builder = new StringBuilder();
        int j = 0;
        for (int c = 0; c < a.length(); c++) {
            if (a.charAt(c) == b.charAt(j)) {
                j++;
                if (j == b.length()) {
                    j = 0;
                    builder.append(b);
                }
            } else {
                builder.append("+");
            }
        }
        return builder.toString();
    }
}
