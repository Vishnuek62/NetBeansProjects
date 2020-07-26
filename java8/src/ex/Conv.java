/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Vishnu EK
 */
public class Conv {
    public static void main(String[] args) {
        
        List<String> list =Arrays.asList("af","b");
        Map<Integer,String> map = new HashMap<Integer,String>();
        for (String i : list) 
            map.put(i.length(),i);
        System.out.println(map);
    }
    
    
}
