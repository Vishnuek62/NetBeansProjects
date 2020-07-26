/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class ThreadSafeIteratorExample {

    public static void main(String[] args) {

        List<String> myList = new CopyOnWriteArrayList<>();

         myList.add("1");
         myList.add("2");
         myList.add("3");
         myList.add("4");
         myList.add("5");

         Iterator<String> it = myList.iterator();
         while (it.hasNext()) {
         String value = it.next();
         System.out.println("List Value:" + value);
         if (value.equals("3")) {
         myList.remove("4");
         myList.add("6");
         myList.add("7");
         }
         }
         System.out.println("List Size:" + myList.size());
        Map<String, String> myMap
                = new ConcurrentHashMap<>();
        myMap.put("1", "a");
        myMap.put("2", "b");
        myMap.put("3", "c");

        
        Iterator<String> it1 = myMap.keySet().iterator();
        while (it1.hasNext()) {
            String key = it1.next();
            System.out.println("Map Value:" + myMap.get(key));
            if (key.equals("1")) {
                myMap.remove("3");
                myMap.put("4", "d");
                myMap.put("5", "e");
            }
        }
        System.out.println("Map Size:" + myMap.size());

    }

}
