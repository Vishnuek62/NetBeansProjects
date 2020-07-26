/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aboutCollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;

/**
 *
 * @author Vishnu EK
 */
public class ListEx {

    
    public static void main(String[] args) {
        
        List<String> a =new LinkedList<>();
        a.add(0, "a");
        a.add(1, "b");
        //System.out.println(""+a.get(0));
        for(String ab:a)
        {
            System.out.println(ab);
        }
        a.set(0, "c");
        for(String ab:a)
        {
            System.out.println(ab);
        }
        Set<String> set = new HashSet<>();
        set.add(null);
        
        Map<String,String> map = new HashMap<>();
        Collection<String> list=map.values();
        map.
        
        
    }
    
}
