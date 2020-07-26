package Bankin;


/**
 *
 * @author Vishnu EK
 */
public class MainClass {

    public static void main(String[] args) {
        goThrough(new Icici());
        goThrough(new Sbi());
        goThrough(new SouthIndian());
    }

    private static void goThrough(BankingInterface a) {
        a.addNewFunctionaliy();
    }
}
