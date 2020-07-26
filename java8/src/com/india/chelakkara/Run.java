/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.india.chelakkara;

/**
 *
 * @author Vishnu EK
 */
public class Run {
    
    public static void main(String[] args) {
        
        MainProgram a = new MainProgram();
        a.add(() ->12);
        a.add(new A());
        a.add(new C());
        
        System.out.println(a.getArithematicMean());
    }
    
}
