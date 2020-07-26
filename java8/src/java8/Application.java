
package java8;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<Integer> arrayList= new ArrayList();
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(15);
        
        for(int i : arrayList)
        {
            System.out.println(i);
        }
        
       // arrayList.forEach(() -> {System.out.println();});
        
    }
}
