package Bankin;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vishnu EK
 */
public class MainClass {

   static List<BankingInterface> asList = new ArrayList<>();

    public static void main(String[] args) {
        goThrough(new Icici());
        goThrough(new Sbi());
        goThrough(new SouthIndian());
        goThrough(() -> {
            System.out.println("new");
        });
    }

    private static void goThrough(BankingInterface a) {
        asList.add(a);
        System.out.println("List->"+asList);
        a.addNewFunctionaliy();
    }
}
