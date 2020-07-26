/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// A Java program to show that references are also passed
// by value.
class Test {

    int x;

}

class Main {

    public static void main(String[] args) {
        // t is a reference
        Test t = new Test();
        t.x = 5;
        // Reference is passed and a copy of reference
        // is created in change()
        change(t);

        // Old value of t.x is printed
        System.out.println(t.x);
    }

    public static void change(Test t) {
        // We changed reference to refer some other location
        // now any changes made to reference are not reflected
        // back in main
         t = new Test();

        t.x = 10;
    }
}
