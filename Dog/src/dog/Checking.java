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
public class Checking {

    static String[] names[] = {{"a", "b", "c"},
    new String[3], null,
    {
        "d", "e", "f", null 
    }, null
    };

    public static void main(String[] args) {

        System.out.println(new Checking().names[0]);
        System.out.println(new Checking().names[1]);
        System.out.println(new Checking().names[2]);

        


        System.out.println(new Checking().names[3][2]);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(names[i][j]);
            }
            System.out.println();
        }

    }

}
