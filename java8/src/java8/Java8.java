package java8;

/**
 *
 * @author Vishnu EK
 */
public class Java8 implements NewInterface, second {

    public void walk() {
        second.super.walk();
        NewInterface.super.walk();
    }

    public static void main(String[] args) {
        Java8 j = new Java8();
        j.walk();
    }

}
