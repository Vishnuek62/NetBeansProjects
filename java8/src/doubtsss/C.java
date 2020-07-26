/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doubtsss;

/**
 *
 * @author Vishnu EK
 */
public class C implements A,B{

    @Override
    public void run() {
        System.out.println("aaaaaaaa");
    }
    
    
    public static void main(String[] args) {
        A b=new C();
        b.run();
    }
    
    
}
