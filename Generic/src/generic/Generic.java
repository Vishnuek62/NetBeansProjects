package generic;

public class Generic {

    public static void main(String[] args) 
    {
        Integer[] intarr = {10,20,30,40};
        
        Character[] chararr ={'f','t','h'};
        
        System.out.println("printing arrays");
        
        printarray(intarr);
        System.out.println(intarr);
        printarray(chararr);
     }
    
    public static <E>void printarray(E[] ar)
    {
        for(E a : ar)
        {
            System.out.println(a);
            
        }
    System.out.println();
            
            
    }
    
}
