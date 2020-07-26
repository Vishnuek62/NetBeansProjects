/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.india.chelakkara;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vishnu EK
 */
public class MainProgram {

    List<Connector> a = new ArrayList<>();

    void add(Connector con) {
        a.add(con);
    }

    int getArithematicMean() {
        int total = a.stream().mapToInt(Connector::getScore).sum();
        return total / a.size();

    }

}
