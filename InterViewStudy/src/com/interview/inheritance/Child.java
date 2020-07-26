package com.interview.inheritance;

/**
 *
 * @author Vishnu EK
 * @since Sep 10, 2018
 * @version 1.0
 */

class Parent 
{
    public void display()
    {
        System.out.println("Parent Class display() method");
    }
}
public class Child extends Parent
{
    public void display()
    {
        System.out.println("Child class display() method");
    }
    public static void main(String args[]) 
    {
        //Parent class object to Parent reference
        Parent p = new Parent();
        p.display();
        //Child class object to Child reference
        Child c = new Child();
        c.display();
        //Child class object to Parent reference
        Parent pc = new Child();
        pc.display();
     }
}