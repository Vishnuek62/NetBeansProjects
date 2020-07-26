/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equalsndhashcode;

import java.util.HashMap;
 
public class MyHashcodeImpl {
 
    public static void main(String a[]){
         
        
        HashMap<Price, String> hm = new HashMap<Price, String>();
        hm.put(new Price("Banana", 20), "Banana");
        hm.put(new Price("Apple", 40), "Apple");
        hm.put(new Price("Orange", 30), "Orange");
        //creating new object to use as key to get value
        Price key = new Price("Banana", 20);
        System.out.println("Hashcode of the key: "+key.hashCode());
        System.out.println("Value from map: "+hm.get(key));
        
        Price key1 = new Price("Banana", 20);
        Price key2 = new Price("Banana", 20);
        
        System.out.println(key1.equals(key2));
        
        System.out.println(key1.hashCode());
        
        System.out.println(key1.hashCode());
        
        
    }
}
 