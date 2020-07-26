/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashExample;

import java.util.HashMap;
import java.util.Map;

class GFG 
{
    public static void main (String[] args) 
    {
        Geek g1 = new Geek("aditya", 1);
        Geek g2 = new Geek("aditya", 1);
         
        Map<Geek, String> map = new HashMap<Geek, String>();
        map.put(g1, "CSE");
        map.put(g2, "IT");
         
        for(Geek geek : map.keySet())
        {
            System.out.println(map.get(geek).toString());
        }
     }
}
