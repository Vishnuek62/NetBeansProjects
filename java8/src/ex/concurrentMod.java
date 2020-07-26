/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 *
 * @author Vishnu EK
 */
public class concurrentMod {

    public static void main(String[] args) {

        List<String> list = new CopyOnWriteArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        list.add("G");
        list.add("H");
        

       
        Iterator<String> iter = list.stream().iterator();
        while (iter.hasNext()) {
            String str = iter.next();
            System.out.println("iiiiiiii " + str);
            if (str.equals("B")) {
                list.remove("H");
                 list.add("I");
            }
            System.out.println("iiiiiiii " + str);
        }

    }
}
