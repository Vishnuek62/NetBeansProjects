/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @author Vishnu EK
 */
public class Switch {
    public static void run()
    {
        int i=0;    
        System.out.println(i);
    }
    
    
   public static void main(String args[]){
       run();
	int price = 6;
	switch (price) {
		case 6: System.out.println("It is:6");break;
		default: System.out.println("It is: default");break;
		case 5: System.out.println("It is: 5");break;
		case 9: System.out.println("It is: 9");break;
	}
        Map<String, String> wordMap = new HashMap<String, String>();
        wordMap.put("1", "a");
         wordMap.put("2", "b");
          wordMap.put("3", "c");
           wordMap.put("4", "d");
	Set<Entry<String, String>> set = wordMap.entrySet();
	List<Entry<String, String>> list = new ArrayList<Entry<String, String>>(set);
        
        System.out.println(list);
        
} 
}
