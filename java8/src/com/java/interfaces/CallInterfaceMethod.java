/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.interfaces;

/**
 *
 * @author Vishnu EK
 */
public class CallInterfaceMethod implements FirstInterface,SecondInterface{
    
    
    public void someMethod(){
        System.out.println("Am from CallInterfaceMethod");
        FirstInterface.super.someMethod();
        
    }
    public static void main(String[] args) {
        
        new CallInterfaceMethod().someMethod();
        
    }
    
    
    
}
