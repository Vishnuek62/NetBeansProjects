
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dog;

/**
 *
 * @author Vishnu EK
 */
public class Dog extends Animal {

    void walking() {
        System.out.println("walkinggggg");
    }

    @Override
    void running() {
        System.out.println("runnninggg meethod--Dog Class");
    }

    public static void main(String[] args) {
        Animal a = new Dog();
        a.running();
    }

}
