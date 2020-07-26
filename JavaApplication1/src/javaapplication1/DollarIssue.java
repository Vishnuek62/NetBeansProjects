package javaapplication1;

import java.util.ArrayList;
import java.util.List;

public class DollarIssue {

    public static void main(String[] args) {
        String defaultLang = "aa";
        String asd = "$";
        char[] arrAsd = asd.toCharArray();
        StringBuilder builder = new StringBuilder("");
            for (int i = 0; i < arrAsd.length - 1; i++) {
                if (arrAsd[i] == '$' && arrAsd[i] == arrAsd[i + 1]) {
                    builder.append(arrAsd[i] + defaultLang);
                } else {
                    builder.append(arrAsd[i]);
                }
            }
        
        System.out.println(builder.append("$").toString());
    }
}
