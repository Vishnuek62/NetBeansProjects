
package ariyan;

public class Arr 
{
    
    public static void main(String[] args)
    {
        
        char[] r ={'v','i','s','h','n','u'};
        
        char[] y = new char[15];
        
        System.arraycopy(r, 2, y, 5, 4);
        System.out.println(y);
        System.out.println(new String(y));
        String m = new String(y);
        System.out.println(y);
    }
    
    
}
