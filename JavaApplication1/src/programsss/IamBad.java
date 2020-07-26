/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programsss;

/**
 *
 * @author Vishnu EK
 */
public class IamBad {

    public IamBad() {
        System.out.println("IamBad" + "zerovariable");
    }

    public IamBad(String h) {
        System.out.println("IamBad" + "one variable");
    }

    public IamBad(String h, String i) {
        System.out.println("IamBad" + "two variable");
    }
}

class UareBad extends IamBad {

    public UareBad() {
        System.out.println("UareBad" + "zero variable");
    }

    public UareBad(String h) {
        System.out.println("UareBad" + "one variable");
    }

    public UareBad(String h, String i) {
        System.out.println("IamBad" + "two variable");
    }

    public static void main(String[] args) {
        UareBad a = new UareBad();
        UareBad a1 = new UareBad("kl");
        UareBad a2 = new UareBad("kl","mm");
    }

}
