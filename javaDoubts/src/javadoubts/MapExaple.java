/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadoubts;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Vishnu EK
 */
public class MapExaple {
    
    public static void main(String[] args) {
        
        Map<Student,String> a = new HashMap();
        
        Student studentDto1 = new Student();
        studentDto1.setName("vishnu");
        
        System.out.println("hashcode of student1 "+studentDto1.hashCode());
        
        Student studentDto2 = new Student();
        studentDto2.setName(" vishnu");
        
        System.out.println("hashcode of student2 "+studentDto2.hashCode());
        
        a.put(studentDto1, "student1");
        a.put(studentDto2, "student2");
        
        System.out.println("fff"+a.get(studentDto1));  
    }
}
