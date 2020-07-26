/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceEx;

/**
 *
 * @author Vishnu EK
 */
public class RunningMethod {
    
    
    public static void main(String[] args) {
        
        ExampleInterface ref = new Human();
        ExampleInterface ref1 = new Donkey();
        
        ref.sitting();
        ref1.sitting();
        
        

    }
    
}
