package com.interview.inheritance;

/**
 *
 * @author Vishnu EK
 * @since Aug 10, 2018
 * @version 1.0
 */
class CastExample {
    void foo() {
        System.out.println("CastExample -> foo");
    }

    void boo() {
        System.out.println("CastExample -> boo");
    }
   
}

class subCastExample extends CastExample {

    void foo() {
        System.out.println("subCastExample -> foo");
    }

    void boo() {
        System.out.println("subCastExample -> boo");
    }

    public static void main(String[] args) {
        subCastExample sub = new subCastExample();
        CastExample main = (CastExample) sub;
        main.boo();
        main.foo();
        CastExample a = new CastExample();
        a.boo();
        a.foo();
        
        
    }
}
