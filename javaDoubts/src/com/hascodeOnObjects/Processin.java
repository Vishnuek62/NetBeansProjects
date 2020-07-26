/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hascodeOnObjects;

/**
 *
 * @author Vishnu EK
 */
public class Processin {
    public static void main(String[] args) {
        Student vishnu = new Student("Vishnu","261");
        Student shijo = new Student("Vishnu","261");
        
        System.out.println(vishnu);
        System.out.println(shijo);
        
        System.out.println(vishnu == shijo);
        
        System.out.println(vishnu.equals(shijo));
        
        Runtime a= Runtime.getRuntime();
                
    }
}
