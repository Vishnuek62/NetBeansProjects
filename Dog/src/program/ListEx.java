/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Vishnu EK
 */
public class ListEx {

    public static void main(String[] args) {
        List<AnimalInt> stringList = new ArrayList<>();
        stringList.re
        List<Dog> objectList = stringList; //this does compile only if List<String> where subtypes of List<Object>
      /*  objectList.add(new Object());
        String s = stringList.get(0);// attempt to assign an Object to a String and the Java compiler has to prevent these cases.
*/
        
        Map a = new HashMap();
    }

}
interface AnimalInt
{
}


class Dog extends Animal implements AnimalInt
{}
class Cat extends Animal implements AnimalInt{}
class Animal{}