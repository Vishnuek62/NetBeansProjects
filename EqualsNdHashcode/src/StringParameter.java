/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vishnu EK
 */
public class StringParameter {

    public static void main(String[] args) {

        String a = new String("abc");
        changeString(a);
        System.out.println(a);

        StringBuilder b = new StringBuilder("abc");
        changeBuilder(b);
        System.out.println(b);

        Integer c = new Integer(1);
        changeInteger(c);
        System.out.println(c);

        StringBuffer d = new StringBuffer("abc");
        changeBuffer(d);
        System.out.println(d);

        int e = 1;
        changeInt(e);
        System.out.println(e);
    }

    private static void changeString(String a) {
        a = "abcd";
    }

    private static void changeBuilder(StringBuilder x) {
        x.append("d");
    }

    private static void changeInteger(Integer c) {
        c = 2;
    }

    private static void changeBuffer(StringBuffer d) {
        d.append("d");
    }

    private static void changeInt(int e) {
        e = 2;
    }
}
