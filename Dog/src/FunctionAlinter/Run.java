/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionAlinter;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vishnu EK
 */
public class Run {
    public static void main(String[] args) {
        List<CallingInterface> a = new ArrayList<>();
        a.add(new Universe());
        a.add(new World());
        for(CallingInterface u:a)
        {
            System.out.println(u.getDescription());
        }
    }
}
