/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.interfaces;
public interface FirstInterface {
    default void someMethod(){
        System.out.println("Am from first interface");
    }
}